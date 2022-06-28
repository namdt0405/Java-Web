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
public class Chapters {
    private int id;
    private String name;
    private String subname;
    private String alias;
    private String content;
    private int view;
    private int storyID;
    private Time CreatedAt;
    private Time UpdatedAt;

    public Chapters() {
    }

    public Chapters(int id, String name, String subname, String alias, String content, int view, int storyID, Time CreatedAt, Time UpdatedAt) {
        this.id = id;
        this.name = name;
        this.subname = subname;
        this.alias = alias;
        this.content = content;
        this.view = view;
        this.storyID = storyID;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubname() {
        return subname;
    }

    public String getAlias() {
        return alias;
    }

    public String getContent() {
        return content;
    }

    public int getView() {
        return view;
    }

    public int getStoryID() {
        return storyID;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public void setCreatedAt(Time CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setUpdatedAt(Time UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
}
