/*
 * CASE STUDY 1
 * Group 2
 *	Nurcassandra Nissa Binti Shanizal (202721)
	Nurin Khairunnisa Binti Abdul Halim (204195)
	Nurul Fathaanah Qaidah Binti Zulfahmi	202335
	Norain Nadhirah Binti Zulhisham (203834)*/

package images;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GUI extends Application {
	 
	  @Override
	  public void start(Stage primaryStage) throws Exception {
	      BorderPane root = new BorderPane();
	      
	      Font fontBold = Font.font("Times New Roman",
	      FontWeight.BOLD, FontPosture.REGULAR, 16);
	      
	      Font hd2 = Font.font("Times New Roman",
	    	      FontWeight.BOLD, FontPosture.REGULAR, 14);
	 
	      root.setPadding(new Insets(15, 20, 10, 10));
	 
	      // TOP CUSTOMER INFO
	      GridPane pane = new GridPane();
	      pane.setStyle("-fx-background-color: ANTIQUEWHITE");
	      pane.setAlignment(Pos.CENTER);
	      //pane.setPadding(new Insets(11.5, 12.5, 20, 14.5));
	      pane.setHgap(5.5);
	      pane.setVgap(5.5);
	      
	      TextField name = new TextField();
	      name.setPrefWidth(200);
	      name.setMaxWidth(300);
	      
	      TextField add1 = new TextField();
	      add1.setPrefWidth(300);
	      add1.setMaxWidth(300);
	      
	      TextField add2 = new TextField();
	      add2.setPrefWidth(300);
	      add2.setMaxWidth(300);
	      
	      TextField add3 = new TextField();
	      add3.setPrefWidth(300);
	      add3.setMaxWidth(300);
	      
	      VBox vboxTop = new VBox();
	      vboxTop.setSpacing(10);
	      vboxTop.setPadding(new Insets(10,10, 10,10));
	      
	      Label ci = new Label("Customer Information");
	      ci.setFont(fontBold);
	      
	      vboxTop.getChildren().add(ci);
	      
	      pane.add(new Label("Customer Name:"), 0, 1);
	      pane.add(name, 1, 1);
	      pane.add(new Label("Phone Number:"), 0, 2);
	      pane.add(new TextField(), 1, 2);
	      pane.add(new Label("Customer Address:"), 0, 3);
	      pane.add(add1, 1, 3);
	      pane.add(add2, 1, 4);
	      pane.add(add3, 1, 5);
	      Button btAdd = new Button("Add Name");
	      pane.add(btAdd, 1, 6);
	      
	      
	      pane.setPadding(new Insets(10, 10, 10, 10));
	      vboxTop.getChildren().add(pane);
	      root.setTop(vboxTop);
	      // Set margin for top area.
	      BorderPane.setMargin(vboxTop, new Insets(0, 0, 0, 10));
	      
	 
	      // LEFT - ORDER
	      VBox vbox = new VBox();
	      vbox.setSpacing(10);
	      vbox.setPadding(new Insets(10,10, 10,10));
	      
	      Label menu = new Label("PERSONA'S NASI LEMAK HOUSE MENU");
	      menu.setFont(fontBold);
	      
	      Label mmenu = new Label("Main Menu");
	      mmenu.setFont(hd2);
	      
	      vbox.getChildren().add(menu);
	      
	     FileInputStream inputstream = new FileInputStream("C:\\Users\\\\Ain\\eclipse-workspace\\Persona's Nasi Lemak G2\\src\\images\\nasilemak.jpg"); 
		 Image image = new Image(inputstream);
		 ImageView nasilemak = new ImageView(image); 
		 nasilemak.setFitHeight(100); 
		 nasilemak.setFitWidth(100); 
		 nasilemak.setPreserveRatio(true); 
	     
		 Image image1 = new Image(new FileInputStream("C:\\Users\\Ain\\eclipse-workspace\\Persona's Nasi Lemak G2\\src\\images\\meehun.jpg"));
		 ImageView meehun = new ImageView(image1); 
		 meehun.setFitHeight(100); 
		 meehun.setFitWidth(100); 
		 meehun.setPreserveRatio(true); 
	      
	      Spinner<Integer> spinner =new Spinner<Integer>(0, 20, 0);
	      Spinner<Integer> spinner2 =new Spinner<Integer>(0, 20, 0);
	      
	      GridPane pane1 = new GridPane();
	      pane1.setStyle("-fx-background-color: ANTIQUEWHITE");
	      pane1.setAlignment(Pos.CENTER);
	      pane1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	      pane1.setHgap(5.5);
	      pane1.setVgap(5.5);
    
	      
	      
	      pane1.add(mmenu, 0, 1);
	      pane1.add(nasilemak,0,2);
	      pane1.add(new CheckBox("Nasi Lemak RM1.50"), 1,2);
	      pane1.add(new Label("Qty"), 2, 2);
	      pane1.add(spinner,3,2);
	      pane1.add(meehun,0,3);
	      pane1.add(new CheckBox("Mee Hoon RM1.00"),1,3);
	      pane1.add(new Label("Qty"), 2, 3);
	      pane1.add(spinner2,3,3);
	      
	      pane1.add(new Button("Add Order"),3,4);
	      
	      
	    
	  	
	      
	      //DRINKS
	      
	      Spinner<Integer> sp =new Spinner<Integer>(0, 20, 0);
		  Spinner<Integer> sp1 =new Spinner<Integer>(0, 20, 0);
		  Spinner<Integer> sp2 =new Spinner<Integer>(0, 20, 0);
	      
	      
	      GridPane pane3 = new GridPane();
	      pane3.setStyle("-fx-background-color: ANTIQUEWHITE");
	      pane3.setAlignment(Pos.CENTER_LEFT);
	      pane3.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	      pane3.setHgap(5.5);
	      pane3.setVgap(5.5);
	      
	      Label d = new Label("Drinks");
	      d.setFont(hd2);
	      pane3.add(d, 0, 1);
	      pane3.add(new CheckBox("Tea RM1.00"), 1,2);
	      pane3.add(new Label("Qty"), 2, 2);
	      pane3.add(sp,3,2);
	      
	      pane3.add(new CheckBox("Coffee RM1.40"), 1,3);
	      pane3.add(new Label("Qty"), 2, 3);
	      pane3.add(sp1,3,3);
	      
	      pane3.add(new CheckBox("Chocolate RM1.50"), 1,4);
	      pane3.add(new Label("Qty"), 2, 4);
	      pane3.add(sp2,3,4);
	      
	      
	      pane3.add(new Label("Add Ice? "), 0, 6);
	      pane3.add(new RadioButton("Hot"),1,6);
	      pane3.add(new RadioButton("Cold"),2,6);	
	      
	      pane3.add(new Button("Add Order"),3,7);
	      
	      
	      vbox.getChildren().add(pane1);
	      
	      vbox.getChildren().add(pane3);
	      

	   
	      vbox.setPadding(new Insets(10, 10, 10, 10));
	      
	      
	     
	      root.setLeft(vbox);
	      // Set margin for top area.
	      BorderPane.setMargin(vbox, new Insets(10, 10, 10, 10));
	      
	 //////////////////////////////////////////////////////////////////////////////////     
	      // CENTER
	      
	      //SIDE DISH
	      VBox vb =  new VBox();
	      vb.setSpacing(10);
	      vb.setPadding(new Insets(10,10, 10,10));
	      
	      Label text = new Label("");
	      text.setFont(fontBold);
	      vb.getChildren().add(text);
	      
	      GridPane pane2 = new GridPane();
	      pane2.setStyle("-fx-background-color: ANTIQUEWHITE");
	      pane2.setAlignment(Pos.CENTER);
	      pane2.setPadding(new Insets(5, 5, 5, 5));
	      pane2.setHgap(5.5);
	      pane2.setVgap(5.5);

	      Image image2 = new Image(new FileInputStream("C:\\Users\\Ain\\eclipse-workspace\\Persona's Nasi Lemak G2\\src\\images\\telurmata.jpg"));
	      ImageView telur = new ImageView(image2); 
	      telur.setFitHeight(100); 
	      telur.setFitWidth(100); 
	      telur.setPreserveRatio(true); 
	      Image image3 = new Image(new FileInputStream("C:\\Users\\Ain\\eclipse-workspace\\Persona's Nasi Lemak G2\\src\\images\\ayam.jpg"));
	      ImageView ayam = new ImageView(image3); 
	      ayam.setFitHeight(100); 
	      ayam.setFitWidth(100); 
	      ayam.setPreserveRatio(true);
	      
	      Image image4 = new Image(new FileInputStream("C:\\Users\\Ain\\eclipse-workspace\\Persona's Nasi Lemak G2\\src\\images\\nuget.jpg"));
	      ImageView nuget = new ImageView(image4); 
	      nuget.setFitHeight(100); 
	      nuget.setFitWidth(100); 
	      nuget.setPreserveRatio(true);
		      
		  Spinner<Integer> spinner3 =new Spinner<Integer>(0, 20, 0);
		  Spinner<Integer> spinner4 =new Spinner<Integer>(0, 20, 0);
		  Spinner<Integer> spinner5 =new Spinner<Integer>(0, 20, 0);
	      
		  Label sidedish =new Label("Side Dish/Toppings");
		  sidedish.setFont(hd2);
		  
	      pane2.add(sidedish, 0, 1);
	      pane2.add(telur,0,2);
	      pane2.add(new CheckBox("Telur Mata RM1.00"), 1,2);
	      pane2.add(new Label("Qty"), 2, 2);
	      pane2.add(spinner3,3,2);
	      
	      pane2.add(ayam,0,3);
	      pane2.add(new CheckBox("Fried Chicken RM2.50"), 1,3);
	      pane2.add(new Label("Qty"), 2, 3);
	      pane2.add(spinner4,3,3);
	      
	      pane2.add(nuget,0,4);
	      pane2.add(new CheckBox("Fried Nuggets RM1.00"), 1,4);
	      pane2.add(new Label("Qty"), 2, 4);
	      pane2.add(spinner5,3,4);
	      
	      pane2.add(new Button("Add Order"),3,6);
	      
	      vb.getChildren().add(pane2);

	      root.setCenter(vb);
	       
	 
	      
	       
	       
	       // CONFIRM ORDER
	       VBox v1= new VBox();
	       GridPane p = new GridPane();
	       p.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		   p.setHgap(5.5);
		   p.setVgap(5.5);
	       
	       Label calc = new Label("Order Calculation");
		   calc.setFont(fontBold);
		   v1.getChildren().add(calc);
	       
	       v1.setSpacing(10);
		   v1.setPadding(new Insets(10,10, 10,10));
	       
	       TableView orderconfirm = new TableView();
	       
	       orderconfirm.setEditable(true);
	       
	        TableColumn bil = new TableColumn("No.");
	        TableColumn order = new TableColumn("Order");
	        TableColumn qty = new TableColumn("Quantity");
	        TableColumn price = new TableColumn("Price(RM)");
	        
	        orderconfirm.getColumns().addAll(bil, order, qty, price);
	        
	        TextField total = new TextField("0.00");
	        
	        p.add(new Label("Total Price: "),1,2);
	        p.add(total,4,2);
	        p.add(new Button("Calculate"),4,3);
	        p.add(new Button ("Print Receipt"),4,4);
	        BorderPane.setAlignment(p, Pos.CENTER_RIGHT);
	        
	        v1.getChildren().add(orderconfirm);
	        v1.getChildren().add(p);
	        v1.setStyle("-fx-border-color: TEAL");
	      
	        root.setRight(v1);
	      // Set margin for right area.
	      BorderPane.setMargin(v1, new Insets(10, 10, 10, 10));
	      
	      
	      // ScrollPane
	        ScrollPane scrollPane = new ScrollPane();
	        scrollPane.setContent(root);
	        
	        // Pannable.
	        scrollPane.setPannable(true);
	      
	        root.setStyle("-fx-background-color: DARKSEAGREEN");
	        Scene scene = new Scene(scrollPane);
	  
	 
	      primaryStage.setTitle("Delivery Service Persona's Nasi Lemak House");
	      primaryStage.setScene(scene);
	      primaryStage.setMaximized(true);
	      primaryStage.show();
	  }
	 
	  public static void main(String[] args) {
		    launch(args);
		  }
	}