//  Author: Sophia Babayev
//  Date created: 12/6/2024
//  General description: Creates a ball that moves around the game board.

import java.awt.*;

public class Ball {

		private int x;
		private int y;
		private int size;
		private int XVelocity;
		private int YVelocity;
	
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
		XVelocity= 10;
		YVelocity= 10;
	}


	//  Pre-condition: Ball must exist
	//  Post-condition: Draws the ball in a certain color and shape
	public void draw(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(x, y, size, size);
	}


	public int getXpos() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	 
  
	public int getYpos() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}


	public int getXVelocity() {
		return XVelocity;
	}
	public void setXVelocity(int XVelocity) {
		this.XVelocity = XVelocity;
	}


	public int getYVelocity() {
		return YVelocity;
	}
	public void setYVelocity(int YVelocity) {
		this.YVelocity = YVelocity;
	}


	//  Pre-condition: Ball must exist
	//  Post-condition: Moves the ball around the game board
	public void move() {
		x+= XVelocity;
		y+= YVelocity;
	}


	//  Pre-condition: The ball must exist and be hitting either the bricks, wall, or paddle
    //  Post-condition: Makes tha ball bounce off of things
	public void reverseX(){
		XVelocity =-XVelocity;
	}
	public void reverseY(){
		YVelocity =-YVelocity;
	}
	
}