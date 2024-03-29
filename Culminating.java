/******************************************************************** 
* Project: ICS4U CULMINATING 
* Programmers: Yousef 
* Date: 2019-01-18 
* Program: Culminating.java 
* Description: A fun text adventure that sends the user into a world of arcade 
* games. The user must defeat 3 arcade type games in order to escape the world  
* and return back to reality. Can he do it? 
*********************************************************************/ 
package culminating; 

import java.util.Random; 
import java.util.Scanner; 
import javax.swing.JOptionPane; 
import java.io.*;
import java.util.ArrayList;

public class Culminating { 

    public static void main(String[] args) throws InterruptedException, 
            StringIndexOutOfBoundsException, IOException{ 

        //CLASSES USED THROUGHOUT ALL METHODS
        
        //Initiallize object class
        PItems obj = new PItems();
        
        //Initiallize Scanners
        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        
        //Initiallize Random
        Random r = new Random();
   
        //Display Title 
        String display = "\t\tY.S.M ARCADES\n\t\tTEXT ADVENTURE";  
        
            for (int i = 0; i < display.length(); i++) { 
                System.out.print(display.charAt(i) + ""); 
                Thread.sleep(250); 
            }//end of for loop   
        
        //Ask for user's name which will be used throughout story
        obj.setName(JOptionPane.showInputDialog("ENTER YOUR NAME")); 
        
        //Intro dialogue 
        //intro(obj); 
  
        //GAME 1: YOUSEF 
        //yMaze(obj,scanN); 
         
        //Transition dialogue to GAME 2 
        //>>>>>transition1(obj); 
         
        //GAME 2: STEVEN 
        //>>>>>sMatch(obj,scanS,r); 
         
        //Transition dialogue to GAME 3 
        //transition2(obj); 
        
        //GAME 3: MAHAD
        mShooter(obj,scanN,r);
        
        //End game dialogue
        transition3(obj);
        
        //End game menu
        endMenu(obj,scanN);
        
    }//end of main 
     
    /* 
    intro 
    This method displays the introduction to the text adventure 
    @param n: The characters name is used within the dialogue 
    @param t: Title of the game is used to display on the computer screen 
    */ 
     
    public static void intro(PItems obj) throws InterruptedException{ 
        //Intro Story 
        //Dialogue 
        //Arcade Name 
        String t = "  Y.S.M ARCADES";
        //User dialogue 
        String dialogue = "\n\nDaniel: " + obj.getName() + ", are" 
                + " you sure you wanna touch" 
                + " that? We might get in trouble...\n\nYaw: Yea, we already" 
                + " snuck in here, this stuff looks super sketchy...\n\n"  
                + obj.getName() + ": Cmon guys, nothings gonna happen. See? It's just" 
                + " an old computer.\nLets turn it on and see what happens." ; 
         
            for (int i = 0; i < dialogue.length(); i++) { 
                System.out.print(dialogue.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
         
        //Display computer screen 
        System.out.println("\n\n---------------------------------" 
                + "\n|\t\t\t\t|" 
                + "\n|\t\t\t\t|" 
                + "\n|\t\t\t\t|" 
                + "\n|\t" + t + "         |" 
                + "\n|\t\t\t\t|" 
                + "\n|\t\t\t\t|" 
                + "\n|\t\t\t\t|" 
                + "\n---------------------------------"); 
         
        //User dialogue 
        String dialogue2 = "\n\nDaniel: " + obj.getName() + ", I have " 
                + "a bad feeling about" 
                + " this.\n\n" + obj.getName() + ": Woah... whats this?" ; 
         
            for (int i = 0; i < dialogue2.length(); i++) { 
                System.out.print(dialogue2.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
         
        //Computer dialogue     
        JOptionPane.showMessageDialog(null,"HI " + obj.getName() + "."); 
        JOptionPane.showMessageDialog(null,"You have activated the " 
                + "teleportation squence..."); 
        JOptionPane.showMessageDialog(null,"*Alarm Sirens*"); 
         
        //User dialogue 
        String dialogue3 = "\n\nYaw: " + obj.getName() + " WE TOLD U THIS" 
                + " WAS A BAD IDEA"; 
         
            for (int i = 0; i < dialogue3.length(); i++) { 
                System.out.print(dialogue3.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
         
        //Computer dialogue     
        JOptionPane.showMessageDialog(null,"LAUNCHING IN: 3"); 
        JOptionPane.showMessageDialog(null,"2"); 
        JOptionPane.showMessageDialog(null,"1"); 
         
        //User dialogue 
        String dialogue4 ="\n\n" + obj.getName() + ": WHATS HAPPE-" ; 
         
            for (int i = 0; i < dialogue4.length(); i++) { 
                System.out.print(dialogue4.charAt(i) + ""); 
                Thread.sleep(250); 
            }      
         
        //Pause as character is teleporting to arcade world 
        Thread.sleep(2000); 
         
        //Computer dialogue 
        JOptionPane.showMessageDialog(null,obj.getName()+", Welcome to M.S.Y ARCADES :D"); 
        JOptionPane.showMessageDialog(null,"You can't leave until you beat " 
                + "these three games!"); 
        JOptionPane.showMessageDialog(null,"1: Y's Maze"); 
        JOptionPane.showMessageDialog(null,"2: S's Matching"); 
        JOptionPane.showMessageDialog(null,"3: M's Shooter"); 
         
        //User dialogue 
        String dialogue5 ="\n\n" + obj.getName() + ": ... WHAT! I knew I should've listened" 
                + " to them." ; 
         
            for (int i = 0; i < dialogue5.length(); i++) { 
                System.out.print(dialogue5.charAt(i) + ""); 
                Thread.sleep(250); 
            }      
         
        //Computer dialogue     
        JOptionPane.showMessageDialog(null,"Ready?"); 
        JOptionPane.showMessageDialog(null,"You will now be taken to the " 
                + "first game.\n\t(Y's Maze)"); 
         
        //User dialogue 
        String dialogue6 ="\n\n" + obj.getName() + ": How do I play?" ; 
         
            for (int i = 0; i < dialogue6.length(); i++) { 
                System.out.print(dialogue6.charAt(i) + ""); 
                Thread.sleep(250); 
            }        
    }//end of intro 
     
    /* 
    transition1 
    This method gives transition story dialogue from the completion of game one, 
    moving to game two. 
    @param n: The characters name is used within the dialogue 
    */ 
     
    public static void transition1(PItems obj) throws InterruptedException{ 
        //User dialogue 
        String d ="\n" + obj.getName() + ": FINALLY, can I leave now????"; 
         
            for (int i = 0; i < d.length(); i++) { 
                System.out.print(d.charAt(i) + ""); 
                Thread.sleep(250); 
            }    
        //Computer dialogue 
        JOptionPane.showMessageDialog(null,"You will now be taken to the " 
                + "second game.\n\t(S's Matching)"); 
        //User dialogue 
        String dialogue ="\n\n" + obj.getName() + ": Ugh, this is gonna be a long, " 
                + "long day...\n"; 
         
            for (int i = 0; i < dialogue.length(); i++) { 
                System.out.print(dialogue.charAt(i) + ""); 
                Thread.sleep(250); 
            }      
             
        //Computer dialogue2 
        JOptionPane.showMessageDialog(null,":D"); 
        JOptionPane.showMessageDialog(null,"Not if you win all the games!"); 
        JOptionPane.showMessageDialog(null,"If you don't thoough... youuuu might" 
                + " be here for a while :)"); 
         
        //User dialogue2 
        String dialogue2 ="\n" + obj.getName() + ": Whatever, lets just get this over " 
                + "with, how do I play this next one?"; 
         
            for (int i = 0; i < dialogue2.length(); i++) { 
                System.out.print(dialogue2.charAt(i) + ""); 
                Thread.sleep(250); 
            }      
    }//end of method transtion1 
     
    /* 
    transition2 
    This method gives transition story dialogue from the completion of game two, 
    moving to game three. 
    @param n: The characters name is used within the dialogue 
    */ 
     
    public static void transition2(PItems obj) throws InterruptedException{ 
        //User dialogue 
        String d ="\n\n" + obj.getName() + ": Man that was tough, am I done yet?"; 
         
            for (int i = 0; i < d.length(); i++) { 
                System.out.print(d.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
         
        //Computer dialogue 
        JOptionPane.showMessageDialog(null,"You will now be taken to the " 
                + "third game.\n\t(M's Shooter)"); 
        //User dialogue 
        String dialogue ="\n\n" + obj.getName() + ": CANT YOU JUST LET ME OUT"; 
         
            for (int i = 0; i < dialogue.length(); i++) { 
                System.out.print(dialogue.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
         
        //Computer dialogue2     
        JOptionPane.showMessageDialog(null,"Nope :))"); 
        JOptionPane.showMessageDialog(null,"But if you beat the game, yes :D"); 
         
        //User dialogue2 
        String dialogue2 ="\n\n" + obj.getName() + ": Fine... How do I play this one?"; 
         
            for (int i = 0; i < dialogue2.length(); i++) { 
                System.out.print(dialogue2.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
    }//end of method transtion2 
    
    /* 
    transition3 
    This method gives ending dialogue from the completion of all games, 
    @param n: The characters name is used within the dialogue 
    */ 
     
    public static void transition3(PItems obj) throws InterruptedException{ 
        //User dialogue 
        String d ="\n\n" + obj.getName()+ ":  YES! IM DONE, LET ME OUT"; 
         
            for (int i = 0; i < d.length(); i++) { 
                System.out.print(d.charAt(i) + ""); 
                Thread.sleep(250); 
            } 
        
        //Pause for 3 seconds
        Thread.sleep(3000);
        
        //Computer dialogue 
        JOptionPane.showMessageDialog(null, obj.getName() + ", good job! You're done!");
        JOptionPane.showMessageDialog(null,"You did well! I will now take you "
                + "back to your world."); 
        JOptionPane.showMessageDialog(null,"LAUNCHING IN 3"); 
        JOptionPane.showMessageDialog(null,"2"); 
        JOptionPane.showMessageDialog(null,"1"); 
        JOptionPane.showMessageDialog(null,"Thanks for playing!!!");
    }//end of method transtion3 
    
    /* 
    yMaze 
    This method is the MAIN METHOD for the first game (Yousef's Maze game) 
    */  
     
    public static void yMaze(PItems obj, Scanner scanN) throws InterruptedException,  
            StringIndexOutOfBoundsException  { 
        int score=0; 
         
        //using primitive grpahics to printout messages on screen 
        JOptionPane.showMessageDialog(null,"YOUR CHARACTER IS THE O"); 
        JOptionPane.showMessageDialog(null,"USE W,A,S,D TO FIND THE CIRCLE"); 
        JOptionPane.showMessageDialog(null,"PRESS ENTER TO CONFIRM EACH MOVE"); 
        JOptionPane.showMessageDialog(null,"YOU GET ONE POINT PER LEVEL BEATEN");
        JOptionPane.showMessageDialog(null,"THERE ARE SEVEN MAZES"); 
        JOptionPane.showMessageDialog(null,"ENJOY"); 
         
        //double array for level1 a level on a grid
        //double array for level1 a level on a grid
        String [][] L1 = {{"-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|","#","#","#","#"," "," "," "," "," ","◉","|"},
                          {"|","#","#","#","#"," ","#","#","#","#","#","|"},
                          {"|","#","#","#"," "," ","#","#","#","#","#","|"},
                          {"|","#"," "," "," ","#","#","#","#"," "," ","|"},
                          {"|"," "," ","#","#","#","#","#","#","#","#","|"},
                          {"|"," ","#","#","#"," "," "," "," "," ","#","|"},
                          {"|"," "," "," "," "," ","#","#","#"," "," ","|"},
                          {"|","#","#","#","#","#","#","#","#","O","#","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        //double array for level2 
        String [][] L2 = {{"-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|"," "," "," "," "," "," "," ","#","#","#","|"},
                          {"|"," ","#","#","#","#","#","◉","#","#","#","|"},
                          {"|"," ","#","#","#","#"," ","#"," ","#","#","|"},
                          {"|"," "," ","#","#","#"," "," "," "," "," ","|"},
                          {"|","#"," ","#","#","#","#","#","#","#"," ","|"},
                          {"|","#"," "," "," "," "," "," "," "," "," ","|"},
                          {"|","#","#","#","#"," ","#","#","#","#","#","|"},
                          {"|","#","#","#","#","O","#","#","#","#","#","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        //double array for level3
        String [][] L3 = {{"-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|","◉"," "," "," "," "," ","#","#","#","#","|"},
                          {"|","#","#","#","#","#"," "," "," "," "," ","|"},
                          {"|","#"," "," "," ","#","#","#","#","#"," ","|"},
                          {"|","#"," ","#"," ","#","#","#","#","#"," ","|"},
                          {"|","#"," ","#"," "," "," "," ","#"," "," ","|"},
                          {"|"," "," "," ","#"," ","#"," ","#"," ","#","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#"," ","#","|"},
                          {"|","O"," "," ","#"," ","#"," "," "," ","#","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        //double array for level4
        String [][] L4 = {{"-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|"," "," "," "," "," "," "," "," "," "," ","|"},
                          {"|"," ","#","#","#","#","#"," ","#","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," "," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," "," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","◉","#"," ","|"},
                          {"|"," ","#","#","#"," ","#","#","#","#"," ","|"},
                          {"|"," "," "," "," "," "," "," "," "," "," ","|"},
                          {"|","#","#","#","#","O","#","#","#","#","#","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        //double arrat for level5
        String [][] L5 = {{"-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|","#"," ","#"," ","#"," "," "," "," "," ","|"},
                          {"|","#"," ","#"," ","#"," ","#","#","#"," ","|"},
                          {"|"," "," "," "," "," "," ","#","◉","#"," ","|"},
                          {"|"," ","#","#"," ","#","#","#"," ","#"," ","|"},
                          {"|"," ","#","#"," ","#","#","#"," ","#"," ","|"},
                          {"|"," ","#","#"," ","#"," "," "," ","#"," ","|"},
                          {"|"," ","#","#"," ","#"," ","#","#","#"," ","|"},
                          {"|","O"," "," "," ","#"," "," "," "," "," ","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        //double array for level6
        String [][] L6 = {{"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","|"},
                          {"|"," ","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"," ","|"},
                          {"|"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","|"},
                          {"|"," ","#"," ","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#","#","#","#","#","#","#","#","#","#","#","#","#","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#","#","#","#","#","#","#","#","#","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#"," ","#","#","#","#","#","#"," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#"," ","#","◉"," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#"," ","#","#","#","#"," ","#"," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#"," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," ","#","#","#","#","#","#","#","#"," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," ","#","#","#","#","#","#","#","#","#","#","#","#"," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," ","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"," ","#"," ","#"," ","|"},
                          {"|"," ","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"," ","|"},
                          {"|"," ","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"," ","#"," ","|"},
                          {"|"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","O","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        //double array for level7
        String [][] L7 = {{"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
                          {"|"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#","#","#","|"},
                          {"|"," ","#","#","#","#","#","#","#","#","#","#"," ","#","#","#","#"," ","#"," "," "," ","#","#","#","|"},
                          {"|"," "," ","#","#","#"," "," "," ","#","#","#"," ","#","#","#","#"," "," "," ","#"," ","#","#","#","|"},
                          {"|","#"," "," ","#","#"," ","#"," "," "," "," "," ","#","#","#","#","#","#","#","#"," ","#","#","#","|"},
                          {"|","#","#"," "," ","#"," ","#","#","#","#","#"," ","#","#","#","#","#","#","#","#"," ","#","#","#","|"},
                          {"|","#","#","#"," "," ","#","#","#","#","#","#"," ","#","#"," "," ","#","#","#","#"," ","#","#","#","|"},
                          {"|","#","#","#","#"," "," ","#","#","#","#","#"," ","#","#","#"," ","#","#","#"," "," ","#","#","#","|"},
                          {"|","#","#","#","#","#"," "," ","#","#","#","#"," ","#","#","#"," ","#","#","#"," ","#","#","#","#","|"},
                          {"|","#","#","#","#","#","#"," "," ","#","#","#"," ","#","#","#"," ","#","#","#"," "," ","#","#","#","|"},
                          {"|"," "," "," "," "," "," "," "," "," ","#"," ","O"," "," "," "," ","#","#","#","#"," "," ","#","#","|"},
                          {"|"," ","#"," ","#","#","#","#","#"," ","#","#"," ","#","#","#"," "," ","#","#","#","#"," "," ","#","|"},
                          {"|"," ","#"," ","#","#","#","#","#"," ","#","#"," ","#","#","#","#"," "," ","#","#","#","#"," "," ","|"},
                          {"|"," ","#"," ","#","#","#","#","#"," ","#","#"," ","#","#","#","#","#"," "," ","#","#","#","#"," ","|"},
                          {"|"," ","#"," ","#","#"," "," "," "," ","#","#"," ","#","#","#","#","#","#"," ","#","#","#","#"," ","|"},
                          {"|"," ","#","#","#","#"," ","#","#","#","#","#"," ","#","#","#","#","#","#"," ","#"," "," "," "," ","|"},
                          {"|"," "," "," ","#","#"," ","#"," "," "," ","#"," ","#","#","#","#","#"," "," ","#"," ","#","#"," ","|"},
                          {"|","#"," "," "," "," "," ","#"," ","#","#","#"," ","#","#","#","#"," "," ","#","#"," "," ","#"," ","|"},
                          {"|","#","#"," ","#","#","#","#"," ","#","#","#"," ","#","#","#"," "," ","#","#","#","#"," ","#"," ","|"},
                          {"|","#","#"," ","#","#","#","#"," ","#","#","#"," ","#","#"," "," ","#","#","#","#","#","◉","#"," ","|"},
                          {"|","#","#"," ","#","#","#","#"," ","#","#","#"," ","#"," "," ","#","#","#","#","#","#","#","#"," ","|"},
                          {"|","#","#"," "," "," "," "," "," ","#","#","#"," "," "," ","#"," "," "," "," "," "," "," "," "," ","|"},
                          {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"}};
        
        score = level1(L1,score,scanN);//method for the algorithm for level1 and returns score 
        score = level2(L2,score,scanN);//method for the algorithm for level2 and returns score 
        score = level3(L3,score,scanN);//method for the algorithm for level3 and returns score 
        score = level4(L4,score,scanN);//method for the algorithm for level4 and returns score 
        score = level5(L5,score,scanN);//method for the algorithm for level5 and returns score 
        score = level6(L6,score,scanN);//method for the algorithm for level6 and returns score       
        score = level7(L7,score,scanN);//method for the algorithm for level7 and returns score 
         
        obj.addScore(score);
        
        //Display current score after game 1
        System.out.println("\nCongrats! You beat Y's Maze.\n"
                + "Your current score is " + obj.getScore());
        //Pause before transition1 
        Thread.sleep(3000); 
       
    }//end of yMaze 
     
    /* 
    level1 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L1 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */ 
     
    public static int level1(String [][] L1, int score, Scanner scanN){   
        char move = ' ';// intiliazed char variable 
        String hold;//holds the spot when changing spots  
        int y = 8,x = 9;//starting coordinate of the on this specific level 
        boolean flag = false;//flag to check if the user inputted WASD or not  
        boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
         
        System.out.println("\n\nUse W,A,S,D to play");     
        for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L1[rows][colm]); 
            } 
            System.out.println(); 
            } 
        do { 
            do{ 
                while(cflag) 
                { 
                    try{//error handles a blank char input 
                        move = scanN.nextLine().charAt(0); 
                        cflag = false; 
                    } 
                    catch(StringIndexOutOfBoundsException e) 
                    { 
                        System.out.println("Error - you did not type anything."); 
                        cflag = true; 
                    } 
                } 
                //if user inputs wasd then it will exit loop 
                    if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                        flag = false; 
                    } 
                    //if user doesnt input wasd then it will loop 
                else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
             
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L1[y-1][x].equals("#")||L1[y-1][x].equals("|")||L1[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                hold = L1[y][x]; 
                L1[y][x] = L1[y-1][x]; 
                L1[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L1[y][x+1].equals("#")||L1[y][x+1].equals("|")||L1[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L1[y][x+1].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end of stage 1!!!"); 
                    return score; 
                }  
                hold = L1[y][x]; 
                L1[y][x] = L1[y][x+1]; 
                L1[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L1[y][x-1].equals("#")||L1[y][x-1].equals("|")||L1[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                hold = L1[y][x]; 
                L1[y][x] = L1[y][x-1]; 
                L1[y][x-1] = hold;  
                x-=1; 
                } 
            //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L1[y+1][x].equals("#")||L1[y+1][x].equals("|")||L1[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                }    
                hold = L1[y][x]; 
                L1[y][x] = L1[y+1][x]; 
                L1[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L1[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//end of level 1   
  
    /* 
    level2 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L2 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */  
     
    public static int level2(String [][] L2, int score, Scanner scanN){
        char move = ' ';// intiliazed char variable 
        String hold;//holds the spot when changing spots  
        int y = 8,x = 5;//starting coordinate of the on this specific level 
        boolean flag = false;//flag to check if the user inputted WASD or not  
        boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
         
        System.out.println("\nUse W,A,S,D to play\n");     
        for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L2[rows][colm]); 
            } 
            System.out.println(); 
            }    
        do { 
            do{ 
                while(cflag) 
                { 
                    try{//error handles a blank char input 
                        move = scanN.nextLine().charAt(0); 
                        cflag = false; 
                    } 
                catch(StringIndexOutOfBoundsException e) 
                { 
                    System.out.println("Error - you did not type anything."); 
                    cflag = true; 
                } 
            } 
                //if user inputs wasd then it will exit loop 
                if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                    flag = false; 
                } 
                //if user doesnt input wasd then it will loop 
            else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
         
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L2[y-1][x].equals("#")||L2[y-1][x].equals("|")||L2[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                }  
                hold = L2[y][x]; 
                L2[y][x] = L2[y-1][x]; 
                L2[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L2[y][x+1].equals("#")||L2[y][x+1].equals("|")||L2[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                hold = L2[y][x]; 
                L2[y][x] = L2[y][x+1]; 
                L2[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L2[y][x-1].equals("#")||L2[y][x-1].equals("|")||L2[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L2[y][x]; 
                L2[y][x] = L2[y][x-1]; 
                L2[y][x-1] = hold;  
                x-=1; 
                } 
            //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L2[y+1][x].equals("#")||L2[y+1][x].equals("|")||L2[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L2[y+1][x].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end of stage 2!!!"); 
                    return score; 
                }     
                hold = L2[y][x]; 
                L2[y][x] = L2[y+1][x]; 
                L2[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L2[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//end of level 2 
        
    /* 
    level3 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L3 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */ 
     
        public static int level3(String [][] L3, int score, Scanner scanN){ 
        char move = ' ';// intiliazed char variable 
        String hold;//holds the spot when changing spots  
        int y = 8,x = 1;//starting coordinate of the on this specific level 
        boolean flag = false;//flag to check if the user inputted WASD or not  
        boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
         
        System.out.println("Use W,A,S,D to play");     
        for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L3[rows][colm]); 
            } 
            System.out.println(); 
        } 
        do { 
            do{ 
                while(cflag) 
                { 
                    try{//error handles a blank char inout 
                        move = scanN.nextLine().charAt(0); 
                        cflag = false; 
                    } 
                catch(StringIndexOutOfBoundsException e) 
                { 
                    System.out.println("Error - you did not type anything."); 
                    cflag = true; 
                } 
            } 
                //if user inputs wasd then it will exit loop 
                if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                    flag = false; 
               } 
                //if user doesnt input wasd then it will loop 
            else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
         
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L3[y-1][x].equals("#")||L3[y-1][x].equals("|")||L3[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L3[y][x]; 
                L3[y][x] = L3[y-1][x]; 
                L3[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L3[y][x+1].equals("#")||L3[y][x+1].equals("|")||L3[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L3[y][x]; 
                L3[y][x] = L3[y][x+1]; 
                L3[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L3[y][x-1].equals("#")||L3[y][x-1].equals("|")||L3[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L3[y][x-1].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end of stage 3!!!"); 
                    return score; 
                } 
                hold = L3[y][x]; 
                L3[y][x] = L3[y][x-1]; 
                L3[y][x-1] = hold;  
                x-=1; 
                } 
            //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L3[y+1][x].equals("#")||L3[y+1][x].equals("|")||L3[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
     
                hold = L3[y][x]; 
                L3[y][x] = L3[y+1][x]; 
                L3[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L3[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//end of level 3 
         
    /* 
    level4 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L4 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */  
            
    public static int level4(String [][] L4, int score, Scanner scanN){ 
    char move = ' ';// intiliazed char variable 
    String hold;//holds the spot when changing spots  
    int y = 8,x = 5;//starting coordinate of the on this specific level 
    boolean flag = false;//flag to check if the user inputted WASD or not  
    boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
         
        System.out.println("Use W,A,S,D to play");     
            for (int rows = 0; rows < 10; rows++) { 
                for (int colm = 0; colm < 12; colm++) { 
                    System.out.print(L4[rows][colm]); 
                } 
            System.out.println(); 
            } 
        do { 
            do{ 
                while(cflag) 
                { 
                    try{//error handles a blank char inout 
                        move = scanN.nextLine().charAt(0); 
                        cflag = false; 
                    } 
                catch(StringIndexOutOfBoundsException e) 
                { 
                    System.out.println("Error - you did not type anything."); 
                    cflag = true; 
                } 
            } 
                //if user inputs wasd then it will exit loop 
                if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                    flag = false; 
               } 
                //if user doesnt input wasd then it will loop 
            else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
             
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L4[y-1][x].equals("#")||L4[y-1][x].equals("|")||L4[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L4[y][x]; 
                L4[y][x] = L4[y-1][x]; 
                L4[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L4[y][x+1].equals("#")||L4[y][x+1].equals("|")||L4[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L4[y][x+1].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end stage 4!!!"); 
                    return score; 
                } 
                hold = L4[y][x]; 
                L4[y][x] = L4[y][x+1]; 
                L4[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L4[y][x-1].equals("#")||L4[y][x-1].equals("|")||L4[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L4[y][x]; 
                L4[y][x] = L4[y][x-1]; 
                L4[y][x-1] = hold;  
                x-=1; 
                } 
            //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L4[y+1][x].equals("#")||L4[y+1][x].equals("|")||L4[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L4[y+1][x].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end stage 4!!!"); 
                    return score; 
                }     
                hold = L4[y][x]; 
                L4[y][x] = L4[y+1][x]; 
                L4[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L4[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//end of level4 
      
    /* 
    level5 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L5 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */   
  
    public static int level5(String [][] L5, int score, Scanner scanN){  
    char move = ' ';// intiliazed char variable 
    String hold;//holds the spot when changing spots  
    int y = 8,x = 1;//starting coordinate of the on this specific level 
    boolean flag = false;//flag to check if the user inputted WASD or not  
    boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
         
        System.out.println("Use W,A,S,D to play");     
        for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L5[rows][colm]); 
            } 
            System.out.println(); 
            } 
        do { 
            do{ 
                while(cflag) 
            { 
                try{//error handles a blank char inout 
                    move = scanN.nextLine().charAt(0); 
                    cflag = false; 
                } 
                catch(StringIndexOutOfBoundsException e) 
                { 
                    System.out.println("Error - you did not type anything."); 
                    cflag = true; 
                } 
            } 
                //if user inputs wasd then it will exit loop 
                if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                    flag = false; 
               } 
                //if user doesnt input wasd then it will loop 
            else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
         
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L5[y-1][x].equals("#")||L5[y-1][x].equals("|")||L5[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L5[y-1][x].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end of stage 5!!!"); 
                    return score; 
                } 
                hold = L5[y][x]; 
                L5[y][x] = L5[y-1][x]; 
                L5[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L5[y][x+1].equals("#")||L5[y][x+1].equals("|")||L5[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                 
                hold = L5[y][x]; 
                L5[y][x] = L5[y][x+1]; 
                L5[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L5[y][x-1].equals("#")||L5[y][x-1].equals("|")||L5[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L5[y][x]; 
                L5[y][x] = L5[y][x-1]; 
                L5[y][x-1] = hold;  
                x-=1; 
                } 
            //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L5[y+1][x].equals("#")||L5[y+1][x].equals("|")||L5[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
    
                hold = L5[y][x]; 
                L5[y][x] = L5[y+1][x]; 
                L5[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 10; rows++) { 
            for (int colm = 0; colm < 12; colm++) { 
                System.out.print(L5[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//level5 
     
    /* 
    level6 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L6 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */ 
     
    public static int level6(String [][] L6, int score, Scanner scanN){ 
    char move = ' ';// intiliazed char variable 
    String hold;//holds the spot when changing spots  
    int y = 21,x = 24;//starting coordinate of the on this specific level 
    boolean flag = false;//flag to check if the user inputted WASD or not  
    boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
         
        System.out.println("Use W,A,S,D to play");     
        for (int rows = 0; rows < 23; rows++) { 
            for (int colm = 0; colm < 26; colm++) { 
                System.out.print(L6[rows][colm]); 
            } 
            System.out.println(); 
        } 
        do { 
            do{ 
                while(cflag) 
                { 
                    try{//error handles a blank char inout 
                        move = scanN.nextLine().charAt(0); 
                        cflag = false; 
                    } 
                catch(StringIndexOutOfBoundsException e) 
                { 
                    System.out.println("Error - you did not type anything."); 
                    cflag = true; 
                } 
            } 
                //if user inputs wasd then it will exit loop 
                if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                    flag = false; 
               } 
                //if user doesnt input wasd then it will loop 
            else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
             
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L6[y-1][x].equals("#")||L6[y-1][x].equals("|")||L6[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L6[y][x]; 
                L6[y][x] = L6[y-1][x]; 
                L6[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L6[y][x+1].equals("#")||L6[y][x+1].equals("|")||L6[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L6[y][x]; 
                L6[y][x] = L6[y][x+1]; 
                L6[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L6[y][x-1].equals("#")||L6[y][x-1].equals("|")||L6[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L6[y][x-1].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end of stage 6!!!"); 
                    return score; 
                } 
                hold = L6[y][x]; 
                L6[y][x] = L6[y][x-1]; 
                L6[y][x-1] = hold;  
                x-=1; 
                } 
                //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L6[y+1][x].equals("#")||L6[y+1][x].equals("|")||L6[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
     
                hold = L6[y][x]; 
                L6[y][x] = L6[y+1][x]; 
                L6[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 23; rows++) { 
            for (int colm = 0; colm < 26; colm++) { 
                System.out.print(L6[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//End of level6 
     
    /* 
    level7 
    this method has the algorithm for a continous movement and updating level per movement 
    @param L7 a double array that contains the terrain of the level 
    @param score adds points to score per level finished  
    @param scanN
    @return score points are returned and saved to score for each level 
    */  
  
    public static int level7(String [][] L7, int score, Scanner scanN){ 
    char move = ' ';// intiliazed char variable 
    String hold;//holds the spot when changing spots  
    int y = 10,x = 12;//starting coordinate of the on this specific level 
    boolean flag = false;//flag to check if the user inputted WASD or not  
    boolean cflag = true;//cflag is used in try and catch to make sure that the char variable would repeat when its a blank 
  
        System.out.println("Use W,A,S,D to play");     
        for (int rows = 0; rows < 23; rows++) { 
            for (int colm = 0; colm < 26; colm++) { 
                System.out.print(L7[rows][colm]); 
            }    
            System.out.println(); 
        } 
        do { 
            do{ 
                while(cflag) 
                { 
                    try{//error handles a blank char inout 
                        move = scanN.nextLine().charAt(0); 
                        cflag = false; 
                    } 
                catch(StringIndexOutOfBoundsException e) 
                { 
                    System.out.println("Error - you did not type anything."); 
                    cflag = true; 
                } 
            } 
                //if user inputs wasd then it will exit loop 
                if(move == 'w' || move == 'a'  || move == 's' || move == 'd'){ 
                    flag = false; 
               } 
                //if user doesnt input wasd then it will loop 
            else{ 
                    System.out.println("invalid move! please type W,A,S,D"); 
                    flag = true; 
                } 
                cflag = true; 
            }while(flag); 
             
            //if user input w the position of the user will change with the space above it  
            if(move==('w')){ 
                if(L7[y-1][x].equals("#")||L7[y-1][x].equals("|")||L7[y-1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L7[y][x]; 
                L7[y][x] = L7[y-1][x]; 
                L7[y-1][x] = hold;  
                y-=1; 
                } 
            //if the user input d the users position will change with the blank to the right 
            if(move==('d')){ 
                if(L7[y][x+1].equals("#")||L7[y][x+1].equals("|")||L7[y][x+1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L7[y][x]; 
                L7[y][x] = L7[y][x+1]; 
                L7[y][x+1] = hold;  
                x+=1; 
                } 
            //if the user inputs a then the users position will change with the blank to the left 
            if(move==('a')){ 
                if(L7[y][x-1].equals("#")||L7[y][x-1].equals("|")||L7[y][x-1].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
  
                hold = L7[y][x]; 
                L7[y][x] = L7[y][x-1]; 
                L7[y][x-1] = hold;  
                x-=1; 
                } 
            //if user inputs s then the position of the user will change with the blank below it  
            if(move==('s')){ 
                 
                if(L7[y+1][x].equals("#")||L7[y+1][x].equals("|")||L7[y+1][x].equals("-")){ 
                    System.out.println("Cannot move!!! There is a wall"); 
                    continue; 
                } 
                //if user hit checkpoint it will return the score and exit method  
                else if(L7[y+1][x].equals("◉")){ 
                    score++; 
                    JOptionPane.showMessageDialog(null,"You reached the end of stage 7!!!"); 
                    return score;  
                } 
  
                hold = L7[y][x]; 
                L7[y][x] = L7[y+1][x]; 
                L7[y+1][x] = hold;  
                y+=1; 
                } 
            //prints level after every move 
                for (int rows = 0; rows < 23; rows++) { 
            for (int colm = 0; colm < 26; colm++) { 
                System.out.print(L7[rows][colm]); 
            } 
            System.out.println(); 
        }          
    } while (true);  
    }//End of level7  
     
    //END OF GAME 1 CODE 
       
    /* 
    sMatch 
    This method is the MAIN METHOD for the second game (Steven's Matching  
    Typing game) 
    */  
     
    public static void sMatch(PItems obj, Scanner scanS, Random r) 
            throws InterruptedException, IOException { 
        //Intro 
        JOptionPane.showMessageDialog(null,"YOU WILL BE FACED AGAINST 10" 
                + " BOSSES"); 
        JOptionPane.showMessageDialog(null,"THREE FAILS AND YOU LOSE :)"); 
        JOptionPane.showMessageDialog(null,"EASY: Level 1-3\nMEDIUM: Level " 
                + "4-6\nHARD: Level 7-9\nULTRA: Level 10"); 
        JOptionPane.showMessageDialog(null,"MATCH THE WRITING ON THE SCREEN "
                + "BEFORE TIME RUNS OUT!"); 
        JOptionPane.showMessageDialog(null,"YOU GET ONE POINT PER LEVEL BEATEN");
        JOptionPane.showMessageDialog(null,"ENJOY"); 
         
        //Starting pause 3 Seconds 
        Thread.sleep(3000); 
         
        //Ctr Variable 
        int ctr = 0; 
        //Failure variable 
        int fail = 0 ; 
         
        //LEVEL ONE-THREE time limit variable  
        int time1 = 12;  
         
        //Dowhile user does not fail 3 levels 
        do { 
             
        //Message to User 
        JOptionPane.showMessageDialog(null,"Lets start off easy..."); 
        JOptionPane.showMessageDialog(null,"Levels 1-3 are the \"Easy\" " 
                + "levels."); 
        JOptionPane.showMessageDialog(null,"They are: Preset words\nIts a " 
                + "warmup ;)"); 
         
        //Pause for level one 
        Thread.sleep(3000); 
         
        //LEVEL ONE   
        long start1 = System.currentTimeMillis();          
        int n = levelOne(scanS);          
        long end1 = System.currentTimeMillis();          
        double duration1 = (end1-start1)/1000;  
        //LEVEL ONE failures  
        fail = failures(duration1,time1,n,fail);  
        ctr++; 
        //Display how many chances left 
        System.out.println("You can fail " + (3-fail) + " more level/s"); 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //LEVEL TWO  
        long start2 = System.currentTimeMillis();          
        n = levelTwo(scanS);          
        long end2 = System.currentTimeMillis();  
        double duration2 = (end2-start2)/1000;  
        //LEVEL TWO failures  
        fail = failures(duration2,time1,n,fail);  
        ctr++;  
        //Display how many chances left 
        System.out.println("You can fail " + (3-fail) + " more level/s"); 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //LEVEL THREE 
        long start3 = System.currentTimeMillis(); 
        n = levelThree(scanS); 
        long end3 = System.currentTimeMillis(); 
        double duration3 = (end3-start3)/1000; 
        //LEVEL THREE failures 
        fail = failures(duration3,time1,n,fail); 
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check 
        ctr++; 
  
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //END OF EASIER LEVELS 
         
        //Message to User 
        JOptionPane.showMessageDialog(null,"You passed the easy levels!" 
                 +  "\nLets tone it up a notch."); 
        JOptionPane.showMessageDialog(null,"Levels 4-6 are the \"Medium\" " 
                + "levels."); 
        JOptionPane.showMessageDialog(null,"They are: RANDOMIZED LETTERS " 
                + "\nRead carefully ;)"); 
         
        //Pause for 3 seconds 
        Thread.sleep(3000); 
         
        //LEVEL FOUR-SIX time limit variable  
        int time2 = 10;  
         
        //LEVEL FOUR 
        long start4 = System.currentTimeMillis(); 
        n = levelFour(scanS,r); 
        long end4 = System.currentTimeMillis(); 
        double duration4 = (end4-start4)/1000; 
        //LEVEL FOUR failures 
        fail = failures(duration4,time2,n,fail); 
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check 
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //LEVEL FIVE 
        long start5 = System.currentTimeMillis(); 
        n = levelFive(scanS,r); 
        long end5 = System.currentTimeMillis(); 
        double duration5 = (end5-start5)/1000; 
        //LEVEL FIVE failures 
        fail = failures(duration5,time2,n,fail);    
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check 
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //LEVEL SIX 
        long start6 = System.currentTimeMillis(); 
        n = levelSix(scanS,r); 
        long end6 = System.currentTimeMillis(); 
        double duration6 = (end6-start6)/1000; 
        //LEVEL SIX failures 
        fail = failures(duration6,time2,n,fail); 
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check 
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //END OF MEDIUM LEVELS 
  
        //Message to User 
        JOptionPane.showMessageDialog(null,"You passed the medium levels!" 
                 +  "\nTime to get intense..."); 
        JOptionPane.showMessageDialog(null,"Levels 7-9 are the \"Hard\" " 
                + "levels."); 
        JOptionPane.showMessageDialog(null,"They are: RANDOMIZED SYMBOLS " 
                + "\nHold that shift button!"); 
         
        //Pause for 3 seconds 
        Thread.sleep(3000); 
         
        //LEVEL FOUR-SIX time limit variable  
        int time3 = 8;  
         
        //LEVEL SEVEN 
        long start7 = System.currentTimeMillis(); 
        n = levelSeven(scanS,r); 
        long end7 = System.currentTimeMillis(); 
        double duration7 = (end7-start7)/1000; 
        //LEVEL SEVEN failures 
        fail = failures(duration7,time3,n,fail); 
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check         
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //LEVEL EIGHT 
        long start8 = System.currentTimeMillis(); 
        n = levelEight(scanS,r); 
        long end8 = System.currentTimeMillis(); 
        double duration8 = (end8-start8)/1000; 
        //LEVEL EIGHT failures 
        fail = failures(duration8,time3,n,fail); 
        //Check if 3 failures 
        if(fail>=3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check         
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //LEVEL NINE 
        long start9 = System.currentTimeMillis(); 
        n = levelNine(scanS,r); 
        long end9 = System.currentTimeMillis(); 
        double duration9 = (end9-start9)/1000; 
        //LEVEL NINE failures 
        fail = failures(duration9,time3,n,fail); 
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        else if(fail<3) { 
            System.out.println("You can fail " + (3-fail) + " more level/s"); 
        }//End of check     
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //END OF HARD LEVELS 
  
        //Message to User 
        JOptionPane.showMessageDialog(null,"Wow, you made it this far? " 
                + "Im suprised."); 
        JOptionPane.showMessageDialog(null,"Level 10 is: EVERYTHING " 
                + "COMBINED"); 
        JOptionPane.showMessageDialog(null,"Beat this, you win.\nGood luck!"); 
             
        //Pause for 3 seconds 
        Thread.sleep(3000); 
         
        //LEVEL TEN 
        long start10 = System.currentTimeMillis(); 
        n = levelTen(scanS,r); 
        long end10 = System.currentTimeMillis(); 
        double duration10 = (end10-start10)/1000; 
        //LEVEL TEN failures 
        fail = endGame(duration10,time2,n,fail); 
        //Check if 3 failures 
        if(fail==3) { 
            break; 
        } 
        ctr++; 
         
        //Pause for 3.5 seconds 
        Thread.sleep(3500); 
         
        //END OF FINAL LEVEL 
         
        //While user has less than 3 errors 
        }while(ctr<10); 
         
        //Score count 
        obj.addScore(10 - fail); 
         
        if(fail==3) { 
            System.out.println("\nYou Lost the Typing game!");
            lose(obj);
        } 
        else { 
            System.out.print("You Won! Congrats! Your score so far is " 
                    + obj.getScore()); 
        } 
         
        //Pause before transition dialogue 
        Thread.sleep(3000); 
        
        }//End of sMatch 
         
    /* 
    failures 
    This method calculates and displays to the user their progress in the levels 
    and also keeps track of the amount of failures they have. They can have a  
    max of 3 failures before they lose the game. 
    @param d : Keeps track of duration user took to complete the level 
    @param t : Keeps track of the time they user has to complete the level 
    @param n : Has a value of 0 or 1 to determine if the user has passed the  
    level 
    @param f : Counter for current number of failures 
    @return f: Return failures to main to determine if the loop should be exited 
    */  
         
    public static int failures(double d, int t, int n, int f) {  
         
        //Display time user took to finish level 
        System.out.println("Took " + d + " second/s");  
         
        //If statement to see if user beat the level 
        if(d>t) {  
            System.out.println("You DID NOT beat the timer!");  
            f++;  
            System.out.println("Failures = " + f);  
        }//End of if  
        else if(n==0) {  
            f++;             
            System.out.println("Failures = " + f);  
        }//End of else if  
        else {  
            System.out.println("You beat the timer!");  
        }//End of else  
         
        //If statement to allow user to keep playing 
        if(f!=3) { 
            System.out.println("Proceed to next level..."); 
        } 
        return f; 
    }//End of method failures  
     
    /* 
    matching 
    this method checks if what the user entered is the same as the boss 
    @param b: String for boss of the current level 
    @param a: String for user answer for the current level 
    @return 1 or 0 to level method: 1 if user matched boss, 0 if user did not  
    match boss 
    */  
     
    public static int matching(String b, String a) {  
        //If ans = boss  
        if(a.equals(b)) {  
            System.out.println("\nCongrats! You matched: " + b);  
            //Represents correct answer value  
            return 1;  
        }//End of if  
        else {  
            System.out.println("\nWrong Answer!!!");  
            //Represents wrong answer value  
            return 0;  
        }//End of else  
    }//End of method matching 
     
    /* 
    levelOne 
    This method displays the preset String the user must match, and prompts the 
    user to enter their answer. 
    @param scanS
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelOne(Scanner scanS) {  
        //Title  
        System.out.println("\n\n\tL E V E L  O N E\n");  
        //Variable for Level One Boss  
        String boss1 = "HelLo";  
        //Variable for user answer  
        String ans1;  
        //Prompt for level one  
        System.out.println("You have 12 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss1);  
        ans1 = scanS.nextLine();  
          
        //If ans = boss  
        int n = matching(boss1,ans1);  
        return n;  
    }//End of levelOne  
     
    /* 
    levelTwo 
    This method displays the preset String the user must match, and prompts the 
    user to enter their answer. 
    @param scanS
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelTwo(Scanner scanS) {  
        //Title  
        System.out.println("\n\n\tL E V E L  T W O\n");  
          
        //Variable for Level Two Boss  
        String boss2 = "E X C A L I B U R";  
        //Variable for user answer  
        String ans2;  
          
        //Prompt for level two  
        System.out.println("You have 12 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss2);  
        ans2 = scanS.nextLine();  
          
        int n = matching(boss2,ans2);  
        return n;  
    }//End of levelTwo  
     
    /* 
    levelThree 
    This method displays the preset String the user must match, and prompts the 
    user to enter their answer. 
    @param scanS
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelThree(Scanner scanS) {  
        //Title  
        System.out.println("\n\n\tL E V E L  T H R E E\n");  
          
        //Variable for Level Three Boss  
        String boss3 = "How much wood can a wood chuck chuck?";  
        //Variable for user answer  
        String ans3;  
          
        //Prompt for level Three  
        System.out.println("You have 12 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss3);  
        ans3 = scanS.nextLine();  
          
        int n = matching(boss3,ans3);  
        return n;  
    }//End of levelThree  
     
    /* 
    levelFour 
    This method randomly generates a String of 8 letters the user must match,  
    and prompts the user to enter their answer. 
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelFour(Scanner scanS,Random r) { 
        //Initiallize variables 
        int length = 8; 
        char data = ' '; 
        String boss4 = ""; 
         
        //Generate random String as boss 
        for (int i=0; i<=length; i++) { 
            data = (char)(r.nextInt(25)+97); 
            boss4 = data + boss4; 
        }//End of for loop 
         
        //Title  
        System.out.println("\n\n\tL E V E L  F O U R\n");  
          
        //Variable for user answer  
        String ans4;  
          
        //Prompt for level Four  
        System.out.println("You have 10 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss4);  
        ans4 = scanS.nextLine();  
          
        int n = matching(boss4,ans4);  
        return n;      
    }//End of levelFour 
     
    /* 
    levelFive 
    This method randomly generates a String of 10 letters the user must match,  
    and prompts the user to enter their answer. 
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelFive(Scanner scanS, Random r) { 
        //Initiallize variables 
        int length = 10; 
        char data = ' '; 
        String boss5 = ""; 
         
        //Generate random String as boss 
        for (int i=0; i<=length; i++) { 
            data = (char)(r.nextInt(25)+97); 
            boss5 = data + boss5; 
        }//End of for loop 
         
        //Title  
        System.out.println("\n\n\tL E V E L  F I V E\n");  
          
        //Variable for user answer  
        String ans5;  
          
        //Prompt for level Five  
        System.out.println("You have 10 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss5);  
        ans5 = scanS.nextLine();  
          
        int n = matching(boss5,ans5);  
        return n;      
    }//End of levelFive 
     
    /* 
    levelSix 
    This method randomly generates a String of 12 letters the user must match,  
    and prompts the user to enter their answer. 
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelSix(Scanner scanS, Random r) { 
        //Initiallize variables 
        int length = 12; 
        char data = ' '; 
        String boss6 = ""; 
         
        //Generate random String as boss 
        for (int i=0; i<=length; i++) { 
            data = (char)(r.nextInt(25)+ 97); 
            boss6 += data; 
        }//End of for loop 
         
        //Title  
        System.out.println("\n\n\tL E V E L  S I X\n");  
          
        //Variable for user answer  
        String ans6;  
          
        //Prompt for level Six  
        System.out.println("You have 10 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss6);  
        ans6 = scanS.nextLine();  
          
        int n = matching(boss6,ans6);  
        return n;      
    }//End of levelSix 
     
    /* 
    levelSeven 
    This method randomly generates a String of 3 symbols the user must match,  
    and prompts the user to enter their answer. 
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */  
         
    public static int levelSeven(Scanner scanS, Random r) { 
        //Initiallize variables 
        String rand = "!@#$%^&*()-_=+"; 
        String boss7 = ""; 
         
        //Generate random String as boss 
        for (int i = 0; i < 3; i++) { 
            char c = rand.charAt(r.nextInt(14));     
            boss7 += c; 
        }  
        //Title  
        System.out.println("\n\n\tL E V E L  S E V E N\n");  
          
        //Variable for user answer  
        String ans7;  
          
        //Prompt for level Seven 
        System.out.println("You have 8 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss7);  
        ans7 = scanS.nextLine();  
          
        int n = matching(boss7,ans7);  
        return n;      
    }//End of levelSeven 
         
    /* 
    levelEight 
    This method randomly generates a String of 5 symbols the user must match,  
    and prompts the user to enter their answer.
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */  
     
    public static int levelEight(Scanner scanS, Random r) { 
        //Initiallize variables 
        String rand = "!@#$%^&*()-_=+"; 
        String boss8 = ""; 
         
        //Generate random String as boss 
        for (int i = 0; i < 5; i++) { 
            char c = rand.charAt(r.nextInt(14));     
            boss8 += c; 
        }  
        //Title  
        System.out.println("\n\n\tL E V E L  E I G H T\n");  
          
        //Variable for user answer  
        String ans8;  
          
        //Prompt for level Eight 
        System.out.println("You have 8 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss8);  
        ans8 = scanS.nextLine();  
          
        int n = matching(boss8,ans8);  
        return n;      
    }//End of levelEight 
         
    /* 
    levelNine 
    This method randomly generates a String of 7 symbols the user must match,  
    and prompts the user to enter their answer. 
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */      
     
    public static int levelNine(Scanner scanS, Random r) {   
        //Initiallize variables 
        String rand = "!@#$%^&*()-_=+"; 
        String boss9 = ""; 
         
        //Generate random String as boss 
        for (int i = 0; i < 7; i++) { 
            char c = rand.charAt(r.nextInt(14));     
            boss9 += c; 
        }  
        //Title  
        System.out.println("\n\n\tL E V E L  N I N E\n");  
          
        //Variable for user answer  
        String ans9;  
          
        //Prompt for level Nine 
        System.out.println("You have 8 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss9);  
        ans9 = scanS.nextLine();  
          
        int n = matching(boss9,ans9);  
        return n;      
    }//End of levelNine 
         
    /* 
    levelTen 
    This method creates a String of preset words, symbols, uppercase  
    and lowercase that the user must match,  
    and prompts the user to enter their answer. 
    @param scanS
    @param r
    @return n: returns n value from matching method to main. 
    */  
         
    public static int levelTen(Scanner scanS, Random r) { 
        //Initiallize variables 
        String rand = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!" 
                + "@#$%^&*()-_=+"; 
        String boss10 = "ThIs Is EasY: "; 
         
        //Generate random String as boss 
        for (int i = 0; i < 5; i++) { 
            char c = rand.charAt(r.nextInt(64));     
            boss10 += c; 
        }  
        //Title  
        System.out.println("\n\n\tL E V E L  T E N\n");  
          
        //Variable for user answer  
        String ans10;  
          
        //Prompt for level Ten 
        System.out.println("You have 10 seconds! Match the following "  
                + "(Case Sensitive)\n\n\t\t" + boss10);  
        ans10 = scanS.nextLine();  
          
        int n = matching(boss10,ans10);  
        return n;      
    }//End of levelTen 
         
    /* 
    endGame 
    Similar to the failure method, this method is strictly for the last level. 
    Displays dialogue that relate to the last level and storyline depending on  
    if the user failed or passed the last level. 
    @param d : Keeps track of duration user took to complete the level 
    @param t : Keeps track of the time they user has to complete the level 
    @param n : Has a value of 0 or 1 to determine if the user has passed the  
    level 
    @param f : Counter for current number of failures 
    @return f: Return failures to main to determine if the loop should be exited 
    */  
     
    public static int endGame(double d, int t, int n, int f) { 
            System.out.println("Took " + d + " second/s");  
        if(d>t) {  
            System.out.println("You DID NOT beat the timer!");  
            f++;   
            System.out.println("Failures: " + f); 
        }//End of if  
        else if(n==0) {  
            f++;             
            System.out.println("Wrong Answer!!!");  
            System.out.println("Failures: " + f); 
        }//End of else if  
        else {  
            System.out.println("\n");  
        }//End of else  
         
        if(f==3) { 
            System.out.println("You LOST on the LAST LEVEL!"); 
        } 
        return f; 
    }//End of method endGame  
  
    //END OF GAME 2 CODE 
    
    public static void mShooter(PItems obj, Scanner scanN, Random r)
            throws InterruptedException, IOException {
        //Two-dimensional arrays that hold the grids for each of the levels
        String[][]one={{"1","2","3","4","5"},
                     {"♛"," "," "," "," "},
                     {"⚫","⚫","⚫","⚫","⚫",},
                     {" "," "," "," "," "},
                     {"⬆"," "," "," "," "},
                     {"⚫","⚫","⚫","⚫","⚫",}};
        String[][]two={{"1","2","3","4","5","6"},
                     {"♛"," "," "," "," "," "},
                     {"⚫","⚫","⚫","⚫","⚫","⚫"},
                     {"↓"," "," "," "," "," "},
                     {" "," "," "," "," "," "},
                     {"⬆"," "," "," "," "," "},
                     {"⚫","⚫","⚫","⚫","⚫","⚫"}};
        //String variables that hold a message that will be displayed to the user
        JOptionPane.showMessageDialog(null,"M'S SHOOTER"); 
        JOptionPane.showMessageDialog(null,"INPUT NUMBERS TO HIDE IN A "
                + "DESIRED POSITION");
        JOptionPane.showMessageDialog(null,"IF YOU HIT THE COMPUTER, YOU PASS "
                + "THE LEVEL");
        JOptionPane.showMessageDialog(null,"TWO LEVELS");
        JOptionPane.showMessageDialog(null,"YOU GET 10 POINTS PER LEVEL BEATEN");
        JOptionPane.showMessageDialog(null,"ENJOY");
        
        //Calls method Level One to take the user to the first level
        Level1(one, obj, scanN,r);
        //Prints out the second message using a for loop and graphics
        JOptionPane.showMessageDialog(null,"You have completed Level One, now "
                + "onto the next level"); 
        //Calls method Level Two to take the user to the second level
        Level2(two, obj, scanN,r);
        //Prints out the third message using a for loop and graphics
        JOptionPane.showMessageDialog(null,"You have completed Level Two");
        
        //Shows current score
        System.out.println("\nCongrats! Your current score is " 
                + obj.getScore());
    }
    
    /**
    * Display
    * This method will display the two-dimensional array when it is called 
    * @param l
    */
    
    public static void Display(String[][]l){
        //Nested for loop to display the two-dimensional arrray every time this method is called
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j <l[i].length; j++) {
                System.out.print(l[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
    }//end Display
    
    /**
    * Level1
    * This method will take the user through the first level of the game
    * @param lvl1[][] - The two-dimensional array that holds the grid of the level
    * @param obj
    * @param scanN
    * @param r
    */
    public static void Level1(String[][]lvl1, PItems obj, Scanner scanN, Random r){
        //Variables
        int pos=0,cSpare=0,cPos=0,pSpare=0;
        String temp=" ";
        System.out.println("\n\nL E V E L   1\n");
        //For loop to run the first level 10 times
        for (int k = 0; k < 10; k++) {
            //Calls method display to display grid
            Display(lvl1);
            //If counter is greater than 1, the program reassigns the temp variable for the user's and computer's sprite
            if (k>0) {
                cSpare=cPos;
                pSpare=pos;
            }
            //Creates a random number between 0 and 4 and assigsn it to cPos
            cPos = r.nextInt(4);
            //Switches the computer's sprite to whatever position the random number selects
            temp=lvl1[1][cSpare];
            lvl1[1][cSpare]=lvl1[1][cPos];
            lvl1[1][cPos]=temp;
            System.out.println("--------------------------------------------");
            //Do while to error trap the user's answer
            do {
                System.out.println("Which position would you like to shoot?");
                pos=scanN.nextInt();
            } while (pos<1||pos>5);
            //Subtracts one from the user's answer to coorespond to array position
            pos-=1;
            //Switches the user's sprite to whatever position the user selects
            temp=lvl1[4][pSpare];
            lvl1[4][pSpare]=lvl1[4][pos];
            lvl1[4][pos]=temp;
            //If statement to determine whether the user hit the computer
            if (pos==cPos) {
                //Displays message to user and displays the grid
                System.out.println("You have hit the crown");
                Display(lvl1);
                //Adds score to the user's total
                obj.addScore(1);
                JOptionPane.showMessageDialog(null,"YOU HAVE FOUND A HEALTH POTION"); 
                obj.addPotion(1);
                //Breaks out of the loop once the user has won
                break;
            }
            else{
                //Displays message to user if they miss
                System.out.println("You missed!!");
            }
                
        }
    }//end Level1
    
    /**
    * Level2
    * This method will take the user through the second level of the game
    * @param lvl2[][] - The two-dimensional array that holds the grid of the level
    * @param obj
    * @param scanN
    * @param r
    * @throws java.io.IOException
    */
    
    public static void Level2(String[][]lvl2, PItems obj, Scanner scanN, Random r) 
            throws IOException{
        //Variables
        int pos=0,cSpare=0,cPos=0,pSpare=0;
        String tempC=" ",tempP=" ";
        System.out.println("\n\n\n--------------------------------------------");
        System.out.println("\n\nL E V E L   2\n");
        
        //Computer dialogue
        JOptionPane.showMessageDialog(null,"YOU HAVE 10 HEALTH POINTS"); 
        JOptionPane.showMessageDialog(null,"Every time the computer hits you, you lose 2 health points"); 
        //For loop to run the first level 10 times
        for (int k = 0; k < 15; k++) {
            //If statement to determine if the counter is 0 to display grid 
            if (k==0) {
                //Calls method display to display grid
                Display(lvl2);
            }
            //If counter is greater than 0 then it reassigns the user temp variable
            else{
                pSpare=pos;
            }
            //Creates a random number between 0 and 5 and assigsn it to cPos
            cPos = r.nextInt(6);
            //Switches the computer's sprite to whatever position the random number selects
            tempC=lvl2[1][cSpare];
            lvl2[1][cSpare]=lvl2[1][cPos];
            lvl2[1][cPos]=tempC;
            //Switches the computer's arrow sprite to whatever position the random number selects
            tempC=lvl2[3][cSpare];
            lvl2[3][cSpare]=lvl2[3][cPos];
            lvl2[3][cPos]=tempC;
            //Do while to error trap the user's answer
            do {
                System.out.println("\n\n\nUser's Turn");
                System.out.println("--------------------------------------------");
                System.out.println("Which position would you like to shoot?");
                pos=scanN.nextInt();
            } while (pos<1||pos>6);
            //Subtracts one from the user's answer to coorespond to array position
            pos-=1;
            //Switches the user's sprite to whatever position the user selects
            tempP=lvl2[5][pSpare];
            lvl2[5][pSpare]=lvl2[5][pos];
            lvl2[5][pos]=tempP;
            //Calls method display to display grid
            Display(lvl2);
            //If statement to determine whether the user hit the computer
            if (pos==cPos) {
                //Displays message to user and displays the grid
                System.out.println("You have hit the crown");
                Display(lvl2);
                //Adds score to the user's total
                obj.addScore(1);
                //Breaks out of the loop once the user has won
                break;
            }
            else{
                //Displays message to user if they miss
                System.out.println("You missed!!");
                //Reassigns the user temp variable
                pSpare=pos;
                //Do while to error trap the user's answer
                do {
                    System.out.println("Which position would you like to hide?");
                    pos=scanN.nextInt();
                } while (pos<1||pos>6);
                //Subtracts one from the user's answer to coorespond to array position
                pos-=1;
                //Switches the user's sprite to whatever position the user selects
                tempC=lvl2[5][pSpare];
                lvl2[5][pSpare]=lvl2[5][pos];
                lvl2[5][pos]=tempC;
                //Calls method cSpare to see if the computer hits the user
                cSpare=Level2C(lvl2,cPos,pos,obj,r);
            }
            
        }
    }//end Level2
    
    /**
    * Level2C
    * This method will take the user to the code that will determine if the user was hit by the computer
    * @param lvl2[][] - The two-dimensional array that holds the grid of the level
    * @param cPos - The current position of the computer's sprite
    * @param pos - The current position of the user's sprite
    * @return number - The computer's position at the end of the method
    */
    
    public static int Level2C(String[][]lvl2,int cPos,int pos, PItems obj, 
            Random r) throws IOException{
        Scanner scanS = new Scanner(System.in);
        //Variables
        String temp=" ",tempA=" ",ans;
        //Creates a random number between 0 and 5 and assigsn it to cPos
        int number = r.nextInt(5);
        //Switches the computer's sprite to whatever position the random number selects
        temp=lvl2[1][cPos];
        lvl2[1][cPos]=lvl2[1][number];
        lvl2[1][number]=temp;
        //Switches the computer's arrow sprite to whatever position the random number selects
        tempA=lvl2[3][cPos];
        lvl2[3][cPos]=lvl2[3][number];
        lvl2[3][number]=tempA;
        System.out.println("\n\n\nComputer's Turn");
        //If statement to determine whether the computer hit the user
        if (pos==number) {
            System.out.println("--------------------------------------------");
            System.out.println("The computer hit you");
            //Calls method display to display grid
            Display(lvl2);
            obj.subtractHealth(2);
            if (obj.getHPotion()>0) {
                //Do-While to error trap user's decision to use a health potion
                do {
                    System.out.println("Would you like to use your health potion? (Yes/No)");
                    ans=scanS.nextLine();
                    if(!(ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("No"))) {
                        System.out.println("Please enter \"yes\", or \"no\"");
                    }
                } while (!(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("no")));
                //If the user answers yes then there health goes up by 4
                if (ans.equalsIgnoreCase("yes")) {
                    obj.addHealth(4);
                    obj.subtractPotion(1);
                }
            }
            //If user runs out of health then they die
            if (obj.getHealth()<=0) {
                System.out.println("You have lost all your lives, you are dead");
                lose(obj);
            }
            return number;
        }
        else{
            System.out.println("--------------------------------------------");
            System.out.println("The computer missed");
            //Calls method display to display grid
            Display(lvl2);
            return number;
        }
    }//end Level2C
    
    //END OF GAME 3
    
    /*
    * files
    * This method will create a file and read scores from the file
    * @param obj
    */
    
    public static void files(PItems obj) throws IOException{
        ArrayList<String>name= new ArrayList<>();
        ArrayList<String>score= new ArrayList<>();
        String fileName = "scores.txt";
        FileWriter fWriter = new FileWriter("C:\\Users\\744466954\\OneDrive - Halton Catholic District School Board\\ICS4U\\Unit 5\\Culminating\\"+fileName,true);
        PrintWriter outFile = new PrintWriter(fWriter);
        outFile.println(obj.getScore()+" "+obj.getName());
        outFile.close();
        File myFile = new File("C:\\Users\\744466954\\OneDrive - Halton Catholic District School Board\\ICS4U\\Unit 5\\Culminating\\"+fileName);
        Scanner readFile = new Scanner(myFile);
        while(readFile.hasNext()){
            String line = readFile.nextLine();
            String[]token=line.split(" ");
            score.add(token[0]);
            name.add(token[1]);
        }
        readFile.close();
        SelectionSort(score,name);
    }//end of files
    
    /*
    * SelectionSort
    * This method will sort arrays
    * @param array
    */
    
    public static void SelectionSort(ArrayList<String>array,ArrayList<String>name) throws IOException{
        String minName;
        int minIndex;
        String minValue; 
        for (int i = 0; i < array.size(); i++) 
        { 
            minValue = array.get(i); 
            minIndex = i; 
            minName = name.get(i);
            for (int j = i + 1; j < array.size(); j++) 
            { 
                if (array.get(j).compareToIgnoreCase(minValue)>0) 
                { 
                    minValue=array.get(j);
                    minIndex = j; 
                    minName=name.get(j);
                } 
            } 
            array.set(minIndex, array.get(i));
            array.set(i, minValue);
            name.set(minIndex, name.get(i));
            name.set(i, minName);
        } 
        System.out.println("\nHigh Score Table");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i)+" "+name.get(i));
        }
        rewriteFile(array,name);
    }//end of SelectionSort
    
    /*
    * rewriteFile
    * This method will add scores into the text file when a game is completed
    * @param obj
    */
    
    public static void rewriteFile(ArrayList<String>array,ArrayList<String>name)throws IOException{
        String fileName = "scores.txt";
        FileWriter fWriter = new FileWriter("C:\\Users\\744466954\\OneDrive - Halton Catholic District School Board\\ICS4U\\Unit 5\\Culminating\\"+fileName);
        PrintWriter outFile = new PrintWriter(fWriter);
        for (int i = 0; i < array.size(); i++) {
            outFile.println(array.get(i)+" "+name.get(i));
        }
        outFile.close();
    }//end of rewriteFile
    
    /*
    * UserInf
    * This method will display info from the text file (Name & Score)
    * @param obj
    */
    
    public static void UserInf(PItems obj)throws IOException{
        ArrayList<String>name= new ArrayList<>();
        ArrayList<String>score= new ArrayList<>();
        String fileName = "scores.txt";
        FileWriter fWriter = new FileWriter("C:\\Users\\744466954\\OneDrive - Halton Catholic District School Board\\ICS4U\\Unit 5\\Culminating\\"+fileName,true);
        PrintWriter outFile = new PrintWriter(fWriter);
        outFile.println(obj.getScore()+" "+obj.getName());
        outFile.close();
        File myFile = new File("C:\\Users\\744466954\\OneDrive - Halton Catholic District School Board\\ICS4U\\Unit 5\\Culminating\\"+fileName);
        Scanner readFile = new Scanner(myFile);
        while(readFile.hasNext()){
            String line = readFile.nextLine();
            String[]tokens=line.split(" ");
            if (tokens[1].equals(obj.getName())) {
                System.out.println(tokens[1]+" got a score of "+tokens[0]);
            }
        }
        readFile.close();
    }//end of UserInf
    
    /*
    * lose
    * If the user loses, this method will give the user dialogue that they have
    lost and end the program short.
    * @param obj
    */
    
    public static void lose(PItems obj) throws IOException {
        Scanner scanN = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"You lost! Sorry " +obj.getName() 
                + ", guess you're stuck forever!");
        JOptionPane.showMessageDialog(null,"GAME OVER");
        
        //Dipslay end menu
        endMenu(obj,scanN);
        //END GAME MENU
        
        System.exit(0);
    }//end of lose
    
    /*
    * endMenu
    * Once user is done their play session, end menu will show their scores and
    previous high scores
    * @param obj
    * @param scanN
    */
    
    public static void endMenu(PItems obj,Scanner scanN) throws IOException {
        //Menu Prompt
        System.out.println("\n\n\t\tEND GAME MENU\n\n1. Your Score\n\n2. "
                + "High Score Table");
        int ans = scanN.nextInt();
        
        //Menu to display score
        switch(ans) {
                case 1: {
                    //Print score
                    System.out.println("\n\nYOUR SCORE\n\n");
                    UserInf(obj);
                    break;
            }
                case 2: { 
                    System.out.println("\n");
                    
                    //Files method to print out scores
                    files(obj);
                    break;
                }
        }
    }//end of endMenu
    
}//End of class