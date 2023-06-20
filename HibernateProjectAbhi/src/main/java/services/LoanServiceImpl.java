package services;
/*Code Is Developed by Abhishek*/

import dao.LoanAgreementDAO;
import model.LoanAgreement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanAgreementDAO loanAgreementDAO;

    @Override
    public void createLoanAgreement(LoanAgreement loanAgreement) {
        loanAgreementDAO.saveLoanAgreement(loanAgreement);
    }

    @Override
    public LoanAgreement getLoanAgreementById(int loanAgreementId) {
        return loanAgreementDAO.getLoanAgreementById(loanAgreementId);
    }

    @Override
    public List<LoanAgreement> getAllLoanAgreements() {
        return loanAgreementDAO.getAllLoanAgreements();
    }

    @Override
    public void updateLoanAgreement(LoanAgreement loanAgreement) {
        loanAgreementDAO.updateLoanAgreement(loanAgreement);
    }

    @Override
    public void deleteLoanAgreement(int loanAgreementId) {
        LoanAgreement loanAgreement = getLoanAgreementById(loanAgreementId);
        loanAgreementDAO.deleteLoanAgreement(loanAgreement);
    }
}
