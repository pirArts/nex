package com.ea.nex.Mappers;

import com.ea.nex.Models.GameScoreDB;
import org.apache.ibatis.annotations.Param;

/**
 * Created by EricQiu on 8/29/2014.
 */
public interface GameScoreMapper {
    public void save(@Param("entity")GameScoreDB entity);
}
