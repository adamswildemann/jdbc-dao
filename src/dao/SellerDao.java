package dao;

import entities.Department;
import entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Department obj);

    void insert(Seller obj);

    void update(Department obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

}
