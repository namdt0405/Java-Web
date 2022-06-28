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
public class StoryAuthor {
    private int id;
    private int StoryID;
    private int AuthorID;
    private Time CreatedAt;
    private Time UpdatedAt;

    public StoryAuthor() {
    }

    public StoryAuthor(int id, int StoryID, int AuthorID, Time CreatedAt, Time UpdatedAt) {
        this.id = id;
        this.StoryID = StoryID;
        this.AuthorID = AuthorID;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getId() {
        return id;
    }

    public int getStoryID() {
        return StoryID;
    }

    public int getAuthorID() {
        return AuthorID;
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

    public void setStoryID(int StoryID) {
        this.StoryID = StoryID;
    }

    public void setAuthorID(int AuthorID) {
        this.AuthorID = AuthorID;
    }

    public void setCreatedAt(Time CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setUpdatedAt(Time UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
}
