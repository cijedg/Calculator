package Interfaces;

@FunctionalInterface

public interface UnaryOperator<T> {
    T apply(T t);
}
