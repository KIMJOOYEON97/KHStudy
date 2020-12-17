package kh.java.oop.student;

public class StudentMain {

	public static void main(String[] arg) {
		//학생클래스를 new연산자를 이용 객체로 생성.
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setPoint(90);
		s1.printStudentInfo();
		
		Student s2 = new Student();
		s2.setName("신사임당");
		s2.setPoint(87);
		s2.printStudentInfo();
		
	
		Student s3 = new Student();
		s3.setName("세종대왕");
		s3.setPoint(67);
		s3.printStudentInfo();
		
		Student s4 = new Student();
		s4.setName("장영실");
		s4.setPoint(99);
		s4.printStudentInfo();
		
//		System.out.println(s1.getName()+"님의 점수는"+s1.getPoint()+"점입니다.");
//		System.out.println(s2.getName()+"님의 점수는"+s2.getPoint()+"점입니다.");
//		System.out.println(s3.getName()+"님의 점수는"+s3.getPoint()+"점입니다.");
//		System.out.println(s4.getName()+"님의 점수는"+s4.getPoint()+"점입니다."); 
//		메소드를 만들어주면 getName getPoint 일일이 해줄 필요가 없다.
		
		/*
		 * Student s2 = new Student(); s2.name ="신사임당"; s2.point = 87;
		 * s2.printStudentInfo();
		 * 
		 * Student s3 = new Student(); s3.name ="세종대왕"; s3.point = 67;
		 * s3.printStudentInfo();
		 * 
		 * Student s4 = new Student(); s4.name ="장영실"; s4.point = 99;
		 * s4.printStudentInfo();
		 */
		
		Speaker speaker1 = new Speaker();
		speaker1.brand = "JBL";   //필드 정보 작성
		speaker1.color ="red";
		speaker1.volume =5;
		speaker1.maxVolume =10;
		System.out.println(speaker1.info());
		
		Speaker speaker2 = new Speaker();
		speaker2.brand = "하만카돈";   //필드 정보 작성
		speaker2.color ="투명";
		speaker2.volume =50;
		speaker2.maxVolume =100;
		speaker2.volumUp();
		speaker2.volumUp();
		speaker2.volumUp();
		System.out.println(speaker2.info());
		
	}
}
