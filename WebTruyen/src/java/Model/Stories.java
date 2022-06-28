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
public class Stories {
    private int Id;
    private String name;
    private String alias;
    private String content;
    private int view;
    private String source;
    private String image;
    private int userID;
    private String keyword;
    private String description;
    private Time CreatedAt;
    private Time UpdatedAt;

    public Stories() {
    }

    public Stories(int Id, String name, String alias, String content, int view, String source, String image, int userID, String keyword, String description, Time CreatedAt, Time UpdatedAt) {
        this.Id = Id;
        this.name = name;
        this.alias = alias;
        this.content = content;
        this.view = view;
        this.source = source;
        this.image = image;
        this.userID = userID;
        this.keyword = keyword;
        this.description = description;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
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

    public String getSource() {
        return source;
    }

    public String getImage() {
        return image;
    }

    public int getUserID() {
        return userID;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getDescription() {
        return description;
    }

    public Time getCreatedAt() {
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

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedAt(Time CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setUpdatedAt(Time UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
}
