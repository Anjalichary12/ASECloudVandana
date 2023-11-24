import java.util.Scanner;

class RomanToIntegerConv
{
    public static void main(String[] args) 
       {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String romanNum = scanner.nextLine().toUpperCase();
	int result = romanToInt(romanNum);
        System.out.println("Integer value of " + romanNum + " is: " + result);
	scanner.close();
       }

        // Custom Roman to Integer conversion function
        private static int romanToInt(String s)
        {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int result = 0;
        int i = 0;
        while (i < s.length()) 
        {
            for (int j = 0; j < symbols.length; j++)
             {
                if (i + symbols[j].length() <= s.length() && s.substring(i, i + 					symbols[j].length()).equals(symbols[j])) 
                {
                    result += values[j];
                    i += symbols[j].length();
                    break;
               }
            }
        }
        return result;
        }
}
