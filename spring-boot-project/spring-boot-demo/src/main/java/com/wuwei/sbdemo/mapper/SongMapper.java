package com.wuwei.sbdemo.mapper;

import com.wuwei.sbdemo.Bean.Song;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapper {

	@Select("select * from songs")
	List<Song> getAllSongs();


	List<Song> getSongsBySinger();
}
