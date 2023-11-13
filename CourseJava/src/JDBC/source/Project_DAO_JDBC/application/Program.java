package JDBC.source.Project_DAO_JDBC.application;

import JDBC.source.Project_DAO_JDBC.model.dao.DaoFactory;
import JDBC.source.Project_DAO_JDBC.model.dao.SellerDao;
import JDBC.source.Project_DAO_JDBC.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
