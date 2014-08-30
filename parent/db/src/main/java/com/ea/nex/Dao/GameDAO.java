package com.ea.nex.Dao;

import com.ea.nex.Models.GameScoreDB;

/**
 * Created by EricQiu on 8/29/2014.
 */
public interface GameDAO {
    public void save(GameScoreDB entry);
    public float getRating(long score);
}
