package com.collection.list.music;

import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicTitleAscending implements Comparator<Music> {

	//title 오름차순
	@Override
	public int compare(Music m1, Music m2) {
		
		return m1.getTitle().compareTo(m2.getTitle());
	}

	
}
