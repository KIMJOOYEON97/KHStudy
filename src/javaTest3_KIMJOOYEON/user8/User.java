package javaTest3_KIMJOOYEON.user8;

import java.util.Objects;

public class User {

	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return String.format("%5s %5s %5s %5d %2c %10s" 
			 				,id ,password, name,age, gender,phone );
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id,password,name,age, gender,phone);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj)
//			return true;
//		if(obj == null||!(obj instanceof User))
//			return false;
//		
//		User u = (User) obj;
//		if(id == null) {
//			if(u.id != null)
//				return false;
//		}
//		if(password == null) {
//			if(u.password != null)
//				return false;
//		}
//		if(name == null) {
//			if(u.name != null)
//				return false;
//		}
//		if(age == 0) {
//			if(u.age != 0)
//				return false;
//		}
//		if(gender== ' ') {
//			if(u.gender != ' ')
//				return false;
//		}
//		if(phone == null) {
//			if(u.phone != null)
//				return false;
//		}
//		
//		if(id.equals(u.id)
//				&&password.equals(u.password)
//				&&name.equals(u.name)
//				//int랑 char는 == 비교 가능
//				&&age==u.age
//				&&gender==u.gender
//				&&phone.equals(u.phone)) {
//			return true;			
//		}
//		return false;
//		
//
//	}
	
//	public Object clone() {
//		User copyUser = (User)this.clone();
//		return copyUser;
//	}
	
}
