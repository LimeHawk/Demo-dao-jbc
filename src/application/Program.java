package application;

import java.util.Date;
import models.entities.Department;
import models.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        Department dep = new Department(1, "Books");
        
        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0, dep);
        
        System.out.println(seller);
        
    }
    
}
