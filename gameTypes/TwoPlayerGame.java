package Swiggy_LLD.gameTypes;

import Swiggy_LLD.interfaces.GameArena;

import java.util.Random;

import Swiggy_LLD.interfaces.DiceGame;
import Swiggy_LLD.utils.Player;
import Swiggy_LLD.utils.PlayerInputHandler;

public abstract class TwoPlayerGame implements GameArena, DiceGame {
    public Player[] buildArena() {
        //////////////////////////
        System.out.println("*********************************************************");
        System.out.println("*                  LOADING GAME ARENA                   *");
        System.out.println("*********************************************************");
        //////////////////////////

        try {
            System.out.println("Input data for the first Player(A):-");
            Player A = PlayerInputHandler.takeInputs();

            System.out.println("\n\nInput data for the second Player(B):-");
            Player B = PlayerInputHandler.takeInputs();

            return new Player[] { A, B };

        } catch (Exception e) {
            throw (e);
        }
    }

    public abstract void startGame();

    public int rollDice(int minDiceValue, int maxDiceValue) {
        Random rn = new Random();
        return minDiceValue + rn.nextInt(maxDiceValue);
    }

}
