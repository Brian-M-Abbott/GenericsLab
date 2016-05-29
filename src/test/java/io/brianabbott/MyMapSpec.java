package io.brianabbott;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by brianabbott on 5/28/16.
 */
public class MyMapSpec {

    @Test
    public void constructorTest(){
        MyMap<String,Integer> test = new MyMap<>(10);
        int expectedCombinedLength = 20;
        int actualCombinedLength = test.getKeyStorage().length + test.getValueStorage().length;
        assertEquals("The length of the key and value arrays should be equal and sum to 20",expectedCombinedLength,actualCombinedLength);
    }

    @Test
    public void getTest(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("testKey",5);
        int expectedValue = 5;
        int actualValue = test.get("testKey");
        assertEquals("The value for the key should be 5",expectedValue,actualValue);
    }

    @Test
    public void putKeyTest(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("Test",5);
        String expectedKey = "Test";
        String actualKey = (String)test.getKeyStorage()[0];
        assertEquals("The first key should be 'test'",expectedKey,actualKey);
    }

    @Test
    public void putValueTest(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("Test",5);
        int expectedValue = 5;
        int actualValue = (int)test.getValueStorage()[0];
        assertEquals("The first key should be 'test'",expectedValue,actualValue);
    }

    @Test
    public void containsKey(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("Test",5);
        assertTrue(test.containsKey("Test"));
    }

    @Test
    public void containsValue(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("Test",5);
        assertTrue(test.containsValue(5));
    }

    @Test
    public void clearTest(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("Test,", 5);
        test.put("testy",10);
        test.clear();
        assertNull(test.getKeyStorage()[0]);
    }

    @Test
    public void isEmptyTest(){
        MyMap<String,Integer> test = new MyMap<>(10);
        test.put("Test",1);
        test.clear();
        assertTrue("The array should be empty", test.isEmpty());
    }

    @Test
    public void keySetTest(){
        MyMap<String,Integer> testKeyset = new MyMap<>(10);
        testKeyset.put("firstkey",5);
        testKeyset.put("secondkey",5);
        Set actualSet = testKeyset.keySet();
        String expectedKeySet = "[firstkey, secondkey]";
        String actualFirstkey = actualSet.toString();
        assertEquals("The keyset should include all keys",expectedKeySet,actualFirstkey);
    }

    @Test
    public void removalTest(){
        MyMap<String,Integer> testRemoval = new MyMap<>(10);
        testRemoval.put("firstkey",5);
        testRemoval.put("secondkey",5);
        testRemoval.remove("secondkey");
        assertNull("The index at 1 should be null",testRemoval.getKeyStorage()[1]);
        assertNull("The index at 1 should be null",testRemoval.getValueStorage()[1]);
    }

    @Test
    public void sizeTest(){
        MyMap<String,Integer> testSize = new MyMap<>(10);
        testSize.put("test",1);
        int expectedSize = 1;
        int actualSize = testSize.size();
        assertEquals("The size should be 1",expectedSize,actualSize);
    }
}
