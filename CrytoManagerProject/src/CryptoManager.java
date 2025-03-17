/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:The code uses two different type of encryption method 
 * which  are caesar and bellaso encryption and decrpytion methods to encrypted a text based on key and key of string 
 * Due: 3/17/2025
 * Platform/compiler:eclipse/javac
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Armel Daryl Kelodjoue Nguetchouang
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for(int i=0 ;i<plainText.length();i++) {
			if (plainText.charAt(i)>UPPER_RANGE || plainText.charAt(i)<LOWER_RANGE){
				return false;
			}
				
		}
		return true;
		
	}
	

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		
		
		// if('A'>68) use it to compare this value 
		// summary of caesar cipher takes a key and add a number to the ascii value of each number
		//ABC 65 66 67 -> 66 67 68
		// Bellaso cipher  
		//keep substracting untill number is in range
		// read power point 
		//javaeffects
		 int charvalue;
			String encrptedText="";
			if(isStringInBounds(plainText)==false) {
				return "The selected string is not in bounds, Try again.";
					
				}else {
					for(int i=0 ;i<plainText.length();i++) {
						
						charvalue = plainText.charAt(i) + key;
						while(charvalue>UPPER_RANGE) {
							charvalue -= RANGE;
							}
						encrptedText +=(char)charvalue;
						
						}
						return encrptedText;
			
				}
		 
		 
	}     
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		String encryptedText="";
		int newCharvalue;
		int j=0;
		for(int i=0 ;i<plainText.length();i++) {
		newCharvalue=plainText.charAt(i)+ bellasoStr.charAt(j);
		while(newCharvalue>UPPER_RANGE) {
		newCharvalue -= RANGE;
		}
		encryptedText +=(char)newCharvalue;
		if(j>=bellasoStr.length()-1) {
		j=0;
		}else {
		j++;
		}
		}
		return encryptedText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		int charvalue;
		String decryptedText="";
		if(isStringInBounds(encryptedText)) {
		for(int i=0 ;i<encryptedText.length();i++) {
			
		charvalue = encryptedText.charAt(i) - key;
		while(charvalue<LOWER_RANGE) {
			charvalue += RANGE;
			}
		decryptedText +=(char)charvalue;
		
		}
		
				
			}
		return decryptedText;		
		
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String decryptedText="";
		int newCharvalue;
		int j=0;
		for(int i=0 ;i<encryptedText.length();i++) {
			
		newCharvalue=encryptedText.charAt(i)-bellasoStr.charAt(j);
		while(newCharvalue<LOWER_RANGE) {
		newCharvalue += RANGE;
		
		}
		
		decryptedText +=(char)newCharvalue;
		
		if(j>=bellasoStr.length()-1) {
		j=0;
		}else {
		j++;
		}
		}
		return decryptedText;
	}
}
