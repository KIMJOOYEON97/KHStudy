package com.oop.method;

public class Test {
	
	//다음 코드에서 각 출력문에 찍히게 될 값을 작성하고, 실제 코드로 작성후 확인하세요.
	  int a = 100;
	    static int s = 99;
	    
	    public static void main(String[] args) {
	        Test t = new Test();
	        t.test1();
	        
	        t.test2();
	        
	        Test t3 = new Test();
	        t.test3(t3);
	        System.out.println(t3.a); //t3.a의 값은 t.a = 10으로 지정했음으로 t3.a는 10이다.
	        
	        
	        t.test4(t);
	            
	    }
	    public void test1() {
	        int a = 1000;
	        int s = 999;
	        System.out.println(this.a); //100  this는 int a =100을 가리킨다
	        System.out.println(Test.s); //99   Test클래스의 s를 참조하는 것임으로 99
	    }
	    public void test2() {
	        Test t = new Test();
	        t.a = 1000;
	        System.out.println(a); //t.a라면 1000이 되지만  그냥 a일 경우 int a =100 참조
	    }
	    public void test3(Test t) {
	        t.a = 10;
	        this.a = 200;	  
	        System.out.println(t.a); //10
	        System.out.println(a); //this는 int a =100이 200으로 바뀐것임
	    }
	    public void test4(Test t) {
	        t.a = 1000;
	        System.out.println(this.a); //1000  여기서 this는 test4d의 객체 t를 참조하는 것으로  t.a =1000으로 바꿨음으로 1000
	    }
}

