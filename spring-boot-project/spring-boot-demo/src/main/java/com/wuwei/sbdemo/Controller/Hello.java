package com.wuwei.sbdemo.Controller;

import com.wuwei.sbdemo.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

	@Autowired
	SongService songService;

	@RequestMapping("/roy")
	public String test()
	{
		return "hello roy!";
	}

	@RequestMapping("/allSongs")
	public String getAllSongs()
	{
		return songService.getAllSongs().toString();
	}

	@RequestMapping("/roySongs")
	public String getSongsBySinger()
	{
		return songService.getSongsBySinger("Roy").toString();
	}


}
