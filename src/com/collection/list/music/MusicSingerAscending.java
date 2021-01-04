package com.collection.list.music;

import java.util.Comparator;

import com.collection.list.music.model.vo.Music;

public class MusicSingerAscending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
