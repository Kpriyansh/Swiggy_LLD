package Swiggy_LLD.utils;

import java.util.Scanner;

public class PlayerInputHandler {
    static Scanner scanner = new Scanner(System.in);

    public static Player takeInputs() {
        Player P = new Player();
        inputPlayerName(P);
        inputPlayerHealth(P);
        inputPlayerStrength(P);
        inputPlayerAttack(P);
        return P;
    }

    private static void inputPlayerName(Player P) {
        System.out.println("Input name of the Player: ");
        String name = scanner.next();
        if (name.isEmpty()) {
            // throw exception
            throw new IllegalArgumentException("Name must be non-empty");
        }
        P.setName(name);
    }

    private static void inputPlayerStrength(Player P) {
        System.out.println("Input strength of the Player: ");
        int strength = scanner.nextInt();
        if (!validAttribute(strength)) {
            // throw exception
            throw new IllegalArgumentException("Strength must be a Positive Integer");
        }
        P.setStrength(Integer.valueOf(strength));
    }

    private static void inputPlayerAttack(Player P) {
        System.out.println("Input attack of the Player: ");
        int attack = scanner.nextInt();
        if (!validAttribute(attack)) {
            // throw exception
            throw new IllegalArgumentException("Attack must be a Positive Integer");

        }
        P.setStrength(Integer.valueOf(attack));
    }

    private static void inputPlayerHealth(Player P) {
        System.out.println("Input health of the Player: ");
        int health = scanner.nextInt();
        if (!validAttribute(health)) {
            // throw exception
            throw new IllegalArgumentException("Health must be a Positive Integer");

        }
        P.setStrength(Integer.valueOf(health));
    }

    private static boolean validAttribute(int attr) {
        return attr > 0;
    }
}
