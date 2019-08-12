package com.mckesson.task1.iterator.impl;

import java.util.*;

public class AlternatingIterator<E> implements Iterator {

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    private List<Iterator<E>> itrs;

    private List<Iterator<E>> listIterator;

    private Iterator<E> iterators[];

    private int size;
    
    private int noOfItr;

    private int cursor = 0;
    private int itrCursor = 0;
    private boolean isLastElement = false;

    /**
     * Constructor to accept the different types or iterator
     * @param iterators
     */
    public AlternatingIterator(Iterator<E> ... iterators) {
        this.iterators = iterators;
        this.itrs = new ArrayList<Iterator<E>>();
        addIteratorToLit(this.iterators);
        this.noOfItr = this.iterators.length;
    }

    private void addIteratorToLit(Iterator<E>[] iterators) {

        for(Iterator<E> iterator: iterators) {
            int index = 0;
            Object[] data = new Object[DEFAULT_CAPACITY];
            /*while (iterator.hasNext()) {
                Object obj = iterator.next();
                data[index++] = obj;
                size++;
            }*/
           // this.dataMap.put(iterator, data);
            this.itrs.add(iterator);
        }
        System.out.println(this.itrs);
    }


    /**
     * Checks the element in the given iterator
     * @return true if next element found otherwise false
     */
    public boolean hasNext() { return !this.isLastElement;}

    /**
     * This method returns the element exists in the iterator
     *
     * @return returns the object if hasNext() is true.
     */
    public Object next() {
    	
    	if(itrCursor == noOfItr) {
    		itrCursor=0;
    	}
    	
    	Iterator<E> itr = itrs.get(itrCursor);
    	if(itrCursor < noOfItr) {
    		itrCursor++;
    	}
    	while(itr.hasNext()) {
    		Object obj = itr.next();
    		return obj;
    	}
    	
    	if(!itr.hasNext() && itrCursor < noOfItr) {
    		return next();
    	}else {
    		isLastElement=true;
    	}
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

}
