package Controller;

import DTO.Customer;
import Service.BoFactory;
import Service.Super_Service;
import Service.custom.CustomerBo;
import Service.custom.Impl.CustomerBoImpl;
import Util.Botype;
import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class addCustomer {

    @FXML
    private TextField textID;

    @FXML
    private TextField textName;

    @FXML
    private TextField textaddress;

@Inject
CustomerBo Service;

    @FXML
    void BtnADD(ActionEvent event) {
        String ID= textID.getText();
        String NAME = textName.getText();
        String Address = textaddress.getText();

        Customer customer = new Customer(ID,NAME,Address);
        new CustomerBoImpl().addCustomer(customer);

        Service.addCustomer(customer);

    }

}
