import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] massiv = new int[]{1, 2, 3};
        double[] Massiv = new double[]{1.57, 7.654, 9.986};
        long[] Massivv = new long[]{125, 534, 1309};
        System.out.println("Задача 2");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i]);
            if (i != massiv.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < Massiv.length; i++) {
            System.out.print(Massiv[i]);
            if (i != Massiv.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < Massivv.length; i++) {
            System.out.print(Massivv[i]);
            if (i != Massivv.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.print(massiv[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = Massiv.length - 1; i >= 0; i--) {
            System.out.print(Massiv[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = Massivv.length - 1; i >= 0; i--) {
            System.out.print(Massivv[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0){
                massiv[i]++;
        }
    }
        System.out.println(Arrays.toString(massiv));
}
}



