package ru.levelup.pavel_kustov.qa.homework1.task1;

/**
 *  Class show answer on 1st home work
 *  tasks 1:
 *  bubble sort, binary search, revers array, random filling array
 *
 * @version 1.0
 * @author  Kustov Pavel
 */

public class Main {

    static int vArr[] = { 11, 22, 34, 65, 2, 5, 12, 63, 54, 3, 32, 4, 85};  // main working array


    /**
     *  Entry point
     */
    public static void main(String[] args)
    {
        Main app = new Main();
        app.startApp();
    }

    /**
     *  Function that todo all work
     */
    public void startApp()
    {
        System.out.println("Input array:");
        printArr();

        bubbleSort();

        System.out.println("Output array:");
        printArr();
    }

    /**
     *  Method for printing main array
     */
    static void printArr() {
        for (int i = 0; i < vArr.length; i++) {
            System.out.print(vArr[i]);
            System.out.print(" ");
        }
        System.out.println(";");
    }

    /**
     *  Algorithm sorting without usage extension memory
     */
    static void sortMagic(int i, int j) {
        int ii = vArr[i];
        int jj = vArr[j];

        ii = ii ^ jj;
        jj = ii ^ jj;
        ii = ii ^ jj;

        vArr[i] = ii;
        vArr[j] = jj;
    }

    /**
     *  Algorithm bubble sort
     */
    public static void bubbleSort() {
        for (int i = vArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vArr[j] > vArr[j+1]) {
                    sortMagic(j, j+1);
                }
            }
        }
    }


}
