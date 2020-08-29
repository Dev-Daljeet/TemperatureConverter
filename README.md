# TemperatureConverter
> A converter for temperature degrees conversions of Fahrenheit (°F), Celsius (°C), Kelvin (K) and Rankine (°R).

This project converts one temperature units like celsius to another temperature units like fahrenheit. It can convert to/from four temperature units: Fahrenheit (°F), Celsius (°C), Kelvin (K) and Rankine (°R).

Programming language: Java

GUI: JavaFx

Location of Java classes: src\main\java\convertTemperatureUnits

Location of Test classes: src\test\java\main\java\convertTemperatureUnits

Location of JUnit 5 libraries: lib

## A sample screenshot of Project
![Screesshot of GUI](https://github.com/Dev-Daljeet/TemperatureConverter/blob/master/Screenshots/Screenshot(GUI).jpg?raw=true)

## Run:
### Prerequisites: 

**(Note: As of JDK 7 update 6, JavaFX is included with the standard JDK and JRE bundles. Hence you don’t have to download it separately if you have a JDK version higher than JDK 7 update 6.)**

* Oracle JDK installed (recommended Java SE version 14.0.2 or latest release) 
* (optional) any Java IDE (recommened IntelliJ IDEA Version: 2020.2.1 or latest release)

Refer to this [link](https://www.tutorialspoint.com/javafx/javafx_environment.htm) for installation of Oracle JDK and setting up the path for windows.

### Using IDE:

Step 1: Download the zip of the project or clone the project with HTTPS.

Step 2: Open the project in IDE. For zip file, unzip the project or import the project into IDE.

Step 3: Go to src\main\java\convertTemperatureUnits and compile and run the class UserInterface.

Step 4: Enter any value (double value) in input field. Then, choose units for convert from and convert to. Lastly, click on convert button. Result will be displayed in text area at bottom of GUI.


### Using command line:

Step 1: Download the zip of the project or clone the project with HTTPS.

Step 2: For zip file, unzip the project. Navigate to src\main\java\convertTemperatureUnits directory. 

Step 3: Execute the following command to compile the UserInterface.java file.
        
        javac -d . UserInterface.java
        
Step 4: To run the program, execute the following command.

        java  UserInterface
        
Step 5: Enter any value (double value) in input field. Then, choose units for convert from and convert to. Lastly, click on convert button. Result will be displayed in text area at bottom of GUI.

## Usage example:
### example 1:
Convert 22.4 Celsius (°C) to fahrenheit (°F).

![Screesnhot of conversion 1](https://github.com/Dev-Daljeet/TemperatureConverter/blob/master/Screenshots/convert1.jpg?raw=true)

### example 2:
Convert -3.4 Rankine (°R) to Kelvin (K).

![Screesnhot of conversion 2](https://github.com/Dev-Daljeet/TemperatureConverter/blob/master/Screenshots/convert2.jpg?raw=true)

### example 3: 
Clear the input field and result.

![Screesnhot of clear](https://github.com/Dev-Daljeet/TemperatureConverter/blob/master/Screenshots/clear.jpg?raw=true)

# License
MIT License
Copyright (c) 2020 Dev-Daljeet

Refer to **LICENSE** file for full information.
