package package1;

import java.util.Scanner;

public class Encryption 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String s = sc.nextLine();
        String encryptedString = encrypt(s);
        System.out.println("Encrypted string: " + encryptedString);
    }

    public static String encrypt(String input) 
    {
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) 
            {
                char encryptedChar = (char) (ch - 2);
                r.append(encryptedChar);
            } else if (Character.isLowerCase(ch)) 
            {
                char encryptedChar = (char) (ch - 3);
                r.append(encryptedChar);
            } else
            {
                r.append(ch);  
            }
        }

        return r.toString();
        
}
}