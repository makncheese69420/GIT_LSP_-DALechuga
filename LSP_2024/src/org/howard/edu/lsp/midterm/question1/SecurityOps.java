package org.howard.edu.lsp.midterm.question1;
/**
 * @author Makuochukwu Onwubiko
 * This class encrypts a message by writing the even indices of the string first then the odd indices of the string
 */

public class SecurityOps {
	/**
	 * 
	 * The constructor
	 */
	public SecurityOps() {
		
	}
	
	
	/**
	 * 
	 * @param text takes the string that needs to be encrypted
	 * @return the encrypted text
	 */
	public static String encrypt(String text) {
		String even = "";
		String odd = "";
		
		for( int i = 0; i < text.length(); i++ ) {
			if(Character.isWhitespace(text.charAt(i))) {
				continue;
			}
			if(i % 2 == 0) {
				even = even + text.charAt(i);
			}
			else {
				odd = odd + text.charAt(i);
			}
		}
		String result = even + odd;
		
		text = result;
		
		
		return text;
		
	}

}
