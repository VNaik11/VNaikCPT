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
		pregame(con);
	}else if(strChoice.equals("score")){
		score(con);
	}else if(strChoice.equals("help")){
		help(con);
	}else{
		con.println("Error");
	}
}
	
	
	public static void pregame(Console con){
	
	//The function of this console is to determine the usernames of both players.
	//This console also determines whether the player wants to record their game.
	
	con.clear();
	
	//Enter your Usernames
	String strP1;
	String strP2;
	
	con.println("PLAYER ONE - ENTER YOUR USERNAME");
	strP1 = con.readLine();
	con.println("PLAYER TWO- ENTER YOUR USERNAME");
	strP2 = con.readLine();	
	
	//Ask reader if they would like to record the game.
	
	String strRecord;
	
	con.println("Would you like to record the game?");
	strRecord = con.readLine();
	if(strRecord.equals("yes")){
		record(con);
	}else if(strRecord.equals("no")){
		game(con);
	}
}
		
	public static void game(Console con){
	
	//Actual gameplay code of the game.
	//Includes pieces, and board.
	
	con.clear();
	
	BufferedImage imgGame = con.loadImage("Game.jpg");
		con.drawImage(imgGame, 0, 0);

	//Array
	//Creating the board.
	int intBoard[][];
	intBoard = new int[5][6];
	
	int intRow;
	int intCol;
	int intP1Move;
	int intP2Move;
	
	boolean win = false;
	
	con.println("Make your move");
	while(win = false){
		intP1Move = con.readInt();
		intP2Move = con.readInt();
		for(intRow = 5; intRow < 0; intRow--){
			for(intCol = 0; intCol < 6; intCol++){
				intBoard[intRow][intP1Move] = intCol;
				
				
			}
		}
		for(intRow = 5; intRow < 0; intRow--){
			for(intCol = 0; intCol < 6; intCol++){
				intBoard[intRow][intP2Move] = intCol;
			}
		}
	}
	
	for(intRow = 5; intRow < 0; intRow--){
			for(intCol = 0; intCol < 6; intCol++){
				con.println(intBoard[intRow][0]+intBoard[intRow][1]+intBoard[intRow][2]+intBoard[intRow][3]+intBoard[intRow][4]+intBoard[intRow][5]+intBoard[intRow][6]);
 
		
		
			}
		}
	}

	
	public static void record(Console con){
	
	//This console takes the user inputs from the game and stores them in the recording.txt file.
	
	con.clear();
	
	BufferedImage imgGame = con.loadImage("Game.jpg");
		con.drawImage(imgGame, 0, 0);
	
	//Recording the game.
	
	TextOutputFile txtRecording = new TextOutputFile("recording.txt");
	
	int intBoard[][];
	intBoard = new int[5][6];
	
	int intRow;
	int intCol;
	int intP1Move;
	int intP2Move;
	
	boolean win = false;
	
	while(win = false){
		intP1Move = con.readInt();
		intP2Move = con.readInt();
		txtRecording.println(intP1Move);
		txtRecording.println(intP2Move);
		for(intRow = 5; intRow < 0; intRow--){
			for(intCol = 0; intCol < 6; intCol++){
				intBoard[intRow][intP1Move] = intCol;
				
				
			}
		}
		for(intRow = 5; intRow < 0; intRow--){
			for(intCol = 0; intCol < 6; intCol++){
				intBoard[intRow][intP2Move] = intCol;
			}
		}
	}
	
	for(intRow = 5; intRow < 0; intRow--){
			for(intCol = 0; intCol < 6; intCol++){
				con.println(intBoard[intRow][0]+intBoard[intRow][1]+intBoard[intRow][2]+intBoard[intRow][3]+intBoard[intRow][4]+intBoard[intRow][5]+intBoard[intRow][6]);
	
	
	
	//strWinner = winner of the game.
	
	
	con.println("Would you like to start a \"new\" game or watch the \"replay?\"");
	String strDecision;
	strDecision = con.readLine();
	
	if(strDecision.equals("new")){
		game(con);
	}else if(strDecision.equals("replay")){
		playback(con);
		
			}
		}
	}	
}
	
	public static void playback(Console con){
		
	//Taking information from recording.txt and replaying the moves.
	//When the user enters stop, the game goes back to the main menu.
	
	TextInputFile txtRecord = new TextInputFile("recording.txt");
	
	int intCol;
	int intRow = 5;
		
		int intBoard[][] = new int[5][6];
		for(intRow = 0; intRow < 5; intRow--){
			for (intCol = 0; intCol < 6; intCol++){
				
				intBoard[intRow][intCol] = txtRecord.readInt(); 
			
			}
		}
	}
	
	public static void help(Console con){
		
	//Help menu.
		
	con.clear();
	
	BufferedImage imgHelp = con.loadImage("Help.jpg");
		con.drawImage(imgHelp, 0, 0);
		
	con.println("Connect 4 is a game where you and someone else take tuens placing pieces on the board.");
	con.println("The goal of the game is to to have a straight line of four connecting pieces.");
	con.println("These pieces can go vertical, straight, or sideways.");
	con.println("The first person to connect four in a row wins!");
		
	}
	
	public static void score(Console con){
		
	//The function here is to sort the amount of wins in descending order by username.
		
	con.clear();
	
	TextInputFile txtHighScores = new TextInputFile("highscore.txt");
	String strUsername;
	String strWinner = "Player1";
	int intWins;
	
	while(txtHighScores.eof() == false){
		strUsername = txtHighScores.readLine();
		intWins = txtHighScores.readInt();
		if(strUsername.equals(strWinner)){
			intWins = intWins + 1;
		}
	}
}
	

	
		
}


