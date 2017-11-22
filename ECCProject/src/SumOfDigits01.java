public class SumOfDigits01 {
    public static void main(String[] args) {
        int num = 799;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num)	{
    	if(num>=10 && num <= 99){
	    int firstDigit = num/10;
	    int lastDigit = num%10;
	    int sum = firstDigit+lastDigit;
	    return sum;}
    	else return 0;
    }
}