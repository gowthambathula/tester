//Gowtham Reddy Bathula	
//999992867
import java.util.*;
import java.io.*;
import java.lang.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
 
public class tester extends JPanel{
 
 private JButton squares[][];
  
public tester(){
     this.setSize(400,400);
     this.setLayout(new GridLayout(10,10));
     squares = new JButton[10][10];
     buildButtons();
}
 
private void buildButtons(){  
   for(int i=0;i<10;i++){
          for(int j=0;j<10;j++){
               squares[i][j] = new JButton();
               squares[i][j].setSize(400,400);
               this.add(squares[i][j]);
          }
     }
}
public static void main(String[] args) {
  tester g = new tester();
  JFrame frame = new JFrame("My Minesweeper");
  frame.add(g);
  frame.setSize(400,400);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
 }
}