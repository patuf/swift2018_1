package swift2018_1.hristo.hwk_07.VideoStore.model;

import java.util.ArrayList;
import java.util.List;

public class VideoStoreClient {

    private final String clientId;
    private final List<RentedMovie> rentedMovies;

    public VideoStoreClient(String clientId) {
        this.clientId = clientId;
        rentedMovies = new ArrayList<RentedMovie>();
    }

    public String getClientId() {
        return clientId;
    }

    public boolean haveMovieBre(String title){
        for (RentedMovie rm : rentedMovies)
            if (rm.getTitle().equals(title))
                return true;

        return false;

    }
}
