import java.util.Arrays;

public class Main {

	public static String ArrayChallenge(String[] strArr) {

		String answer = "not possible";
		String firstEntry = strArr[0];
		String[] dictionary = strArr[1].split("\\s*,\\s*");
		System.out.println("MainWord: " + firstEntry);
		System.out.println("Dictionary: " + Arrays.toString(dictionary));
		System.out
				.println("****************************************************************************************");
		String[] splitFirstWord;

		for (String wordD : dictionary) {
			splitFirstWord = firstEntry.split("\\s*" + wordD + "\\s*");

			if (splitFirstWord.length == 2 && splitFirstWord[0].isEmpty()) {
				answer = wordD + ", " + splitFirstWord[1];
			}
		}

		System.out.println("***The result is***");

		return answer;
	}

	public static void main(String[] args) {
		String[] test1 = { "baseball",
				"a,all,b,ball,bat,base,cat,code,d,e,quit,z,game" };

		String[] test2 = { "hellocat", "apple,bat,cat,goodbye,hello,yellow,why" };

		System.out.println(ArrayChallenge(test2));
	}

}
