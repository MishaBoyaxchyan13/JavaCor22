package chapter2;

public class Example2 {

    public static void main(String[] args) {
        int a = 65;
        int b = 45;

        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }

        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print("i");
               }
            } else {
                for (int i = a; i <= b; i++) {
                    System.out.println("i");


                }

            }
         char c = (char) a ;
        char c1 = (char) b;
        System.out.println(c);
        System.out.println(c1);

        }
    }
