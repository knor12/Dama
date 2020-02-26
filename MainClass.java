///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
import javax.swing.SwingUtilities;

import java.util.ArrayList;

import Objects.*;
import GUI.*;
import Logic.*;

public class MainClass {

	/**
	 * @param args
	 */
	
	static GUIGame GuiGam ; 
	
	public static void main(String[] args) {
	
		
		Game game = new Game(12,12, 12);
		//game.printGame();
		
		GuiGam = new GUIGame(game);
		//
	}

}
