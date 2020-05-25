package com.rudyy.springecurity;

public class Quottion {
    private String content;
    private String author;

    public Quottion() {
    }

    public Quottion(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
