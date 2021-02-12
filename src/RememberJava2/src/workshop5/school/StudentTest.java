package workshop5.school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("홍길동",16,175,65);
		
		int num = 0;
		int sumArg = 0;
		int sumHeight = 0;
		double avgAge = 0;
		double avgHeight = 0;
		
		System.out.println("이름" + "\t" + "나이" + "\t"+ "신장" + "\t" + "몸무게");
		for(int i =0; i <studentArray.length;i++) {
			System.out.println(studentArray[i]);
			sumArg += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			num++;
		}
		
		avgAge = (sumArg/(double)num);
		avgHeight =(sumHeight/(double)num);

		System.out.println();
		System.out.printf("%.2f\n",avgAge);
		System.out.printf("%.2f",avgHeight);

	}

}
