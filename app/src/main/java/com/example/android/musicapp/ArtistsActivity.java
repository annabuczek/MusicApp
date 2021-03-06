package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //        Set custom Toolbar as ActionBar for activity
        Toolbar mainToolbar = findViewById(R.id.artists_toolbar);
        setSupportActionBar(mainToolbar);

//        Create ArrayList of String, representing Artists
        ArrayList<String> artists = new ArrayList<>();

        artists.add("Metallica");
        artists.add("Nirvana");
        artists.add("Guns N' Roses");
        artists.add("Red Hot Chili Peppers");
        artists.add("The Beatles");
        artists.add("Led Zeppelin");
        artists.add("Metallica");
        artists.add("Nirvana");
        artists.add("Guns N' Roses");
        artists.add("Red Hot Chili Peppers");
        artists.add("The Beatles");
        artists.add("Led Zeppelin");
        artists.add("Metallica");
        artists.add("Nirvana");
        artists.add("Guns N' Roses");
        artists.add("Red Hot Chili Peppers");
        artists.add("The Beatles");
        artists.add("Led Zeppelin");

//        Create new instance of ArrayAdapter
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.artists_list_item, artists);


//        Set ArrayAdapter
        ListView list = findViewById(R.id.artist_list);
        list.setAdapter(listAdapter);


    }

//    Create options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_artists, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //    Add actions to selected menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.menu_artists_songs:

                Intent s = new Intent(ArtistsActivity.this, SongsMainActivity.class);
                startActivity(s);
                return true;

            case R.id.menu_artists_albums:

                Intent a = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(a);
                return true;

            default:
        return super.onOptionsItemSelected(item);
        }
        }

}
