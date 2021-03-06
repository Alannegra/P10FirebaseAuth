package com.example.p10firebaseauth;

import java.util.HashMap;
import java.util.Map;

public class Post {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public Map<String, Boolean> likes = new HashMap<>();
    public String mediaUrl;
    public String mediaType;
    public String time;
    public int likenum;

    // Constructor vacio requerido por Firestore
    public Post() {}

    public Post(String uid, String author, String authorPhotoUrl, String content,String mediaUrl, String mediaType, String time) {
        this.uid = uid;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
       //Long timeactual = System.currentTimeMillis()/1000;
        // this.time = timeactual.toString();
        this.time = time;
    }
}