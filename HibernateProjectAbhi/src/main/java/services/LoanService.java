package services;
/*Code Is Developed by Abhishek*/
import model.LoanAgreement;

import java.util.List;

public interface LoanService {

    // Create
    void createLoanAgreement(LoanAgreement loanAgreement);

    // Read
    LoanAgreement getLoanAgreementById(int loanAgreementId);
    List<LoanAgreement> getAllLoanAgreements();

    // Update
    void updateLoanAgreement(LoanAgreement loanAgreement);

    // Delete
    void deleteLoanAgreement(int loanAgreementId);
}
