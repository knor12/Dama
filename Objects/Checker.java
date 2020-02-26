///////////////////////////////////////////////////////////////////////////////
//                   
// Project:          Dama
//
// Author:           Noreddine Kessa
//
///////////////////////////////////////////////////////////////////////////////
package Objects;

public class Checker extends GameObject {
	boolean isSelected = false  ; 
	 EnmPlayerDirection Direction ; 
	public Checker(int x , int y  , EnmPlayerDirection Direction) {
		this.setX(x) ; 
		this.setY(y) ;
		this.Direction = Direction ;
		
	}
	
	
	public EnmPlayerDirection getDirection(){
		return this.Direction;
	}
	
	
	public boolean isSelected(){
		return this.isSelected ; 
	}
	
	
	public void setSelected(boolean isSelected ){
		this.isSelected = isSelected ; 
	}

}
