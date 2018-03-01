package swift2018_1.hristo.hwk_07.VideoStore.database;
import java.time.LocalDate;


import swift2018_1.hristo.hwk_07.VideoStore.model.VideoStoreMovie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MovieDB {

    private List <VideoStoreMovie> db = new ArrayList<VideoStoreMovie>();

    public boolean addMovie (VideoStoreMovie movie){
        db.add (movie);
        return true;
    }

    public boolean removeMovie (String title) {
        int idx = findByTitleidx(title);
            if (idx > -1) {
                db.remove(idx);
                return true;
            } else
                return false;
        }

        public VideoStoreMovie findByTitle(String title){
         int idx = findByTitleidx(title);
         if (idx > -1){
             return db.get(idx);
         }else
             return null;
        }

    private int findByTitleidx(String title){
        for (int i = 0; i < db.size(); i++) {
            if(db.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }

        public VideoStoreMovie[] findByEditor(String editor) {
            List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
            for (VideoStoreMovie vsm : db) {
                if (vsm.getEditor().equals(editor))
                    result.add(vsm);
            }
                return result.toArray(new VideoStoreMovie[0]);
            }


    public VideoStoreMovie [] findByGenre (String genre) {
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db)
            if (vsm.getGenre().equals(genre))
                result.add(vsm);
        return result.toArray(new VideoStoreMovie[0]);
    }

    public VideoStoreMovie[] findAboveRating (double rating){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db)
            if (vsm.getImdbRating() < rating)
                result.add(vsm);
        return result.toArray(new VideoStoreMovie[0]);
    }

    public VideoStoreMovie[] findAfterDate (LocalDate date){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db)
            if (vsm.getReleseDate().isBefore(date)) {
                result.add(vsm);
            }
        return result.toArray(new VideoStoreMovie[0]);
    }

}
