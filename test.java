import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class test{
	public static void main(String[] args){
		Console con = new Console();
	
	int intBoard[][];
	int intCount = record();
	intBoard = loadgame(intCount);
	printgame(intBoard, intCount, con);
	printgame(intBoard, intCount, con);
		
	}
	
	public static int record(){
	
	TextInputFile txtRecording = new TextInputFile("recording.txt");
	
	int intP1;
	int intP2;
	int intLines = 0;
	
	while(txtRecording.eof() == false){
		intP1 = txtRecording.readInt();
		intP2 = txtRecording.readInt();	
		intLines++;
		
		}
		txtRecording.close();
		return intLines/6;
	}
	public static int[][] loadgame(int intCount){
		int intBoard[][] = new int[intCount][6];
		TextInputFile txtRecording = new TextInputFile("recording.txt");
		int intRow;
		for(intRow = 0; intRow < intCount; intRow++){
			intBoard[intRow][0] = txtRecording.readInt();
			intBoard[intRow][1] = txtRecording.readInt();
			intBoard[intRow][2] = txtRecording.readInt();
			intBoard[intRow][3] = txtRecording.readInt();
			intBoard[intRow][4] = txtRecording.readInt();
			intBoard[intRow][5] = txtRecording.readInt();
			intBoard[intRow][6] = txtRecording.readInt();
		}
		txtRecording.close();
		return intBoard;
	}
	public static void printgame(int intBoard[][], int intCount, Console con){
		int intRow;
		for(intRow = 0; intRow < intCount; intRow++){
			con.print(intBoard[intRow][0]);
			con.print(intBoard[intRow][1]);
			con.print(intBoard[intRow][2]);
			con.print(intBoard[intRow][3]);
			con.print(intBoard[intRow][4]);
			con.print(intBoard[intRow][5]);
			con.println(intBoard[intRow][6]);
		}
	}
}



