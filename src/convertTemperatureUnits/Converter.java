package convertTemperatureUnits;

public class Converter {
    public String celsiusConversion(String convertTo, double unit)
    {
        String result;
        double convertedUnit;
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = unit;
            result = unit+" °C = "+convertedUnit+" °C";
            break;
            case "Fahrenheit (°F)": convertedUnit = unit*9/5+32;
            result = unit+" °C = "+convertedUnit+" °F";
            break;
            case "Kelvin (K)": convertedUnit = unit+273.15;
            result = unit+" °C = "+convertedUnit+" k";
            break;
            case "Rankine (°R)": convertedUnit = unit*9/5+491.67;
            result = unit+" °C = "+convertedUnit+" °R";
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }

    public String fahrenheitConversion(String convertTo, double unit)
    {
        String result;
        double convertedUnit;
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = (unit-32)*5/9;
                result = unit+" °F = "+convertedUnit+" °C";
                break;
            case "Fahrenheit (°F)": convertedUnit = unit;
                result = unit+" °F = "+convertedUnit+" °F";
                break;
            case "Kelvin (K)": convertedUnit = (unit+459.67)*5/9;
                result = unit+" °F = "+convertedUnit+" k";
                break;
            case "Rankine (°R)": convertedUnit = unit+459.67;
                result = unit+" °F = "+convertedUnit+" °R";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }

    public String kelvinConversion(String convertTo, double unit)
    {
        String result;
        double convertedUnit;
        switch(convertTo)
        {
            case "Celsius (°C)": convertedUnit = unit-273.15;
                result = unit+" K = "+convertedUnit+" °C";
                break;
            case "Fahrenheit (°F)": convertedUnit = unit*9/5-459.67;
                result = unit+" K = "+convertedUnit+" °F";
                break;
            case "Kelvin (K)": convertedUnit = unit;
                result = unit+" K = "+convertedUnit+" k";
                break;
            case "Rankine (°R)": convertedUnit = unit*9/5;
                result = unit+" K = "+convertedUnit+" °R";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }

    public String rankineConversion(String convertTo, double unit) {
        String result;
        double convertedUnit;
        switch (convertTo) {
            case "Celsius (°C)":
                convertedUnit = unit * 5 / 9 - 273.15;
                result = unit + " °R = " + convertedUnit + " °C";
                break;
            case "Fahrenheit (°F)":
                convertedUnit = unit - 459.67;
                result = unit + " °R = " + convertedUnit + " °F";
                break;
            case "Kelvin (K)":
                convertedUnit = unit * 5 / 9;
                result = unit + " °R = " + convertedUnit + " k";
                break;
            case "Rankine (°R)":
                convertedUnit = unit;
                result = unit + " °R = " + convertedUnit + " °R";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
        return result;
    }
}
