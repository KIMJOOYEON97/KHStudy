package com.io.test4.run;

import com.io.test4.controller.BookManager;

public class TestBookManager {

	public static void main(String[] args) {
/**
 *     main() 포함
    1. BookManager 클래스의 메소드 실행 테스트함
 */
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}

}
