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

//        Set Toolbar as ActionBar
        Toolbar mainToolbar = findViewById(R.id.albums_toolbar);
        setSupportActionBar(mainToolbar);

//        Create ArrayList of Albums
        ArrayList<Song> albums = new ArrayList<>();

        albums.add(new Song("The Black Album", "Metallica", R.drawable.metallica_grid));
        albums.add(new Song("Nevermind", "Nirvana", R.drawable.nirvana_grid));
        albums.add(new Song("Use Your Illusion", "Guns N' Roses", R.drawable.gunsnroses_grid));
        albums.add(new Song("Californication", "Red Hot Chili Peppers", R.drawable.redhotchilipeppers_grid));
        albums.add(new Song("Yellow Submarine", "The Beatles", R.drawable.thebeatles_grid));
        albums.add(new Song("Physical Graffiti", "Led Zeppelin", R.drawable.ledzeppelin_grid));
        albums.add(new Song("The Black Album", "Metallica", R.drawable.metallica_grid));
        albums.add(new Song("Nevermind", "Nirvana", R.drawable.nirvana_grid));
        albums.add(new Song("Use Your Illusion", "Guns N' Roses", R.drawable.gunsnroses_grid));
        albums.add(new Song("Californication", "Red Hot Chili Peppers", R.drawable.redhotchilipeppers_grid));
        albums.add(new Song("Yellow Submarine", "The Beatles", R.drawable.thebeatles_grid));
        albums.add(new Song("Physical Graffiti", "Led Zeppelin", R.drawable.ledzeppelin_grid));
        albums.add(new Song("The Black Album", "Metallica", R.drawable.metallica_grid));
        albums.add(new Song("Nevermind", "Nirvana", R.drawable.nirvana_grid));
        albums.add(new Song("Use Your Illusion", "Guns N' Roses", R.drawable.gunsnroses_grid));
        albums.add(new Song("Californication", "Red Hot Chili Peppers", R.drawable.redhotchilipeppers_grid));
        albums.add(new Song("Yellow Submarine", "The Beatles", R.drawable.thebeatles_grid));
        albums.add(new Song("Physical Graffiti", "Led Zeppelin", R.drawable.ledzeppelin_grid));

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);

        GridView grid = findViewById(R.id.albums_grid);

        grid.setAdapter(albumAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_albums, menu);
        return super.onCreateOptionsMenu(menu);
    }

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
