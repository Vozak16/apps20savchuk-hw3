package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    private final MyPredicate myPredicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        this.myPredicate = myPredicate;
        applyFunctionFilter();
    }

    @Override
    public String operationDescription() {
        return "FilterDecorator is applied.";
    }

    private void applyFunctionFilter() {

        Object[] newArray = smartArray.toArray();
        int newLength = 0;

        for (Object elem : newArray) {
            if (myPredicate.test(elem)) {
                newLength++;
            }
        }

        Object[] resultArray = new Object[newLength];

        int j = 0;
        for (Object elem : newArray) {
            if (myPredicate.test(elem)) {
                resultArray[j] = elem;
                j++;
            }
        }
        this.smartArray = new BaseArray(resultArray);
    }
}
