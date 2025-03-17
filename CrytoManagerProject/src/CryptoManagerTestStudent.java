import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoManagerTestStudent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void testIsStringInBounds() {
       //Test with a String in Bound
        assertTrue(CryptoManager.isStringInBounds("HELLO"));
        assertTrue(CryptoManager.isStringInBounds("12345"));
        // Test with a String out of bound
        assertFalse(CryptoManager.isStringInBounds("{HeLLO"));
    }

    @Test
    public void testCaesarEncryption() {
       // Test of caesarEncryption with String in bound
        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
        assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
        // Test of caesarEncryption with String out of bounds
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("{HELLO", 5));
    }

    @Test
    public void testCaesarDecryption() {
       // Test of caesarDecryption from encryptedString
        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3));
        assertEquals("TESTING", CryptoManager.caesarDecryption("UFTUJOH", 1));
      
    }

    @Test
    public void testBellasoEncryption() {
       //Test of BellasoEncryption 
        assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
        assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
       
    }

    @Test
    public void testBellasoDecryption() {
    	 //Test of BellasoDecryption 
        assertEquals("TESTING", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
        assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
        
    }

}
