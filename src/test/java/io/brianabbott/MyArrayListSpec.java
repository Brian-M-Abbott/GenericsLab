package io.brianabbott;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brianabbott on 5/25/16.
 */
public class MyArrayListSpec {

    @Test
    public void addObjectTest(){
        MyArrayList<String> testStringList = new MyArrayList<>();
        String expectedFirstString = "Test";
        testStringList.add("Test");
        testStringList.add("Test2");
        testStringList.add("Test3");
        testStringList.add("Test4");
        testStringList.add("Test5");
        testStringList.add("Test6");
        testStringList.add("Test7");
        testStringList.add("Test8");
        testStringList.add("Test9");
        testStringList.add("Test10");
        testStringList.add("Test11");
        testStringList.add("Test12");
        testStringList.add("Test13");
        String actualFirstString = testStringList.get(0);
        assertEquals("The first object should be 'Test'",expectedFirstString,actualFirstString);
    }

    @Test
    public void addObjectAtIndexTest(){
        MyArrayList<String> testStringList = new MyArrayList<>();
        String expectedFirstString = "Test3";
        testStringList.add("Test");
        testStringList.add("Test2");
        testStringList.add("Test3",1);
        String actualFirstIndex = "Test3";
        assertEquals(expectedFirstString,actualFirstIndex);
    }

    @Test
    public void getObjectFromArrayListTest() throws IndexOutOfBoundsException{
        MyArrayList<Integer> testIntList = new MyArrayList<>();
        int expectedFirstValue  = 5;
        testIntList.add(5);
        int actualFirstValue = testIntList.get(0);
        assertEquals("The first  value should be 5", expectedFirstValue,actualFirstValue);
    }

    @Test
    public void removeItemTest(){
        MyArrayList<String> testString = new MyArrayList<>();
        testString.add("Test1");
        testString.add("Test2");
        testString.add("Test3");
        testString.remove(1);
        String expectedValue = "Test3";
        String actualValue = testString.get(1);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void removeSpecificItemTest(){
        MyArrayList<String> testString = new MyArrayList<>();
        testString.add("1Test");
        testString.add("2Test");
        testString.add("3Test");
        testString.add("2Test");
        testString.remove("2Test");
        String expectedValueAtIndex1 = "3Test";
        String actualValueAtIndex1 = testString.get(1);
        assertEquals("The value at index 1 should be 3Test after removal",expectedValueAtIndex1,actualValueAtIndex1);
    }

    @Test
    public void clearTest(){
        MyArrayList<String> testString = new MyArrayList<>();
        testString.add("1Test");
        testString.add("2Test");
        testString.add("3Test");
        testString.clear();
        String expectedValue = null;
        String actualValue = testString.get(0);
        assertEquals("The cleared array should be empty",expectedValue,actualValue);
    }

    @Test
    public void setTest(){
        MyArrayList<String> testString = new MyArrayList<>();
        testString.add("StringToSet");
        testString.set(0,"Setted");
        String expectedSetValue = "Setted";
        String actualSetValue = testString.get(0);
        assertEquals("The value should be set to Setted",expectedSetValue,actualSetValue);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setFailureTest(){
        MyArrayList<String> testString = new MyArrayList<>();
        testString.set(0,"FAILURE");
    }

    @Test
    public void isEmptyTest() {
        MyArrayList<String> emptyMyArrayList = new MyArrayList<>();
        boolean expectedEmptyStatus = true;
        boolean actualEmptyStatus = emptyMyArrayList.isEmpty();
        assertEquals("Should be true", expectedEmptyStatus, actualEmptyStatus);
    }

    @Test
    public void containsTest() {
        MyArrayList<String> testMyArrayList = new MyArrayList<>();
        testMyArrayList.add("Test");
        boolean expectedContainsStatus = true;
        boolean actualContainsStatus = testMyArrayList.contains("Test");
        assertEquals("Should be true", expectedContainsStatus, actualContainsStatus);
    }

}
