///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package Objects;


import java.util.ArrayList;



public class Board extends GameObject {
	protected int numSquaresX ; //needs to be even 
	protected int numSquaresY ; // needs to be even 
	protected ArrayList<Square> lstSquares = new ArrayList<Square>() ; 
	
	public Board(int numSquaresX , int numSquaresY) {
		boolean playable ;
		
		this.numSquaresX  = numSquaresX ; 
		this.numSquaresY = numSquaresY ; 
		
		for ( int i =1 ; i < numSquaresX+1 ; i++ ){
			for ( int j =1 ; j < numSquaresX+1 ; j++ ){
				playable = ((i%2)==(j%2));
				lstSquares.add(new Square(i , j , playable));
				
			}
			
		}
	}

	
	public ArrayList<Square> getSquares(){
		return lstSquares ; 
	}
	
	
	public int getNumSquaresX(){
		return this.numSquaresX ; 
	}
	
	public int getNumSquaresY(){
		return this.numSquaresY ; 
	}
}
