package com.swift.videostore.database;

import com.swift.videostore.model.VideoStoreClient;
import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.List;

public class ClientDb
{
    private List <VideoStoreClient> db = new ArrayList<VideoStoreClient>();

    public boolean addClient(VideoStoreClient client)
    {
        if (findByIdIdx(client.getClientId()) == -1)
        {
            db.add(client);
            return true;
        }
        else
            return false;
    }

    public boolean removeClient(String  title)
    {
        int idx = findByIdIdx(title);
        if (idx > -1)
        {
            db.remove(idx);
            return true;
        }
        else
            return false;
    }

    private int findByIdIdx(String id)
    {
        for (int i = 0; i < db.size(); i ++)
        {
            if (db.get(i).getClientId().equals(id))
                return i;
        }
        return -1;
    }

    public VideoStoreClient[] whoHasMovie(String title)
    {
        List<VideoStoreClient> result = new ArrayList<VideoStoreClient>();

        for (VideoStoreClient vsc: db)
            if (vsc.haveMovieBre(title))
                result.add(vsc);
        return result.toArray(new VideoStoreClient[0]);
    }

    public int getClientCount()
    {
        return this.db.size();
    }
}
