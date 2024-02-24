//Design a java program to sort list of names in ascending order.

import java.util.*;

class SortNames {
    String name[] = new String[5];
    int i, n = 5;

    SortNames() {
        for (i = 0; i < n; i++) {
            name[i] = null;
        }
    }

    void inputNames() {
        name[0] = "Rishabh";
        name[1] = "Deepak";
        name[2] = "Vishal";
        name[3] = "Sakshi";
        name[4] = "Amrit";
    }

    void bubbleSort() {
        int j;
        String temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
    }

    void displayNames() {
        for (i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
    }
}

class Practical14 {
    public static void main(String a[]) {
        SortNames sn = new SortNames();
        sn.inputNames();
        sn.bubbleSort();
        sn.displayNames();
    }
}

