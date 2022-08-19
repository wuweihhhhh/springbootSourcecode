package com.wuwei.sbdemo.Service.impl;

import com.wuwei.sbdemo.Bean.Song;
import com.wuwei.sbdemo.Service.SongService;
import com.wuwei.sbdemo.mapper.SongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	SongMapper songMapper;

	public List<Song> getAllSongs() {
		return songMapper.getAllSongs();
	}

	public List<Song> getSongsBySinger(String singer) {
		return songMapper.getSongsBySinger();
	}
}
