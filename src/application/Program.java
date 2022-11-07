package application;

import java.util.Date;
import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        
        SellerDao sellerDao = DaoFactory.createSellerDAo();
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
        
    }
    
}
