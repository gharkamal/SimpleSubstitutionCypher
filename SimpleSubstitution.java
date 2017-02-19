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
    public static String[] swapText(String[] key)
    {
        
        return key;
        
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] key = new String[26];
        //System.out.println("Enter CypherText: ");
        int[] count = frequency("GBSXUCGSZQGKGSQPKQKGLSKASPCGBGBKGUKGCEUKUZKGGBSQEICA"
                                + "CGKGCEUERWKLKUPKQQGCIICUAEUVSHqKGCEUPCGBCGQOEVSHUNSU"
                                + "GKUZCGQSNLSHEHIEEDCUOGEPKHZGBSNKCUGSUKUASERLSKASCUGB"
                                + "SLKACRCACUZSSZEUSBEXHKRGSHWKLKUSQSKCHQTXKZHEUQBKZAEN"
                                + "NSUASZFENFCUOCUEKBXGBSWKLKUSQSKNFKQQKZEHGEGBSXUCGSZQ"
                                + "GKGSQKUZBCQAEIISKOXSZSICVSHSZGEGBSQSAHSGKHMERQGKGSKR"
                                + "EHNKIHSLIMGEKHSASUGKNSHCAKUNSQQKOSPBCISGBCqHSLIMQGKG"
                                + "SZGBKGCGQSSNSZXQSISQQGEAEUGCUXSGBSSJCqGCUOZCLIENKGCA"
                                + "USOEGCKGCEUqCGAEUGKCUSZUEGBHSKGEHBCUGERPKHEHKHNSZKGGKAD");
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
    }
    
}
