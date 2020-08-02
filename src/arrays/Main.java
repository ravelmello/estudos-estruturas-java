package arrays;

import arrays.Arrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Arrays a = new Arrays();

        ArrayList letters = new ArrayList();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("C");

        a.verifyFirstRepetition(letters);


    }
}
