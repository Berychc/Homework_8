import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();

    } public static void task1() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        double[] secondArray = {1.57, 7.654, 9.986};

        int[] thirdArray = new int[6];
        thirdArray[0] = 666;
        thirdArray[1] = 659;
        thirdArray[2] = 777;
        thirdArray[3] = 135;
        thirdArray[4] = 335;
        thirdArray[5] = 369;
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);
        }
    } public static void task2() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        System.out.println(Arrays.toString(firstArray));

        double[] secondArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = new int[6];
        thirdArray[0] = 666;
        thirdArray[1] = 659;
        thirdArray[2] = 777;
        thirdArray[3] = 135;
        thirdArray[4] = 335;
        thirdArray[5] = 369;
        System.out.println(Arrays.toString(thirdArray));

    } public static void task3() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] thirdArray = new int[6];
        thirdArray[0] = 666;
        thirdArray[1] = 659;
        thirdArray[2] = 777;
        thirdArray[3] = 135;
        thirdArray[4] = 335;
        thirdArray[5] = 369;
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    } public static void task4() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}