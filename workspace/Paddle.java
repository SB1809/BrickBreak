//  Author: Sophia Babayev
//  Date created: 12/6/2024
//  General description: Creates a paddle that moves around the game board baced on user imput.

import java.awt.*;

public class Paddle {

    private int x;
    private int y;
    private int width;
    private int height;
    private int velocity;

public Paddle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    velocity= 3;
}


//  Pre-condition: The object must not be null
//  Post-condition: Draws the Paddle in a certain color and shape
public void draw(Graphics g){
    g.setColor(Color.red);
    g.fillRect(x , y, width, height);
}

public int getX() {
    return x;
}
public void setX(int x) {
    this.x = x;
}
 
public int getY() {
    return y;
}
public void setY(int y) {
    this.y = y;
}

public int getWidth() {
    return width;
}
public void setWidth(int width) {
    this.width = width;
}

public int getHeight() {
    return height;
}
public void setHeight(int height) {
    this.height = height;
}

public int getVelocity() {
    return velocity;
}
public void setVelocity(int velocity) {
    this.velocity = velocity;
}


//  Post-condition: increases and decreases the velocity to make the game harder
public void addVelocity(int velocity){
this.velocity += velocity;
if(this.velocity > 4){
    this.velocity = 4;
}
if(this.velocity<-2){
    this.velocity = -2;
}
}


//  Pre-condition: User must press the right or left button
//  Post-condition: Moves the paddle around the game board baced on the user
public void move() {
    x+= velocity;
    if(x<=0){
        x = 0;
    }
    if(x+width>= 680){
        x = 680-width;
    }
}

}