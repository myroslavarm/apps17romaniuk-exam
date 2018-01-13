package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);
    }

    public void deleteNegativeNumbers(SmartArray smartArray){
        for(int i=0; i<smartArray.size(); ++i){
            if((int)smartArray.toArray()[i] < 0){
                smartArray.toArray()[i] = null;
            }
        }
    }
}
