package edu.handong.csee.java.hw2.converters;

/**
 * converter for MILE fo KM
 */
public class MILEToKMConverter implements Convertible{
    
    /**
     * to return converted result
     */
    private double result;

    /**
     * to set fromvalue
     */
    private double fromValue;

    /**
     * set fromValue to private fromValue
     * @param fromValue
     */
    public void setFromValue(double fromValue){
        this.fromValue = fromValue;
    }

    /**
     * get result of converted value
     * @return
     */
    public double getConvertedValue(){
        return result;
    }

    /**
     * calculate
     */
    public void convert(){
        result = fromValue * 1.6;
    }
}
