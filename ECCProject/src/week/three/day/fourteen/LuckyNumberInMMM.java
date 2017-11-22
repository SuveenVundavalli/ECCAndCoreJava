package week.three.day.fourteen;

import java.util.Scanner;

public class LuckyNumberInMMM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB in the format dd-mmm-yyyy");
		String date = sc.nextLine();
		System.out.println("Your lucky number is : "+getLuckyNumber(date));
		
	}

	private static int getLuckyNumber(String date) {
		int luckyNumber=0;
		String dates[] = date.split("-");
		dates[1] = getMonthToInt(dates[1]);
		for(int i=0;i<dates.length;i++) {
			luckyNumber+=Integer.parseInt(dates[i]);
		}
		while(luckyNumber>=10) {
			luckyNumber = getSumOfDigits(luckyNumber);
		}
		return luckyNumber;
	}
	
	private static int getSumOfDigits(int luckyNumber) {
		int sum=0;
		while(luckyNumber>0) {
			sum+=luckyNumber%10;
			luckyNumber/=10;
		}
		return sum;
	}

	private static String getMonthToInt(String month) {
		String months[] = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		for(int i=0;i<months.length;i++) {
			//System.out.println(months[i].equals(month.toLowerCase()));
			if(months[i].equals(month.toLowerCase())) {
				//System.out.println(i+1);
				return ""+(i+1);
			}
		}
		return ""+0;
	}

}