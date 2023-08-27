package JavInterviewPrgms;

public class SumOfEvnNum {

	public static void main(String[] args) {
		
		int sum=0;
		//for(int i=2; i<=100; i=i+2) {
		//	sum = sum+i;
		//}		
		for(int i=2; i<=100; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
