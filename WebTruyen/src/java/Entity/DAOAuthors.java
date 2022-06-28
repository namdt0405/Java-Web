/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Data.SqlConnect;
import Model.Authors;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinht
 */
public class DAOAuthors {
    private List<Authors> authors = new ArrayList<>();
    
    public  Authors get(int id) throws SQLException, Exception{
        Authors authors = new Authors();
            Connection conn = SqlConnect.getConnection();
            PreparedStatement prp = conn.prepareStatement("Select*from Author Where Id = ?");
            prp.setInt(1, id);
            ResultSet rs = prp.executeQuery();
            if (rs.next()){
                authors.setId(rs.getInt("ID"));
                authors.setName(rs.getString("Name"));
                authors.setDescription("Description");
                authors.setAlias(rs.getString("alias"));
                authors.setKeyword(rs.getString("Keyword"));
                authors.setCreatedAt(rs.getTime("CreatedAt"));
                authors.setUpdatedAt(rs.getTime("UpdatedAt"));
            }
        return authors;
    }
   public void InsertAuthor(Authors authors) throws SQLException, Exception{
       Connection conn = SqlConnect.getConnection();
       PreparedStatement prp = conn.prepareStatement("Insert into Authors :(ID,Name,alias,keyword,Description,CreatedAt,UpdatedAt) Values (?, ?, ?, ?, ?, ?, ?) ");
       prp.setInt(1, authors.getId());
       prp.setString(2, authors.getName());
       prp.setString(3, authors.getAlias());
       prp.setString(4, authors.getKeyword());
       prp.setString(5, authors.getDescription());
       prp.setTime(6, authors.getCreatedAt());
       prp.setTime(7, authors.getUpdatedAt());
       prp.executeUpdate();
   }
   public void UpdateAuthor(Authors authors) throws SQLException, Exception{
       Connection conn = SqlConnect.getConnection();
       String url = "Update Author set name= ?, alias=?, keyword=?, Description=?,UpdateAt=? WHERE Id=?";
       PreparedStatement prp = conn.prepareCall(url);
       prp.setString(1, authors.getName());
       prp.setString(2, authors.getAlias());
       prp.setString(3, authors.getKeyword());
       prp.setString(4, authors.getDescription());
       prp.setTime(5, authors.getUpdatedAt());
       prp.setInt(6, authors.getId());
       prp.executeUpdate();
   }
   public void DeleteAuthor(int id) throws SQLException, Exception{
       Connection conn = SqlConnect.getConnection();
       String url = "Delete Author where ID = ? ";
       PreparedStatement prp = conn.prepareStatement(url);
       prp.setInt(1, id);
       prp.executeUpdate();
   }
   public List<Authors> GetAllAuthors() throws SQLException,Exception{
       List<Authors> authors = new ArrayList<>();
       Connection conn = SqlConnect.getConnection();
       String url = "Select * from Authors";
       Statement s = conn.createStatement();
       ResultSet rs = s.executeQuery(url);
       while (rs.next()){
           Authors author = new Authors();
           author.setId(rs.getInt("ID"));
           author.setName(rs.getString("Name"));
           author.setAlias(rs.getString("Alias"));
           author.setKeyword(rs.getString("Keyword"));
           author.setDescription(rs.getString("Description"));
           author.setCreatedAt(rs.getTime("CreatedAt"));
           author.setUpdatedAt(rs.getTime("UpdatedAt"));
           authors.add(author);
           
       }
       return authors;
   } 
   public Authors GetAuthorById(int id )  throws SQLException,Exception{
       Connection conn = SqlConnect.getConnection();
       Authors author = new Authors();
       String url = "Select * from Authors where ID = ?";
       PreparedStatement prp = conn.prepareStatement(url);
        ResultSet rs = prp.executeQuery();
        if (rs.next()){
            author.setId(rs.getInt("ID"));
           author.setName(rs.getString("Name"));
           author.setAlias(rs.getString("Alias"));
           author.setKeyword(rs.getString("Keyword"));
           author.setDescription(rs.getString("Description"));
           author.setCreatedAt(rs.getTime("CreatedAt"));
           author.setUpdatedAt(rs.getTime("UpdatedAt"));
        }
        return author;
   }
}
