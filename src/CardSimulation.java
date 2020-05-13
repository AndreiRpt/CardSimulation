import javax.swing.*;
import java.util.Random;
/**
 * For this exercise you should use the Java class Random which is contained in the java.util
 * package in the Java standard library.
 * Create a class called CardSimulation (with the main class)
 * Your program is to simulate drawing cards from a normal deck of cards and printing out the
 * following:
 * A. the frequency with which each card suit is drawn;
 * B. the frequency with which each face value is drawn.
 * The program should draw a card 100 times and print the results as follows:
 *
 * Face value frequencies
 * Spades 18
 * ...
 * ...
 * Suit frequencies
 * Ace 7
 * ...
 * ...
 */

public class CardSimulation {

  public static void main(String[] args) {

    Random rand = new Random();
    String [] cardSuit = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String [] faceValue = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
          "Nine", "Ten", "Jack", "Queen", "King"};




    // 0=yes, 1=no, 2=cancel
    int option = JOptionPane.showConfirmDialog(null, "Would you like to play a game?");
    if (option != 0){
      System.out.println("Please come back soon!!!");
    }

    while (option == 0) {

      int Spades = 0, Hearts = 0, Diamonds = 0, Clubs = 0, Ace = 0, Two = 0,
              Three = 0, Four = 0, Five = 0, Six = 0, Seven = 0, Eight = 0, Nine = 0,
              Ten = 0, Jack = 0, Queen = 0, King = 0;

      String drawingNumber = JOptionPane.showInputDialog("How many times would you like to draw a card?");
      int drawingNumberInt = Integer.parseInt(drawingNumber);

        for (int i = 0; i<drawingNumberInt; i++) {

          String CardSuitsResults = cardSuit[rand.nextInt(cardSuit.length)];
          String FaceValueResults = faceValue[rand.nextInt(faceValue.length)];

            switch (CardSuitsResults) {
              case "Spades": Spades++;
              break;
              case "Hearts": Hearts++;
              break;
              case "Diamonds": Diamonds++;
              break;
              case "Clubs": Clubs++;
              break;
            }

            switch (FaceValueResults) {
              case "Ace": Ace++;
              break;
              case "Two": Two++;
              break;
              case "Three": Three++;
              break;
              case "Four": Four++;
              break;
              case "Five": Five++;
              break;
              case "Six": Six++;
              break;
              case "Seven": Seven++;
              break;
              case "Eight": Eight++;
              break;
              case "Nine": Nine++;
              break;
              case "Ten": Ten++;
              break;
              case "Jack": Jack++;
              break;
              case "Queen": Queen++;
              break;
              case "King": King++;
              break;
            }
        }

      System.out.println("Face value frequencies: " +  '\n' +
              "Spades (♠): " + Spades + '\n' +
              "Hearts (♥): " + Hearts + '\n' +
              "Diamonds (♦): " +  Diamonds + '\n'  +
              "Clubs (♣): " + Clubs + '\n');
      System.out.println("Suit frequencies: " + '\n' +
              "Ace: " + Ace + '\n' +
              "Two: " + Two + '\n' +
              "Three: " + Three + '\n' +
              "Four: " + Four + '\n' +
              "Five: " + Five + '\n' +
              "Six: " + Six + '\n' +
              "Seven: " + Seven + '\n' +
              "Eight: " + Eight + '\n' +
              "Nine: " + Nine + '\n' +
              "Ten: " + Ten + '\n' +
              "Jack: " + Jack + '\n' +
              "Queen: " + Queen + '\n'+
              "King: " + King + '\n');

      option =  JOptionPane.showConfirmDialog(null, "Would you like to play again?");
      if (option==0){System.out.println("--------------------- New values: ---------------------");

      } else {System.out.println('\n' +"Thanks for playing!!! BYE!!!");}

    }





  }



}
