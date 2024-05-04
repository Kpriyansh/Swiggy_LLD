package Swiggy_LLD;

import Swiggy_LLD.interfaces.GameArena;
import Swiggy_LLD.utils.MagicArena;

public class Main {
        public static void main(String[] args) {

                GameArena magicArena = new MagicArena();
                magicArena.startGame();
        }
}