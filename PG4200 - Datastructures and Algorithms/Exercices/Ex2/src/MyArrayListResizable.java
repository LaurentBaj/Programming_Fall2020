package org.pg4200.ex02;

import org.pg4200.les02.list.MyArrayList;

public class MyArrayListResizable<T> extends MyArrayList<T> {

    public MyArrayListResizable(){
        super();
    }

    public MyArrayListResizable(int capacity){
        super(capacity);
    }

    @Override
    public void add(int index, T value) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if(data.length == size) {
            Object[] duplicate = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                duplicate[i]  = data[i];
            }
            data = duplicate;
        }
        
        super.add(index, value);
    }
}
