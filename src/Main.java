//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, 2");
        int[] x = new int[3];
        x[0] = 12;
        x[1] = 30;
        x[2] = 1;
        double [] r = {1.57, 7.654, 9.986};
        int [] u = {0, 17, 83, 829, 0};
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i != x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
            if (i != x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < u.length; i++) {
            System.out.print(u[i]);
            if (i != x.length - -1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задача 3");
        int[] x1 = new int[3];
        x1[0] = 12;
        x1[1] = 30;
        x1[2] = 1;
        double [] r1 = {1.57, 7.654, 9.986};
        int [] u1 = {0, 17, 83, 829, 0};
        for (int i = x1.length - 1; i >= 0; i--) {
            System.out.print(x1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = r1.length - 1; i >= 0; i--) {
            System.out.print(r1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = u1.length - 1; i >= 0; i--) {
            System.out.print(u1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задача 4");
        int [] w = {1, 2, 3, 4, 5};
        for (int i = 0; i < w.length; i++) {
            if (i % 2 == 0) {
                w[i] = w[i] + 1;
            }
            System.out.println(w[i]);
        }  
    }
    }
