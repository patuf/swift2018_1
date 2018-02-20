package com.swift.videostore.database;

import com.swift.videostore.model.VideoStoreMovie;

import java.util.ArrayList;
import java.util.List;

public class MovieDB {
    private List<VideoStoreMovie> db = new ArrayList<VideoStoreMovie>();

    public boolean addMovie(VideoStoreMovie movie) {
        int idx = findByTitleIdx(movie.getTitle());
        if (idx > -1) {
            return false;
        }

        db.add(movie);
        return true;
    }

    public boolean removeMovie(String title) {
        int idx = findByTitleIdx(title);
        if (idx > -1) {
            db.remove(idx);
            return true;
        } else
            return false;
    }

    public VideoStoreMovie findByTitle(String title) {
        int idx = findByTitleIdx(title);
        if (idx > -1) {
            return db.get(idx);
        } else
            return null;
    }

    public VideoStoreMovie[] findByEditor(String editor) {
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db) {
            if (vsm.getEditor().equals(editor))
                result.add(vsm);
        }

        return result.toArray(new VideoStoreMovie[0]);
    }

    private int findByTitleIdx(String title) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }
}
