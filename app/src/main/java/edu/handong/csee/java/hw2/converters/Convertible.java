package edu.handong.csee.java.hw2.converters;

/**
 * interface of converters class
 */
public interface Convertible {

    /**
     * set fromValue to private value
     * @param fromValue
     */
    public void setFromValue(double fromValue);

    /**
     * to return converted value
     */
    public double getConvertedValue();

    /**
     * to calculater
     */
    public void convert();

}