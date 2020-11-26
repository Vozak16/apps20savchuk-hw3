package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    protected Object[] elements;

    public BaseArray(Object[] elements) {
        this.elements = elements;
    }

    public Object[] toArray() {
        return elements;
    }; // return array with SmartArray elements

    public String operationDescription() {
        return "BaseArray is used.";
    }; // return current operation name applied to SmartArray

    public int size() {
        return elements.length;
    }; // return SmartArray size


}
