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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import Objects.* ;

public class GUIChecker extends JPanel  {
	
	Color ForwardColor = Color.green;
	Color BackwardColor = Color.red; 
	Color SelectedBackwardColor = Color.orange ;
	Color SelectedForwardColor = Color.blue ;

	private Checker checker ; 
	public GUIChecker(Checker checker) {
		this.checker = checker ;
		
		if (checker.getDirection()==EnmPlayerDirection.BACKWARD){
			//this.setBackground(BackwardColor);
		}else{
			//this.setBackground(ForwardColor);
		}
			
		
		
		
		
		
		
	}
	
	
	@Override
     protected void paintComponent(Graphics g) {
         // TODO Auto-generated method stub
         super.paintComponent(g);
         int width = getWidth();
         int height = getHeight();
         if (checker.getDirection()==EnmPlayerDirection.BACKWARD){
 			//this.setBackground(BackwardColor);
        	 if (checker.isSelected()){
        		 g.setColor(SelectedBackwardColor);
        	 }else {
        		 g.setColor(BackwardColor);
        	 }
        	 
 		}else{
 			if (checker.isSelected()){
       		 g.setColor(SelectedForwardColor);
       	 }else {
       		 g.setColor(ForwardColor);
       	 }
 		}
         g.fillOval(0, 0, width, height);
     }


	

}
