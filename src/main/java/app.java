import java.util.Scanner;

public class app {

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to Ceaser Cipher");
        System.out.println(" choice\n 1.Encryption\n 2.Decryption");
        int choice=input.nextInt();
        if(choice==1){
            System.out.println("Encrypting...");
            Cipher encrypting= new Cipher();


        }
        else{
            System.out.println("Decrypting..");
        }
    }
}
