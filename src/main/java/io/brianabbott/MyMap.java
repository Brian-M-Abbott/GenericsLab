package io.brianabbott;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by brianabbott on 5/28/16.
 */
public class MyMap<K,V> {

    private Object[] keyStorage;
    private Object[] valueStorage;
    private int arrayIndex = 0;

    public MyMap(){
        keyStorage = new Object[10];
        valueStorage = new Object[10];
    }

    public MyMap(int size){
        keyStorage = new Object[size];
        valueStorage = new Object[size];
    }

    public Object[] getKeyStorage(){
        return (K[])keyStorage;
    }

    public Object[] getValueStorage(){
        return (V[])valueStorage;
    }

    public void put(K key, V value){
        if(arrayIndex == keyStorage.length-1){
            resizeArray();
        }

        if(get(key) == null){
            keyStorage[arrayIndex] = key;
            valueStorage[arrayIndex] = value;
            arrayIndex++;
        }
    }

    public void clear(){
        keyStorage = new Object[10];
        valueStorage = new Object[10];
        arrayIndex = 0;
    }

    public boolean containsKey(K key){
        for(int i = 0; i < keyStorage.length;i++) {
            if (keyStorage[i] == null) {
                continue;
            }
            if (keyStorage[i] == key) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value){
        for(int i = 0; i < valueStorage.length;i++){
            if(valueStorage[i] == null){
                continue;
            }

            if(valueStorage[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public V get(K key){
        for(int i = 0; i < keyStorage.length;i++){
            if(keyStorage[i] == null){
                continue;
            } else if(keyStorage[i].equals(key)){
                return (V)valueStorage[i];
            }
        }
        return null;
    }

    public boolean isEmpty(){
        for(int i = 0;i<keyStorage.length;i++){
            if(keyStorage[i] != null){
                return false;
            }
        }
        return true;
    }


    public Set<K> keySet(){
        Set<K> keylist = new HashSet<>();

        for(int i = 0; i < keyStorage.length;i++){
            if(keyStorage[i] != null)
            keylist.add((K)keyStorage[i]);
        }
        return keylist;
    }

    public void remove(K key){
        int indexToRemove = 0;

        if(containsKey(key) ==false){
            return;
        }

        for(int i = 0; i < keyStorage.length;i++){
            if(keyStorage[i] == key){
                indexToRemove = i;
            }
        }

        for(int i = indexToRemove;i<keyStorage.length-1;i++){
            keyStorage[i] = keyStorage[i+1];
            valueStorage[i] = valueStorage[i+1];
        }
        arrayIndex--;
    }

    private void resizeArray(){
        Object[] largerKeyArray = new Object[valueStorage.length+10];
        Object[] largerValArray = new Object[keyStorage.length+10];
        for(int i = 0; i < valueStorage.length;i++){
            largerValArray[i] = valueStorage[i];
        }
        for(int i = 0; i < keyStorage.length;i++){
            largerKeyArray[i] = keyStorage[i];
        }
        keyStorage = largerKeyArray;
        valueStorage = largerValArray;
    }

    public int size(){

        return arrayIndex;
    }









}
