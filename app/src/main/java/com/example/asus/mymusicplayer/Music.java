package com.example.asus.mymusicplayer;

public class Music {

    /**
     * image resource
     */
    private int mImageResourceId;

    /**
     * titel of songkategory
     */
    private String mTitelOfSong;

    /**
     * titel of song
     */
    private String mSortOfSong;

    /**
     * song resource
     */
    private int mAudioResourceId;


    /**
     * Create a new music object
     */

    public Music(int ImageResourceId, String TitelOfSong, String SortOfSong, int AudioResourceId) {
        mImageResourceId = ImageResourceId;
        mTitelOfSong = TitelOfSong;
        mSortOfSong = SortOfSong;
        mAudioResourceId = AudioResourceId;
    }


    /**
     * Return the default image resource
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the default titel of song
     */
    public String getmSortOfSong() {
        return mSortOfSong;
    }

    /**
     * Return the default kategory of song
     */
    public String getmTitelOfSong() {
        return mTitelOfSong;
    }

    /**
     * Return the audio resource id
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

}
