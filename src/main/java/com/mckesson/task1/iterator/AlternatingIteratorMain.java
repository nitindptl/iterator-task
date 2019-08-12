package com.mckesson.task1.iterator;

import com.mckesson.task1.iterator.impl.AlternatingIterator;
import com.mckesson.task1.iterator.impl.EvenIterator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AlternatingIteratorMain {
    public static void main(String args[]) {
        //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*EvenIterator<Integer> myList = new EvenIterator(list);

        Iterator<Integer> iter = myList;

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }*/

        List<String> list1 = Arrays.asList("1","2","3");
        List<String> list2 = Arrays.asList("a","b","c","dd");
        List<String> list3 = Arrays.asList("y","z","a");

       Iterator<String> itr1 = list1.iterator();

        Iterator<String> itr2 = list2.iterator();

        Iterator<String> itr3 = list3.iterator();

       AlternatingIterator<Object> alternatingIterator = new AlternatingIterator(itr1, itr2, itr3);

        while (alternatingIterator.hasNext()) {
            System.out.println(alternatingIterator.next());
        }

    }


}
