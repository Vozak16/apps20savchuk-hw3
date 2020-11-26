package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    private final MyComparator myComparator;

    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);
        this.myComparator = myComparator;
        applyFunction();
    }

    @Override
    public String operationDescription() {
        return "SortDecorator is applied.";
    }

    private void applyFunction() {

        Object[] newArray = getSmartArray().toArray();

        Arrays.sort(newArray, myComparator);
        this.setSmartArray(new BaseArray(newArray));
    }
    
}
