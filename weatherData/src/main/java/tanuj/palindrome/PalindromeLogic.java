package tanuj.palindrome;

public class PalindromeLogic {
	
	public static String getReverse(String input) {
		int length=input.length();
		
		
		char a[]=new char[length];
		int j=0;
		for(int i=length-1;i>=0;i--) {
		a[j]=input.charAt(i);
		System.out.println(a[j]);
		j++;
		}
		
		return new String(a);
	}

}
