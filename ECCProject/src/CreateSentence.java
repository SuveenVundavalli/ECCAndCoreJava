public class CreateSentence {

	public static void main(String[] args) {
		System.out.println(getVariableName("talent_sprint"));
		System.out.println(getVariableName("TalentSprint"));
	}

	private static String getVariableName(String str) {
		String result = "";
		if (str.contains("_")) {
			String ar[] = str.split("_");
			result += ar[0];
			for (int i = 1; i < ar.length; i++) {
				result += ar[i].toUpperCase().charAt(0) + ar[i].substring(1, ar[i].length());
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isUpperCase(str.charAt(i)))
					result += "_" + str.toLowerCase().charAt(i);
				else
					result += str.charAt(i);
			}
		}
		return result;
	}

}
