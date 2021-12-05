package com.sparta.sort;

public class Container <T extends Comparable<T>> implements Comparable<Container<T>> {
    private T value;
    public Container(T value)  { this.value = value; }
    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }

    @Override
    public int compareTo(Container<T> o)
    {
        return getValue().compareTo(o.getValue());
    }

    @Override
    public String toString() { return getValue().toString(); }

}
