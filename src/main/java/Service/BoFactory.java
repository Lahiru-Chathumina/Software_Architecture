package Service;

import Service.custom.Impl.CustomerBoImpl;
import Service.custom.Impl.ItemBoImpl;
import Service.custom.Impl.OderBoImpl;
import Util.Botype;
import lombok.Data;

public class BoFactory {
    private static  BoFactory instance;
    private BoFactory(){}

    public static BoFactory getInstance(){
      return instance==null?instance = new BoFactory(): instance;
    }

    public <T extends Super_Service> T getBoType(Botype type){
        switch (type){
            case Customer: return (T) new CustomerBoImpl();
            case Item : return (T) new ItemBoImpl();
            case Oder: return (T) new OderBoImpl();
        }
        return null;
    }
}
