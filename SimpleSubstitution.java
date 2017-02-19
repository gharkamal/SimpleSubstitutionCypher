import java.lang.reflect.Array;
import java.util.Scanner;


public class SimpleSubsitution {
    
    public static int[] frequency(String a)
    {
        char[] c = a.toCharArray();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] countArray = new int[26];
        for (char x : c)
        {
            for (int i = 0; i < alphabet.length(); i++)
            {
                if (alphabet.charAt(i) == x) {
                    countArray[i]++;
                }
            }
        }
        return countArray;
        
    }
    public static char[] swapText(String[] key, String cypherText)
    {
        char[] c = cypherText.toCharArray();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int y =0; y < c.length; y++)
        {
            for (int i = 0; i < alphabet.length(); i++)
            {
                if (alphabet.charAt(i) == c[y]) {
                    
                    c[y] = key[i].charAt(0);
                }
            }
        }
        
        return c;
        
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] key = new String[26];
        System.out.println("Enter CypherText: ");
        String cypherText = input.nextLine();
        int[] count = frequency(cypherText);
        for(int i = 0; i < count.length; i++)
        {
            System.out.println(alphabet.charAt(i) + " :" + count[i]);
        }
        
        
        
        System.out.println("Guess key: ");
        for(int i = 0;i < 26; i++)
        {
            System.out.println(alphabet.charAt(i) + ": ");
            key[i] = input.nextLine();
        }
        for(int i = 0; i < key.length; i++)
        {
            System.out.println(alphabet.charAt(i) + " :" + key[i]);
        }
        System.out.println("Attempted PlainText: ");
        System.out.println(swapText(key, cypherText));
    }
    
}
