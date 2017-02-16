import java.lang.reflect.Array;


public class Solution {

		public static int[] solution(String a)
		{
			int[] count = new int[26];
			
			for(int i = 0; i < count.length; i++)
			{
				
				count[i] = 0;
			}
			char[] letters = a.toCharArray();
			for(int i = 0; i < letters.length; i++)
			{
				if(letters[i] == 'A')
				{
					count[0] =  count[0] + 1;
				}
				else if(letters[i] == 'B')
				{
					count[1] =  count[1] + 1;
				}
				else if(letters[i] == 'C')
				{
					count[2] =  count[2] + 1;
				}
				else if(letters[i] == 'D')
				{
					count[3] =  count[3] + 1;
				}
				else if(letters[i] == 'E')
				{
					count[4] =  count[4] + 1;
				}
				else if(letters[i] == 'F')
				{
					count[5] =  count[5] + 1;
				}
				else if(letters[i] == 'G')
				{
					count[6] =  count[6] + 1;
				}
				else if(letters[i] == 'H')
				{
					count[7] =  count[7] + 1;
				}
				else if(letters[i] == 'I')
				{
					count[8] =  count[8] + 1;
				}
				else if(letters[i] == 'J')
				{
					count[9] =  count[9] + 1;
				}
				else if(letters[i] == 'K')
				{
					count[10] =  count[10] + 1;
				}
				else if(letters[i] == 'L')
				{
					count[11] =  count[11] + 1;
				}
				else if(letters[i] == 'M')
				{
					count[12] =  count[12] + 1;
				}
				else if(letters[i] == 'N')
				{
					count[13] =  count[13] + 1;
				}
				else if(letters[i] == 'O')
				{
					count[14] =  count[14] + 1;
				}
				else if(letters[i] == 'P')
				{
					count[15] =  count[15] + 1;
				}
				else if(letters[i] == 'Q')
				{
					count[16] =  count[16] + 1;
				}
				else if(letters[i] == 'R')
				{
					count[17] =  count[17] + 1;
				}
				else if(letters[i] == 'S')
				{
					count[18] =  count[18] + 1;
				}
				else if(letters[i] == 'T')
				{
					count[19] =  count[19] + 1;
				}
				else if(letters[i] == 'U')
				{
					count[20] =  count[20] + 1;
				}
				else if(letters[i] == 'V')
				{
					count[21] =  count[21] + 1;
				}
				else if(letters[i] == 'W')
				{
					count[22] =  count[22] + 1;
				}
				else if(letters[i] == 'X')
				{
					count[23] =  count[23] + 1;
				}
				else if(letters[i] == 'Y')
				{
					count[24] =  count[24] + 1;
				}
				else if(letters[i] == 'Z')
				{
					count[25] =  count[25] + 1;
				}
				

			}
			return count;
		
			
		}
		
		public static void main(String[] args)
		{
			int[] count = solution("GBSXUCGSZQGKGSQPKQKGLSKASPCGBGBKGUKGCEUKUZKGGBSQEICA"
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
