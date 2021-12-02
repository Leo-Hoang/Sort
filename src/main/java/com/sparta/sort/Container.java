package com.sparta.sort;

public class Container <T extends Comparable<T>> implements Comparable<Container<T>> {
    private T value;
    public Container(T value)  { this.value = value; }

    private T getValue() { return value; }

    @Override
    public int compareTo(Container<T> o)
    {
        return getValue().compareTo(o.getValue());
    }
}
