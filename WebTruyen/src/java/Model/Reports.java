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
public class Reports {
    private int id;
    private int ChapterId;
    private String message;
    private Time CreatedAt;
    private Time UpdatedAt;

    public Reports() {
    }

    public Reports(int id, int ChapterId, String message, Time CreatedAt, Time UpdatedAt) {
        this.id = id;
        this.ChapterId = ChapterId;
        this.message = message;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getId() {
        return id;
    }

    public int getChapterId() {
        return ChapterId;
    }

    public String getMessage() {
        return message;
    }

    public Time getCreatedAt() {
        return CreatedAt;
    }

    public Time getUpdatedAt() {
        return UpdatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChapterId(int ChapterId) {
        this.ChapterId = ChapterId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCreatedAt(Time CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setUpdatedAt(Time UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
}
