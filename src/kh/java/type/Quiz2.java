package kh.java.type;
/**
 * 2. 다음 코드의 형변환 과정과 결과값을 예상해 주석으로 작성한뒤 콘솔 결과와 비교하세요.
        public void test2(){
            System.out.println("A = "+ ('A'+0));
            
            System.out.println("0 =" + ('0' + 0) );
            
            System.out.println("(char)65 = " + (char)65);
            
            byte bt1 = 125;
            char ch1 = 'C';
            int it1 = bt1 - ch1;
            System.out.println("it1 = "+it1);
            
            
            boolean bool = false;
            
            bool = (2.0 == 5/2);
            System.out.println("bool = " + bool);
            
            bool = ('C' == 67);
            System.out.println("bool = " + bool);
            
            bool = ('A' == 'B'-1);
            System.out.println("bool = " + bool);
            
            bool = ('a' != 97 );//부정연산자
            System.out.println("bool = " + bool);
        }
 * 
 *
 */
public class Quiz2 {
	
	public static void main(String[] args) {
		
		Quiz2 q2 =new Quiz2();
		q2.test2();
	}

	public void test2() {
		
		System.out.println("A = "+ ('A'+0));
// A = (65+0) => A= 65
        
        System.out.println("0 =" + ('0' + 0) );
// 0 = (48 + 0) => 48
        
        System.out.println("(char)65 = " + (char)65);
// A = 'A'
        
        byte bt1 = 125;
        char ch1 = 'C';
        int it1 = bt1 - ch1;
        System.out.println("it1 = "+it1);
// it1  =  125 - 67 = 58
        
        boolean bool = false;
        bool = (2.0 == 5/2);
        System.out.println("bool = " + bool);
// false =(2.0 == 2.5)
// false = false =>true
        
        bool = ('C' == 67);
        System.out.println("bool = " + bool);
//        bool = 67 ==67 => true
        
        bool = ('A' == 'B'-1);
        System.out.println("bool = " + bool);
//      bool = 65 == 66 -1 => true
        
        bool = ('a' != 97 );//부정연산자
        System.out.println("bool = " + bool);
//		bool = 97 != 97 =>false 
	}
}
