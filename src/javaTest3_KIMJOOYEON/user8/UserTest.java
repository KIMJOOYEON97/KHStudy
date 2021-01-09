package javaTest3_KIMJOOYEON.user8;

public class UserTest {

	public static void main(String[] args) {
		User[] user = new User[3];
		user[0] =new User("user01", "pass01","김철수" ,32 ,'M', "010-1234-5678");
		user[1] =new User("user02", "pass02","이영희" ,25,'F', "010-5555-7777");
		user[2] =new User("user03", "pass03","황진이" ,20,'F', "010-9876-5678");
	
		System.out.println("users list -------------------------------------------------------------------");
		for(User u :user) {
			System.out.println(u);
		}
		System.out.println("copyUsers list -------------------------------------------------------------------");
		
		User[] copyUsers = new User[user.length];
		for(int i = 0;i<user.length;i++) {
			copyUsers[i] = user[i];
		}
		
		for(User u :copyUsers) {
			System.out.println(u);
		}
		System.out.println("비교결과 -------------------------------------------------------------------");
		
		for(int i = 0; i<copyUsers.length;i++) {
			System.out.println(copyUsers[i].equals(user[i]));
		}
		
		
			
//		boolean flag = false;
//		for(int i =0;i<user.length; i++) {
//			if(copyUsers[i].getId().equals(user[i].getId())){
//				if(copyUsers[i].getPassword().equals(user[i].getPassword())) {
//					if(copyUsers[i].getName().equals(user[i].getName())) {
//						if(copyUsers[i].getAge() == user[i].getAge()) {
//							if(copyUsers[i].getGender() == user[i].getGender()) {
//								if(copyUsers[i].getPhone().equals(user[i].getPhone())) {
//									flag = true;
//									
//								}
//							}
//						}
//					}
//				}
//			}				
//			System.out.println(flag);
//		}
	
	
	}
}
