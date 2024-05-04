package Swiggy_LLD.utils;

enum PlayerNum {
    PLAYER_A, PLAYER_B
}

public class GameArena {

    public void buildArena() {
        //////////////////////////
        System.out.println("*********************************************************");
        System.out.println("*                  LOADING GAME ARENA                   *");
        System.out.println("*********************************************************");
        //////////////////////////

        try {
            System.out.println("Input data for the first Player(A): ");
            Player A = PlayerInputHandler.takeInputs();

            System.out.println("Input data for the second Player(B): ");
            Player B = PlayerInputHandler.takeInputs();

            this.startGame(A, B);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void startGame(Player A, Player B) {
        ///////////////////////////
        System.out.println("*********************************************************");
        System.out.println("*                     STARTING GAME                     *");
        System.out.println("*********************************************************");
        //////////////////////////

        PlayerNum currentPlayer = startingTurn(A, B);
        while (checkPlayers(A, B) == true) {
            this.displayPlayerStats(A, B);
            this.playRound(A, B, currentPlayer);
            currentPlayer = this.nextTurn(currentPlayer);
            this.displayPlayerStats(A, B);
        }
        PlayerNum winner = getWinner(A, B);

        System.out.println("#################### WINNER ####################");
        if (winner == PlayerNum.PLAYER_A) {
            System.out.println("* Player " + A.name + " wins Magic Arena *");
        } else {
            System.out.println("* Player " + B.name + " wins Magic Arena *");

        }
        System.out.println("################################################");

    }

    private void playRound(Player A, Player B, PlayerNum currentPlayer) {
        ///////////////////////////
        System.out.println("*********************************************************");
        System.out.println("*                   STARTING NEW ROUND                  *");
        System.out.println("*********************************************************");
        //////////////////////////
        if (currentPlayer == PlayerNum.PLAYER_A) {
            System.out.println("Player " + A.name + " is attacking and Player " + B.name + " is defending.");
            System.out.println("Player " + A.name + " is rolling dice...");
            int score_A = rollDice();
            System.out.println("Dice score: " + score_A);
            int attackingPower = score_A * A.attack;
            System.out.println("Player " + A.name + "'s attack power = " + attackingPower);
            int score_B = rollDice();
            System.out.println("Dice score: " + score_B);
            int defence = score_B * B.strength;
            System.out.println("Player " + B.name + "'s defence power = " + defence);
            B.health = Math.max(0, B.health - Math.max(0, attackingPower - defence));

        } else {
            System.out.println("Player " + B.name + " is attacking and Player " + A.name + " is defending.");
            System.out.println("Player " + B.name + " is rolling dice...");
            int score_B = rollDice();
            System.out.println("Dice score: " + score_B);
            int attackingPower = score_B * B.attack;
            System.out.println("Player " + B.name + "'s attack power = " + attackingPower);
            int score_A = rollDice();
            System.out.println("Dice score: " + score_A);
            int defence = score_A * A.strength;
            System.out.println("Player " + A.name + "'s defence power = " + defence);
            A.health = Math.max(0, A.health - Math.max(0, attackingPower - defence));
        }

    }

    private void displayPlayerStats(Player A, Player B) {

        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();

        System.out.println("Player " + A.name + " current stats: ");
        System.out.println("Total current health: " + A.health);
        System.out.println("Attack value: " + A.attack);
        System.out.println("Strength value: " + A.strength);

        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();

        System.out.println("Player " + B.name + " current stats: ");
        System.out.println("Total current health: " + B.health);
        System.out.println("Attack value: " + B.attack);
        System.out.println("Strength value: " + B.strength);
    }

    private PlayerNum nextTurn(PlayerNum currentPlayer) {
        return currentPlayer == PlayerNum.PLAYER_A ? PlayerNum.PLAYER_B : PlayerNum.PLAYER_A;
    }

    private int rollDice() {
        return 1 + (int) Math.random() % 6;
    }

    private PlayerNum startingTurn(Player A, Player B) {
        PlayerNum startTurn;
        if (A.health < B.health) {
            System.out.println("Because of lesser health Player " + A.name + " will start!");
            startTurn = PlayerNum.PLAYER_A;
        } else if (A.health > B.health) {
            System.out.println("Because of lesser health Player " + B.name + " will start!");
            startTurn = PlayerNum.PLAYER_B;
        } else {
            System.out.println("Both Player's health is equal. Picking a random player...");
            startTurn = Math.random() % 2 == 0 ? PlayerNum.PLAYER_A : PlayerNum.PLAYER_B;
            if (startTurn == PlayerNum.PLAYER_A) {
                System.out.println("Player " + A.name + " will start!");
            } else {
                System.out.println("Player " + B.name + " will start!");
            }
        }
        return startTurn;
    }

    private boolean checkPlayers(Player A, Player B) {
        return A.health > 0 && B.health > 0;
    }

    private PlayerNum getWinner(Player A, Player B) {
        return A.health > 0 ? PlayerNum.PLAYER_A : PlayerNum.PLAYER_B;
    }
}
