///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.*;

import Logic.GameLogic;
import Objects.* ; 

public class GUICheckersOut extends JPanel {
	
	JLabel labelScore ; 
	JLabel labelTurn ; 
	 
	
	private Player player ; 
	public GUICheckersOut(Player player ){
		setLayout(new GridLayout(3,1));
		this.player = player ;
		labelScore = new JLabel();
		labelTurn = new JLabel();
		labelScore.setFont(new Font("Verdana",1,50));
		labelTurn.setFont(new Font("Verdana",1,50));
		add(labelScore);
		add(new JLabel("--"));
		add(labelTurn);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		Integer chrOut = 0 ;
		for(Checker ckr :player.getCheckers() ){
			if (ckr.getX()==0 &&ckr.getY()==0){
				chrOut+=1;
				
			}
			labelScore.setText(chrOut.toString());
		}
		
		if (GameLogic.getOnlyInstance().getCurrentPlayer()==player){
			labelTurn.setForeground(Color.green);
			
			labelTurn.setText(" ");
			labelTurn.updateUI();
			
		}else{
			labelTurn.setForeground(Color.red);
			labelTurn.setText(" ");
		}
		
		
		this.revalidate();
	}


}
