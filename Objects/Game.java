///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package Objects;

import java.util.ArrayList;

public class Game extends GameObject {

	protected int numSquaresX , numSquaresY , numCheckers ; 

	private Player playerForward , playerBackward ; 
	
	
	 
	private Board board ;

	public Game(int numSquaresX , int numSquaresY , int numCheckers ) {
		this.numCheckers = numCheckers ; 
		this.numSquaresX = numSquaresX ; 
		this.numSquaresY = numSquaresY ;
		
		board = new Board(numSquaresX , numSquaresY);
		
		playerForward = new Player(numCheckers, EnmPlayerDirection.FORWARD, board);
		
		playerBackward = new Player(numCheckers, EnmPlayerDirection.BACKWARD, board);
		
	}


	public Board getBoard(){
		return this.board ; 
	}

	public int getnumCheckers(){
		return this.numCheckers ; 
	}

	public int getNumSquaresX(){
		return this.numSquaresX ; 
	}

	public int getNumSquaresY(){
		return this.numSquaresY ; 
	}


	public Player getPlayer(EnmPlayerDirection Direction){
		if (Direction == EnmPlayerDirection.FORWARD){
			return playerForward ; 
		}else if (Direction == EnmPlayerDirection.BACKWARD) {
			return playerBackward ;
		}else {
			return null;
		}
	}


	public void printGame(){
		
		
		ArrayList<Square> squares = board.getSquares();
		System.out.println("=====================================");
		for (Square s : squares){
			System.out.println("Playable="+ s.isPlayable()+ "   , X=" + s.getX() + "    Y="+ s.getY()); 
		}
		System.out.println("=====================================");


		




		ArrayList<Checker> chekcers =playerForward.getCheckers();

		System.out.println("=============Forward========================");
		for (Checker c : chekcers){
			System.out.println("Checker ="+ "   , X=" + c.getX() + "    Y="+ c.getY()); 
		}
		System.out.println("=====================================");




		



		
		chekcers =playerBackward.getCheckers();
		System.out.println("=============Backward========================");
		for (Checker c : chekcers){
			System.out.println("Checker ="+ "   , X=" + c.getX() + "    Y="+ c.getY()); 
		}
		System.out.println("=====================================");


	}



}
