package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{

    private final MyFunction MY_FUNCTION;

    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        this.MY_FUNCTION = myFunction;
        applyFunction();
    }

    @Override
    public String operationDescription() {
        return "MapDecorator is applied.";
    }

    private void applyFunction() {

        Object[] newArray = smartArray.toArray();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = MY_FUNCTION.apply(newArray[i]);

        }
        this.smartArray = new BaseArray(newArray);
    }

}
