/*
 * I made this demo just in case we are not ready to sumbit a demo on the due date. Feel free to download and tell me what you think.
 * We can also use this as the base to build our story on
 * I will modify the code time to time for a better look 
 
 */
package javaapplication1;

import java.util.Random;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextBaseGame  {

  JFrame windows = new JFrame("Credit Roll Test");  
  
  
  
  
    
JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, backstoryPanel,EndButtonPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton,EndButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHP, monsterHP, silverRing;
    String weapon , position, item [] ={"Long Sword","Hand", "Potion"};
   
    Random rand = new Random();
    TitleScreenHandler tsHandler = new TitleScreenHandler();
     EndCredit screen = new EndCredit();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new TextBaseGame();
    }
    public TextBaseGame(){
       
         
        window = new JFrame();
        window.setSize(800, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        
        con = window.getContentPane();
        
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(50, 100, 700, 500);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Welcome to the Dungeon");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(100,400,550,100);
        startButtonPanel.setBackground(Color.black);
        
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);
        titleNamePanel.add(titleNameLabel);
          window.setVisible(true);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
      
        //End Credit scene
        
         EndButtonPanel = new JPanel();
        EndButtonPanel.setBounds(100,400,550,100);
        EndButtonPanel.setBackground(Color.black);
        
        EndButton = new JButton("Watch End Credit");
        EndButton.setBackground(Color.black);
        EndButton.setForeground(Color.white);
        EndButton.setFont(normalFont);
      
        EndButton.setFocusPainted(false);
        titleNamePanel.add(titleNameLabel);
                 
        EndButtonPanel.setVisible(false);
        EndButtonPanel.add(EndButton);
        con.add(titleNamePanel);
        con.add(EndButtonPanel);
        
      
    
}
    public void createGameScreen(){
        
       titleNamePanel.setVisible(false);
       startButtonPanel.setVisible(false);
       
     mainTextPanel = new JPanel();
     mainTextPanel.setBounds(100, 100, 600, 250);
     mainTextPanel.setBackground(Color.black);
     con.add(mainTextPanel);
     mainTextArea = new JTextArea("This is the main Text Area");
     mainTextArea.setBounds(100,300,400,100);
     mainTextArea.setBackground(Color.black);
     mainTextArea.setForeground(Color.white);
     mainTextArea.setFont(normalFont);
     mainTextArea.setLineWrap(true);
     mainTextArea.setEditable(false);
     mainTextPanel.add(mainTextArea);
     
     choiceButtonPanel = new JPanel();
     choiceButtonPanel.setBounds(100, 350, 600, 250);
     choiceButtonPanel.setBackground(Color.black);
     choiceButtonPanel.setLayout(new GridLayout(4,1));
     con.add(choiceButtonPanel);
     
     choice1 = new JButton("Choice 1");
     choice1.setBackground(Color.black);
     choice1.setForeground(Color.white);
     choice1.setFont(normalFont);
     choice1.setFocusPainted(false);
     choice1.addActionListener(choiceHandler);
     choice1.setActionCommand("c1");
     choiceButtonPanel.add(choice1);
     
     choice2 = new JButton("Choice 2");
     choice2.setBackground(Color.black);
     choice2.setForeground(Color.white);
     choice2.setFont(normalFont);
     choice2.setFocusPainted(false);
     choice2.addActionListener(choiceHandler);
     choice2.setActionCommand("c2");
     choiceButtonPanel.add(choice2);
     
     choice3 = new JButton("Choice 3");
     choice3.setBackground(Color.black);
     choice3.setForeground(Color.white);
     choice3.setFont(normalFont);
     choice3.setFocusPainted(false);
     choice3.addActionListener(choiceHandler);
     choice3.setActionCommand("c3");
     choiceButtonPanel.add(choice3);
     
     choice4 = new JButton("Choice 4");
     choice4.setBackground(Color.black);
     choice4.setForeground(Color.white);
     choice4.setFont(normalFont);
     choice4.setFocusPainted(false);
     choice4.setActionCommand("c4");
     choice4.addActionListener(choiceHandler);
     choiceButtonPanel.add(choice4);
     
     playerPanel = new JPanel();
     playerPanel.setBounds(100, 15, 600, 50);
     playerPanel.setBackground(Color.black);
     playerPanel.setLayout(new GridLayout(1,4));
     con.add(playerPanel);
     hpLabel = new JLabel("HP: ");
     hpLabel.setFont(normalFont);
     hpLabel.setForeground(Color.white);
     playerPanel.add(hpLabel);
     hpLabelNumber = new JLabel();
     hpLabelNumber.setFont(normalFont);
     hpLabelNumber.setForeground(Color.white);
     playerPanel.add(hpLabelNumber);
     
     weaponLabel = new JLabel("Weapon: ");
     weaponLabel.setFont(normalFont);
     weaponLabel.setForeground(Color.white);
     playerPanel.add(weaponLabel);
     
     weaponLabelName = new JLabel();
    weaponLabelName.setFont(normalFont);
    weaponLabelName.setForeground(Color.white);
     playerPanel.add(weaponLabelName);
     
     playerSetup();
             
     
     
     
    }
    public void playerSetup(){
        playerHP = 15;
        monsterHP = 20;
        weapon = "Hand";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);
        
        townGate();
    }
    public void townGate(){
    position = "townGate";
        mainTextArea.setText(" You are at the Dungeon's gate. \nThere is Guard standing"
                + "\nWhat would you like to do?");
    
    choice1.setText("Talk to the guard");
    choice2.setText("Attack");
    choice3.setText("Leave");
    choice4.setText("");
    
    }
    public void talkGuard(){
       position = "talkGuard";
        mainTextArea.setText("Guard: Hello!  \nApologies but I can't let you in \nbecause you don't have a ring");
    choice1.setText("<--Back");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    
    }
    public void attackGuard(){
        position = "attackGuard";
        mainTextArea.setText("Guard: Hey that wasn't smart of you. \nYou receive " +playerHP + " damage");
        playerHP = playerHP - playerHP;
        hpLabelNumber.setText(""+playerHP);
    choice1.setText("Next");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    
        
    }
    public void crossRoad(){
        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad . \nGo South to go to the Dungeon's gate");
        choice1.setText("Go North");
        choice2.setText("Go East");
        choice3.setText("Go South");
        choice4.setText("Go West");
    }
    public void north(){
        position = "north";
        mainTextArea.setText("You found a river. \n You Drink Some Water .\nYour HP is recovered by 2");
        playerHP= playerHP +2;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Go South");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
     
    }
    public void east(){
        position = "east";
        mainTextArea.setText("You walk into a Forest \nand found a sword. \nYou picked up the Sword");
        weapon = "Long Sword";
        weaponLabelName.setText(weapon);
         choice1.setText("Go West");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void west(){
        position ="west";
        mainTextArea.setText("You have encounter a Goblin!");
       choice1.setText("Fight");
       choice2.setText("Run");
       choice3.setText("");
        choice4.setText("");
    }
    public void fight(){
        position ="fight";
        mainTextArea.setText("Goblin's HP is " + monsterHP + "\nWhat do you do?");
        choice1.setText("Attack");
       choice2.setText("Run");
       choice3.setText("Open your bag");
        choice4.setText("");
    }
    public void playerAttack(){
        position = "playerAttack";
        
        int playerDamage = 0;
        playerDamage = new java.util.Random().nextInt(3);
        if(weapon.equals("Hand")){
            playerDamage = new java.util.Random().nextInt(3);
            
        }
        else if(weapon.equals("Long Sword")){
            playerDamage = new java.util.Random().nextInt(8);
        }
        
        mainTextArea.setText("You attacked and \ngave " + playerDamage + " Damage");
        monsterHP -= playerDamage;
        choice1.setText("Next");
       choice2.setText("");
       choice3.setText("");
        choice4.setText("");
    }
    
    public void bag(){
        position = "bag";
        
        String items = item[rand.nextInt(item.length)];
        
        if(items.equals("Potion")){
            playerHP= playerHP +2;
            mainTextArea.setText("You have gained 2 points of HP "
                    + "\nby drinking the potion "
                    + "\n Now you have got " + playerHP + " HP");
             hpLabelNumber.setText(""+ playerHP);
        }
        else if(items.equals("Hand")){
            weapon = "Hand";
            mainTextArea.setText("Your weapon was changed to \n" + weapon);
             weaponLabelName.setText(weapon);
        }
        else if(items.equals("Long Sword")){
            weapon ="Long Sword";
            mainTextArea.setText("Your weapon was changed to \n" + weapon);
             weaponLabelName.setText(weapon);
        }
        choice1.setText("Attack");
       choice2.setText("Run");
       choice3.setText("Open your bag");
        choice4.setText("");
    }
    public void monsterAttack(){
        position = "monsterAttack";
        int monsterDamage = 0;
        monsterDamage = new java.util.Random().nextInt(4);
        
       mainTextArea.setText("The monster attacked and gave " + monsterDamage + " damage");
       playerHP -= monsterDamage;
       hpLabelNumber.setText(""+ playerHP);
       
       choice1.setText("Next");
       choice2.setText("");
       choice3.setText("");
       choice4.setText("");
    }
    public void win(){
        position = "win";
        
        mainTextArea.setText("You defeated the Goblin \nThe Goblin drropped a ring. \n<You got the ring Item>");
        
        silverRing = 1;
        
        choice1.setText("Go east");
       choice2.setText("");
       choice3.setText("");
       choice4.setText("");
    }
    public void lose(){
        position ="lose";
        mainTextArea.setText("You are Dead \n<Game Over>");
         choice1.setText(">");
       choice2.setText("");
       choice3.setText("");
       choice4.setText("");
       choice1.setVisible(false);
       choice2.setVisible(false);
       choice3.setVisible(false);
       choice4.setVisible(false);
    }
    public void ending(){
        position ="ending";
        
        mainTextArea.setText("Guard : Thank you for defeating the Goblin "
                + "\nYou can come in the Dungeon \n<The End>");
       choice1.setText(">");
       choice2.setText("");
       choice3.setText("");
       choice4.setText("");
       EndButtonPanel.setVisible(true);
         EndButton.addActionListener(screen);
          window.setVisible(true);
           windows.setVisible(true);
       choice1.setVisible(false);
       choice2.setVisible(false);
       choice3.setVisible(false);
       choice4.setVisible(false);
    }
public  class  TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }

public class EndCredit implements ActionListener{
      public void actionPerformed(ActionEvent event){
          
             
           javaapplication1.EndCredit screen = new javaapplication1.EndCredit();
            
                            
            
              window.setVisible(false);
         
          
       
         
      }
}
public class ChoiceHandler implements ActionListener{
    public void actionPerformed(ActionEvent event){
        String yourChoice = event.getActionCommand();
        
       switch(position){
           case "townGate":
               switch(yourChoice){
                   case "c1" : 
                       if(silverRing ==1){
                           ending();
                           
                       } 
                       else{
                           talkGuard();
                       }
                       break;
                   case "c2": attackGuard();break;
                   case "c3" : crossRoad();break;
               }
               break;
           case "talkGuard":
               switch(yourChoice){
                   case "c1": townGate(); break;
               }
               break;
               case"attackGuard":
                   switch(yourChoice){
                       case "c1": 
                      
                                   if(playerHP< 1){
                                       lose(); 
                       
                   }
                                   else{
                                       townGate();
                                   }
                                   break;
                   }
                   break;
               case "crossRoad":
                   switch(yourChoice){
                       case "c1": north();break;
                       case "c2" : east();break;
                       case "c3": townGate();break;
                       case "c4" : west();break;
                   }
                   break;
               case "north":
                   switch(yourChoice){
                       case"c1": crossRoad(); break;
                   }
                   break;
                   case"east":
                       switch(yourChoice){
                       case"c1": crossRoad(); break;
                   }
                       break;
                     case"west":
                       switch(yourChoice){
                       case"c1": fight(); break;
                       case"c2": crossRoad(); break;
                   }
                       break;
                       case"fight":
                           switch(yourChoice){
                               case"c1": playerAttack(); break;
                               case "c2":crossRoad(); break;
                               case "c3" : bag(); break;
                           }
                           break;
                       case "playerAttack":
                           switch(yourChoice){
                               case"c1": 
                                   if(monsterHP<1){
                                       win();
                                   }
                                   else{
                                        monsterAttack();
                                   }
                                   if(playerHP< 1){
                                           lose();
                                           
                                           }
                                   break;
                               
                           }
                   break;
                   case "monsterAttack":
                           switch(yourChoice){
                               case"c1": 
                                   if(playerHP< 1){
                                       lose();
                                   }
                                   else{
                                         fight();}
                                    break;
                               
                           }
                   case "bag":
                       switch(yourChoice){
                          case"c1": playerAttack(); break;
                               case "c2":crossRoad(); break;
                               case "c3" : bag(); break;
                       }
                           break;
                
                           case"win":
                               switch(yourChoice){
                               case"c1": crossRoad();
                               }
       
    }
}
}
}