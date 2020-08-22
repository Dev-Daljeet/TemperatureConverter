package convertTemperatureUnits;

import java.text.DecimalFormat;

public class Converter
{
    private String result;
    private double convertedUnit;
    private DecimalFormat decimalFormat = new DecimalFormat("#####.###");
    private static Converter onlyConverter = null;

    private Converter()
    {
        result = null;
        convertedUnit = 0.0;
    }

    public static Converter getInstance()
    {
        if(onlyConverter == null)
        {
            onlyConverter = new Converter();
        }
        return onlyConverter;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getConvertedUnit() {
        return convertedUnit;
    }

    public void setConvertedUnit(double convertedUnit) {
        this.convertedUnit = convertedUnit;
    }

    public String celsiusConversion(String convertTo, double unit)
    {
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = unit;
            result = decimalFormat.format(unit) + " °C = " + decimalFormat.format(convertedUnit) + " °C";
            break;
            case "Fahrenheit (°F)": convertedUnit = unit*9/5+32;
            result = decimalFormat.format(unit) + " °C = " + decimalFormat.format(convertedUnit) + " °F";
            break;
            case "Kelvin (K)": convertedUnit = unit+273.15;
            result = decimalFormat.format(unit) + " °C = " + decimalFormat.format(convertedUnit) + " K";
            break;
            case "Rankine (°R)": convertedUnit = unit*9/5+491.67;
            result = decimalFormat.format(unit) + " °C = " + decimalFormat.format(convertedUnit) + " °R";
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }

    public String fahrenheitConversion(String convertTo, double unit)
    {
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = (unit-32)*5/9;
                result = decimalFormat.format(unit) + " °F = " + decimalFormat.format(convertedUnit) + " °C";
                break;
            case "Fahrenheit (°F)": convertedUnit = unit;
                result = decimalFormat.format(unit) + " °F = " + decimalFormat.format(convertedUnit) + " °F";
                break;
            case "Kelvin (K)": convertedUnit = (unit+459.67)*5/9;
                result = decimalFormat.format(unit) + " °F = " + decimalFormat.format(convertedUnit) + " K";
                break;
            case "Rankine (°R)": convertedUnit = unit+459.67;
                result = decimalFormat.format(unit) + " °F = " + decimalFormat.format(convertedUnit) + " °R";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }

    public String kelvinConversion(String convertTo, double unit)
    {
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = unit-273.15;
                result = decimalFormat.format(unit) + " K = " + decimalFormat.format(convertedUnit) +" °C";
                break;
            case "Fahrenheit (°F)": convertedUnit = unit*9/5-459.67;
                result = decimalFormat.format(unit) + " K = "+ decimalFormat.format(convertedUnit) +" °F";
                break;
            case "Kelvin (K)": convertedUnit = unit;
                result = decimalFormat.format(unit) + " K = "+ decimalFormat.format(convertedUnit) + " K";
                break;
            case "Rankine (°R)": convertedUnit = unit*9/5;
                result = decimalFormat.format(unit) + " K = "+ decimalFormat.format(convertedUnit) + " °R";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }

    public String rankineConversion(String convertTo, double unit)
    {
        switch (convertTo) {
            case "Celsius (°C)":
                convertedUnit = unit * 5 / 9 - 273.15;
                result = decimalFormat.format(unit) + " °R = " + decimalFormat.format(convertedUnit) + " °C";
                break;
            case "Fahrenheit (°F)":
                convertedUnit = unit - 459.67;
                result = decimalFormat.format(unit) + " °R = " + decimalFormat.format(convertedUnit) + " °F";
                break;
            case "Kelvin (K)":
                convertedUnit = unit * 5 / 9;
                result = decimalFormat.format(unit) + " °R = " + decimalFormat.format(convertedUnit) + " K";
                break;
            case "Rankine (°R)":
                convertedUnit = unit;
                result = decimalFormat.format(unit) + " °R = " + decimalFormat.format(convertedUnit) + " °R";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }
}
