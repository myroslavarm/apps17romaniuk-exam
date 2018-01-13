package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
    }
}
