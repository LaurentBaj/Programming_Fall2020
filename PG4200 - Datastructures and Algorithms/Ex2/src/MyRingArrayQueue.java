package org.pg4200.ex02;

import org.pg4200.les02.queue.MyQueue;

public class MyRingArrayQueue<T> implements MyQueue<T> {

    protected Object[] data;

    /*
        Note: here it can happen that tail < head
     */

    private int head = -1;
    private int tail = -1;

    public MyRingArrayQueue(){
        this(10);
    }

    public MyRingArrayQueue(int capacity){
        data = new Object[capacity];
    }

    public void enqueue(T value) {

        if (isEmpty()) {
            head = 0;
            tail = 0;

        } else if (head <= tail) {

            if(tail < data.length) {
                tail++;
            } else {
                if (head != 0) {
                    tail = 0;
                } else {
                    Object[] duplicate = new Object[data.length * 2];

                    for (int i = 0; i < data.length; i++) {
                        duplicate[i] = data[i];
                    }
                    data = duplicate;
                    tail++;
                }
            }
        } else {
            assert tail < head;

            if (tail < head) {
                tail++;
            } else {
                Object[] duplicate = new Object[data.length * 2];

                int diff = data.length - 1;
                for (int i = 0; i < diff; i++) {
                    duplicate[i] = data[head + 1];
                }

                for (int i = 0; i < (tail + 1); i++) {
                    duplicate[diff + 1] = data[i];
                }

                head = 0;
                tail = data.length;
                data = duplicate;
            }
        }

        data[tail] = value;

    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new RuntimeException();
        }

        T value = (T) data[head];

        if(size() == 1){
            //now it ll be empty
            head = -1;
            tail = -1;
        } else {
            head++;
            if(head >= data.length){
                head = 0;
            }
        }

        return value;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new RuntimeException();
        }

        return (T) data[head];
    }

    @Override
    public int size() {
        if(head < 0){
            return 0;
        } else if(head == tail) {
            return 1;
        } else if(head < tail) {
            //normal case
            return (tail - head) + 1;
        } else {
            int size = 0;
            //add size based on all elements after head
            size += (data.length - head);
            //then add all from 0 til tail
            size += tail + 1;

            return size;
        }
    }
}
