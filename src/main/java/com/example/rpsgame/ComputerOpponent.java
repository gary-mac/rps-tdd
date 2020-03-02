package com.example.rpsgame;

import java.util.Arrays;
import java.util.Random;

public class ComputerOpponent implements Computer, Cheater {

    private Random random;
    private static final String[] COMPUTERS_CHOICE = new String[]{"rock", "paper", "scissors"};

    public ComputerOpponent(Random random) {
        this.random = random;
    }

    public String getComputerChoice() {

        int choice = random.nextInt(COMPUTERS_CHOICE.length);
        return COMPUTERS_CHOICE[choice];
    }

    public String setCheaterChoice(String playerChoice) {

        int readPlayersChoice = Arrays.asList(COMPUTERS_CHOICE).indexOf(playerChoice);
        int computerChoosesBestOption = readPlayersChoice + 1;

        while(computerChoosesBestOption <= 2){

            return COMPUTERS_CHOICE[computerChoosesBestOption];
        }
            int choice = 0;
            return COMPUTERS_CHOICE[choice];
    }

    public String getCheaterChoice() {

        return null;
    }
}