package convertTemperatureUnits;

import java.text.DecimalFormat;

public class Converter
{
    private String result;
    private double convertedUnit;
    private DecimalFormat decimalFormat = new DecimalFormat("#####.###");
    private static Converter onlyConverter = null;
    private String[] unitsOfMeasurement = {"°C","°F", "K","°R"};

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
        int i = 0;
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

    public String fahrenheitConversion(String convertTo, double unit)
    {
        int i = 0;
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

    public String rankineConversion(String convertTo, double unit)
    {
        int i;
        switch (convertTo) {
            case "Celsius (°C)":
                convertedUnit = unit * 5 / 9 - 273.15;
                i = 0;
                break;
            case "Fahrenheit (°F)":
                convertedUnit = unit - 459.67;
                i = 1;
                break;
            case "Kelvin (K)":
                convertedUnit = unit * 5 / 9;
                i = 2;
                break;
            case "Rankine (°R)":
                convertedUnit = unit;
                i = 3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return decimalFormat.format(unit) + " " + unitsOfMeasurement[3] + " = " + decimalFormat.format(convertedUnit) +" "+ unitsOfMeasurement[i];
    }
}
