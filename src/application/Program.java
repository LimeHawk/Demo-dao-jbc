package application;

import java.util.Date;
import java.util.List;
import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        
        System.out.println("--- Test 1: Seller findById ---- ");
        
        SellerDao sellerDao = DaoFactory.createSellerDAo();
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
        
        System.out.println("--- Test 2: Seller findByDepartment ---- ");
        
        Department department = new Department(2 , null);
        
        List<Seller> list = sellerDao.findByDepartment(department);
        
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("--- Test 3: Seller findAll ---- ");
        
        list = sellerDao.findAll();
        
        for(Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("--- Test 4: Seller insert ---- ");
        Seller newSeller = new Seller(null,"Greg" , "Greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());
    }
    
}
