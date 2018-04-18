package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {


    TextView titleTextView;
    TextView artistTextView;
    ImageView albumCoverImg;
    TextView albumTextView;
    ImageButton playButton;
    ImageButton nextButton;
    ImageButton backButton;
    ImageButton shuffleButton;
    ImageButton repeatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

//        Set custom Toolbar as ActionBar for the activity
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

        findViews();
        updateViews(title, artist, albumCover, album);
        setClickListenersForPlayer();

    }

    /**
     * Find views for further use
     */
    public void findViews() {
        titleTextView = findViewById(R.id.song_title_text_view);
        artistTextView = findViewById(R.id.song_artist_text_view);
        albumCoverImg = findViewById(R.id.album_cover_img);
        albumTextView = findViewById(R.id.album_text_view);
        playButton = findViewById(R.id.play_button);
        nextButton = findViewById(R.id.next_button);
        backButton = findViewById(R.id.back_button);
        shuffleButton = findViewById(R.id.shuffle_button);
        repeatButton = findViewById(R.id.repeat_button);
    }


    /**
     * Populate views with the data
     *
     * @param title title of the song
     * @param artist artist name
     * @param albumCover image with the cover of the album
     * @param album the name of the album
     */
    public void updateViews(String title, String artist, int albumCover, String album) {
        titleTextView.setText(title);
        artistTextView.setText(artist);
        albumCoverImg.setImageResource(albumCover);
        albumTextView.setText(album);
    }

    public void setClickListenersForPlayer() {
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}

