package swift2018_1.hristo.hwk_07.VideoStore.database;

import swift2018_1.hristo.hwk_07.VideoStore.model.VideoStoreClient;

import java.util.ArrayList;
import java.util.List;

public class ClientDB {

    private List<VideoStoreClient> db = new ArrayList<VideoStoreClient>();

    public boolean addClient (VideoStoreClient client) {
        if (findByIdIdx(client.getClientId()) == -1) {
            db.add(client);
            return true;
        } else
            return false;
    }

    public VideoStoreClient[] whoHasMovie (String title){
        List<VideoStoreClient> result = new ArrayList<VideoStoreClient>();

        for(VideoStoreClient vsc : db){
            if (vsc.haveMovieBre(title))
                result.add(vsc);
        }
        return result.toArray(new VideoStoreClient[0]);
    }

    private int findByIdIdx (String id){

        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getClientId().equals(id) )
                return i;
        }
        return -1;
    }


}
