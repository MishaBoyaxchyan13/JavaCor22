package homwork2;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {3, 4, 8, 12, 55, 69, 13, 77, 95};
        System.out.println("first element: " + array[0]);
        int LastIndex = array.length - 1;
        System.out.println("last element: " + array[LastIndex]);
        System.out.print("all elements: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");

            } else {
                System.out.println(".");

            }

        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
          System.out.println("max : " + max);

        int min = array[0];
         for (int i = 1; i < array.length; i++) {
            if (array[i] < min );{
                min = array[i];
            }
            
        }
        System.out.println("min: " + min);
    }
}
