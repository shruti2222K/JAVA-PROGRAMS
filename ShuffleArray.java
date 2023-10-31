import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            
            // Swapping elements at indexes i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
	
