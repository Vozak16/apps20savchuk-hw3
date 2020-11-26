package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    private final MyComparator MY_COMPARATOR;

    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);
        this.MY_COMPARATOR = myComparator;
        applyFunction();
    }

    @Override
    public String operationDescription() {
        return "SortDecorator is applied.";
    }

    private void applyFunction() {

        Object[] newArray = smartArray.toArray();

        Arrays.sort(newArray, MY_COMPARATOR);
        this.smartArray = new BaseArray(newArray);
    }
    
}
