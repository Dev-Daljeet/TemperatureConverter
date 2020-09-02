package com.mycompany.converttemperatureunits;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/** Represents the layout pane of GUI.
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class LayoutPane
{
    private StackPane paneForHeader = new StackPane();
    private GridPane paneForInnerContent = new GridPane();
    private BorderPane paneForBottom = new BorderPane();
    private BorderPane paneForLayout = new BorderPane();
    private Converter converter = Converter.getInstance();
    private String[] units = {"Celsius (°C)","Fahrenheit (°F)", "Kelvin (K)","Rankine (°R)"};

    /** Gets(Returns) the layout pane of GUI.
     * @return paneForLayout A borderpane which contains header, inner content and footer(bottom) of GUI.
     */
    public BorderPane getPaneForLayout()
    {
        // Make a Text object to display the title or heading at top of GUI.
        Text heading = new Text("Temperature Conversion Calculator");
        heading.setFill(Color.WHITE);
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,18));

        // Make a Rectangle object which acts as background for heading text at top position.
        Rectangle backgroundForHeading = new Rectangle();
        backgroundForHeading.setX(10);
        backgroundForHeading.setY(10);
        backgroundForHeading.setWidth(380);
        backgroundForHeading.setHeight(50);
        backgroundForHeading.setFill(Color.RED);
        backgroundForHeading.setArcWidth(10);
        backgroundForHeading.setArcHeight(10);

        // Add the Text object (heading) and Rectangle object (backgroundForHeading) in StackPane object (paneForHeader).
        paneForHeader.getChildren().addAll(backgroundForHeading,heading);
        paneForHeader.setPadding(new Insets(10,0,0,0));

        // Make three Label objects that display info about TextField and ComboBox.
        Label value = new Label("Enter a value");
        value.setFont(Font.font("Helvetica",15));
        Label convertFrom = new Label("Convert From");
        convertFrom.setFont(Font.font("Helvetica",15));
        Label convertTo = new Label("Convert To");
        convertTo.setFont(Font.font("Helvetica",15));

        // Make a TextField object to get input from users.
        TextField textFieldForValue = new TextField();

        // Make a ComboBox object to select an unit to convert from.
        ComboBox<String> cboForConvertFrom = new ComboBox<String>();
        ObservableList<String> itemsForConvertFrom = FXCollections.observableArrayList(units);
        cboForConvertFrom.setItems(itemsForConvertFrom);
        cboForConvertFrom.setValue("Celsius (°C)");

        // Make a ComboBox object to select an unit to convert to.
        ComboBox<String> cboForConvertTo = new ComboBox<String>();
        ObservableList<String> itemsForConvertTo = FXCollections.observableArrayList(units);
        cboForConvertTo.setItems(itemsForConvertTo);
        cboForConvertTo.setValue("Celsius (°C)");

        // Add the Label objects and ComboBox objects into GridPane object (paneForInnerContent).
        paneForInnerContent.add(value,0,0);
        paneForInnerContent.add(textFieldForValue,1,0);
        paneForInnerContent.add(convertFrom,0,1);
        paneForInnerContent.add(cboForConvertFrom,1,1);
        paneForInnerContent.add(convertTo,0,2);
        paneForInnerContent.add(cboForConvertTo,1,2);

        // Set the alignment, vertical and horizontal gap of GridPane object (PaneForInnerContent).
        paneForInnerContent.setAlignment(Pos.CENTER);
        paneForInnerContent.setVgap(10);
        paneForInnerContent.setHgap(10);

        // Make a Button object to convert the entered units.
        Button btnForConvert = new Button();
        btnForConvert.setText("Convert");

        // Make a Button object to clear the TextField and result section.
        Button btnForClear = new Button();
        btnForClear.setText("Clear");

        // Make a HBox object (paneForButtons) and add the Button objects in it.
        HBox paneForButtons = new HBox();
        paneForButtons.getChildren().addAll(btnForConvert,btnForClear);
        paneForButtons.setSpacing(20);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setPadding(new Insets(0,0,10,0));

        // Make a TextArea object which displays result.
        TextArea result = new TextArea();
        result.setPrefWidth(380);
        result.setPrefHeight(80);
        result.setEditable(false);
        result.setText("Result:");
        result.setPadding(new Insets(5,5,5,5));

        // Add the HBox object (paneForButtons) and TextArea object (result) in GridPane object (paneForBottom).
        paneForBottom.setCenter(paneForButtons);
        paneForBottom.setBottom(result);

        /* Add the StackPane object (paneForHeader), GridPane object (paneForInnerContent) and GridPane object (paneForBottom)
           in GridPane object (paneForLayout). */
        paneForLayout.setTop(paneForHeader);
        paneForLayout.setCenter(paneForInnerContent);
        paneForLayout.setBottom(paneForBottom);

        /* Make an action event handler/handling for Button object (btnForConvert). When button is clicked, it converts
           one unit to another unit.*/
        btnForConvert.setOnAction(e -> {
            double unit = Double.parseDouble(textFieldForValue.getText());
            String conFrom = cboForConvertFrom.getValue();
            String conTo = cboForConvertTo.getValue();
            switch (conFrom)
            {
                case "Celsius (°C)": result.setText("Result : "+converter.celsiusConversion(conTo,unit));
                break;
                case "Fahrenheit (°F)": result.setText("Result : "+converter.fahrenheitConversion(conTo,unit));
                break;
                case "Kelvin (K)": result.setText("Result : "+converter.kelvinConversion(conTo,unit));
                break;
                case "Rankine (°R)": result.setText("Result : "+converter.rankineConversion(conTo,unit));
                break;
                default: throw new IllegalStateException("Unexpected value: " + convertTo);
            }
        });

        /* Make an action event handler/handling for Button object (btnForClear). When button is clicked, it clears the
           TextField (textFieldForValue) and TextArea (result). */
        btnForClear.setOnAction(e -> {
            textFieldForValue.setText("");
            result.setText("Result: ");
        });

        return paneForLayout;
    }

}
