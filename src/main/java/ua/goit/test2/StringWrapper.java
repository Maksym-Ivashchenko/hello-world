package ua.goit.test2;

import java.util.Iterator;

//public class StringWrapper<E> implements Iterable<E> {
//    private final E value;
//    private int cursor =0;
//
//    public StringWrapper(E value) {
//        this.value = value;
//    }
//
//    public E getValue() {
//        return value;
//    }
//
//    @Override
//    public String toString() {
//        return "StringWrapper{" +
//                "value=" + value +
//                '}';
//    }
//
//    @Override
//    public Iterator iterator() {
//        return new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return cursor < value.toCharArray().length;
//            }
//
//            @Override
//            public String next() {
//                return String.valueOf(value.charAt(cursor++));
//            }
//        };
//    }
//}
