package JDBC.source.Project_DAO_JDBC.application;

import JDBC.source.Project_DAO_JDBC.model.entities.Department;
import JDBC.source.Project_DAO_JDBC.model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);

        System.out.println(seller);
    }
}
