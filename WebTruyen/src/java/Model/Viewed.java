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
public class Viewed {
    private int id;
    private int StoryID;
    private int ChapterID;
    private int UserID;
    private Time CreatedAt;
    private Time UpdatedAt;

    public Viewed() {
    }

    public Viewed(int id, int StoryID, int ChapterID, int UserID, Time CreatedAt, Time UpdatedAt) {
        this.id = id;
        this.StoryID = StoryID;
        this.ChapterID = ChapterID;
        this.UserID = UserID;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getId() {
        return id;
    }

    public int getStoryID() {
        return StoryID;
    }

    public int getChapterID() {
        return ChapterID;
    }

    public int getUserID() {
        return UserID;
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

    public void setChapterID(int ChapterID) {
        this.ChapterID = ChapterID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setCreatedAt(Time CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setUpdatedAt(Time UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
    
}
