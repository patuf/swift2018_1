package DataBase;

import model.VideoStoreMovie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieDB {
    private List<VideoStoreMovie> db = new ArrayList<VideoStoreMovie>();

    public boolean addMovie(VideoStoreMovie movie){
        int idx = findByTitleIdx(movie.getTitle());
        if (idx > -1)  return false;
        db.add(movie);
        return true;
    }
    public boolean removeMvie(String title){
        int idx = findByTitleIdx(title);
        if(idx > -1) {
            db.remove(idx);
            return true;
        }else
            return false;
    }

    public VideoStoreMovie findByTitle(String title){
        int idx = findByTitleIdx(title);
        if (idx > -1){
            return db.get(idx);
        }
        return null;
    }

    public VideoStoreMovie[] findByEditor(String editor){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for(VideoStoreMovie vsm : db){
            if(vsm.getEditor().equals(editor)){
                result.add(vsm);
            }
        }
        return result.toArray(new VideoStoreMovie[0]);
    }

    public VideoStoreMovie[] findByGenre(String genre){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for(VideoStoreMovie vsm : db){
            if(vsm.getGenre().equals(genre)){
                result.add(vsm);
            }
        }
        return result.toArray(new VideoStoreMovie[0]);
    }

    public VideoStoreMovie[] findByRating(double rating){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for(VideoStoreMovie vsm : db){
            if(vsm.getImdbRating() >= rating)
                result.add(vsm);
        }
        return result.toArray(new VideoStoreMovie[0]);
    }

    public VideoStoreMovie[] findByDate(LocalDate date){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for(VideoStoreMovie vsm : db){
            if(vsm.getReleaseDate().equals(date))
                result.add(vsm);
        }
        return  result.toArray(new VideoStoreMovie[0]);
    }

    private int findByTitleIdx(String title){
        for (int i = 0; i < db.size(); i++) {
            if(db.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }
}
