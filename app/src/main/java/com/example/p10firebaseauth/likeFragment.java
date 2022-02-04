package com.example.p10firebaseauth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;


public class likeFragment extends HomeFragment {

    public likeFragment() {
    }

    @Override
    Query getQuery() {
        return FirebaseFirestore.getInstance().collection("posts").orderBy("likenum", Query.Direction.DESCENDING);
    }


}