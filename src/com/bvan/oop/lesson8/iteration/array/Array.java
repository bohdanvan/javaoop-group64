package com.bvan.oop.lesson8.iteration.array;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author bvanchuhov
 */
public class Array<T> implements Iterable<T> {

    private final T[] elems;

    public Array(T[] elems) {
        this.elems = elems;
    }

    public T get(int idx) {
        return elems[idx];
    }

    public void set(int idx, T elem) {
        elems[idx] = elem;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elems.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elems[currentIndex++];
        }
    }
}
