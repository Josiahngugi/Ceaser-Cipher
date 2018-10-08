public class Cipher  {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static String plainText;
    private int shiftKey;



    public static String encrypt(String getplainText, int shiftKey) {

        plainText = getplainText.toLowerCase();
        String cipherText = "";

        for (int i = 0; i < plainText.length(); i++) {
            int keyVal = (shiftKey + ALPHABET.indexOf(plainText.charAt(i))) % 26;
            cipherText += ALPHABET.charAt(keyVal);
        }
        return cipherText;

    }
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }

}






