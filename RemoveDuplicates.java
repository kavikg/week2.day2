package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		System.out.println(text);
		removeduplicates(text);
	}
		public static void removeduplicates(String s) {
			s = s.toLowerCase();
			String[] text1 = s.split(" ");
			System.out.println(text1);
			for (int i = 0; i < text1.length; i++) {
				
				for (int j = 0; j < text1.length; j++) {
					if (text1[i].equals(text1[j])) {
						
						if(text1[i]!= text1[j])
						text1[i] = "";

					}

				}

			}		


		
		for (int i = 0; i < text1.length; i++) {
			if (text1[i] != " ") {
				System.out.print(text1[i]  + " ");
			}
		}
	
		}
}
