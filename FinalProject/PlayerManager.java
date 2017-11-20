/**Program: Player Manager Class
*File: PlayerManager.java
*Summary: Creates an application where the user, an NFL team CEO, will be able to
* view a list of available players for each position, see individual player 
* stats, and select players for his/her roster. The user will be able to see the
* list of chosen players and remove a player if they want.   
*Author: Jake D. Babcock / This is my own work. 
*Date: November 17, 2017
**/
package NFLDraft;


import javafx.geometry.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;



public class PlayerManager extends Application
{
    
    //Arraylists needed to show all players 
   Stage menu = new Stage();
   public ArrayList <NFLPlayer> availablePlayers = new ArrayList <NFLPlayer>();
   public ArrayList <OffensivePlayer> offensivePlayers = new ArrayList <OffensivePlayer>();
   public ArrayList <DefensivePlayer> defensivePlayers = new ArrayList <DefensivePlayer>();
   public ArrayList <Object> currentRoster = new ArrayList <Object>();
   public TextField searchField = new TextField();
   
   @Override
   public void start(Stage primaryStage)
   {
       createPlayers();
       menu.setTitle("NFL Draft");
       showMenu();
   }       
   
   public void showMenu()
   {
       BorderPane pane = new BorderPane();
       pane.setTop(getLogo());
       VBox center = new VBox(getSearchBar(), getMenu());
       center.setPadding(new Insets(15,15,15,15));;
       pane.setCenter(center);
       menu.setScene(new Scene(pane,700,600));
       menu.show();
   }       
   
   
    // Stackpane that shows logo 
 private StackPane getLogo() {
  StackPane stackPane = new StackPane();
  stackPane.setPrefHeight(300);
  stackPane.setPadding(new Insets(15, 15, 15, 15));
  stackPane.setStyle("-fx-background-color: black");
  ImageView imageView = new ImageView(new Image("res/NFL_Draft.png")); //adds image from res source package 
  imageView.setFitHeight(300);
  imageView.setPreserveRatio(true);
  stackPane.getChildren().add(imageView);
  return stackPane;
 }
 
  // Create players for draft - using career stats
 public void createPlayers() {

  // Create Offensive Players
  OffensivePlayer offensivePlayer1 = new OffensivePlayer("Jay Ajayi", 24, 36, "Philadelphia Eagles", 6.0f, 223f, "off", 308, 0, 0, 2309, 0, 0, 10, "RB");
  OffensivePlayer offensivePlayer2 = new OffensivePlayer("Tom Brady", 39, 12, "New England Patriots", 6.4f, 225f, "off", 64728, 0, 0, 2627, 0, 0, 495, "QB");
  OffensivePlayer offensivePlayer3 = new OffensivePlayer("Andre Ellington", 28, 38, "Arizona Cardinals", 5.9f, 199f, "off", 1296, 0, 0, 1750, 0, 0, 13, "RB");
  OffensivePlayer offensivePlayer4 = new OffensivePlayer("Michael Crabtree", 30, 15, "Oakland Raiders", 6.1f, 2115f, "off", 6754, 0, 0, 0, 0, 0, 49, "WR");
  OffensivePlayer offensivePlayer5 = new OffensivePlayer("Julio Jones", 28, 11, "Atlanta Falcons", 6.3f, 220f, "off", 8325, 0, 0, 94, 0, 0, 41, "WR");
  OffensivePlayer offensivePlayer6 = new OffensivePlayer("Aaron Rodgers", 33, 12, "Green Bay Packers", 6.2f, 2225f, "off", 38212, 618, 2627, 0, 0, 0, 335, "QB");
  OffensivePlayer offensivePlayer7 = new OffensivePlayer("Todd Gurly II", 23, 30, "Los Angeles Rams", 6.1f, 227f, "off", 940, 0, 0, 2782, 0, 0, 27, "RB");
  OffensivePlayer offensivePlayer8 = new OffensivePlayer("LeSean McCoy", 29, 25, "Buffalo Bills", 5.11f, 210f, "off", 3195, 32, 9.1, 9663, 4.4, 203, 78, "RB");
  OffensivePlayer offensivePlayer9 = new OffensivePlayer("Russel Wilson", 28, 3, "Seattle Seahawks", 5.11f, 215f, "off", 20736, 407, 7.5, 2979, 1.8, 36, 160, "QB");
  OffensivePlayer offensivePlayer10 = new OffensivePlayer("Larry Fitzgerald", 32, 11, "Arizona Cardinals", 6.3f, 218f, "off", 15157, 109, 11.1, 0, 0, 0, 108, "WR");
  OffensivePlayer offensivePlayer11 = new OffensivePlayer("Alvin Kamara", 22, 41, "New Orleans Saints", 5.10f, 215f, "off", 447, 42, 0, 459, 0, 0, 4, "RB");
          
  // Create Defensive Players
  DefensivePlayer defensivePlayer1 = new DefensivePlayer("Joey Bosa", 22, 99, "Los Angeles Chargers", 6.5f, 280f, "def", 60, 20, 76, 21, 0, "DE");
  DefensivePlayer defensivePlayer2 = new DefensivePlayer("Reuben Foster", 23, 56, "SF 49ers", 6.1f, 228f, "def", 24, 38, 154, 0, 0, "ILB");
  DefensivePlayer defensivePlayer3 = new DefensivePlayer("Richard Sherman", 29, 25, "Seattle Seahawks", 6.3f, 195f, "def", 279, 25, 77, 1, 32, "DB");
  DefensivePlayer defensivePlayer4 = new DefensivePlayer("Jordan Poyer", 26, 21, "Buffalo Bills", 6.0f, 191f, "def", 135, 31, 127, 3, 4, "FS");
  DefensivePlayer defensivePlayer5 = new DefensivePlayer("Luke Kuechly", 26, 59, "Carolina Panthers", 6.3f, 238f, "def", 764, 19, 112, 9, 15, "OLB");
  DefensivePlayer defensivePlayer6 = new DefensivePlayer("Kevin Minter", 26, 51, "Cincinnati Bengals", 6.0f, 246f, "def", 186, 30, 133, 5, 0, "MLB");
  DefensivePlayer defensivePlayer7 = new DefensivePlayer("Geno Atkins", 29, 97, "Cincinnati Bengals", 6.1f, 300f, "def", 274, 11, 42, 58, 0, "DT");
  DefensivePlayer defensivePlayer8 = new DefensivePlayer("Kiko Alonso", 27, 47, "Miami Dolphins", 6.3f, 233f, "def", 236, 8, 1, 3, 7, "LB");
  DefensivePlayer defensivePlayer9 = new DefensivePlayer("Cordrea Tankersley", 24, 30, "Miami Dolphins", 6.1f, 196f, "def", 22, 7, 60, 0, 0, "CB");
  DefensivePlayer defensivePlayer10 = new DefensivePlayer("Jonathan Casillas", 30, 52, "New York Giants", 6.1f, 226f, "def", 260, 30, 105, 6.5, 1, "OLB");
  DefensivePlayer defensivePlayer11 = new DefensivePlayer("Sam Acho", 29, 93, "Chicago Bears", 6.3f, 259f, "def",164, 52, 216, 14.5, 3, "OLB");
  
  // Add Offensive Players to draft
  offensivePlayers.add(offensivePlayer1);
  offensivePlayers.add(offensivePlayer2);
  offensivePlayers.add(offensivePlayer3);
  offensivePlayers.add(offensivePlayer4);
  offensivePlayers.add(offensivePlayer5);
  offensivePlayers.add(offensivePlayer6);
  offensivePlayers.add(offensivePlayer7);
  offensivePlayers.add(offensivePlayer8);
  offensivePlayers.add(offensivePlayer9);
  offensivePlayers.add(offensivePlayer10);
  offensivePlayers.add(offensivePlayer11);

  // Add Defensive Players to draft
  defensivePlayers.add(defensivePlayer1);
  defensivePlayers.add(defensivePlayer2);
  defensivePlayers.add(defensivePlayer3);
  defensivePlayers.add(defensivePlayer4);
  defensivePlayers.add(defensivePlayer5);
  defensivePlayers.add(defensivePlayer6);
  defensivePlayers.add(defensivePlayer7);
  defensivePlayers.add(defensivePlayer8);
  defensivePlayers.add(defensivePlayer9);
  defensivePlayers.add(defensivePlayer10);
 }

 
   //Layout that shows different types positions available for offense
   private void showOffense()
   {
       BorderPane pane = new BorderPane();
       pane.setTop(getLogo());
       
       VBox vBox = new VBox(15);
       vBox.setPadding(new Insets(15,5,5,5));
       
       // shows back button in form of arrow 
       Button back = new Button();
       back.setText("\u21E6");
       back.setId("Back to Menu");
       back.setFont(Font.font("Times Roman", 20));
       back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       //when clicked, shows all available offense players
       Button AvailableOff = new Button("All Available");
       AvailableOff.setId("allOff");
       AvailableOff.setMaxWidth(Double.MAX_VALUE);
       AvailableOff.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       //when clicked, shows all available qb's
       Button QB = new Button("QB");
       QB.setId("QB");
       QB.setMaxWidth(Double.MAX_VALUE);
       QB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       //when clicked, shows all available running backs
       Button RB = new Button("RB");
       RB.setId("RB");
       RB.setMaxWidth(Double.MAX_VALUE);
       RB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       //when clicked, shows all available wide receivers 
       Button WR = new Button("WR");
       WR.setId("WR");
       WR.setMaxWidth(Double.MAX_VALUE);
       WR.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       //displayers all buttons horizontally 
       HBox offenseType = new HBox();
       offenseType.setSpacing(125);
       offenseType.setPadding(new Insets(0,30,0,30));
       offenseType.getChildren().addAll(AvailableOff, QB, RB, WR);
       
       //displays back, search bar, "select position, vertically 
       vBox.getChildren().addAll(back, getSearchBar(), new Label("Select Position"), offenseType);
       pane.setCenter(vBox);
       menu.setScene(new Scene(pane,700,600));
       menu.show();    
   }     
   //Lists offensive players and labels. 
   //VBox used as player info will read left to right 
   private void listOffensivePlayers(String selection)
   {
       BorderPane pane = new BorderPane();
       
       pane.setTop(getLogo());
       
       VBox vBox = new VBox(15);
       vBox.setPadding(new Insets(15,5,5,5));
       
       Button back = new Button();
       back.setText("\u21E6");
       back.setId("Back to Offense");
       back.setFont(Font.font("Times Roman", 20));
       back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       GridPane list = new GridPane();
       list.setAlignment(Pos.CENTER);
       list.setPadding(new Insets(11.5,12.5,13.5,14.5));
       list.setHgap(5.5);
       list.setVgap(5.5);
       int i = 1;
       
       list.add(new Label("Name"), 0, 0);
       list.add(new Label("Age"), 1, 0);
       list.add(new Label("Number"), 2, 0);
       list.add(new Label("Team"), 3, 0);
       list.add(new Label("Height"), 4, 0);
       list.add(new Label("Weight"), 5, 0);
       list.add(new Label("Passing/Rec"), 6, 0);
       list.add(new Label("Rushing"), 7, 0);
       list.add(new Label("TD"), 8, 0);
       list.add(new Label("Draft"), 9, 0);
       
       if (selection == "allOff")
       {
           for (OffensivePlayer object: offensivePlayers)
           {
               if (object.getStatus() == "available")
               {
                   Label name = new Label(object.getName());
                   Label age = new Label(Integer.toString(object.getAge()));
                   Label number = new Label(Integer.toString(object.getNumber()));
                   Label team = new Label(object.getTeam());
                   Label height = new Label(Float.toString(object.getHeight()));
                   Label weight = new Label(Float.toString(object.getWeight()));
                   Label passRec = new Label(Double.toString(object.getPassing()));
                   Label rushing = new Label(Double.toString(object.getRushing()));
                   Label td = new Label(Double.toString(object.getTd()));
                   Button draft = new Button();
                   draft.setText("Draft");
                   draft.setId("draftOff" + object.getName());
                   draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                   list.add(name,0,i);
                   list.add(age,1,i);
                   list.add(number, 2,i);
                   list.add(team,3,i);
                   list.add(height, 4, i);
                   list.add(weight,5,i);
                   list.add(passRec,6,i);
                   list.add(rushing, 7, i);
                   list.add(td,8,i);
                   list.add(draft,9,i);
                   i++;
               }
           }
       } else 
       {
           for (OffensivePlayer object: offensivePlayers)
           {
               if (object.getStatus()=="available" && object.getPosition() == selection)
               {
                   Label name = new Label(object.getName());
                   Label age = new Label(Integer.toString(object.getAge()));
                   Label number = new Label(Integer.toString(object.getNumber()));
                   Label team = new Label(object.getTeam());
                   Label height = new Label(Float.toString(object.getHeight()));
                   Label weight = new Label(Float.toString(object.getWeight()));
                   Label passRec = new Label(Double.toString(object.getPassing()));
                   Label rushing = new Label(Double.toString(object.getRushing()));
                   Label td = new Label(Double.toString(object.getTd()));
                   Button draft = new Button();
                   draft.setText("Draft");
                   draft.setId("draftOff" + object.getName());
                   draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                   list.add(name,0,i);
                   list.add(age,1,i);
                   list.add(number, 2,i);
                   list.add(team,3,i);
                   list.add(height, 4, i);
                   list.add(weight,5,i);
                   list.add(passRec,6,i);
                   list.add(rushing, 7, i);
                   list.add(td,8,i);
                   list.add(draft,9,i);
                   i++;
               }
           }
       }
       ColumnConstraints columnConstraints = new ColumnConstraints();
       columnConstraints.setFillWidth(true);
       columnConstraints.setHgrow(Priority.ALWAYS);
       list.getColumnConstraints().add(columnConstraints);
       
       vBox.getChildren().addAll(back, getSearchBar(), list);
       pane.setCenter(vBox);
       
       ScrollPane scroller = new ScrollPane(pane);
       scroller.setFitToWidth(true);
       menu.setScene(new Scene(scroller,700,550));
       menu.show();
       
   }       
   //similar to above but with defensive players 
   //abbreviated the positions 
   public void showDefense()
   {
       BorderPane pane = new BorderPane();
       pane.setTop(getLogo());
       
       VBox vBox = new VBox(15);
       vBox.setPadding(new Insets(15,5,5,5));
       
       Button back = new Button();
       back.setText("\u21E6");
       back.setId("Back to Menu");
       back.setFont(Font.font("Times Roman", 20));
       back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       Button AvailableOff = new Button("All Available");
       AvailableOff.setId("allOff");
       AvailableOff.setMaxWidth(Double.MAX_VALUE);
       AvailableOff.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       Button DE = new Button("DE");
       DE.setId("DE");
       DE.setMaxWidth(Double.MAX_VALUE);
       DE.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       Button ILB = new Button("ILB");
       ILB.setId("ILB");
       ILB.setMaxWidth(Double.MAX_VALUE);
       ILB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       Button DB = new Button("DB");
       DB.setId("DB");
       DB.setMaxWidth(Double.MAX_VALUE);
       DB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       Button FS = new Button("FS"); // create My Roster button
       FS.setId("FS"); // set button id
       FS.setMaxWidth(Double.MAX_VALUE); // set button width
       FS.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

       Button OLB = new Button("OLB"); // create My Roster button
       OLB.setId("OLB"); // set button id
       OLB.setMaxWidth(Double.MAX_VALUE); // set button width
       OLB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

       Button MLB = new Button("MLB"); // create My Roster button
       MLB.setId("MLB"); // set button id
       MLB.setMaxWidth(Double.MAX_VALUE); // set button width
       MLB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

       Button DT = new Button("DT"); // create My Roster button
       DT.setId("DT"); // set button id
       DT.setMaxWidth(Double.MAX_VALUE); // set button width
       DT.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       FlowPane defenseType = new FlowPane();
       defenseType.setHgap(40);
       defenseType.setPadding(new Insets(0,10,0,10));
       defenseType.getChildren().addAll(AvailableOff, DE,ILB,DB,FS,OLB,MLB,DT);
       
       vBox.getChildren().addAll(back, getSearchBar(), new Label("Select Position"), defenseType);
       pane.setCenter(vBox);
       menu.setScene(new Scene(pane,700,550));
       menu.show();
       }
   
    // Searchbar
 private HBox getSearchBar() {
  Label searchlabel = new Label("Lookup Player"); 
  searchField.setId("searchFor");
  searchField.setMinWidth(50);
  searchField.setPrefWidth(460);
  searchField.setMaxWidth(460);
  Button searchBtn = new Button("Search"); 
  searchBtn.setId("search"); 
  searchBtn.setMaxWidth(Double.MAX_VALUE); 
  searchBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
  HBox searchBar = new HBox(); // create HBox
  searchBar.getChildren().addAll(searchlabel, searchField, searchBtn);
  searchBar.setSpacing(10);
  return searchBar;
 }

   
   private void listDefensivePlayers(String selection)
   {
       BorderPane pane = new BorderPane();
       pane.setTop(getLogo());
       
       VBox vBox = new VBox(15);
       vBox.setPadding(new Insets(15,5,5,5));
       
       Button back = new Button();
       back.setText("\u21E6");
       back.setId("Back to Defense");
       back.setFont(Font.font("Times Roman", 20));
       back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       GridPane list = new GridPane();
       list.setAlignment(Pos.CENTER);
       list.setPadding(new Insets(11.5,12.5,13.5,14.5));
       list.setHgap(5.5);
       list.setVgap(5.5);
       int i = 1;
       
       list.add(new Label("Name"), 0, 0);
       list.add(new Label("Age"), 1, 0);
       list.add(new Label("Number"), 2, 0);
       list.add(new Label("Team"), 3, 0);
       list.add(new Label("Height"), 4, 0);
       list.add(new Label("Weight"), 5, 0);
       list.add(new Label("Tackles"), 6, 0);
       list.add(new Label("Sacks"), 7, 0);
       list.add(new Label("Int"), 8, 0);
       list.add(new Label("Draft"), 9, 0);
       
  if (selection == "alldef") 
  {
   for (DefensivePlayer object: defensivePlayers)
   { // List all defensive players
    if (object.getStatus() == "available") 
    {
     Label name = new Label(object.getName());
     Label age = new Label(Integer.toString(object.getAge()));
     Label number = new Label(Integer.toString(object.getNumber()));
     Label team = new Label(object.getTeam());
     Label height = new Label(Float.toString(object.getHeight()));
     Label weight = new Label(Float.toString(object.getWeight()));
     Label Tackles = new Label(Double.toString(object.getTackles()));
     Label Sacks = new Label(Double.toString(object.getSacks()));
     Label Int = new Label(Double.toString(object.getInter()));
     Button draft = new Button();
     draft.setText("Draft"); // unicode for back Arrow
     draft.setId("draftdef " + object.getName());
     draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
     list.add(name, 0, i);
     list.add(age, 1, i);
     list.add(number, 2, i);
     list.add(team, 3, i);
     list.add(height, 4, i);
     list.add(weight, 5, i);
     list.add(Tackles, 6, i);
     list.add(Sacks, 7, i);
     list.add(Int, 8, i);
     list.add(draft, 9, i);
     i++;
    }
   }
  } else 
  {
   for (DefensivePlayer object: defensivePlayers) 
   {
    if (object.getStatus() == "available" && object.getPosition() == selection)
    { 
     Label name = new Label(object.getName());
     Label age = new Label(Integer.toString(object.getAge()));
     Label number = new Label(Integer.toString(object.getNumber()));
     Label team = new Label(object.getTeam());
     Label height = new Label(Float.toString(object.getHeight()));
     Label weight = new Label(Float.toString(object.getWeight()));
     Label Tackles = new Label(Double.toString(object.getTackles()));
     Label Sacks = new Label(Double.toString(object.getSacks()));
     Label Int = new Label(Double.toString(object.getInter()));
     Button draft = new Button();
     draft.setText("Draft"); // unicode for back Arrow
     draft.setId("draftdef " + object.getPosition() + " " + object.getName());
     draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
     list.add(name, 0, i);
     list.add(age, 1, i);
     list.add(number, 2, i);
     list.add(team, 3, i);
     list.add(height, 4, i);
     list.add(weight, 5, i);
     list.add(Tackles, 6, i);
     list.add(Sacks, 7, i);
     list.add(Int, 8, i);
     list.add(draft, 9, i);
     i++;
     }
   }
 }
  
     ColumnConstraints columnConstraints = new ColumnConstraints();
     columnConstraints.setFillWidth(true);
     columnConstraints.setHgrow(Priority.ALWAYS);
     list.getColumnConstraints().add(columnConstraints);

  
     vBox.getChildren().addAll(back, getSearchBar(), list);
     pane.setCenter(vBox);

 
     ScrollPane scroller = new ScrollPane(pane);
     scroller.setFitToWidth(true);

     menu.setScene(new Scene(scroller, 700, 550));
     menu.show();

   } 
   //roster that user can go to after selection of any player, introduces
   //"cut" node that allows user to remove the player from roster. 
   private void showRoster()
   {
       BorderPane pane = new BorderPane();
       pane.setTop(getLogo());
       
       VBox vBox = new VBox(15);
       vBox.setPadding(new Insets(15,5,5,5));
       
       Button back = new Button();
       back.setText("\u21E6");
       back.setId("Back to Menu");
       back.setFont(Font.font("Times Roman" , 20));
       back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
       
       GridPane list = new GridPane();
       list.setAlignment(Pos.CENTER);
       list.setPadding(new Insets(11.5,12.5,13.5,14.5));
       list.setHgap(5.5);
       list.setVgap(5.5);
       int i = 0;
       int offResults = 0;
       int defResults = 0;
      
       for (Object object: currentRoster)
       {
           if(((NFLPlayer) object).getCategory().equals("off"))
           {
               offResults++;
           }
       }
       
       if (offResults > 0 )
       {
          list.add(new Label("Offense"), 0, 0);
          list.add(new Label("Age"), 1, 0);
          list.add(new Label("Number"), 2, 0);
          list.add(new Label("Team"), 3, 0);
          list.add(new Label("Height"), 4, 0);
          list.add(new Label("Weight"), 5, 0);
          list.add(new Label("Passing/Rec"), 6, 0);
          list.add(new Label("Rushing"), 7, 0);
          list.add(new Label("TD"), 8, 0);
          list.add(new Label("Cut"), 9, 0);
          i++;
       }
       // Ouput for selected offensive players 
      for (Object object: currentRoster)
      { 
         if (((NFLPlayer) object).getCategory() == "off")
         {
    Label name = new Label(((NFLPlayer) object).getName());
    Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
    Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
    Label team = new Label(((NFLPlayer) object).getTeam());
    Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
    Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
    Label passRec = new Label(Double.toString(((OffensivePlayer) object).getPassing()));
    Label rushing = new Label(Double.toString(((OffensivePlayer) object).getRushing()));
    Label td = new Label(Double.toString(((OffensivePlayer) object).getTd()));
    Button draft = new Button();
    draft.setText("Cut"); 
    draft.setId("cut_ " + ((NFLPlayer) object).getName());
    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
    list.add(name, 0, i);
    list.add(age, 1, i);
    list.add(number, 2, i);
    list.add(team, 3, i);
    list.add(height, 4, i);
    list.add(weight, 5, i);
    list.add(passRec, 6, i);
    list.add(rushing, 7, i);
    list.add(td, 8, i);
    list.add(draft, 9, i);
    i++;
   }
  }
      for (Object object: currentRoster)
      {
          if(((NFLPlayer) object).getCategory().equals("def"))
          {
              defResults++;
          }
      }
      
      if (defResults > 0) 
      {
        list.add(new Label("Defense"), 0, i);
        list.add(new Label("Age"), 1, i);
        list.add(new Label("Number"), 2, i);
        list.add(new Label("Team"), 3, i);
        list.add(new Label("Height"), 4, i);
        list.add(new Label("Weight"), 5, i);
        list.add(new Label("Tackles"), 6, i);
        list.add(new Label("Sacks"), 7, i);
        list.add(new Label("Int"), 8, i);
        list.add(new Label("Cut"), 9, i);
        i++;
       }
      //output for all defensive players 
      for (Object object: currentRoster) 
      { 
         if (((NFLPlayer) object).getCategory() == "def") 
         {
    Label name = new Label(((NFLPlayer) object).getName());
    Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
    Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
    Label team = new Label(((NFLPlayer) object).getTeam());
    Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
    Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
    Label Tackles = new Label(Double.toString(((DefensivePlayer) object).getTackles()));
    Label Sacks = new Label(Double.toString(((DefensivePlayer) object).getSacks()));
    Label Int = new Label(Double.toString(((DefensivePlayer) object).getInter()));
    Button draft = new Button();
    draft.setText("Cut"); 
    draft.setId("cut_ " + ((NFLPlayer) object).getName());
    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
    list.add(name, 0, i);
    list.add(age, 1, i);
    list.add(number, 2, i);
    list.add(team, 3, i);
    list.add(height, 4, i);
    list.add(weight, 5, i);
    list.add(Tackles, 6, i);
    list.add(Sacks, 7, i);
    list.add(Int, 8, i);
    list.add(draft, 9, i);
    i++;
   }
  }
  ColumnConstraints columnConstraints = new ColumnConstraints();
  columnConstraints.setFillWidth(true);
  columnConstraints.setHgrow(Priority.ALWAYS);
  list.getColumnConstraints().add(columnConstraints);
  
  vBox.getChildren().addAll(back, getSearchBar(), list);
  pane.setCenter(vBox);
  
  ScrollPane scroller = new ScrollPane(pane);
  scroller.setFitToWidth(true);

  menu.setScene(new Scene(scroller, 700, 550));
  menu.show();
  
   }
   
    private void showSearchResults(String searchName) {
  BorderPane pane = new BorderPane();
  pane.setTop(getLogo());

  VBox vBox = new VBox(15);
  vBox.setPadding(new Insets(15, 5, 5, 5));

  Button back = new Button();
  back.setText("\u21E6"); // unicode for back Arrow
  back.setId("Back to Menu");
  back.setFont(Font.font("Verdana", 20));
  back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

  // Create gridPane for list of players
  GridPane list = new GridPane();
  list.setAlignment(Pos.CENTER);
  list.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
  list.setHgap(5.5);
  list.setVgap(5.5);
  int i = 0;
  int offResults = 0;
  int defResults = 0;

  for (Object object: offensivePlayers) { // List all defensive players
   if (((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())) {
    offResults++;
   }
  }

  if (offResults > 0) {
   list.add(new Label("Offense"), 0, 0);
   list.add(new Label("Age"), 1, 0);
   list.add(new Label("Number"), 2, 0);
   list.add(new Label("Team"), 3, 0);
   list.add(new Label("Height"), 4, 0);
   list.add(new Label("Weight"), 5, 0);
   list.add(new Label("Passing/Rec"), 6, 0);
   list.add(new Label("Rushing"), 7, 0);
   list.add(new Label("TD"), 8, 0);
   list.add(new Label("Cut"), 9, 0);
   i++;
  }

  for (Object object: offensivePlayers) { // List all defensive players
   if (((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())) {
    Label name = new Label(((NFLPlayer) object).getName());
    Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
    Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
    Label team = new Label(((NFLPlayer) object).getTeam());
    Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
    Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
    Label passRec = new Label(Double.toString(((OffensivePlayer) object).getPassing()));
    Label rushing = new Label(Double.toString(((OffensivePlayer) object).getRushing()));
    Label td = new Label(Double.toString(((OffensivePlayer) object).getTd()));
    Button draft = new Button();
    draft.setText("Draft"); 
    draft.setId("draftOff" + ((NFLPlayer) object).getName());
    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
    list.add(name, 0, i);
    list.add(age, 1, i);
    list.add(number, 2, i);
    list.add(team, 3, i);
    list.add(height, 4, i);
    list.add(weight, 5, i);
    list.add(passRec, 6, i);
    list.add(rushing, 7, i);
    list.add(td, 8, i);
    list.add(draft, 9, i);
    i++;
   }
  }

  for (Object object: defensivePlayers) { // List all defensive players
   if (((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())) {
    defResults++;
   }
  }

  if (defResults > 0) {
   // Set grid headers
   list.add(new Label("Defense"), 0, i);
   list.add(new Label("Age"), 1, i);
   list.add(new Label("Number"), 2, i);
   list.add(new Label("Team"), 3, i);
   list.add(new Label("Height"), 4, i);
   list.add(new Label("Weight"), 5, i);
   list.add(new Label("Tackles"), 6, i);
   list.add(new Label("Sacks"), 7, i);
   list.add(new Label("Int"), 8, i);
   list.add(new Label("Cut"), 9, i);
   i++;
  }

  for (Object object: defensivePlayers) { // List all defensive players
   if (((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())) {
    Label name = new Label(((NFLPlayer) object).getName());
    Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
    Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
    Label team = new Label(((NFLPlayer) object).getTeam());
    Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
    Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
    Label Tackles = new Label(Double.toString(((DefensivePlayer) object).getTackles()));
    Label Sacks = new Label(Double.toString(((DefensivePlayer) object).getSacks()));
    Label Int = new Label(Double.toString(((DefensivePlayer) object).getInter()));
    Button draft = new Button();
    draft.setText("Draft");
    draft.setId("draftdef " + ((NFLPlayer) object).getName());
    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
    list.add(name, 0, i);
    list.add(age, 1, i);
    list.add(number, 2, i);
    list.add(team, 3, i);
    list.add(height, 4, i);
    list.add(weight, 5, i);
    list.add(Tackles, 6, i);
    list.add(Sacks, 7, i);
    list.add(Int, 8, i);
    list.add(draft, 9, i);
    i++;
   }
  }


  
  ColumnConstraints columnConstraints = new ColumnConstraints();
  columnConstraints.setFillWidth(true);
  columnConstraints.setHgrow(Priority.ALWAYS);
  list.getColumnConstraints().add(columnConstraints);

 
  vBox.getChildren().addAll(back, getSearchBar(), list);
  pane.setCenter(vBox);

 
  ScrollPane scroller = new ScrollPane(pane);
  scroller.setFitToWidth(true);

  menu.setScene(new Scene(scroller, 700, 550));
  menu.show();
 }
	 
 private Node getMenu() {
  Button offense = new Button("View Offense");
  offense.setId("View Offense");
  offense.setMaxWidth(Double.MAX_VALUE); 
  offense.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

  Button defense = new Button("View Defense"); 
  defense.setId("View Defense"); 
  defense.setMaxWidth(Double.MAX_VALUE); 
  defense.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

  Button myRoster = new Button("My Roster"); 
  myRoster.setId("My Roster"); 
  myRoster.setMaxWidth(Double.MAX_VALUE); 
  myRoster.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

  VBox vbButtons = new VBox();
  vbButtons.setSpacing(30);
  vbButtons.setPadding(new Insets(30, 200, 30, 200));

  vbButtons.getChildren().addAll(offense, defense);

  
  if (!currentRoster.isEmpty()) {
   vbButtons.getChildren().addAll(myRoster);
  }
  return vbButtons;
 }






 public static void main(String[] args) {
  launch(args);
 }

 // This handles all events for when buttons are clicked 
 private class MyEventHandler implements EventHandler < Event > {
  @Override
  public void handle(Event evt) {
 
   switch (((Control) evt.getSource()).getId()) {
    case "View Offense":
     showOffense();
     break;
    case "View Defense":
     showDefense();
     break;
    case "My Roster":
     showRoster();
     break;
    case "Back to Menu":
     showMenu();
     break;
    case "Back to Offense":
     showOffense();
     break;
    case "Back to Defense":
     showDefense();
     break;
    case "search":
     showSearchResults(searchField.getText());
     break;
    case "allOff":
     listOffensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "QB":
     listOffensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "RB":
     listOffensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "WR":
     listOffensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "alldef":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "DE":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "ILB":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "DB":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "FS":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "OLB":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "MLB":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "DT":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "LB":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
    case "CB":
     listDefensivePlayers(((Control) evt.getSource()).getId());
     break;
   }

   // drafting offense
   if (((Control) evt.getSource()).getId().contains("draftOff")) {
    String name;
    String players;

    if (((Control) evt.getSource()).getId().contains("QB")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "QB";
    } else if (((Control) evt.getSource()).getId().contains("RB")) {
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "RB";
    } else if (((Control) evt.getSource()).getId().contains("WR")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "WR";
    } else {
     name = ((Control) evt.getSource()).getId().substring(9); 
     players = "allOff";
    }

    for (Iterator < OffensivePlayer > it = offensivePlayers.iterator(); it.hasNext();) { 
     OffensivePlayer offensivePlayers = it.next();

     if (offensivePlayers.getName().equals(name)) {
      //Creates alert to user that a offensive player was drafted
      Alert a = new Alert(AlertType.INFORMATION);
      a.setTitle("Celebrator");
      a.setHeaderText(" New draft made! ");
      a.setResizable(true);
      String version = System.getProperty("java.version");
      String content = String.format(offensivePlayers.getName() + offensivePlayers.celebrate(), version);
      a.setContentText(content);
      a.showAndWait();

      currentRoster.add(offensivePlayers); 		 
      it.remove(); 

      if (searchField.getText().isEmpty()) {
       listOffensivePlayers(players);
      } else {
       showSearchResults(searchField.getText());
       searchField = new TextField();
      }

     }
    }

   }

   // drafting defense
   if (((Control) evt.getSource()).getId().contains("draftdef")) {
    String name;
    String players;

    if (((Control) evt.getSource()).getId().contains("DE")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "DE";
    } else if (((Control) evt.getSource()).getId().contains("ILB")) { 
     name = ((Control) evt.getSource()).getId().substring(13);
     players = "ILB";
    } else if (((Control) evt.getSource()).getId().contains("DB")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "DB";
    } else if (((Control) evt.getSource()).getId().contains("FS")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "FS";
    } else if (((Control) evt.getSource()).getId().contains("OLB")) { 
     name = ((Control) evt.getSource()).getId().substring(13);
     players = "OLB";
    } else if (((Control) evt.getSource()).getId().contains("MLB")) { 
     name = ((Control) evt.getSource()).getId().substring(13);
     players = "MLB";
    } else if (((Control) evt.getSource()).getId().contains("DT")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "DT";
    } else if (((Control) evt.getSource()).getId().contains("LB")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "LB";
    } else if (((Control) evt.getSource()).getId().contains("CB")) { 
     name = ((Control) evt.getSource()).getId().substring(12);
     players = "CB";
    } else {
     name = ((Control) evt.getSource()).getId().substring(9); 
     players = "alldef";
    }

    for (Iterator < DefensivePlayer > it = defensivePlayers.iterator(); it.hasNext();) {
     DefensivePlayer defensivePlayers = it.next();

     if (defensivePlayers.getName().equals(name)) { 
     // creates alert that defensive player was drafted 
      Alert a = new Alert(AlertType.INFORMATION); 
      a.setTitle("Celebrator");
      a.setHeaderText(" New draft made! ");
      a.setResizable(true);
      String version = System.getProperty("java.version");
      String content = String.format(defensivePlayers.getName() + defensivePlayers.celebrate(), version); //gets name, gets random celebration 
      a.setContentText(content);
      a.showAndWait();

      currentRoster.add(defensivePlayers); 		 
      it.remove(); 
      if (searchField.getText().isEmpty()) {
       listDefensivePlayers(players); 
      } else {
       showSearchResults(searchField.getText());
       searchField = new TextField();
      }
     }
    }

   }

  
   if (((Control) evt.getSource()).getId().contains("cut_")) {
    String name;
    name = ((Control) evt.getSource()).getId().substring(5);

    for (Iterator < Object > it = currentRoster.iterator(); it.hasNext();) { 
     Object currentRoster = it.next();

     if (((NFLPlayer) currentRoster).getName().equals(name)) {
     //alert for when a player is cut/removed 
      Alert a = new Alert(AlertType.INFORMATION); 
      a.setTitle("Celebrator");
      a.setHeaderText("Player Removed");
      a.setResizable(true);
      String version = System.getProperty("java.version");
      String content = String.format("You have removed " + name, version);
      a.setContentText(content);
      a.showAndWait();

      if (((NFLPlayer) currentRoster).getCategory().equals("off")) {
       offensivePlayers.add((OffensivePlayer) currentRoster); 	 
       it.remove(); 
       showRoster(); 
      }

      if (((NFLPlayer) currentRoster).getCategory().equals("def")) {
       defensivePlayers.add((DefensivePlayer) currentRoster); // add object to current roster		 
       it.remove();
       showRoster(); 
      }


     }
    }

   }

  }
 }


}
