/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Data.SqlConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dinht
 */
public class DAO {
    public interface Dao<T> {
 
    List<T> getAll();
 
    Optional<T> get(int id);
 
    void save(T t);
 
    void update(T t);
 
    void delete(T t);
}
    
}
