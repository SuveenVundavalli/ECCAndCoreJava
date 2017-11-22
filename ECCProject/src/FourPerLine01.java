public class FourPerLine01 {
	public static void main(String[] args) {
		int num = 20;
		System.out.println(getFourPerLine(num));
	}

	public static String getFourPerLine(int num) {
		if (num < 1 || num > 99)
			return "-1";
		String output = "";
		
		for(int i=1;i<=num;i++) {
			if(i%4==0) {
				if(i<10){
					output += " "+i+"\n";
				} else {
					output += i+"\n";
				}
			} else {
				if(i<10) {
					output += " "+i+" ";
				} else if(i==num)
					output += i;
				else {
					output += i+" ";
				}
			}
				
		}
		return output;
		
	}
}