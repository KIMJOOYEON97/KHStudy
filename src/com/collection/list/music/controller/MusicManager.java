package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.collection.list.music.MusicTitleAscending;
import com.collection.list.music.model.vo.Music;

public class MusicManager{

	Scanner sc = new Scanner(System.in);
	private List <Music> mList = new ArrayList<Music>();
	// => 초기화블럭을 사용하여 5곡을 미리 만들어두기
	{ 	
		mList.add(new Music("러시안룰렛","Redvelvet"));
		mList.add(new Music("피카부","Redvelvet"));
		mList.add(new Music("불장난","Blackpink"));
		mList.add(new Music("불장난","Blackpink"));
		mList.add(new Music("파노라마","Izone"));
	}
	//1. 음악리스트 리턴
	public List <Music> selectList(){
		return mList;
	}
	//2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
	public void addList(Music m) {
		mList.add(m);
		
	}
	//3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	public void addAtZero(Music m) {
		mList.add(0,m);
	}
	//4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
//	삭제여부를 리턴
	public boolean removeMusic(String s) {
		
		if(mList.contains(new Music(s,""))) {
			int delIdx = mList.indexOf(new Music(s,""));
			mList.remove(delIdx);
			return true;
		}
		else System.out.println("검색하신 제목의 곡은 없습니다.");
		return false;
	}
	
	//5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
//	교체 성공여부를 리턴
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		if(mList.indexOf(oldMusic) != -1) {
			int oldidx = mList.indexOf(oldMusic);
			mList.set(oldidx, newMusic);
			return true;	
		}
		return false;
		
	}
	
//	6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
//	(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
	
	public List <Music> searchMusicTitle(String title){
		List <Music> searchMusicTitle = new ArrayList<Music>();
		if(mList.contains(new Music(title,""))) {
			int titleidx = mList.indexOf(new Music(title,""));
			searchMusicTitle.add(mList.get(titleidx));
			return searchMusicTitle;
		}else { System.out.println("검색결과가 없습니다.");
		return null;}

		
	}
	
	//7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	public List <Music> searchMusicBySinger(String singer){
		List <Music> searchMusicSinger = new ArrayList<Music>();
		if(mList.contains(new Music("",singer))) {
			int singeridx = mList.indexOf(new Music("",singer));
			searchMusicSinger.add(mList.get(singeridx));
			return searchMusicSinger;
		}else { System.out.println("검색결과가 없습니다.");
		return null;}
	}
	
//	8.서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	public List <Music> orderby(Comparator<Music> c){
		List<Music> mList = (List<Music>)((ArrayList) this.mList).clone();
		mList.sort(c);
		return mList;
	}
	
}