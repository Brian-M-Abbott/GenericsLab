package io.brianabbott;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brianabbott on 5/26/16.
 */
public class MySetSpec {

    MySet<String> test = new MySet<>();
    @Before

    @Test
    public void addTest(){
        test.add("Test1");
        String expectedString = "Test1";
        String actualString = test.get(0);
        assertEquals("The first item should be test1",expectedString,actualString);
    }

    @Test
    public void addAtIndexTest(){
        test.add("Test1");
        test.add("Test2");
        String expectedString = "TestInBetween";
        test.add("TestInBetween",1);
        String actualString = test.get(1);
        assertEquals("The item at index 1 should be 'TestInBetween'",expectedString,actualString);
    }

    @Test
    public void addDuplicateTest(){
        test.add("Test1");
        test.add("Test1");
        String expectedString = null;
        String actualString = test.get(1);
        assertEquals("The first indexed item should be null",expectedString,actualString);
    }

    @Test
    public void setItemTest(){
        test.add("Test1");
        test.set(0,"TestSet");
        String expectedString = "TestSet";
        String actualString = test.get(0);
        assertEquals("The first indexed item should be null",expectedString,actualString);
    }

    @Test
    public void setItemDuplicateTest(){
        test.add("Test1");
        test.add("TestSet");
        test.set(0,"TestSet");
        String expectedString = "Test1";
        String actualString = test.get(0);
        assertEquals("The first indexed item should be null",expectedString,actualString);
    }

    @Test
    public void toObjectArray(){
        test.add("Test");
        assertTrue(test.toArray() instanceof Object[]);
    }


}
