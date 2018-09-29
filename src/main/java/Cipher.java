public class Cipher  {
public static String encrypt(String message, int key){
    if(key>26){
        key=key%26;
    }
    else if(key<0){
        key =(key%26)+26;
    }
    String ciphermessage="";
    int length=message.length();
    for(int i=0;i<length;i++){
        char ch=message.charAt(i);
        if(Character.isLetter(ch)){
            ciphermessage += ch;
            if(Character.isLowerCase(ch)){
                char c=(char)(ch+key);
                if(c>'z'){
                    ciphermessage +=(char)(ch-(26-key));
                }
                else {
                    ciphermessage +=c;
                }
            }
            else if(Character.isLowerCase(ch)){
                char c=(char)(ch+key);
                if(c>'Z'){
                    ciphermessage +=(char)(ch-(26-key));
                }
                else {
                    ciphermessage +=c;
                }
            }

        }
        else {
            ciphermessage +=ch;

        }
    }
    return ciphermessage;
}
}




