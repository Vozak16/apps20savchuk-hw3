package ua.edu.ucu;

import java.util.Arrays;
import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;
import ua.edu.ucu.smartarr.*;

public class SmartArrayApp {

    public static Integer[]
            filterPositiveIntegersSortAndMultiplyBy2(Integer[] integers) {
                
        MyPredicate pr = t -> ((Integer) t) > 0;

        MyComparator cmp = (o1, o2) -> ((Integer) o1) - ((Integer) o2);

        MyFunction func = t -> 2 * ((Integer) t);

        // Input: [-1, 2, 0, 1, -5, 3]
        SmartArray studentSmartArray = new BaseArray(integers);

        studentSmartArray = new FilterDecorator(studentSmartArray, pr);
        studentSmartArray = new SortDecorator(studentSmartArray, cmp);
        studentSmartArray = new MapDecorator(studentSmartArray, func);
        studentSmartArray = new DistinctDecorator(studentSmartArray);

        Object[] result = studentSmartArray.toArray();
        return Arrays.copyOf(result, result.length, Integer[].class);
    }

    public static Object[]
            findDistinctStudentNamesFrom2ndYearWithGPAgt4AndOrderedBySurname(Student[] students) {

        MyPredicate pr1 = t -> ((Student) t).getGPA() >= 4;

        MyPredicate pr2 = t -> ((Student) t).getYear() == 2;

        MyFunction func = t -> ((Student) t).getSurname()  + " " +
                ((Student) t).getName();

        MyComparator cmp = (o1, o2) -> ((Student) o1).getSurname().compareTo(((Student) o2).getSurname());

        SmartArray studentSmartArray = new BaseArray(students);

        studentSmartArray = new FilterDecorator(studentSmartArray, pr1);
        studentSmartArray = new FilterDecorator(studentSmartArray, pr2);
        studentSmartArray = new SortDecorator(studentSmartArray, cmp);
        studentSmartArray = new MapDecorator(studentSmartArray, func);
        studentSmartArray = new DistinctDecorator(studentSmartArray);

        Object[] result = studentSmartArray.toArray();
        return Arrays.copyOf(result, result.length, String[].class);
    }
}
