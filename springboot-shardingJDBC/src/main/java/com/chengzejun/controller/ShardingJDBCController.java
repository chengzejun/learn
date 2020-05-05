package com.chengzejun.controller;


import com.chengzejun.dao.MusicDao;
import com.chengzejun.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShardingJDBCController {

    @Autowired
    private MusicDao musicDao;


    @GetMapping("/test")
    public String test(){
        for(int i=0;i<=10;i++){
            Music music=new Music();
            music.setMusicId(i);
            music.setMusicName("童话"+i);
            musicDao.musicInsert(music);
        }
        return "0";
    }
}
