package JDBC.source.fundamentalsJDBC;

import JDBC.db.DB;
import JDBC.db.DbIntregityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletandoDados {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department WHERE Id = ?");

            st.setInt(1, 6);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected = " + rowsAffected);
        }catch (SQLException e){
            throw new DbIntregityException(e.getMessage());
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
