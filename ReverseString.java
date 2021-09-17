package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		char[] ch=test.toCharArray();
		int s = test.length();
				
		for(int i=s-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
			
		}
	}

