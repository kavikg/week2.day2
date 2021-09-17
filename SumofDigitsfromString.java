package week2.day2;

public class SumofDigitsfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum = 0;
		String rep = text.replaceAll("[\\D]", "");
		System.out.println(rep);
		for (int i = 0; i < rep.length(); i++) {
			char c = rep.charAt(i);
			int n = Character.getNumericValue(c);
			sum = sum + n;
			System.out.println("sum of digits:" + sum);

		}

	}

}
