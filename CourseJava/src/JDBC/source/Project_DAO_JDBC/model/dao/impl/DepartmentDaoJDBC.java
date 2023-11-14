package JDBC.source.Project_DAO_JDBC.model.dao.impl;

import JDBC.db.DB;
import JDBC.db.DbException;
import JDBC.source.Project_DAO_JDBC.model.dao.DepartmentDao;
import JDBC.source.Project_DAO_JDBC.model.entities.Department;

import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;

        try {

            st = conn.prepareStatement("INSERT INTO department " +
                    "(Name) " +
                    "VALUES " +
                    "(?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {

        } finally {

        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

}
