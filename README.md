# Swiggy_Assignment

## Problem Statement

Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0.
Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack” value multiplied by the outcome of the attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0

Player with lower health attacks first at the start of a match.
Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6
Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2
Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70
Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3
Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45
And so on


## Steps for code execution
1. Unzip/clone the Swiggy_LLD repository. The project directory name containing all project files (Main.java, readme.md, interfaces, game, gameTypes, utils) must be Swiggy_LLD.
   For example: if the unzip directory name is Swiggy_LLD-main, change that to Swiggy_LLD
3. Java version used 17.0.10
4. Compile or build the program files: (I used Visual Studio code to run the program.)
   ```bash
   Compile and run Main.java
   ```
5. After executing Main.java, input the players attributes. After then the game starts.
