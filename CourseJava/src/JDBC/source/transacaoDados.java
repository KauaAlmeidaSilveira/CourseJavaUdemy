package JDBC.source;

import JDBC.db.DB;
import JDBC.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class transacaoDados {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false); // Não confirma a transação automaticamente

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET " +
                    "BaseSalary = 2090 WHERE DepartmentId = 1");

            /* - TESTANDO O ROLLBACK
            int x = 1;
            if (x < 2){
                throw new SQLException("Fake error");
            }
            */

            int rows2 = st.executeUpdate("UPDATE seller SET " +
                    "BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit(); // Confirma a transação manualmente

            System.out.println("Rows1: " + rows1 + " Rows2: " + rows2);

        }catch (SQLException e){
            try{
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            }catch (SQLException e1){
                // Erro no rollback
                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
