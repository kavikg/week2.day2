package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = "I am a software tester".split(" ");
		String ans = "", revword = "";
		for (int i = 0; i < test.length; i++) {
			String t = test[i];
			if (i % 2 != 0) {
				for (int j = t.length() - 1; j >= 0; j--) {
					revword = revword + t.charAt(j);
				}
				ans = ans + revword + " ";
				revword = "";

			} else {
				ans = ans + test[i] + " ";
			}

		}
		System.out.println(ans);

	}

}
