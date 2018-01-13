package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    public void removeRepeatedElements(SmartArray smartArray){
        for(int i=0; i<smartArray.size(); ++i){
            if(smartArray.equals(smartArray.toArray()[i])){
                smartArray.toArray()[i] = null;
            }
        }
    }
}
