package oswaldo.algo1;

public class Algo1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 1000 ; i++){
			if (i%3 == 0){
				sum = sum + i;
				System.out.println(sum);
				continue;
			}
			if (i%5 ==0){
				sum = sum +i;
				System.out.println(sum);
				continue;
			}
			
		}	
		System.out.println(sum);
	}
}
