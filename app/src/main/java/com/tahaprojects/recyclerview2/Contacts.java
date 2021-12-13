package com.tahaprojects.recyclerview2;

public class Contacts {
    private String Name;
    private  String Email;
    private String ImgURL;

    public Contacts(String name, String email, String imgURL) {
        Name = name;
        Email = email;
        ImgURL = imgURL;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public void setImgURL(String imgURL) {
        ImgURL = imgURL;
    }
}
