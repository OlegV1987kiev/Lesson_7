import java.util.ArrayList;

public class lesson_7_5 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Audi");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).length());
        }


    }
}
