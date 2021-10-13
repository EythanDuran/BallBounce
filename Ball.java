import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(15);   //mueve distancia  
        bounceBall(); //rebotes
    }
    
    public void bounceBall(){
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(360)); //gira en grados random hasta 360
        } 
    }
    
}
