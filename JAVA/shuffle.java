import java.util.Random;

class ShuffledArray
   {
        public static void main(String[] args)
	{
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        System.out.println("Shuffled Array is:");
        for (int num : arr) 
	{
            System.out.print(num + " ");
        }
   }

        //It is Custom shuffling algorithm (Fisher-Yates shuffle) 
        private static void shuffleArray(int[] arr) 
	{
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) 
	{
            int j = rand.nextInt(i + 1);
            //Here Swap arr[i] with the element at random index j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
