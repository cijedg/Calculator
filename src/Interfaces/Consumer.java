package Interfaces;

@FunctionalInterface

public interface Consumer<T>{
    void accept(T t);
}
