import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class VeerCPT{
	public static void main(String[] args){
	Console con = new Console("Connect 4 - CPT",1280,720);
	
	//Create the main menu of the game.
	
	BufferedImage imgMainMenu = con.loadImage("MainMenu.jpg");
		con.drawImage(imgMainMenu, 0, 0);
		
	String strChoice;
		
	strChoice = con.readLine();
	if(strChoice.equals("play")){
		game(con);
	}else if(strChoice.equals("record")){
		//recording(con);
	}else if(strChoice.equals("help")){
		//help(con);
	}else{
		con.println("Error");
	}
}
	
	public static void game(Console con){
	
	//Enter your Usernames
	String strP1;
	String strP2;
	
	con.println("PLAYER ONE - ENTER YOUR USERNAME");
	strP1 = con.readLine();
	con.println("PLAYER TWO- ENTER YOUR USERNAME");
	strP2 = con.readLine();
	
	//Array
	
	int intColumn;
	int intRow;
	
	//Variables for each piece.
	
	int intP1Piece;
	int intP2Piece;
	
	int intBall1X;
	int intBall1Y;
	intBall1X = 200;
	intBall1Y = 200;
	con.setDrawColor(Color.YELLOW);
	con.fillOval(intBall1X, 100, 25, 25);
	
	int intBall2X;
	int intBall2Y;
	intBall2X = 200;
	intBall2Y = 200;
	con.setDrawColor(Color.RED);
	con.fillOval(intBall1X, 100, 25, 25);
	
	String strBoard[][];
	strBoard = new String[6][5];
	
	for(intRow = 0; intRow <5; intRow++){
		//Placing the piece into column 1.
		//strBoard[intColumn][0] = 
		//Placing the piece into column 2.
		//strBoard[intColumn][1] = 
		}
	
	
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
	
	

	}

