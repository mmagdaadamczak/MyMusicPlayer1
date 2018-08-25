package com.example.asus.mymusicplayer;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MeditationActivity extends AppCompatActivity {

    /**
     * Play all sounds in app
     */
    private MediaPlayer mMediaPlayer;


    /**
     * This listener gets triggered when the MediaPlayer has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener () {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer ();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.song_list );

        // Create a list of songs
        final ArrayList<Music> musics = new ArrayList<> ();
        musics.add ( new Music ( R.drawable.india, "Meditation", "India sounds", R.raw.daw ) );
        musics.add ( new Music ( R.drawable.meditation, "Meditation", "Meditation music", R.raw.wad ) );

        // Create an MusicAdapter. The adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter ( this, musics );

        // Set adapter on a ListView, and find this ListView in XML
        ListView listView = findViewById ( R.id.my_list );
        listView.setAdapter ( adapter );

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
                                              @Override
                                              public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                                                  // Release the media player if it currently exists because we are about to
                                                  // play a different sound file


                                                  releaseMediaPlayer ();

                                                  // Set Music object at the given position the user clicked on
                                                  Music music = musics.get ( position );

                                                  // Create MediaPlayer
                                                  mMediaPlayer = MediaPlayer.create ( MeditationActivity.this, music.getmAudioResourceId () );

                                                  // Start the audio file
                                                  mMediaPlayer.start ();

                                                  // Setup a listener on the media player, so that we can stop and release the
                                                  // media player once the sound has finished playing.
                                                  mMediaPlayer.setOnCompletionListener ( mCompletionListener );
                                              }
                                          }
        );

    }

    /**
     * When the activity is stopped, release the media player resources
     */
    @Override
    public void onStop() {
        super.onStop ();

        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer ();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release ();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

        }
    }

}













