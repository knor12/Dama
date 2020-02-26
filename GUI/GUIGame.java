///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import Logic.GameLogic;
import Objects.* ;

public class GUIGame extends JFrame   {


	private Game game ; 

	//GridBagConstraints c = new GridBagConstraints();

	GUICheckersOut  pnlForwardScore , pnlBackwardScore ; 

	GUIBoard pnlBoard ; 

	GUITop pnlTop ; 

	GUIBottom pnlBottom ;
	public Game getGame(){
		return game ;
	}
	public GUIGame(Game game){
		setTitle("Sample Title: Area of a Rectangle");



		this.game = game ;
		//this.setLayout(new GridBagLayout());
		setLayout(new BorderLayout());
		this.setSize(250, 250); 

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//create the Gamelogic object 
		GameLogic.getOnlyInstance(this);

		//add side panels 
		pnlBackwardScore = new GUICheckersOut(game.getPlayer(EnmPlayerDirection.BACKWARD));
		pnlForwardScore = new GUICheckersOut(game.getPlayer(EnmPlayerDirection.FORWARD));

		pnlBackwardScore.setBackground(Color.RED);
		add(pnlBackwardScore , BorderLayout.WEST);


		pnlForwardScore.setBackground(Color.BLACK);
		add(pnlForwardScore , BorderLayout.EAST);

		//add the board 
		pnlBoard = new GUIBoard(game.getBoard() , 
				game.getPlayer(EnmPlayerDirection.FORWARD ),  
				game.getPlayer(EnmPlayerDirection.BACKWARD ));
		//pnlBoard.setBackground(Color.green);
		add(pnlBoard , BorderLayout.CENTER);


		//add the top 
		pnlTop = new GUITop();
		pnlTop.setBackground(Color.yellow);
		add(pnlTop , BorderLayout.NORTH);


		pnlBottom = new GUIBottom();
		pnlBottom.setBackground(Color.PINK);
		add(pnlBottom , BorderLayout.SOUTH);




		//set visibale 
		setVisible(true ) ;
	}

	public void updateScore(){
		pnlForwardScore.repaint();
		pnlBackwardScore.repaint();
	}




}
