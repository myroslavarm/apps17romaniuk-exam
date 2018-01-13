package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] integers;
    public BaseArray(Object[] integers){
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
