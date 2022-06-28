/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Time;

/**
 *
 * @author dinht
 */
public class Users {
    private int Id;
    private String name;
    private String email;
    private String password;
    private int level;
    private int status;
    private Time CreatedAt;
    private Time UpdatedAt;

    public Users() {
    }

    public Users(int Id, String name, String email, String password, int level, int status, Time CreateAt, Time UpdatedAt) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.level = level;
        this.status = status;
        this.CreatedAt = CreateAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getLevel() {
        return level;
    }

    public int getStatus() {
        return status;
    }

    public Time getCreateAt() {
        return CreatedAt;
    }

    public Time getUpdatedAt() {
        return UpdatedAt;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateAt(Time CreateAt) {
        this.CreatedAt = CreateAt;
    }

    public void setUpdatedAt(Time UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
}
