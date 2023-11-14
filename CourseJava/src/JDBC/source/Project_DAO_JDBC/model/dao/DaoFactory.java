package JDBC.source.Project_DAO_JDBC.model.dao;

import JDBC.db.DB;
import JDBC.source.Project_DAO_JDBC.model.dao.impl.DepartmentDaoJDBC;
import JDBC.source.Project_DAO_JDBC.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
