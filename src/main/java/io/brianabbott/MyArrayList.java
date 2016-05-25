package io.brianabbott;

/**
 * Created by brianabbott on 5/25/16.
 */
public class MyArrayList<T> {

    public final T contents;
    private Object[] contentStorage;

    public  MyArrayList(T obj){
        contents = obj;
        contentStorage = new Object[10];
    }

    public boolean add(T obj){

        return false;
    }

    public void add(T obj,int index){

        return;
    }

    public T get(int index) {
        return null;
    }

    public T remove(int index){
        return null;
    }

    public boolean remove(T obj){
        return false;
    }

    public void set(int index, T obj) {
        return;
    }

    public void clear(){
        return;
    }

    public boolean isEmpty(){
        return false;
    }

    public boolean contains(){
        return false;
    }



}
