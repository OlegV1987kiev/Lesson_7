import java.util.Random;
public class Lesson_7_4 {


        public static void main(String[] args) {
            Random rd = new Random(); // creating Random object
            int[] arr = new int[15];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt(); // storing random integers in an array
                System.out.println(arr[i]); // printing each array element

        }
    }
}
