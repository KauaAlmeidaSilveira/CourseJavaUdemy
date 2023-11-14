package JDBC.source.Project_DAO_JDBC.model.dao;

import JDBC.source.Project_DAO_JDBC.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Integer id);
}
