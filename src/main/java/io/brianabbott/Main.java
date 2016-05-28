package io.brianabbott;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * Created by brianabbott on 5/25/16.
 */
public class Main {

    public static void main(String[] args) {
        MySet<String> tester = new MySet<>(3);
        tester.add("Test");
        tester.add("Test2");
        tester.add("Test2");
        System.out.println(tester.contentStorage[2]);
       // System.out.println(tester.contains("Test"));



    }

}
