package main.java.convertTemperatureUnits;

import convertTemperatureUnits.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** Tests the methods (units) of class Converter.
 * @author Daljeet Singh (Dev-Daljeey)
 * @version 1.0
 */
class ConverterTest {

    /** Test passes if instance of class Converter is created using getInstance() method.
     */
    @Test
    public void onlyInstanceShouldBeCreated() {
        System.out.println("onlyInstanceShouldBeCreated");
        Converter onlyInstance = Converter.getInstance();
        boolean result = onlyInstance instanceof Converter;
        boolean expResult = true;
        assertEquals(expResult,result);
    }

    /** Test passes if all the values returned from celsiusConversion() after conversion are accurate or true.
     *  The four units which are passed by value to method are: one positive integer, one positive integer with 3 precision
     *  points, one negative integer and one negative integer with 2 precision points. All units are hard coded and passed in
     *  random order.
     */
    @Test
    public void celsiusUnitsShouldBeConverted() {
        System.out.println("celsiusUnitsShouldBeConverted");

        Converter onlyInstance = Converter.getInstance();

        String resultCel = onlyInstance.celsiusConversion("Celsius (°C)", 18.545);
        String expResultCel = "18.545 °C = 18.545 °C";
        assertEquals(expResultCel,resultCel);

        String resultFhr = onlyInstance.celsiusConversion("Fahrenheit (°F)", -33);
        String expResultFhr = "-33 °C = -27.4 °F";
        assertEquals(expResultFhr,resultFhr);

        String resultKel = onlyInstance.celsiusConversion("Kelvin (K)", 90);
        String expResultKel = "90 °C = 363.15 K";
        assertEquals(expResultKel,resultKel);

        String resultRan = onlyInstance.celsiusConversion("Rankine (°R)", -98.45);
        String expResultRan = "-98.45 °C = 314.46 °R";
        assertEquals(expResultRan,resultRan);
    }

    /** Test passes if all the values returned from fahrenheitConversion() after conversion are accurate or true.
     *  The four units which are passed by value to method are: one positive integer, one positive integer with 2 precision
     *  points, one negative integer and one negative integer with 3 precision points. All units are hard coded and passed in
     *  random order.
     */
    @Test
    public void fahrenheitUnitsShouldBeConverted() {
        System.out.println("fahrenheitUnitsShouldBeConverted");

        Converter onlyInstance = Converter.getInstance();

        String resultCel = onlyInstance.fahrenheitConversion("Celsius (°C)", -44.214);
        String expResultCel = "-44.214 °F = -42.341 °C";
        assertEquals(expResultCel,resultCel);

        String resultFhr = onlyInstance.fahrenheitConversion("Fahrenheit (°F)", 40);
        String expResultFhr = "40 °F = 40 °F";
        assertEquals(expResultFhr,resultFhr);

        String resultKel = onlyInstance.fahrenheitConversion("Kelvin (K)", 1.34);
        String expResultKel = "1.34 °F = 256.117 K";
        assertEquals(expResultKel,resultKel);

        String resultRan = onlyInstance.fahrenheitConversion("Rankine (°R)", -95);
        String expResultRan = "-95 °F = 364.67 °R";
        assertEquals(expResultRan,resultRan);
    }

    /** Test passes if all the values returned from kelvinConversion() after conversion are accurate or true.
     *  The four units which are passed by value to method are: one positive integer, one positive integer with 2 precision
     *  points, one negative integer and one negative integer with 3 precision points. All units are hard coded and passed in
     *  random order.
     */
    @Test
    public void kelvinUnitsShouldBeConverted() {
        System.out.println("kelvinUnitsShouldBeConverted");

        Converter onlyInstance = Converter.getInstance();

        String resultCel = onlyInstance.kelvinConversion("Celsius (°C)", 66);
        String expResultCel = "66 K = -207.15 °C";
        assertEquals(expResultCel,resultCel);

        String resultFhr = onlyInstance.kelvinConversion("Fahrenheit (°F)", -3.412);
        String expResultFhr = "-3.412 K = -465.812 °F";
        assertEquals(expResultFhr,resultFhr);

        String resultKel = onlyInstance.kelvinConversion("Kelvin (K)", -55);
        String expResultKel = "-55 K = -55 K";
        assertEquals(expResultKel,resultKel);

        String resultRan = onlyInstance.kelvinConversion("Rankine (°R)", 4.12);
        String expResultRan = "4.12 K = 7.416 °R";
        assertEquals(expResultRan,resultRan);
    }

    /** Test passes if all the values returned from rankineConversion() after conversion are accurate or true.
     *  The four units which are passed by value to method are: one positive integer, one positive integer with 3 precision
     *  points, one negative integer and one negative integer with 2 precision points. All units are hard coded and passed in
     *  random order.
     */
    @Test
    public void rankineUnitsShouldBeConverted() {
        System.out.println("rankineUnitsShouldBeConverted");

        Converter onlyInstance = Converter.getInstance();

        String resultCel = onlyInstance.rankineConversion("Celsius (°C)", -73.22);
        String expResultCel = "-73.22 °R = -313.828 °C";
        assertEquals(expResultCel,resultCel);

        String resultFhr = onlyInstance.rankineConversion("Fahrenheit (°F)", 20);
        String expResultFhr = "20 °R = -439.67 °F";
        assertEquals(expResultFhr,resultFhr);

        String resultKel = onlyInstance.rankineConversion("Kelvin (K)", 34.567);
        String expResultKel = "34.567 °R = 19.204 K";
        assertEquals(expResultKel,resultKel);

        String resultRan = onlyInstance.rankineConversion("Rankine (°R)", -43);
        String expResultRan = "-43 °R = -43 °R";
        assertEquals(expResultRan,resultRan);
    }
}