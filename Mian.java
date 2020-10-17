public class Main {

	public static String ArrayChallenge(String[] strArr) {

		String answer = "not possible";
		String firstEntry = strArr[0];
		String[] dictionary = strArr[1].split("\\s*,\\s*");

		for (int i = 0; i < dictionary.length; i++) {
			String[] splitFirstWord = firstEntry.split("\\s*" + dictionary[i]
					+ "\\s*");
			//System.out.print(Arrays.toString(splitFirstWord));

			if (splitFirstWord.length > 0) {

				String jword = "";
				String rword = "";
				for (int j = 0; j < splitFirstWord.length; j++) {
					jword = dictionary[i] + splitFirstWord[j];
					rword = new StringBuffer(jword).reverse().toString();

					if (jword.equals(firstEntry) || rword.equals(firstEntry)) {
						answer = dictionary[i] + ", " + splitFirstWord[j];
					}

				}

			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] test1 = { "baseball",
				"a,all,b,ball,bas,base,cat,code,d,e,quit,z" };

		System.out.println(ArrayChallenge(test1));
	}

}
