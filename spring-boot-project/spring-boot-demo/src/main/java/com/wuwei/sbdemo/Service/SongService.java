package com.wuwei.sbdemo.Service;

import com.wuwei.sbdemo.Bean.Song;

import java.util.List;

public interface SongService {


	List<Song> getAllSongs();

	List<Song> getSongsBySinger(String singer);
}
