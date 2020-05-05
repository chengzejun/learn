package com.chengzejun.dao;

import com.chengzejun.entity.Music;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicDao {
    void musicInsert(Music music);
}
