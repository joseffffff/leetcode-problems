package me.joseff.codeproblems.common;

public interface BaseOutput<T> {

    public T output();

    public boolean compareTo(BaseOutput<T> baseOutput);

    public String toString();
}
