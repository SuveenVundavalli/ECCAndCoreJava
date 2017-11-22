public class AlarmClock01 {
	public static void main(String[] args) {
		int day_of_week = 3;
		boolean onVac = true;
		System.out.println(ringAlarm(day_of_week, onVac));
	}

	public static String ringAlarm(int dayOfWeek, boolean onVac) {
		if (dayOfWeek < 0 || dayOfWeek > 6)
			return "Invalid Inputs";
		if (dayOfWeek >= 1 && dayOfWeek <= 5 && onVac)
			return "10:00";
		if (dayOfWeek >= 1 && dayOfWeek <= 5 && !onVac)
			return "07:00";
		if ((dayOfWeek == 0 || dayOfWeek == 6) && onVac)
			return "OFF";
		if ((dayOfWeek == 0 || dayOfWeek == 6) && !onVac)
			return "10:00";
		return "Invalid Inputs";
	}
}