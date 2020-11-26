package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    private final Object[] elements;

    public BaseArray(Object[] elements) {
        this.elements = elements.clone();
    }

    public Object[] toArray() {
        return elements.clone();
    }; // return array with SmartArray elements

    public String operationDescription() {
        return "BaseArray is used.";
    }; // return current operation name applied to SmartArray

    public int size() {
        return elements.length;
    }; // return SmartArray size


}
