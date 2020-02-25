package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TimelineActivity extends AppCompatActivity {

    public static final String TAG = "TimelineActivity";
    RecyclerView rvPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        rvPost = findViewById(R.id.rvPost);
    }

}
