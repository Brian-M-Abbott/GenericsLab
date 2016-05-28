package io.brianabbott;

/**
 * Created by brianabbott on 5/25/16.
 */
public class MySet<T> extends MyArrayList<T> {


    public MySet(){
        super();
    }

    public MySet(int size){
        super(size);
    }


    @Override
    public void add(T obj) {
        if(super.contains(obj) == false) super.add(obj);
    }

    @Override
    public void add(T obj, int index) {
        if(super.contains(obj) == false) super.add(obj, index);
    }

    @Override
    public void set(int index, T obj) throws IndexOutOfBoundsException {
        if(contains(obj) == false) super.set(index, obj);
    }

    public Object[] toArray(){
        return super.contentStorage;
    }

}
