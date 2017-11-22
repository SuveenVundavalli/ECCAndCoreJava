public class NextHundred01 {
    public static void main(String[] args) {
        int num = 8726;
        System.out.println(getNextMultipleOf100(num));
    }
    public static int getNextMultipleOf100(int num) {
        if(num>=1)
        	return (((num/100)+1)*100);
        else
        	return -1;
    }
}