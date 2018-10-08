public class Cipher  {
    private static String plainText;
    private int shiftKey;



    public static String encrypt(String getplainText, int shiftKey) {

        plainText = getplainText;
        String cipherText = "";

        for (int i = 0; i < plainText.length(); i++) {
            if(Character.isLetter(plainText.charAt(i))){
                if(Character.isLowerCase(plainText.charAt(i))){
                    char ciphered_letter=(char)(plainText.charAt(i)+shiftKey);
                    if(ciphered_letter>'z'){
                        cipherText+=ciphered_letter;

                    }
                    else {
                        cipherText+=ciphered_letter;
                    }
                }
                else if(Character.isUpperCase(plainText.charAt(i))){
                    char ciphered_letter=(char)(plainText.charAt(i)+shiftKey);
                    if(ciphered_letter>'Z'){
                        cipherText+=ciphered_letter;
                    }

                    else {
                        cipherText+=ciphered_letter;
                    }
                }

            }
            else {
                cipherText+=plainText.charAt(i);
            }
        }
        return cipherText;

    }
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText;
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int keyVal = (ALPHABET.indexOf(cipherText.charAt(i))- shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            plainText +=  ALPHABET.charAt(keyVal);
        }
        return plainText;
    }

}






