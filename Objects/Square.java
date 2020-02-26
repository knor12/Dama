///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package Objects;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Square extends GameObject implements MouseListener  {
private  boolean isPlayable ; 
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Square(int x , int y) {
		this.x = x ; 
		this.y = y ; 
	}
	
	public Square(int x , int y , boolean isPlayable) {
		this.x = x ; 
		this.y = y ; 
		this.isPlayable = isPlayable ; 
	}
	
	
	
	public boolean isPlayable(){
		return isPlayable ; 
	}
	
	public void setPlayable(boolean isPlayable){
		this.isPlayable = isPlayable; 
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
