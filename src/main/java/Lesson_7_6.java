import java.util.ArrayList;
 public class Lesson_7_6 {
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("Audi");
            cars.add("Volvo1");
            cars.add("BMW3");
            cars.add("Ford4");
            cars.add("Mazda5");
            cars.add("Audi5");
            for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i).length());
            }


        }
    }

