import java.lang.reflect.Array;
import java.util.Scanner;

public class SimpleSubstitution {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    
    
    public void cipherTextFrequency(String a) {
        char[] c = a.toCharArray();
        
        double[] countArray = new double[26];
        for (char x : c) {
            for (int i = 0; i < alphabet.length(); i++) {
                if (alphabet.charAt(i) == x) {
                    countArray[i]++;
                }
            }
        }
        double length = 0;
        for (double x : countArray) {
            if(x > 0.0)
            {
                length = x + length;
            }
        }
        System.out.println(length);
        System.out.println("CypherText Frequency: ");
        for (int i = 0; i < countArray.length; i++) {
            System.out.println(alphabet.charAt(i) + " :" + (countArray[i]/length)*100);
        }
        
    }
    public void printEnglishLetterFrequency()
    {
        System.out.println("English letter Frequency: ");
        
        double[] englishLetter = new double[26];
        englishLetter[0] = 8.17;
        englishLetter[1] = 1.49;
        englishLetter[2] = 2.78;
        englishLetter[3] = 4.25;
        englishLetter[4] = 1.27;
        englishLetter[5] = 2.23;
        englishLetter[6] = 2.02;
        englishLetter[7] = 6.09;
        englishLetter[8] = 6.97;
        englishLetter[9] = .15;
        englishLetter[10] =.77;
        englishLetter[11] = 4.03;
        englishLetter[12] = 2.41;
        englishLetter[13] = 6.75;
        englishLetter[14] = 7.51;
        englishLetter[15] = 1.93;
        englishLetter[16] = .1;
        englishLetter[17] = 5.99;
        englishLetter[18] = 6.33;
        englishLetter[19] = 9.06;
        englishLetter[20] = 2.76;
        englishLetter[21] = .98;
        englishLetter[22] = 2.36;
        englishLetter[23] = .15;
        englishLetter[24] = 1.97;
        englishLetter[25] = .07;
        
        for (int i = 0; i < englishLetter.length; i++) {
            System.out.println(alphabet.charAt(i) + " :" + (englishLetter[i]));
        }
        
    }
    
    public String swapText(String key, String cypherText) {
        
        char[] keySplit = key.toCharArray();
        char[] cypher = cypherText.toCharArray();
        char[] alph = alphabet.toCharArray();
        
        for (int i = 0; i < alph.length; i++) {
            for (int x = 0; i < cypher.length; x++) {
                if (alph[i] == cypher[x]) {
                    
                    cypher[x] = keySplit[i];
                    
                }
            }
        }
        for (int i = 0; i < key.length(); i++) {
            System.out.println(alphabet.charAt(i) + " :" + keySplit[i]);
            System.out.println("Attempted PlainText: ");
        }
        return cypher.toString();
        
    }
    
    public static void main(String[] args) {
        SimpleSubstitution object = new SimpleSubstitution();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter CypherText: ");
        String cypherText = input.nextLine().toUpperCase();
        
        object.cipherTextFrequency(cypherText);
        object.printEnglishLetterFrequency();
        
        
        String key = "";
        System.out.println("Guess key: ");
        for (int i = 0; i < 26; i++) {
            System.out.println(object.alphabet.charAt(i) + ": ");
            key = key + input.nextLine().toUpperCase();
        }
        
        object.swapText(key, cypherText);
    }
    
}


