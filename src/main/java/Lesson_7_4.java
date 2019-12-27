import java.util.Random;

public class Lesson_7_4 {


    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[15];
        int even = 0;
        int odd = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
        }
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }

        System.out.println("Even index positions sum: " + even);


    }
}
