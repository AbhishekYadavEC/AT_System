package dao;
/*Code is developed by Abhishek*/

import model.LoanAgreement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class LoanAgreementDAOImpl implements LoanAgreementDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveLoanAgreement(LoanAgreement loanAgreement) {
        getSession().save(loanAgreement);
    }

    @Override
    public LoanAgreement getLoanAgreementById(int loanAgreementId) {
        return getSession().get(LoanAgreement.class, loanAgreementId);
    }

    @Override
    public List getAllLoanAgreements() {
        return getSession().createQuery("FROM LoanAgreement").getResultList();
    }

    @Override
    public void updateLoanAgreement(LoanAgreement loanAgreement) {
        getSession().update(loanAgreement);
    }

    @Override
    public void deleteLoanAgreement(LoanAgreement loanAgreement) {
        getSession().delete(loanAgreement);
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
