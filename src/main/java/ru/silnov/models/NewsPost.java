package ru.silnov.models;

public class NewsPost {
    private int id;
    private String title;
    private String stringText;

    public NewsPost() {

    }

    public NewsPost(int id, String title, String stringText) {
        this.id = id;
        this.title = title;
        this.stringText = stringText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStringText() {
        return stringText;
    }

    public void setStringText(String stringText) {
        this.stringText = stringText;
    }
}