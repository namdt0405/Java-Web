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
public class PasswordReset {
    private String email;
    private String token;
    private Time CreatedAt;

    public PasswordReset() {
    }

    public PasswordReset(String email, String token, Time CreatedAt) {
        this.email = email;
        this.token = token;
        this.CreatedAt = CreatedAt;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }

    public Time getCreatedAt() {
        return CreatedAt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCreatedAt(Time CreatedAt) {
        this.CreatedAt = CreatedAt;
    }
    
}
