package main.java.convertTemperatureUnits;

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

public class LayoutPane
{
    private StackPane paneForHeader = new StackPane();
    private GridPane paneForInnerContent = new GridPane();
    private HBox paneForButtons = new HBox();
    private BorderPane paneForBottom = new BorderPane();
    private BorderPane paneForLayout = new BorderPane();
    private String[] units = {"Celsius (°C)","Fahrenheit (°F)", "Kelvin (K)","Rankine (°R)"};
    private Converter converter = Converter.getInstance();

    public BorderPane getPaneForLayout()
    {
        Text heading = new Text("Temperature Conversion Calculator");
        heading.setFill(Color.WHITE);
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,18));

        Rectangle backgroundForHeading = new Rectangle();
        backgroundForHeading.setX(10);
        backgroundForHeading.setY(10);
        backgroundForHeading.setWidth(380);
        backgroundForHeading.setHeight(50);
        backgroundForHeading.setFill(Color.RED);
        backgroundForHeading.setArcWidth(10);
        backgroundForHeading.setArcHeight(10);

        paneForHeader.getChildren().addAll(backgroundForHeading,heading);
        paneForHeader.setPadding(new Insets(10,0,0,0));

        Label value = new Label("Enter a value");
        value.setFont(Font.font("Helvetica",15));
        Label convertFrom = new Label("Convert From");
        convertFrom.setFont(Font.font("Helvetica",15));
        Label convertTo = new Label("Convert To");
        convertTo.setFont(Font.font("Helvetica",15));

        TextField textFieldForValue = new TextField();

        ComboBox<String> cboForConvertFrom = new ComboBox<String>();
        ObservableList<String> itemsForConvertTo = FXCollections.observableArrayList(units);
        cboForConvertFrom.setItems(itemsForConvertTo);
        cboForConvertFrom.setValue("Celsius (°C)");

        ComboBox<String> cboForConvertTo = new ComboBox<String>();
        ObservableList<String> itemsForConvertFrom = FXCollections.observableArrayList(units);
        cboForConvertTo.setItems(itemsForConvertFrom);
        cboForConvertTo.setValue("Celsius (°C)");

        paneForInnerContent.add(value,0,0);
        paneForInnerContent.add(textFieldForValue,1,0);
        paneForInnerContent.add(convertFrom,0,1);
        paneForInnerContent.add(cboForConvertFrom,1,1);
        paneForInnerContent.add(convertTo,0,2);
        paneForInnerContent.add(cboForConvertTo,1,2);

        paneForInnerContent.setVgap(10);
        paneForInnerContent.setHgap(10);
        paneForInnerContent.setAlignment(Pos.CENTER);

        Button btnForConvert = new Button();
        btnForConvert.setText("Convert");

        Button btnForClear = new Button();
        btnForClear.setText("Clear");

        paneForButtons.getChildren().addAll(btnForConvert,btnForClear);
        paneForButtons.setSpacing(20);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setPadding(new Insets(0,0,10,0));

        TextArea result = new TextArea();
        result.setPrefWidth(380);
        result.setPrefHeight(80);
        result.setEditable(false);
        result.setText("Result:");
        result.setPadding(new Insets(5,5,5,5));

        paneForBottom.setCenter(paneForButtons);
        paneForBottom.setBottom(result);

        paneForLayout.setTop(paneForHeader);
        paneForLayout.setCenter(paneForInnerContent);
        paneForLayout.setBottom(paneForBottom);

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

        btnForClear.setOnAction(e -> result.setText("Result: "));

        return paneForLayout;
    }

}
