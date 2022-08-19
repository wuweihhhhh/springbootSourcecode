package com.wuwei.sbdemo.Bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;

@Component
public class Song implements Serializable {

	String id;
	String title;
	String singBy;
	String lyrics;
	String cover;
	Date releaseDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSingBy() {
		return singBy;
	}

	public void setSingBy(String singBy) {
		this.singBy = singBy;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Song{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", singBy='" + singBy + '\'' +
				", lyrics='" + lyrics + '\'' +
				", cover='" + cover + '\'' +
				", release=" + releaseDate +
				'}';
	}
}
