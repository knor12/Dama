///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package Logic;

import GUI.*;
import Objects.*;

import java.awt.Color;
import java.lang.Math.*;


public class GameLogic {

	static GameLogic onlyInstance = null; 

	static Player playerForward , PlayerBackward ;

	static Player cuurentPlayerTurn ; 
	GUIGame pnlGame ;
	GUIGame pnlgame ; 
	private GameLogic(GUIGame pnlgame ) {
		// TODO Auto-generated constructor stub
		this.pnlGame = pnlgame;
		this.pnlgame = pnlgame ;
		PlayerBackward=pnlgame.getGame().getPlayer(EnmPlayerDirection.BACKWARD);
		playerForward=pnlgame.getGame().getPlayer(EnmPlayerDirection.FORWARD);
		cuurentPlayerTurn = playerForward ;

	}




	public static GameLogic getOnlyInstance(GUIGame pnlgame){
		if (onlyInstance==null)
			onlyInstance = new GameLogic( pnlgame);
		return onlyInstance ;
	}



	public static GameLogic getOnlyInstance(){

		return onlyInstance ;
	}



	public void  squareClicked(GUISquare pnlsquare){
		Square square =pnlsquare.getSquare();
		int targetX , targetY ;
		Checker targetCkr ; 

		System.out.println("X="+square.getX()+"Y="+square.getY()    );
		//return true ;
		Checker tempChecker ;
		Player owner = alreadyHasChecker(square);
		Checker ChkrSelected = cuurentPlayerTurn.getSelectedChecker();
		Checker Chkrclicked = cuurentPlayerTurn.getOneChecker(square.getX() , square.getY() );
		
		if (!square.isPlayable()){
			return ; 
		}

		if (Chkrclicked!=null){
			if(ChkrSelected==Chkrclicked){
				Chkrclicked.setSelected(false);
			}else if(ChkrSelected!=null){
				//do nothing already selected one 

			}else {
				Chkrclicked.setSelected(true);
			}
		}else {
			if(ChkrSelected==null){
				//do nothing nothing selected nothing clicked

			}else if ((alreadyHasChecker(square)==null)){ //try to move checker forward 
				if((ChkrSelected.getDirection()==EnmPlayerDirection.FORWARD)  ){
					if((square.getX() == ChkrSelected.getX() +1 ) && 
							java.lang.Math.abs(square.getX() - ChkrSelected.getX())==1){

						ChkrSelected.setX(square.getX());
						ChkrSelected.setY(square.getY());
						ChkrSelected.setSelected(false);
						functiuonSwitchTurns();
					}else if((square.getX() == ChkrSelected.getX() +2 ) && 
							java.lang.Math.abs(square.getX() - ChkrSelected.getX())==2){

						targetX = (ChkrSelected.getX()+square.getX())/2;
						targetY= (ChkrSelected.getY()+square.getY())/2;
						targetCkr =  otherPlayer().getOneChecker(targetX , targetY);

						if (targetCkr!=null){
							targetCkr.setX(0);
							targetCkr.setY(0);
							ChkrSelected.setX(square.getX());
							ChkrSelected.setY(square.getY());
							ChkrSelected.setSelected(false);
							pnlGame.updateScore();
							functiuonSwitchTurns();

						}




					}
				}else{//move the other checkers backward 
					if((square.getX() == ChkrSelected.getX() -1 ) && 
							java.lang.Math.abs(square.getX() - ChkrSelected.getX())==1){

						ChkrSelected.setX(square.getX());
						ChkrSelected.setY(square.getY());
						ChkrSelected.setSelected(false);
						functiuonSwitchTurns();

					}else if((square.getX() == ChkrSelected.getX() -2 ) && 
							java.lang.Math.abs(square.getX() - ChkrSelected.getX())==2){

						targetX = (ChkrSelected.getX()+square.getX())/2;
						targetY= (ChkrSelected.getY()+square.getY())/2;
						targetCkr =  otherPlayer().getOneChecker(targetX , targetY);

						if (targetCkr!=null){
							targetCkr.setX(0);
							targetCkr.setY(0);
							ChkrSelected.setX(square.getX());
							ChkrSelected.setY(square.getY());
							ChkrSelected.setSelected(false);
							pnlGame.updateScore();
							functiuonSwitchTurns();

						}
					}



				}

			}//is the square clicked contains a checker 

		}

		pnlgame.repaint();

		//return true ;



	}


	private Player alreadyHasChecker(Square square){

		Checker ckr = playerForward.getOneChecker(square.getX(), square.getY());
		if (ckr !=null)
			return playerForward ;

		ckr = PlayerBackward.getOneChecker(square.getX(), square.getY());
		if (ckr !=null)
			return PlayerBackward ;
		return null ; 
	}


	private void  functiuonSwitchTurns(){
		if (cuurentPlayerTurn ==playerForward)
			cuurentPlayerTurn=PlayerBackward;
		else 
			cuurentPlayerTurn =playerForward;
		
		pnlGame.updateScore();

	}

	private Player otherPlayer(){
		if (cuurentPlayerTurn ==playerForward)
			return PlayerBackward;
		else 
			return playerForward;

	}
	
	public Player getCurrentPlayer(){
		return cuurentPlayerTurn;
	}
	
	
	
	

}
