///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package GUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import Objects.* ;
import Logic.* ;

public class GUISquare extends JPanel implements  MouseListener {

	
	
	Square square  ; 
	
	public Square getSquare(){
		return square ;
	}
	public GUISquare(Square square) {
		addMouseListener(this);
		this.square = square ; 
		if (square.isPlayable()){
			setBackground(Color.WHITE);
			
		}else {
			setBackground(Color.black);
			
		}
	}
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		GameLogic.getOnlyInstance().squareClicked(this);
		
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
