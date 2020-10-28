package gitproject;

public class AlphanumericString {

	public static void main(String[] args) {
		String str="devi23456tgdh56fd";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
//			if(Character.isAlphabetic(str.charAt(i))) {
//				sum=sum+str.charAt(i);
			int temp=str.charAt(i);
			if(Character.isDigit(temp)) {
				int b=Integer.parseInt(String.valueOf(temp));
				count=count+b;
		
			}
		}
		System.out.println(count);

	}

}
