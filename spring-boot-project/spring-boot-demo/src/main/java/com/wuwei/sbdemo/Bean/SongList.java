package com.wuwei.sbdemo.Bean;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SongList {

	List<Song> songs;

	public SongList(List<Song> songs)
	{
		this.songs = songs;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
}
