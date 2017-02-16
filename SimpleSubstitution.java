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
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter CypherText: ");
        int[] count = frequency("GBSXUCGSZQGKGSQPKQKGLSKASPCGBGBKGUKGCEUKUZKGGBSQEICA"
                                + "CGKGCEUERWKLKUPKQQGCIICUAEUVSHqKGCEUPCGBCGQOEVSHUNSU"
                                + "GKUZCGQSNLSHEHIEEDCUOGEPKHZGBSNKCUGSUKUASERLSKASCUGB"
                                + "SLKACRCACUZSSZEUSBEXHKRGSHWKLKUSQSKCHQTXKZHEUQBKZAEN"
                                + "NSUASZFENFCUOCUEKBXGBSWKLKUSQSKNFKQQKZEHGEGBSXUCGSZQ"
                                + "GKGSQKUZBCQAEIISKOXSZSICVSHSZGEGBSQSAHSGKHMERQGKGSKR"
                                + "EHNKIHSLIMGEKHSASUGKNSHCAKUNSQQKOSPBCISGBCqHSLIMQGKG"
                                + "SZGBKGCGQSSNSZXQSISQQGEAEUGCUXSGBSSJCqGCUOZCLIENKGCA"
                                + "USOEGCKGCEUqCGAEUGKCUSZUEGBHSKGEHBCUGERPKHEHKHNSZKGGKAD");
        for(int a: count)
        {
            System.out.println(a);
        }
    }
}
