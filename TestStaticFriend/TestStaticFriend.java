/*
 * Program: filename.java
 * Student: Lydia Frame 
 * Purpose: Test static variables and count how many times the class has been implemented
*/

import java.util.Scanner; // Import the Scanner class

public class TestStaticFriend {

    public static void main(String[] args) {

      //Create friend 1
      Friends friend1 = new Friends("Don");
      System.out.println("Number of friends: " + Friends.NumOfFriends);

      //Add space between each count
      System.out.println();

      //Friend 2
      Friends friend2 = new Friends("Frank");
      System.out.println("New number of friends: " +Friends.NumOfFriends);

      //space 
      System.out.println();

      //Friend 3
      Friends friend3 = new Friends("Sandy");
      System.out.println("New number of friends: " + Friends.NumOfFriends);

    }
}