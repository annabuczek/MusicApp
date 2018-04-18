package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

//        Set Toolbar as ActionBar
        Toolbar nowPlayingToolbar = findViewById(R.id.now_playing_toolbar);
        setSupportActionBar(nowPlayingToolbar);

//        Set back button on Toolbar
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

//        Get values from intent
        Intent i = getIntent();
        String title = i.getStringExtra("SONG_TITLE");
        String artist = i.getStringExtra("SONG_ARTIST");
        int albumCover = i.getIntExtra("ALBUM_COVER", 0);
        String album = i.getStringExtra("SONG_ALBUM");

//        Find Views
        TextView titleTextView = findViewById(R.id.song_title_text_view);
        TextView artistTextView = findViewById(R.id.song_artist_text_view);
        ImageView albumCoverImg = findViewById(R.id.album_cover_img);
        TextView albumTextView = findViewById(R.id.album_text_view);

//        Set values from intent to views
        titleTextView.setText(title);
        artistTextView.setText(artist);
        albumCoverImg.setImageResource(albumCover);
        albumTextView.setText(album);
    }

}
