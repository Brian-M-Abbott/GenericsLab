package io.brianabbott;

/**
 * Created by brianabbott on 5/25/16.
 */
public class MyArrayList<T> {

    private Object[] contentStorage;

    private int currentBlankIndexInArray = 0;

    public MyArrayList(){
        contentStorage = new Object[10];
    }

    public MyArrayList(int arrayLength){
        contentStorage = new Object[arrayLength];
    }

    public void add(T obj){
        if(currentBlankIndexInArray == contentStorage.length-1){
            resizeArray();
        }
        contentStorage[currentBlankIndexInArray] = obj;
        currentBlankIndexInArray++;
        return;
    }

    public void add(T obj,int index){
        if(currentBlankIndexInArray == contentStorage.length-1){
            resizeArray();
        }

        moveItemsRight(index);
        contentStorage[index] = obj;
        currentBlankIndexInArray++;
        return;
    }

    public T get(int index)  {
        return (T)contentStorage[index];
    }

    public T remove(int index){
        T removedObject = (T)contentStorage[index];
        Object[] oneLessArray = new Object[contentStorage.length-1];

        for(int i = 0; i < index;i++){
            oneLessArray[i]=contentStorage[i];
        }

        for(int i = index;i<contentStorage.length-1;i++){
            if(i == contentStorage.length-1) break;
            oneLessArray[i]=contentStorage[i+1];
        }
        contentStorage = oneLessArray;
        currentBlankIndexInArray--;
        return removedObject;
    }

    public void remove(T obj){
        for(int i = 0; i <contentStorage.length;i++){
            if(contentStorage[i].equals(obj)){
                remove(i);
                break;
            }
        }
    }

    public void set(int index, T obj) throws IndexOutOfBoundsException {
        if(contentStorage[index] == null){
            throw new IndexOutOfBoundsException();
        }
        contentStorage[index]=obj;
    }

    public void clear(){
        contentStorage = new Object[10];
    }

    public boolean isEmpty(){
        for(int i = 0; i < contentStorage.length;i++){
            if(contentStorage[i]!= null){
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object obj){
        for(int i = 0; i < contentStorage.length;i++){
            if(contentStorage[i].equals(obj)){
                return true;
            }
        }
        return false;
    }

    private void resizeArray(){
        Object[] largerArray = new Object[contentStorage.length+10];
        for(int i = 0; i < contentStorage.length;i++){
            largerArray[i] = contentStorage[i];
        }
        contentStorage = largerArray;
    }

    private void moveItemsRight(int index){
        for(int x = contentStorage.length-1;x>index;x--){
            contentStorage[x]=contentStorage[x-1];
        }
    }
}
