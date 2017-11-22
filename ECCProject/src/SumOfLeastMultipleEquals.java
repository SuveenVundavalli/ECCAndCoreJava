
public class SumOfLeastMultipleEquals {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
			System.out.println(i+" : "+getSumEqualsLeastMultiple(i));
	}

	private static int getSumEqualsLeastMultiple(int input) {
		int sum = 0;
		for(int i=2; i<10;i++) {
			sum = 0;
			int temp = i*input;
			while(temp>0) {
				sum += temp%10;
				temp/=10;
			}
			if(sum == input)
				return i*input;
		}
		return -1;
	}

}
