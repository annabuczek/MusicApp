package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

//        Set custom Toolbar as ActionBar for activity
        Toolbar mainToolbar = findViewById(R.id.albums_toolbar);
        setSupportActionBar(mainToolbar);

//        Create ArrayList of Music objects, representing albums
        ArrayList<Music> albums = new ArrayList<>();

        albums.add(new Music("The Black Album", "Metallica", R.drawable.metallica_grid));
        albums.add(new Music("Nevermind", "Nirvana", R.drawable.nirvana_grid));
        albums.add(new Music("Use Your Illusion", "Guns N' Roses", R.drawable.gunsnroses_grid));
        albums.add(new Music("Californication", "Red Hot Chili Peppers", R.drawable.redhotchilipeppers_grid));
        albums.add(new Music("Yellow Submarine", "The Beatles", R.drawable.thebeatles_grid));
        albums.add(new Music("Physical Graffiti", "Led Zeppelin", R.drawable.ledzeppelin_grid));
        albums.add(new Music("The Black Album", "Metallica", R.drawable.metallica_grid));
        albums.add(new Music("Nevermind", "Nirvana", R.drawable.nirvana_grid));
        albums.add(new Music("Use Your Illusion", "Guns N' Roses", R.drawable.gunsnroses_grid));
        albums.add(new Music("Californication", "Red Hot Chili Peppers", R.drawable.redhotchilipeppers_grid));
        albums.add(new Music("Yellow Submarine", "The Beatles", R.drawable.thebeatles_grid));
        albums.add(new Music("Physical Graffiti", "Led Zeppelin", R.drawable.ledzeppelin_grid));
        albums.add(new Music("The Black Album", "Metallica", R.drawable.metallica_grid));
        albums.add(new Music("Nevermind", "Nirvana", R.drawable.nirvana_grid));
        albums.add(new Music("Use Your Illusion", "Guns N' Roses", R.drawable.gunsnroses_grid));
        albums.add(new Music("Californication", "Red Hot Chili Peppers", R.drawable.redhotchilipeppers_grid));
        albums.add(new Music("Yellow Submarine", "The Beatles", R.drawable.thebeatles_grid));
        albums.add(new Music("Physical Graffiti", "Led Zeppelin", R.drawable.ledzeppelin_grid));

//        Create new instance of custom AlbumAdapter
        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);

        //        Set adapter to GridView
        GridView grid = findViewById(R.id.albums_grid);
        grid.setAdapter(albumAdapter);

    }

//    Create options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_albums, menu);
        return super.onCreateOptionsMenu(menu);
    }


//    Add actions to selected menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.album_menu_songs:
                Intent s = new Intent(AlbumsActivity.this, SongsMainActivity.class);
                startActivity(s);
                return true;

            case R.id.album_menu_artists:
                Intent a = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(a);
                return true;

            default:
        return super.onOptionsItemSelected(item);
        }
    }
}
