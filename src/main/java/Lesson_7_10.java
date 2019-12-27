import java.util.Scanner;

public class Lesson_7_10 {

    static class VeryStrictDiet {


        public enum DayOfWeek {

            FRIDAY,
            MONDAY,
            SATURDAY,
            SUNDAY,
            THURSDAY,
            TUESDAY,
            WEDNESDAY

        }


        public static void main(String[] args) {

            System.out.println("Today = " + dayOfWeek);
            System.out.println(holiday+ " is holiday");
        }

            switch (dayOfWeek) {

                case DayOfWeek.SUNDAY:
                    System.out.println(1);
                case MONDAY:
                    System.out.println(2);
                case TUESDAY:
                    System.out.println(3);
                case WEDNESDAY:
                    System.out.println(4);
                case THURSDAY:
                    System.out.println(5);
                case FRIDAY:
                    System.out.println(6);
                case SATURDAY:
                    System.out.println(7);
                default:
                    return;
            }

        }

    }


}
