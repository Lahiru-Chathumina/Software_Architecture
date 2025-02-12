package Repository;

import Repository.custom.Impl.CustomerDaoImpl;
import Repository.custom.Impl.ItemDaoimpl;
import Repository.custom.Impl.OrderDaoimpl;
import Service.custom.Impl.CustomerBoImpl;
import Util.DaoType;

public class DaoFactory{
    private static DaoFactory Instance;
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        return Instance == null? Instance = new DaoFactory(): Instance;
    }
    public <T extends SuperDao> T getDaoType (DaoType Type){
        switch (Type){
            case Customer : return (T) new CustomerDaoImpl();
            case Item: return (T)new ItemDaoimpl();
            case Oder: return (T)new OrderDaoimpl();

        }
        return null;
    }
}
