package com.example.p10firebaseauth;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class timeFragment extends HomeFragment {

    public timeFragment() {
    }

    @Override
    Query getQuery() {
        return FirebaseFirestore.getInstance().collection("posts").orderBy("time", Query.Direction.DESCENDING);
    }


}