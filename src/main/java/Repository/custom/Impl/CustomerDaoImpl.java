package Repository.custom.Impl;
import Entity.CustomerEntity;
import Repository.custom.CustomerDao;
import config.HibernateConfig;
import org.hibernate.Session;

public class CustomerDaoImpl implements CustomerDao {


    @Override
    public boolean Save(CustomerEntity entiy) {
        Session session = HibernateConfig.geSession();
        session.beginTransaction();
        session.persist(entiy);
        session.getTransaction().commit();
        session.close();
        return false;
    }

    @Override
    public CustomerEntity search(String s) {
        return null;
    }
}
