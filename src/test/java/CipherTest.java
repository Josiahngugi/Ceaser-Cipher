import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void Cipher_testingEncryptingmethod() {
        Cipher cipher =new Cipher();
        assertEquals("nbe",cipher.encrypt("mad",1));
    }

    @Test
    public void Cipher_testingDecryptingMethod() {
        Cipher cipher =new Cipher();
        assertEquals("mad",cipher.decrypt("nbe",1));
    }


}