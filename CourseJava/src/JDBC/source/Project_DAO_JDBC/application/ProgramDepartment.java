package JDBC.source.Project_DAO_JDBC.application;

import JDBC.source.Project_DAO_JDBC.model.dao.DaoFactory;
import JDBC.source.Project_DAO_JDBC.model.dao.DepartmentDao;
import JDBC.source.Project_DAO_JDBC.model.entities.Department;
import JDBC.source.Project_DAO_JDBC.model.entities.Seller;

import java.time.LocalDate;

public class ProgramDepartment {
    public static void main(String[] args) {

        DepartmentDao dep = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department Insert ===");

        /*
        Department department = new Department(null, "TI");
        dep.insert(department);
        System.out.println("Inserted!!");
        */

        System.out.println("=== TEST 2: Department Update ===");



    }
}
