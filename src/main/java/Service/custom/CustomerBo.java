package Service.custom;

import DTO.Customer;
import Service.Super_Service;

public interface CustomerBo extends Super_Service {
  boolean addCustomer(Customer customer);

  boolean updateCustomer(String id,Customer customer);
}
