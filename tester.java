import arc.*;

public class tester{
	public static void main(String[] args){
	Console con = new Console();
	
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
}
