public class Fibonacci01 {
	public static void main(String[] args) {
	 	System.out.println(getFibonacciSeries(26));
	}
	public static String getFibonacciSeries(int num) {
		
		if(num<1 || num>40)
			return "-1";
		if(num==1)
			return "0";
		if(num==2)
			return "0,1";
		
		int count=1;
		int a=0,b=1, temp;
		String output = "";
		if(num>2){
			output = "0,1,";
			while(count<=(num-2)){

				temp = a+b;
				a = b;
				b = temp;
				if(count!=(num-2))
					output = output+b+",";
				else
					output = output+b;
				count++;
				
			}
		}
		return output;
		
	}
}