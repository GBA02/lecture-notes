package week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {
    private DiceCup diceCup;
    private List<Player> players;

    public static void main(String[] args) {

        Game knockout = new Game();
        knockout.startGame();

    }

    public void startGame() {
        // make player objects
        // get knockout numbers
        //create a dice cup
        // play game
        //each player will roll dice - use dice cup
        // print winner

        diceCup = new DiceCup(2);

        int numbOfPlayers = getNumbOfPlayers();
        createPlayers(numbOfPlayers);

        setKnockoutNumbers();

        play();

        printGameResults();
    }

    private int getNumbOfPlayers() {
        int numbOfPlayers = positiveIntInput("How many players?");

        while (numbOfPlayers == 1 || numbOfPlayers == 0 || numbOfPlayers >= 10){
            numbOfPlayers = positiveIntInput("Must have at least 2 and no more than 10 players");
        }
            return numbOfPlayers;
    }

    private void printGameResults() {

        for (Player player : players) {
            if (player.isKnockedOut()) {
                System.out.println("Player " + player.getName() + " was knocked out.");
            } else {
                System.out.println("Player " + player.getName() + " is the winner!");
            }
        }
    }

    private void play() {

        int totalPlayers = players.size();
        int playerIndex = 0;

        while (moreThanOnePlayerInPlay()) {

            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockedOut()) {
                System.out.println("Sorry, " + currentPlayer.getName() + " you are knocked out.");
            } else {
                stringInput("Player " + currentPlayer.getName() + ", press enter to roll.");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }

            playerIndex = (playerIndex + 1) % totalPlayers;
        }
    }

    private boolean moreThanOnePlayerInPlay() {
        int totalInPlay = 0;
        for (Player p : players) {
            if (!p.isKnockedOut()) {
                totalInPlay++;
            }
        }

        System.out.println("There are " + totalInPlay + " player(s) in game");
        if (totalInPlay > 1) {
            return true;
        } else {
            return false;
        }
    }

    private void setKnockoutNumbers() {

        for (Player p : players) {
            int knockoutNumber;

            do {
                knockoutNumber = intInput("Player " + p.getName() + ", enter your knockout number." +
                        " It must be 6, 7, 8 or 9.");
            } while (knockoutNumber < 6 || knockoutNumber > 9);// number must be 6-9

            p.setKnockoutNumber(knockoutNumber);
        }
    }

    private void createPlayers(int numbOfPlayers) {

        players = new ArrayList<>();

        for (int x = 0; x < numbOfPlayers; x++) {
            String name = stringInput("Enter player " + (x + 1) + "'s name");
            Player player = new Player(name);
            players.add(player);
        }
    }

}
