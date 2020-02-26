///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import Objects.*;

public class GUIBoard extends JPanel implements MouseListener {




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//GridLayout layout ; 
	GridBagLayout layout ;
	GridBagConstraints c = new GridBagConstraints();
	private Board board ; 
	ArrayList<Square> lstSquares ; 
	ArrayList<GUISquare> pnlLstSquares = new ArrayList<GUISquare> () ;
	GUISquare pnlCurrentSquare ; 
	Player player1 , player2 ; 

	//may have to pass players to to make GUI management easy 
	public GUIBoard(Board board , Player player1 , Player player2 ){
		// register mouse events 
		addMouseListener(this);
		this.board = board ; 
		this.player1 = player1 ; 
		this.player2 = player2 ;
		layout = new  GridBagLayout(); //GridLayout(board.getNumSquaresX(),board.getNumSquaresY());
		setLayout(layout);
		lstSquares = board.getSquares();
		Checker ckrTemp ;  
		GUIChecker pnlCkrTemp ;


		c.gridwidth = 1 ; 
		c.gridheight =1 ;
		c.weighty = 1 ; 
		c.weightx = 1 ; 
		//c.anchor =  GridBagConstraints. ; 
		c.fill = GridBagConstraints.BOTH ;
		for (Square sqr : lstSquares ){
			pnlCurrentSquare = new GUISquare(sqr);
			pnlLstSquares.add(pnlCurrentSquare);

			ckrTemp=player1.getOneChecker(sqr.getX(), sqr.getY());
			if (ckrTemp !=null){
				pnlCkrTemp = new GUIChecker(ckrTemp);
				pnlCurrentSquare.setLayout(layout);
				pnlCurrentSquare.add(pnlCkrTemp, c);
			}


			ckrTemp=player2.getOneChecker(sqr.getX(), sqr.getY());
			if (ckrTemp !=null){
				pnlCkrTemp = new GUIChecker(ckrTemp);
				pnlCurrentSquare.setLayout(layout );
				pnlCurrentSquare.add(pnlCkrTemp , c);
			}

			c.gridx =sqr.getX();
			c.gridy = sqr.getY();
			//pnlCurrentSquare.setPreferredSize(new Dimension(200, 200));
			add(pnlCurrentSquare , c);


		}



	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//this.removeAll();
		
		Checker ckrTemp ;  
		GUIChecker pnlCkrTemp ;
		c.gridwidth = 1 ; 
		c.gridheight =1 ;
		c.weighty = 1 ; 
		c.weightx = 1 ; 
		//c.anchor =  GridBagConstraints. ; 
		c.fill = GridBagConstraints.BOTH ;
		for (Square sqr : lstSquares ){
			pnlCurrentSquare = new GUISquare(sqr);
			//pnlLstSquares.add(pnlCurrentSquare);

			ckrTemp=player1.getOneChecker(sqr.getX(), sqr.getY());
			//
			if (ckrTemp !=null){
				pnlCkrTemp = new GUIChecker(ckrTemp);
				pnlCurrentSquare.setLayout(layout);
				pnlCurrentSquare.add(pnlCkrTemp, c);
			}

//
			ckrTemp=player2.getOneChecker(sqr.getX(), sqr.getY());
			if (ckrTemp !=null){
				pnlCkrTemp = new GUIChecker(ckrTemp);
				pnlCurrentSquare.setLayout(layout );
				pnlCurrentSquare.add(pnlCkrTemp , c);
			}

			c.gridx =sqr.getX();
			c.gridy = sqr.getY();
			//pnlCurrentSquare.setPreferredSize(new Dimension(200, 200));
			add(pnlCurrentSquare , c);
			pnlLstSquares.add(pnlCurrentSquare);
			


		}
		//super.paintComponent(g);
		//this.revalidate();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getSource());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
