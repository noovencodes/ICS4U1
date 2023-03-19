/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author johnn
 */
public class RockPaperScissors {
    private Player player;
    private Player computer;
    
    public RockPaperScissors(){
         player = new Player("Player");
         computer = new Player("Computer");
    }
    //Add player choice
    public void playerPlay(String choice )
    {
        player.play(choice);
    }
    //Add computer choice
    public void computerPlay(String choice )
    {
        computer.play(choice);
    }
    //Get player score
    public int getPlayerScore(){
        return player.getScore();
    }
    //Get computer Score
    public int getComputerScore(){
        return computer.getScore();
    }
    //Check for winner
    public String checkforwinner()
    {
        //Check for tie game
       if (player.getChoice().equals (computer.getChoice())){
//           computer.addScore();
//           player.addScore();
           return "Tie Game";
       }
       //Check if player wins
       else if(player.getChoice().equals("paper") && computer.getChoice().equals("rock")){
          player.addScore();
           return "Player Wins because paper beats rock";
       }
       else if (player.getChoice().equals("scissors") && computer.getChoice().equals("paper")){
            player.addScore();
           return "Player Wins because scissors beats paper";
       }
       else if (player.getChoice().equals("rock") && computer.getChoice().equals("scissors")){
            player.addScore();
           return "Player Wins because rock beats scissors";
       }
       else {
            computer.addScore();
           return "Computer Wins because " + computer.getChoice() + " beats " + player.getChoice();
       }
    }
}
