package org.example;

/*
    Copyable interface - Defines a copy() method that guarantees that any
    classes implementing the interface provide a shallow copy operation.
 */
public interface Copyable {
    public Object copy();
}
