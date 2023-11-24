import java.util.Scanner;

class PangramCheck 
{
        public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkIfPangram(sentence);
        System.out.println("Is the sentence  is a pangram? " + isPangram);
	scanner.close();
    }

        // Custom Pangram checking function
        private static boolean checkIfPangram(String sentence)
        {
        boolean[] mark = new boolean[26];
        // Markers for each letter from a to z
	for (int i = 0; i < sentence.length(); i++) 
        {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z')
            {
                mark[ch - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean value : mark) 
	{
            if (!value) 
	    {
                return false;
            }
        }

        return true;
    }
}
