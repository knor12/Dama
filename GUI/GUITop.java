///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

import Logic.GameLogic;
import Objects.EnmPlayerDirection;

public class GUITop extends JPanel {

	GridBagLayout layout ;
	GridBagConstraints c = new GridBagConstraints();
	JPanel pnlLeft , pnlRight ;
	Color clrLeft , cltRight;
	JPanel pnlPadding[] = new JPanel[5];
	EnmPlayerDirection Turn ; 
	public GUITop(){
		setLayout(layout);

		pnlLeft = new JPanel();
		pnlRight = new JPanel();
		
		JButton btn = new JButton("Helloooooofffffffffff");
		add(btn);
		
		if (GameLogic.getOnlyInstance().getCurrentPlayer().getDirection() ==EnmPlayerDirection.FORWARD){
			pnlLeft.setBackground(Color.green);
			pnlRight.setBackground(Color.red);
		}else {
			pnlLeft.setBackground(Color.red);
			pnlRight.setBackground(Color.green);
			
		}
		

		c.gridx = 1 ; 
		c.gridy = 1 ;

		add(pnlLeft , c);
		c.gridx =pnlPadding.length +2 ;
		add(pnlLeft , c);
		for(int i =0;i < pnlPadding.length ;i++ ){
			pnlPadding[i] = new JPanel();
			c.gridy = 1 +i ;
			add(pnlPadding[i] , c);
		}

		
		


	}


	protected void paintComponent(Graphics g) {

		if (GameLogic.getOnlyInstance().getCurrentPlayer().getDirection() ==EnmPlayerDirection.FORWARD){
			pnlLeft.setBackground(Color.green);
			pnlLeft.setBackground(Color.red);
		}else {
			pnlLeft.setBackground(Color.red);
			pnlLeft.setBackground(Color.green);
			
		}

	}





}




