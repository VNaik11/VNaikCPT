import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class VeerCPT{
	public static void main(String[] args){
	Console con = new Console("Connect 4 - CPT",1280,720);
	
	//Create the main menu of the game.
	
	BufferedImage imgMainMenu = con.loadImage("Main Menu.jpg");
		con.drawImage(imgMainMenu, 0, 0);
		
	//Ask the user what they want to do/see in the main menu.
	String strChoice;
		
	con.println("Do you want to \"play\", go to the \"help\" screen or view the high \"score\" screen?");
		
	strChoice = con.readLine();
	if(strChoice.equals("play")){
		game(con);
	}else if(strChoice.equals("score")){
		score(con);
	}else if(strChoice.equals("help")){
		help(con);
	}else{
		con.println("Error");
	}
}
	
	public static void pregame(Console con){
	
	//Enter your Usernames
	String strP1;
	String strP2;
	
	con.println("PLAYER ONE - ENTER YOUR USERNAME");
	strP1 = con.readLine();
	con.println("PLAYER TWO- ENTER YOUR USERNAME");
	strP2 = con.readLine();
	
	
	//Ask reader if they would like to record the game.
	
	String strRecord;
	strRecord = con.readLine();
	
	con.println("Would you like to record the game?");
	if(strRecord.equals("yes")){
		record(con);
	}else if(strRecord.equals("no")){
	}
}
		
	public static void game(Console con){
	
	//Array
	
	int intRow;
	int intCol;
	
	//Creating the board.
	int intBoard[][];
	intBoard = new int[6][5];
	
	//Creating the pieces.
	
	int intP1Piece;
	int intP2Piece;
	
	
	
	for(intRow = 0; intRow <6; intRow++){
		
		//Placing the piece into column 1.
		//intBoard[intColumn][0] = 
		//Placing the piece into column 2.
		//strBoard[intColumn][1] = 
		}
	}

	
	public static void record(Console con){
	
	//Recording the game.
	
	TextOutputFile txtRecording = new TextOutputFile("recording.txt", true);
	int intMove;
	con.println("Enter the move you would like to make.");
	intMove = con.readInt();
	if(intMove > 7){
		con.println("Please enter a valid move.");
	}else if(intMove < 0){
		con.println("Please enter a valid move.");
	}
	txtRecording.println(intMove);
	txtRecording.close();
}
	
	//File IO (Output) Replay the Users Moves
	
	public static void help(Console con){
		
	con.println("Connect 4 is a game where you 
		
	}
	
	public static void score(Console con){
		
	}

	}

