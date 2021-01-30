package p7.account;

public class AccountTest2 {

	public static void main(String[] args) {
		
		Account[] accArray = new Account[5];
		
		for(int i = 1; i<=5;i++) {
			String account ="221-0101-211"+i;
			accArray[i-1]= new Account(account, 100000, 4.5);
		}
		
		for(Account acc : accArray) {
			acc.accountInfo();
			System.out.println();
		}
		
		for(int i = 1; i<=5;i++) {
			String account ="221-0101-211"+i;
			accArray[i-1]= new Account(account, 100000, 3.7);
		}
		
		System.out.println();
		
		for(Account acc : accArray) {
			acc.accountInfo();
			System.out.printf("이자: %.0f원",acc.calculateInterest());
			System.out.println();
		}
	}
}
