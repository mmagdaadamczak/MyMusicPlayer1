package com.example.asus.mymusicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    /**
     * Create a new WordAdapter object
     */
    public MusicAdapter(Activity context, ArrayList<Music> musics) {
        super ( context, 0, musics );

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.main_list, parent, false );
        }
        // Located the object on a position
        Music currentMusic = getItem ( position );

        //Find the text view in XML and set text on this text view
        TextView songTextView = listItemView.findViewById ( R.id.titel );
        songTextView.setText ( currentMusic.getmTitelOfSong () );

        TextView sortTextView = listItemView.findViewById ( R.id.sort );
        sortTextView.setText ( currentMusic.getmSortOfSong () );

        // Find ImageView in XML and set an image on it
        ImageView imageView = listItemView.findViewById ( R.id.song_image );
        imageView.setImageResource ( currentMusic.getmImageResourceId () );


        // Return the whole list item layout
        return listItemView;

    }
}
