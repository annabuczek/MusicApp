package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aania on 16.04.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    SongAdapter(Activity context, ArrayList<Song> songsList) {
        super(context, 0, songsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Song currentSong = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.songs_list_item, parent, false);
        }

        TextView titleSongTextView = convertView.findViewById(R.id.title_text_view);
        TextView artistTextView = convertView.findViewById(R.id.artist_text_view);

        titleSongTextView.setText(currentSong.getTitle());
        artistTextView.setText(currentSong.getArtist());

        return convertView;
    }
}
