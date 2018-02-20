package DataBase;

import model.VideoStoreClient;

import java.util.ArrayList;
import java.util.List;

public class ClientDB {
    private List<VideoStoreClient> db = new ArrayList<VideoStoreClient>();

    public boolean addClient(VideoStoreClient client){
        if (findByIdIndex(client.getClientId()) == -1) {
            db.add(client);
            return true;
        }else
        return false;
    }
    public VideoStoreClient[] whoHasMovie(String title){
        List<VideoStoreClient> result = new ArrayList<VideoStoreClient>();
        for(VideoStoreClient vsc : db){
            if(vsc.haveMovieBre(title)) result.add(vsc);
        }
        return result.toArray(new VideoStoreClient[0]);
    }
    public boolean removeClient(String clientId){
        int idx = findByIdIndex(clientId);
        if(idx == -1){
            return false;
        }else
            db.remove(idx);
        return true;
    }
    public boolean checkClientId(String clientId){
        if(findByIdIndex(clientId) == -1){
            return false;
        }else
        return true;
    }

    public VideoStoreClient findClient(String clientId){
        return db.get(findByIdIndex(clientId));
    }

    private int findByIdIndex(String id){
        for (int i = 0; i < db.size() ; i++) {
            if(db.get(i).getClientId().equals(id))
                return i;
        }
        return -1;
    }
}
