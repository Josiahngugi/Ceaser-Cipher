public class Cipher  {
    private static String plainText;
    private int shiftKey;

    public static String encrypt(String getplainText, int shiftKey) {

        plainText = getplainText;
        String cipherText = "";

        if(shiftKey>26){
            shiftKey=(shiftKey%26);
        }
        else if(shiftKey<0){
            shiftKey=(shiftKey%26)+26;
        }


        for (int i = 0; i < plainText.length(); i++) {
            if(Character.isLetter(plainText.charAt(i))){
                if(Character.isLowerCase(plainText.charAt(i))){
                    char ciphered_letter=(char)(plainText.charAt(i)+shiftKey);
                    if(ciphered_letter>'z'){
                        cipherText+=(char)(plainText.charAt(i)-(26-shiftKey));

                    }
                    else {
                        cipherText+=ciphered_letter;
                    }
                }
                else if(Character.isUpperCase(plainText.charAt(i))){
                    char ciphered_letter=(char)(plainText.charAt(i)+shiftKey);
                    if(ciphered_letter>'Z'){
                        cipherText+=(char)(plainText.charAt(i)-(26-shiftKey));;
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
    public static String decrypt(String getplainText, int shiftKey)
    {
        plainText = getplainText;
        String cipherText = "";

        if(shiftKey>26){
            shiftKey=(shiftKey%26);
        }
        else if(shiftKey<0){
            shiftKey=(shiftKey%26)+26;
        }

        for (int i = 0; i < plainText.length(); i++) {
            if(Character.isLetter(plainText.charAt(i))){
                if(Character.isLowerCase(plainText.charAt(i))){
                    char ciphered_letter=(char)(plainText.charAt(i)-shiftKey);
                    if(ciphered_letter<'a'){
                        cipherText+=(char)(plainText.charAt(i)+(26-shiftKey));;

                    }
                    else {
                        cipherText+=ciphered_letter;
                    }
                }
                else if(Character.isUpperCase(plainText.charAt(i))){
                    char ciphered_letter=(char)(plainText.charAt(i)-shiftKey);
                    if(ciphered_letter<'A'){
                        cipherText+=(char)(plainText.charAt(i)+(26-shiftKey));;
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

}







