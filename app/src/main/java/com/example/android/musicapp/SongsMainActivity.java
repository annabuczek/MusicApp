package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

//        Set custom Toolbar as ActionBar for activity
        Toolbar mainToolbar = findViewById(R.id.songs_toolbar);
        setSupportActionBar(mainToolbar);

//      Create ArrayList of Music objects, representing songs
        final ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music("Enter Sandman", "Metallica", "The Black Album", R.drawable.metallica ));
        songs.add(new Music("Smells Like Teen Spirit", "Nirvana", "Nevermind", R.drawable.gunsnroses));
        songs.add(new Music("Don't Cry", "Guns N' Roses", "Use Your Illusion", R.drawable.nirvana));
        songs.add(new Music("Otherside", "Red Hot Chili Peppers", "Californication", R.drawable.red_hot_chili_peppers));
        songs.add(new Music("All You Need Is Love", "The Beatles", "Yellow Submarine", R.drawable.the_beatles));
        songs.add(new Music("In My Time Of Dying", "Led Zeppelin", "Physical Graffiti", R.drawable.led_zeppelin));
        songs.add(new Music("Nothing Else Matters", "Metallica", "The Black Album", R.drawable.metallica));
        songs.add(new Music("Lithium", "Nirvana", "Nevermind", R.drawable.gunsnroses));
        songs.add(new Music("November Rain", "Guns N' Roses", "Use Your Illusion", R.drawable.gunsnroses));
        songs.add(new Music("Around The World", "Red Hot Chili Peppers", "Californication", R.drawable.red_hot_chili_peppers));
        songs.add(new Music("Yellow Submarine", "The Beatles", "Yellow Submarine", R.drawable.the_beatles));
        songs.add(new Music("Kashmir", "Led Zeppelin", "Physical Graffiti", R.drawable.led_zeppelin));
        songs.add(new Music("The Unforgiven", "Metallica", "The Black Album", R.drawable.metallica));
        songs.add(new Music("Polly", "Nirvana", "Nevermind", R.drawable.nirvana));
        songs.add(new Music("Knockin’ on Heaven’s Door", "Guns N' Roses", "Use Your Illusion", R.drawable.gunsnroses));
        songs.add(new Music("Californication", "Red Hot Chili Peppers", "Californication", R.drawable.red_hot_chili_peppers));
        songs.add(new Music("All Together Now", "The Beatles", "Yellow Submarine", R.drawable.the_beatles));
        songs.add(new Music("Trampled Under Foot", "Led Zeppelin", "Physical Graffiti", R.drawable.led_zeppelin));

        //        Create new instance of custom SongAdapter
        SongAdapter songAdapter = new SongAdapter(this, songs);

        //        Set adapter to ListView
        ListView list = findViewById(R.id.song_list);
        list.setAdapter(songAdapter);

//        Set onClickListener to selected item from the list
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Music selectedSong = songs.get(position);

//                Open new activity with details about the song
                Intent i = new Intent(SongsMainActivity.this, NowPlayingActivity.class);
                i.putExtra("SONG_TITLE", selectedSong.getTitle());
                i.putExtra("SONG_ARTIST", selectedSong.getArtist());
                i.putExtra("ALBUM_COVER", selectedSong.getAlbumCover());
                i.putExtra("SONG_ALBUM", selectedSong.getAlbum());
                startActivity(i);

            }
        });

    }

//    Create options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_songs, menu);

        return super.onCreateOptionsMenu(menu);
    }

//    Add actions to selected menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.songs_menu_albums:

                Intent al = new Intent(SongsMainActivity.this, AlbumsActivity.class);
                startActivity(al);
                return true;

            case R.id.songs_menu_artists:

                Intent ar = new Intent(SongsMainActivity.this, ArtistsActivity.class);
                startActivity(ar);
                return true;

            case R.id.songs_menu_exit:

                Intent ex = new Intent(Intent.ACTION_MAIN);
                ex.addCategory(Intent.CATEGORY_HOME);
                ex.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(ex);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
