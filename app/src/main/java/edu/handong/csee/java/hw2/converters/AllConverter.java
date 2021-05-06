package edu.handong.csee.java.hw2.converters;

/**
 * class for print all result of convert
 * KM to M and MILE
 * TON to KG and G
 */
public class AllConverter {

    /**
     * to set fromvalue
     */
    private double fromValue;

    /**
     * to get measure for convert
     */
    private String originalMeasure;
    
    /**
     * set fromValue to private fromValue
     * @param fromValue
     */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }

    /**
     * set original measure to private originalMeasure
     * @param originalMeasure
     * @return 
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * by originalMeasure from agrc[1], decide what to print
     * print calculated value
     * if originalmeasure is not KM or TON, print error message
     */
    public void convertAndPrintOut(){
        if(originalMeasure == "KM"){
            System.out.println(fromValue + " KM to " + fromValue*1000 + " M");
            System.out.println(fromValue + " KM to " + fromValue/1.6 + " MILE");
        }else if(originalMeasure == "TON"){
            System.out.println(fromValue + " Ton to " + fromValue*1000 + " KG");
            System.out.println(fromValue + " Ton to " + fromValue*1000000 + " G");
        }else{
            System.out.println("AllConverter cannot supprot the measure!");
        }
    }
}
