import java.util.Scanner;

public class Cipher  {
public static void main(String[] args){
    System.out.println("1.Encryption\n2.Decryption\nChoose(1,2):");
    Scanner input = new Scanner(System.in);
    int Choice = input.nextInt();
      if (Choice==1) {
          System.out.println("Encryption..");
          input.nextLine();
          System.out.println("message only in Lower");
          System.out.print("enter Message");
          String message=input.nextLine();
           int key =0;
           if (key>26) {
               key=key%26;
           }
           else if(key<0){
               key=key%26+26;

           }

           }

      }

      }



