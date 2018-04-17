package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_songs);

//        Set Toolbar as ActionBar
        Toolbar mainToolbar = (Toolbar) findViewById(R.id.songs_toolbar);
        setSupportActionBar(mainToolbar);

//      Create ArrayList of songs
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Enter Sandman", "Metallica", "The Black Album", R.drawable.metallica ));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", "Nevermind", R.drawable.gunsnroses));
        songs.add(new Song("Don't Cry", "Guns N' Roses", "Use Your Illusion", R.drawable.nirvana));
        songs.add(new Song("Otherside", "Red Hot Chili Peppers", "Californication", R.drawable.red_hot_chili_peppers));
        songs.add(new Song("All You Need Is Love", "The Beatles", "Yellow Submarine", R.drawable.the_beatles));
        songs.add(new Song("In My Time Of Dying", "Led Zeppelin", "Physical Graffiti", R.drawable.led_zeppelin));
        songs.add(new Song("Nothing Else Matters", "Metallica", "The Black Album", R.drawable.metallica));
        songs.add(new Song("Lithium", "Nirvana", "Nevermind", R.drawable.gunsnroses));
        songs.add(new Song("November Rain", "Guns N' Roses", "Use Your Illusion", R.drawable.gunsnroses));
        songs.add(new Song("Around The World", "Red Hot Chili Peppers", "Californication", R.drawable.red_hot_chili_peppers));
        songs.add(new Song("Yellow Submarine", "The Beatles", "Yellow Submarine", R.drawable.the_beatles));
        songs.add(new Song("Kashmir", "Led Zeppelin", "Physical Graffiti", R.drawable.led_zeppelin));
        songs.add(new Song("The Unforgiven", "Metallica", "The Black Album", R.drawable.metallica));
        songs.add(new Song("Polly", "Nirvana", "Nevermind", R.drawable.nirvana));
        songs.add(new Song("Knockin’ on Heaven’s Door", "Guns N' Roses", "Use Your Illusion", R.drawable.gunsnroses));
        songs.add(new Song("Californication", "Red Hot Chili Peppers", "Californication", R.drawable.red_hot_chili_peppers));
        songs.add(new Song("All Together Now", "The Beatles", "Yellow Submarine", R.drawable.the_beatles));
        songs.add(new Song("Trampled Under Foot", "Led Zeppelin", "Physical Graffiti", R.drawable.led_zeppelin));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView list = findViewById(R.id.song_list);

        list.setAdapter(songAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song selectedSong = songs.get(position);

                Intent i = new Intent(SongsMainActivity.this, NowPlayingActivity.class);
                i.putExtra("SONG_TITLE", selectedSong.getTitle());
                i.putExtra("SONG_ARTIST", selectedSong.getArtist());
                i.putExtra("ALBUM_COVER", selectedSong.getAlbumCover());
                i.putExtra("SONG_ALBUM", selectedSong.getAlbum());
                startActivity(i);

            }
        });

    }

//    Create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_songs, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    Add actions to menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.songs_menu_search:
                return true;

            case R.id.songs_menu_albums:

                Intent al = new Intent(SongsMainActivity.this, AlbumsActivity.class);
                startActivity(al);
                return true;

            case R.id.songs_menu_artists:

                Intent ar = new Intent(SongsMainActivity.this, ArtistsActivity.class);
                startActivity(ar);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
