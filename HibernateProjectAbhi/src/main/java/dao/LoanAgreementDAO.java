package dao;
/*Code is developed by Abhishek*/

import model.LoanAgreement;

import java.util.List;

public interface LoanAgreementDAO {

    // Create
    void saveLoanAgreement(LoanAgreement loanAgreement);

    // Read
    LoanAgreement getLoanAgreementById(int loanAgreementId);

    //All LoanAgreement Of List
    List<LoanAgreement> getAllLoanAgreements();

    // Update
    void updateLoanAgreement(LoanAgreement loanAgreement);

    // Delete
    void deleteLoanAgreement(LoanAgreement loanAgreement);
}