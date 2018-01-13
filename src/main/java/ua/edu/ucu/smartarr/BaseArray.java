package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Integer[] integers;
    public BaseArray(Integer[] integers){
        this.integers = integers;
    }

    @Override
    public Object[] toArray() {
        return integers;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return integers.length;
    }
}
