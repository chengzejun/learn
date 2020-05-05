package com.chengzejun.dao;

import com.chengzejun.entity.Music;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MusicDaoTest {

    @Autowired
    private MusicDao musicDao;

//    @Test
//   public  void insert(){
//        Music music=new Music();
//        music.setId(1);
//        music.setMusicName("lamda");
//        musicDao.musicInsert(music);
//    }

    @Test
    public void insertTest(){
        for(int i=11;i<=20;i++){
            Music music=new Music();
            music.setMusicId(i);
            music.setMusicName("童话"+i);
            musicDao.musicInsert(music);
        }
    }
}