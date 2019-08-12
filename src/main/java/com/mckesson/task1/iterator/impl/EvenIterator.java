package com.mckesson.task1.iterator.impl;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenIterator<T> implements Iterator<T> {

        private List<T> list;
        int size;
        int currentPointer = 0;

        public EvenIterator(List<T> list) {
            this.list = list;
            this.size = list.size();
        }

        public boolean hasNext() {
            return (currentPointer < size);
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            @SuppressWarnings("unchecked")
            T val = (T) list.get(currentPointer);
            currentPointer += 2;

            return val;
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }


