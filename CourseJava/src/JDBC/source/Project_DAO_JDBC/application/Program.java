package JDBC.source.Project_DAO_JDBC.application;

import JDBC.source.Project_DAO_JDBC.model.entities.Department;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");

        System.out.println(obj);
    }
}
