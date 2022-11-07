package models.dao;

import db.DB;
import models.dao.models.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao createSellerDAo(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
