import arc.*;
import java.awt.Color;

public class VeerToolsCPT{
	public static void main(String[] args){
		Console con = new Console();	
	}
		
		//Used to test parts of code.
		
		public static String[][] sortWins(String strWins[][], int intCount){
		
		int intBelow;
		int intCurrent;
		int intCounter;
		int intCounter2;
		String strTemp;
		
		for(intCounter2 = 0; intCounter2 < intCount-1; intCounter2++){
		for(intCounter = 0; intCounter < intCount-1; intCounter++){
			
			intBelow = Integer.parseInt(strWins[intCounter+1][2]);
			intCurrent =Integer.parseInt(strWins[intCounter][2]);
			if(intBelow > intCurrent){
				strTemp = strWins[intCounter+1][2];
				strWins[intCounter+1][2] = strWins[intCounter][2];
				strWins [intCounter][2] = strTemp;
				strTemp = strWins[intCounter+1][1];
				strWins[intCounter+1][1] = strWins[intCounter][1];
				strWins [intCounter][1] = strTemp;
				strTemp = strWins[intCounter+1][0];
				strWins[intCounter+1][0] = strWins[intCounter][0];
				strWins [intCounter][0] = strTemp;
				
			}
		}
	}
	
	return strWins;
}


	}



	
