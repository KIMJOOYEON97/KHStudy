package com.collection.list.music.view;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.MusicSingerAscending;
import com.collection.list.music.MusicTitleAscending;
import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.model.vo.Music;

public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicManager manager = new MusicManager();
	
	
	public void mainMenu() {
		String menu = "    ================ Music Playlist Menu ================\r\n" + 
				"    1.목록보기\r\n" + 
				"    2.마지막에 음악추가\r\n" + 
				"    3.맨처음에 음악추가\r\n" + 
				"    4.곡삭제\r\n" + 
				"    5.곡변경\r\n" + 
				"    6.곡명검색\r\n" + 
				"    7.가수검색\r\n" + 
				"    8.목록정렬(곡명오름차순)\r\n" + 
				"    0.종료\r\n" + 
				"    ================================================================\r\n" + 
				"    >> 메뉴선택 : ";
	
		while(true) {
			int choice;
			try {
				System.out.print(menu);
				choice = sc.nextInt();
			}catch(Exception e) {
				System.out.println("잘못 입력하였습니다.");
				return;
			}
			sc.nextLine(); 
			//이거 때문에 연달아 나오게 된게 왜 그런건지 이해가 안된다.....왜 여기에 이게 들어가야만하지?
			
			if(choice == 1) {
				printList(manager.selectList());}
			
			else if(choice == 2){
				manager.addList(inputMusic());}
				
			else if(choice == 3){
				manager.addAtZero(inputMusic());}
				
			else if(choice == 4){
				System.out.print("삭제할 곡명을 입력하세요: ");	
				String title = sc.nextLine();
				if(manager.removeMusic(title)) System.out.println("성공적으로 삭제했습니다.");
				}
			
			else if(choice == 5){
				Music oldMusic  = inputMusic();
				Music newMusic = inputMusic();
				
				Boolean result = manager.replaceMusic(oldMusic, newMusic);
				if(result)System.out.println("곡 바꾸기에 성공했습니다.");}
				
			else if(choice == 6){
				String title = inputTitle();
				System.out.println(manager.searchMusicTitle(title));					
				
					}
				
			else if(choice == 7){
				String singer = inputSinger();
				System.out.println(manager.searchMusicBySinger(singer));
				}
				
			else if(choice == 8){sortMenu();}
				
			else if(choice == 0){System.out.println("프로그램 종료");break;}
			}
		}
	
	
	
	public void sortMenu() {
		String menu="================== 정렬 메뉴 ===================\r\n" + 
				"1. 가수명 오름차순\r\n" + 
				"2. 가수명 내림차순\r\n" + 
				"3. 곡명 오름차순\r\n" + 
				"4. 곡명 내림차순\r\n" + 
				"5. 메인메뉴 돌아가기\r\n" + 
				"================================================\r\n" + 
				"   >> 메뉴선택 : ";
		while(true) {
			System.out.print(menu);
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: Comparator<Music> comp = new MusicSingerAscending();
						System.out.println(manager.orderby(comp));break;
				case 2:Comparator<Music> comp1 = new MusicSingerAscending().reversed();
						System.out.println(manager.orderby(comp1));break;
				case 3: Comparator<Music> comp2 = new MusicTitleAscending();
						System.out.println(manager.orderby(comp2));break;
				case 4:Comparator<Music> comp3 = new MusicTitleAscending().reversed();
						System.out.println(manager.orderby(comp3));break;
				case 5: return;
			}
		}
		
	}
	
	public void printList (List <Music> set){
		Iterator<Music> iter = set.iterator();
		while(iter.hasNext()) {
		    Music i = iter.next(); 
		    //순차적으로 결과를 확인할 수 있다.
		    System.out.println(i);
		}
	}
	
	public String inputTitle() {
		System.out.print("검색할 곡명을 입력하세요: ");	
		return sc.nextLine();
	}
	
	public String inputSinger() {
		System.out.print("검색할 가수를 입력하세요: ");	
		return sc.nextLine();
	}
	
	public Music inputMusic() {
		System.out.print("곡명을 입력하세요: ");	
		String title = sc.nextLine();
		System.out.print("가수를 입력하세요: ");	
		String singer = sc.nextLine();
		return new Music(title, singer);
	}

}
