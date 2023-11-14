package JDBC.source.Project_DAO_JDBC.application;

import JDBC.source.Project_DAO_JDBC.model.dao.DaoFactory;
import JDBC.source.Project_DAO_JDBC.model.dao.SellerDao;
import JDBC.source.Project_DAO_JDBC.model.entities.Department;
import JDBC.source.Project_DAO_JDBC.model.entities.Seller;

import java.time.LocalDate;
import java.util.List;

public class ProgramSeller {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller01 = sellerDao.findById(3);
        System.out.println(seller01);

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(dep.getId());
        sellerList.forEach(System.out::println);

        System.out.println("=== TEST 3: seller findAll ===");
        sellerList = sellerDao.findAll();
        sellerList.forEach(System.out::println);

        System.out.println("=== TEST 4: seller Insert ===");
        Seller seller02 = new Seller(null, "Naryeli Helen Cusi Medrano", "nary@gmail.com", LocalDate.now(), 5000.0, dep);
        //sellerDao.insert(seller02);
        System.out.println("Inserted!!");

        System.out.println("=== TEST 5: seller Update ===");
        Seller seller03 = sellerDao.findById(15);
        seller03.setName("joao");
        //sellerDao.update(seller03);
        System.out.println("Updated!!");

        System.out.println("=== TEST 6: seller DeleteById ===");
        sellerDao.deleteById(16);
        System.out.println("Deleted!!");

    }
}
