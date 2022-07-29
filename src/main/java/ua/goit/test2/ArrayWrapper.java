package ua.goit.test2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayWrapper<E> implements Iterable<E>, Serializable, Cloneable {
    private final E[] array;
    private int cursor = 0;

    public ArrayWrapper(E[] array) {
        this.array = array;
    }

    public int length(int index) {
        return array.length;
    }

    public void set(int index, E element) {
        array[index] = element;
    }
    public E get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return cursor < array.length;
            }

            @Override
            public E next() {
                return array[cursor++];
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayWrapper<?> that = (ArrayWrapper<?>) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

}
