package ua.edu.ucu.smartarr;


// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {


    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        applyFunctionFilter();
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator is applied.";
    }

    private void applyFunctionFilter() {

        Object[] newArray = getSmartArray().toArray();
        int newLength = newArray.length;

        for (int i = 0; i < getSmartArray().size(); i++) {
            for (int j = i + 1; j < getSmartArray().size(); j++) {
                if (newArray[i].equals(newArray[j])) {
                    newLength--;
                }

            }

        }

        Object[] resultArray = new Object[newLength];
        int k = 0;
        for (int i = 0; i < getSmartArray().size(); i++) {
            boolean flag = true;
            for (int j = i + 1; j < getSmartArray().size(); j++) {
                if (newArray[i].equals(newArray[j])) {
                    flag = false;
                }
            }
            if (flag) {
                resultArray[k] = newArray[i];
                k++;

            }

        }

        this.setSmartArray(new BaseArray(resultArray));


    }

}
