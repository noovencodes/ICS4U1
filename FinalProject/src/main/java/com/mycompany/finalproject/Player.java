/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author johnn
 */
public class Player {
  private String name;
  private int score;
  private String choice;
  public Player(String name){
     this.name=name;
     
  } 
   public int getScore(){
    return(score);
}
   public String getName(){
       return(name);
   }
   public String getChoice() {
    return(choice);
}
public void addScore(){
    score++;
}
public void play(String choice){
    this.choice=choice;
    
}

    /**
     *
     * @return player information
     */
    @Override
  public String toString()
{
    return"name:"+name+"score:"+ score +"choice:" + choice;
}   
}
