package p3.workshop4;

public class Test03 {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		
		for(int i =0 ; i <arr.length-1;i++) {
			int max = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[max] < arr[j]) {
					int temp = arr[max];
					arr[max] = arr[j];
					arr[j] = temp;
				}
			}
			
			
		}
		
		for(int r =0; r<arr.length;r++) {
			System.out.print(arr[r] +" ");
		}
	}

}
