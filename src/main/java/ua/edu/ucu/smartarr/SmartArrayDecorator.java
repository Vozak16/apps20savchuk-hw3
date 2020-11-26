package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    private SmartArray smartArray;

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

    public SmartArray getSmartArray() {
        return smartArray;
    }

    public void setSmartArray(SmartArray smartArr) {
        this.smartArray = smartArr;
    }

    @Override
    public int size() {
        return smartArray.size();
    } // return SmartArray size

}
