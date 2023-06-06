import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class VeerCPT{
	public static void main(String[] args){
	Console con = new Console("Connect 4 - CPT",1280,720);
	
	//Create the main menu of the game.
	
	BufferedImage imgMainMenu = con.loadImage("MainMenu.jpg");
		con.drawImage(imgMainMenu, 0, 0);
		
		game(con);
	}
	//FileIO (Input) User Input to Track The Users Inputs
	
	public static void game(Console con){
	
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

