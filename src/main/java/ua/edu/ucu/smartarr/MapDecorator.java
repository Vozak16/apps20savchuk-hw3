package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    private final MyFunction myFunction;

    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        this.myFunction = myFunction;
        applyFunction();
    }

    @Override
    public String operationDescription() {
        return "MapDecorator is applied.";
    }

    private void applyFunction() {

        Object[] newArray = getSmartArray().toArray();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myFunction.apply(newArray[i]);

        }
        this.setSmartArray(new BaseArray(newArray));
    }

}
