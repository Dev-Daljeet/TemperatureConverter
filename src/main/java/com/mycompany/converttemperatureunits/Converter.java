package com.mycompany.converttemperatureunits;

import java.text.DecimalFormat;

/** Represents the converter which converts the temperature units.
 * (Note: The Singleton pattern has been implemented on this class.)
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class Converter
{
    private double convertedUnit;
    private DecimalFormat decimalFormat = new DecimalFormat("#####.###");
    private String[] unitsOfMeasurement = {"°C","°F", "K","°R"};

    // The one and only instance of class Converter.
    private static Converter onlyConverter = null;

    /**
     * Private default no-arg constructor which controls the instantiation of the class.
     */
    private Converter()
    {
        convertedUnit = 0.0;
    }

    /** Defines one instance only and allocates the memory to it.
     * @return onlyConverter A one and only instance of class Converter.
     */
    public static Converter getInstance()
    {
        if(onlyConverter == null)
        {
            onlyConverter = new Converter();
        }
        return onlyConverter;
    }

    /** Gets the converted units.
     * @return convertedUnit A double representing the converted units produced after the conversion.
     */
    public double getConvertedUnit() {
        return convertedUnit;
    }

    /** Sets the converted units.
     * @param convertedUnit A double representing the converted units produced after the conversion.
     */
    public void setConvertedUnit(double convertedUnit) {
        this.convertedUnit = convertedUnit;
    }

    /** Converts the units in celsius to specified units.
     * @param convertTo A String representing which unit to convert to.
     * @param unit A double representing the inputted units.
     * @return A string representing the units and converted units after the conversion.
     */
    public String celsiusConversion(String convertTo, double unit)
    {
        int i;
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = unit;
            i = 0;
            break;
            case "Fahrenheit (°F)": convertedUnit = unit*9/5+32;
            i = 1;
            break;
            case "Kelvin (K)": convertedUnit = unit+273.15;
            i = 2;
            break;
            case "Rankine (°R)": convertedUnit = unit*9/5+491.67;
            i = 3;
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return decimalFormat.format(unit) + " " + unitsOfMeasurement[0] + " = " + decimalFormat.format(convertedUnit) +" "+ unitsOfMeasurement[i];
    }

    /** Converts the units in fahrenheit to specified units.
     * @param convertTo A String representing which unit to convert to.
     * @param unit A double representing the inputted units.
     * @return A string representing the units and converted units after the conversion.
     */
    public String fahrenheitConversion(String convertTo, double unit)
    {
        int i;
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = (unit-32)*5/9;
                i = 0;
                break;
            case "Fahrenheit (°F)": convertedUnit = unit;
                i = 1;
                break;
            case "Kelvin (K)": convertedUnit = (unit+459.67)*5/9;
                i = 2;
                break;
            case "Rankine (°R)": convertedUnit = unit+459.67;
                i = 3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return decimalFormat.format(unit) + " " + unitsOfMeasurement[1] + " = " + decimalFormat.format(convertedUnit) +" "+ unitsOfMeasurement[i];
    }

    /** Converts the units in kelvin to specified units.
     * @param convertTo A String representing which unit to convert to.
     * @param unit A double representing the inputted units.
     * @return A string representing the units and converted units after the conversion.
     */
    public String kelvinConversion(String convertTo, double unit)
    {
        int  i;
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = unit-273.15;
                i = 0;
                break;
            case "Fahrenheit (°F)": convertedUnit = unit*9/5-459.67;
                i = 1;
                break;
            case "Kelvin (K)": convertedUnit = unit;
                i = 2;
                break;
            case "Rankine (°R)": convertedUnit = unit*9/5;
                i = 3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return decimalFormat.format(unit) + " " + unitsOfMeasurement[2] + " = " + decimalFormat.format(convertedUnit) +" "+ unitsOfMeasurement[i];
    }

    /** Converts the units in rankine to specified units.
     * @param convertTo A String representing which unit to convert to.
     * @param unit A double representing the inputted units.
     * @return A string representing the units and converted units after the conversion.
     */
    public String rankineConversion(String convertTo, double unit)
    {
        int i;
        switch (convertTo) {
            case "Celsius (°C)": convertedUnit = unit * 5 / 9 - 273.15;
                i = 0;
                break;
            case "Fahrenheit (°F)": convertedUnit = unit - 459.67;
                i = 1;
                break;
            case "Kelvin (K)": convertedUnit = unit * 5 / 9;
                i = 2;
                break;
            case "Rankine (°R)": convertedUnit = unit;
                i = 3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return decimalFormat.format(unit) + " " + unitsOfMeasurement[3] + " = " + decimalFormat.format(convertedUnit) +" "+ unitsOfMeasurement[i];
    }
}
