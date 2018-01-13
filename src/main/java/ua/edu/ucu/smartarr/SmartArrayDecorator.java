package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    public Object[] toArray(){
        return smartArray.toArray();
    } // return array with SmartArray elements

    public String operationDescription(){
        return smartArray.operationDescription();
    } // return current operation name applied to SmartArray

    public int size(){
            return smartArray.size();
    } // return SmartArray size

}
