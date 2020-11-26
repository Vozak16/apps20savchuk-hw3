package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{


    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        applyFunctionFilter();
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator is applied.";
    }

    private void applyFunctionFilter() {

        Object[] newArray = smartArray.toArray();
        int newLength = newArray.length;

        for (int i = 0; i < smartArray.size(); i++) {
            for (int j = i + 1; j < smartArray.size(); j++) {
                if (newArray[i].equals(newArray[j])) {
                    newLength--;
                }

            }

        }

        Object[] resultArray = new Object[newLength];
        int k = 0;
        for (int i = 0; i < smartArray.size(); i++) {
            boolean flag = true;
            for (int j = i + 1; j < smartArray.size(); j++) {
                if (newArray[i].equals(newArray[j])) {
                    flag = false;
                }
            }
            if (flag) {
                resultArray[k] = newArray[i];
                k++;

            }

        }

        this.smartArray = new BaseArray(resultArray);


    }

}
