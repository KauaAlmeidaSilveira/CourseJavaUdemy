package JDBC.source.fundamentalsJDBC;

import JDBC.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizandoDados {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller " +
                        "SET BaseSalary = BaseSalary + ? " +
                        "WHERE DepartmentId = ?");

            st.setDouble(1, 3000.0);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
