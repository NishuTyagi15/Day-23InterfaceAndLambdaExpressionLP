package com.interfaceandlambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayList {
    public NumberPlayList() {
    }

    public static void main(String[] args) {
        //creating sample collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) myList.add(i);

        //Method 1: Traversing Using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" +i);
        }

        //Method 2:Iterating Using forEach
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer i) {
                System.out.println("forEach Consumer Value::"+i);
            }
        }
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        //Method 3:Traversing with Anonymous Consumer
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println("forEach Anonymous Class Value::"+i);
            }
        });

        //Method 4:Explicit Lambda Function
        Consumer<Integer> myListAction = i-> {
            System.out.println("forEach Explicit Lambda Value::"+i);
        };
        myList.forEach(myListAction);

        //Method 4:Implicit Lambda Function
        myList.forEach(i-> {
            System.out.println("forEach Implicit Lambda Value::"+i);
        });
    }
}
