public class Palindrome01 {
	public static void main(String[] args) {
		int num = 878;
		System.out.println(isPalindrome(num));
	}

	public static int isPalindrome(int num) {
        if(num>99 && num <1000){
        	if(num/100 == num%10)
        		return 1;
        	else 
        		return 0;
        	
        }
        else return -1;
    }
}