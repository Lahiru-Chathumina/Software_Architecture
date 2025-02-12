package Config;

import Repository.CrudDao;
import Repository.custom.CustomerDao;
import Repository.custom.Impl.CustomerDaoImpl;
import Service.custom.CustomerBo;
import Service.custom.Impl.CustomerBoImpl;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    @Override
    protected void configure(){
       bind(CustomerBo.class).to(CustomerBoImpl.class);
       bind(CrudDao.class).to(CustomerDaoImpl.class);

    }

}
