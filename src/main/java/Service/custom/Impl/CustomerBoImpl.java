package Service.custom.Impl;

import DTO.Customer;
import Entity.CustomerEntity;
import Repository.DaoFactory;
import Repository.custom.CustomerDao;
import Service.custom.CustomerBo;
import Util.DaoType;
import org.modelmapper.ModelMapper;

public class CustomerBoImpl implements CustomerBo {
CustomerDao Dao = DaoFactory.getInstance().getDaoType(DaoType.Customer);

    @Override
    public boolean addCustomer(Customer customer) {
        CustomerEntity map = new ModelMapper().map(customer, CustomerEntity.class);
        Dao.Save(map);
        return false;
    }

    @Override
    public boolean updateCustomer(String id, Customer customer) {
        return false;
    }
}
