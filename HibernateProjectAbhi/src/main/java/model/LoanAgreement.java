package model;
/*Code Is Developed By Abhishek*/
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "loan_agreements")
public class LoanAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_agreement_id")
    private int loanAgreementId;

    @Column(name = "loan_product")
    private String loanProduct;

    @Column(name = "loan_amount")
    private double loanAmount;

    @Column(name = "loan_status")
    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;

    @Column(name = "tenure")
    private int tenure;

    @Column(name = "roi")
    private double roi;

    @Column(name = "emi_per_month")
    private double emiPerMonth;

    @Column(name = "loan_disbursal_date")
    private LocalDate loanDisbursalDate;

    @Column(name = "repayment_frequency")
    private int repaymentFrequency;

    // Constructors, getters and setters
    public LoanAgreement() {
        // default constructor required by Hibernate
    }

    public LoanAgreement(String loanProduct, double loanAmount, LoanStatus loanStatus, int tenure, double roi, double emiPerMonth, LocalDate loanDisbursalDate, int repaymentFrequency) {
        this.loanProduct = loanProduct;
        this.loanAmount = loanAmount;
        this.loanStatus = loanStatus;
        this.tenure = tenure;
        this.roi = roi;
        this.emiPerMonth = emiPerMonth;
        this.loanDisbursalDate = loanDisbursalDate;
        this.repaymentFrequency = repaymentFrequency;
    }

    public int getLoanAgreementId() {
        return loanAgreementId;
    }

    public void setLoanAgreementId(int loanAgreementId) {
        this.loanAgreementId = loanAgreementId;
    }

    public String getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(String loanProduct) {
        this.loanProduct = loanProduct;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public LocalDate getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public void setLoanDisbursalDate(LocalDate loanDisbursalDate) {
        this.loanDisbursalDate = loanDisbursalDate;
    }

    public int getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(int repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    public void calculateEMI(){
        roi = roi / (12 * 100);//one month interest
        tenure = tenure * 12;
        double emi = loanAmount * roi * (float) Math.pow(1 + roi, tenure) / (float) (Math.pow(1 + roi, tenure) - 1);
        System.out.println("Emi:"+emi);
    }
    public void generateRepaymentSchedule(int noOfInstallments, int loanAmount, int rate, int tenure){
        for (int i = 1; i < noOfInstallments; i++) {
            System.out.println("loan amount " + loanAmount + " rate = " + rate + " tenure = " + tenure + " noOfInstallment = " + i);
        }
    }
    public  double calculateLatePenalty(LocalDate currentDate){
        double baseRate = 10.0;
        double ratePerDay = 0.05;
        //after 5th of month penalty will start
        int daysLate = currentDate.getDayOfMonth()-1 - 5;
        double penalty = baseRate + (daysLate * ratePerDay);
        return penalty;
    }
    public double calculateLoanToValueRatio(int loan_amt, double prpValue){
        double ratio = Math.round((loan_amt / prpValue) * 100);
        return ratio;
    }

    @Override
    public String toString() {
        return "LoanAgreement{" +
                "loanAgreementId=" + loanAgreementId +
                ", loanProduct='" + loanProduct + '\'' +
                ", loanAmount=" + loanAmount +
                ", loanStatus=" + loanStatus +
                ", tenure=" + tenure +
                ", roi=" + roi +
                ", emiPerMonth=" + emiPerMonth +
                ", loanDisbursalDate=" + loanDisbursalDate +
                ", repaymentFrequency=" + repaymentFrequency +
                '}';
    }
}
