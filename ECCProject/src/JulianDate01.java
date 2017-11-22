public class JulianDate01 {
	public static void main(String[] args) {
		String date = "3-jan-2016";
		System.out.println(dateFormat(date));
	}

	public static String dateFormat(String date) {
		String output = "";
		String[] completeDate = date.split("-");
		int dd = Integer.parseInt(completeDate[0]);
		int mon = convertMMMtoMM(completeDate[1]);
		String yyyy = completeDate[2];

		String julDate = julianDate(dd, mon);
		output += yyyy + "" + julDate;
		return output;

	}

	public static String julianDate(int dd, int mon) {
		int[] months = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
		String output = "";
		output += (months[mon - 1] + dd);
		if (output.length() == 1)
			output = "00" + output;
		if (output.length() == 2)
			output = "0" + output;
		return output;
	}

	public static int convertMMMtoMM(String mon) {
		String[] MMM = {"january","february","march","april","may","june","july","august","september","october","november","december"};
		for (int i = 0; i < MMM.length; i++) {
			if (MMM[i].contains(mon.toLowerCase())) {
				return i + 1;
			}
		}
		return 0;
	}
}