Overview
This project is a simple text-based game called Magical Arena where players take turns attacking each other using a dice roll-based mechanism. It simulates matches between players with attributes like health, strength, and attack power. The match ends when one player’s health drops to zero or below. Additionally, there are manual test cases provided to verify the functionality of the classes and methods.


Features
    1.Player: Represents a player with attributes like name, health, strength, and attack.
    2.Dice: Simulates rolling a 6-sided dice to generate random numbers.
    3.Match: Simulates a match between two players with turn-based attacks.
    4.ManualTests: Contains methods to manually test the core functionality of the project.


Project Structure

magical-arena/
├── MagicalArena.java   # Main game logic
├── Player.java         # Player class with attributes and attack methods
├── Match.java          # Match logic between two players
├── Dice.java           # Dice rolling logic
├── ManualTests.java    # Test cases for various components


Prerequisites
    Java Development Kit (JDK): Ensure that JDK 8 or later is installed.
    Compiler/IDE: Any IDE or text editor supporting Java (e.g., IntelliJ IDEA, Eclipse, or VSCode).


How to Compile and Run
    1.Navigate to the Project Folder
    Open a terminal and navigate to the magical-arena folder where all the .java files are located.

    2.Compile the Source Code
    Run the following command to compile all the Java files in the folder: javac *.java

    3.Run the Game
    To start the game, execute the following command: java ManualTests

    4.Run the Manual Tests
    To verify the functionality of various components, execute: java ManualTests

How to Play
    1.Run the MagicalArena class.
    2.The program will automatically simulate matches between pairs of players:
        .Players will take turns attacking each other.
        .Each attack will calculate damage based on dice rolls and player attributes.
        .The match ends when one player’s health drops to 0 or below.
    3.Observe the output in the terminal for detailed logs of attacks and the match result.


Example Output:

Game Output:
    The match begins!
    Player A attacks with damage 20 (30 attack vs 10 defense). Player B's health is now 80.
    Player B attacks with damage 0 (5 attack vs 20 defense). Player A's health is now 50.
    Player A attacks with damage 0 (40 attack vs 40 defense). Player B's health is now 80.
    Player B attacks with damage 20 (25 attack vs 5 defense). Player A's health is now 30.
    Player A attacks with damage 0 (20 attack vs 30 defense). Player B's health is now 80.
    Player B attacks with damage 25 (30 attack vs 5 defense). Player A's health is now 5.
    Player A attacks with damage 30 (40 attack vs 10 defense). Player B's health is now 50.
    Player B attacks with damage 5 (20 attack vs 15 defense). Player A's health is now 0.
    Player A is defeated!

    The match begins!
    Player D attacks with damage 30 (60 attack vs 30 defense). Player C's health is now 12.
    Player C attacks with damage 0 (18 attack vs 20 defense). Player D's health is now 35.
    Player D attacks with damage 0 (20 attack vs 60 defense). Player C's health is now 12.
    Player C attacks with damage 0 (18 attack vs 20 defense). Player D's health is now 35.
    Player D attacks with damage 35 (50 attack vs 15 defense). Player C's health is now -23.
    Player C is defeated!


Manual Test Output:
    [PASS] Player name should be 'Player A'
    [PASS] Player health should be 50
    [PASS] Player strength should be 5
    [PASS] Player attack should be 10
    [PASS] Dice roll should always be between 1 and 6
    Player A attacks Player B: 50 - 25 = 25 damage
    [PASS] Defender's health should decrease or remain unchanged if the attack was fully defended
    [PASS] Match should be successfully initialized
    The match begins!
    Player B attacks with damage 0 (10 attack vs 30 defense). Player A's health is now 50.
    Player A attacks with damage 0 (10 attack vs 25 defense). Player B's health is now 50.
    Player B attacks with damage 25 (30 attack vs 5 defense). Player A's health is now 25.
    Player A attacks with damage 35 (40 attack vs 5 defense). Player B's health is now 15.
    Player B attacks with damage 25 (50 attack vs 25 defense). Player A's health is now 0.
    Player A is defeated!
    [PASS] One player's health should reach 0 or below after the match ends
    The match begins!
    Player A attacks with damage 25 (30 attack vs 5 defense). Player B's health is now 75.
    Player B attacks with damage 10 (30 attack vs 20 defense). Player A's health is now 40.
    Player A attacks with damage 30 (40 attack vs 10 defense). Player B's health is now 45.
    Player B attacks with damage 40 (60 attack vs 20 defense). Player A's health is now 0.
    Player A is defeated!
    [PASS] One player's health should reach 0 or below after the match ends


Design Choices
    .Separation of Concerns:
        .Player handles individual player attributes and logic.
        .Dice encapsulates dice roll logic.
        .Match controls the flow of the game and alternates turns.
    .Modularity: Each class is independent and can be extended or modified without affecting others.
    .Testability: The project includes comprehensive manual tests to verify player initialization, dice rolls, attack mechanics, and full matches.

Commit Guidelines
    .Frequent commits with descriptive messages:
        .Added Player class with attributes and constructor.
        .Implemented dice roll logic.
        .Added Match class for game mechanics.
        .Wrote unit tests for Player and Match classes.


Contact
For any questions or feedback, please reach out to Thota Vamsi Krishna at vamsikrishnathota483@gmail.com