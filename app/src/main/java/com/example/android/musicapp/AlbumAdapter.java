package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aania on 17.04.2018.
 */

public class AlbumAdapter extends ArrayAdapter<Music> {

    public AlbumAdapter(Activity context, ArrayList<Music> albums){
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Music currentAlbum = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.albums_grid_item, parent, false);
        }

        ImageView albumCoverImageView = convertView.findViewById(R.id.albums_cover_img);
        TextView albumTextView = convertView.findViewById(R.id.albums_album_text_view);
        TextView artistTextView = convertView.findViewById(R.id.albums_artist_text_view);

        albumCoverImageView.setImageResource(currentAlbum.getAlbumCover());
        albumTextView.setText(currentAlbum.getAlbum());
        artistTextView.setText(currentAlbum.getArtist());

        return convertView;
    }
}
