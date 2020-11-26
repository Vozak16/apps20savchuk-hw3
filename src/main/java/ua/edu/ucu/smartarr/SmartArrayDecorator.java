package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    } // return array with SmartArray elements

    @Override
    public String operationDescription() {
        return smartArray.operationDescription();
    } // return current operation name applied to SmartArray

    @Override
    public int size() {
        return smartArray.size();
    } // return SmartArray size

}
