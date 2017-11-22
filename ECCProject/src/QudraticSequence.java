import java.util.Scanner;


public class QudraticSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of numbers in sequence : ");
		int limit = sc.nextInt();
		System.out.println(getQudraticSequence(limit));
	}

	private static String getQudraticSequence(int limit) {
		String seq = "";
		
		int i=0;
		
		for(int j=1; j<limit+1;j++){
			i += j;
			seq += i+",";
		}
		return seq.substring(0,seq.length()-1);
	}

}
