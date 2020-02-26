///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package Objects;

import java.util.ArrayList;

public class Player extends GameObject {

	protected EnmPlayerDirection Direction ; 
	protected int numCheckers ; 
	protected Board board ; 
	protected ArrayList<Checker> lstCheckers = new ArrayList<Checker>() ; 


	public Player(int numCheckers , EnmPlayerDirection Direction , Board board  ) {
		this.numCheckers = numCheckers ; 
		this.Direction = Direction ;
		this.board = board ; 

		int listindex =-1 ;
		int assignedSofar =0 ;
		Square currentSquare ; 
		ArrayList<Square> squares =board.getSquares();

		if (this.Direction == EnmPlayerDirection.FORWARD){
			
			
			while(assignedSofar < numCheckers ){
				listindex+=1;
				currentSquare = squares.get((listindex));
				
				while(!currentSquare.isPlayable()){
					listindex+=1;
					currentSquare = squares.get(listindex);
				}
				
				
				lstCheckers.add(new Checker(currentSquare.getX() , currentSquare.getY(), this.Direction));
				assignedSofar++;
			}
			
		}else { // if Direction = backward
			
			listindex = squares.size();
			while(assignedSofar < numCheckers ){
				listindex-=1;
				currentSquare = squares.get((listindex));
				
				while(!currentSquare.isPlayable()){
					listindex-=1;
					currentSquare = squares.get(listindex);
				}
				
				
				lstCheckers.add(new Checker(currentSquare.getX() , currentSquare.getY(), this.Direction));
				assignedSofar++;
			}
			
		}


	}


	public EnmPlayerDirection getDirection(){
		return Direction ; 
	}


	
	public Checker getOneChecker(int x , int y){
		
		for (Checker ckr : lstCheckers ){
			
			if ((ckr.getX()==x )& (ckr.getY()==y)){
				return ckr ; 
			}
		}
		return null ;
		
	}
	
	public Checker getSelectedChecker(){
		
		for (Checker ckr : lstCheckers ){
			
			if (ckr.isSelected){
				return ckr ; 
			}
		}
		return null ;
		
	}

	
	public ArrayList<Checker> getCheckers(){
		return this.lstCheckers ; 
	}


}
