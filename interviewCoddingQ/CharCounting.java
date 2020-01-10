package interviewCoddingQ;
//Q: from the string "aabba" print a after counting. write a program that return count and accepts string "aabba"



public class CharCounting {
	static String str = "aabba";
	 public static int count_char(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
  public static void main(String[] args)
    {
       System.out.print("Number of  a in the string:"+ count_char(str));
    }

}