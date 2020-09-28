package me.joseff.codeproblems.problems.balancedstrings;

import me.joseff.codeproblems.common.Difficulty;
import me.joseff.codeproblems.common.Problem;

import java.util.HashMap;
import java.util.Map;

public class BalancedStrings implements Problem<Input, Output> {

    @Override
    public Output execute(Input input) {

        String letters = input.getLetters();

        int numbersOfR = 0;
        int numbersOfL = 0;

        int result = 0;

        for (int i = 0; i < letters.length(); i++) {

            char currentLetter = letters.charAt(i);

            if (this.isR(currentLetter)) {
                numbersOfR++;
            }

            if (this.isL(currentLetter)) {
                numbersOfL++;
            }

            if (numbersOfL == numbersOfR) {
                result++;
                numbersOfR = 0;
                numbersOfL = 0;
            }
        }

        return new Output(result);
    }

    private boolean isL(char currentLetter) {
        return currentLetter == 'L';
    }

    private boolean isR(char currentLetter) {
        return currentLetter == 'R';
    }

    @Override
    public Map<Input, Output> inputsOutputsSet() {

        Map<Input, Output> set = new HashMap<>();

        set.put(new Input("RLRRLLRLRL"), new Output(4));
        set.put(new Input("RLLLLRRRLR"), new Output(3));
        set.put(new Input("LLLLRRRR"), new Output(1));

        return set;
    }

    @Override
    public String leetCodeId() {
        return "1221";
    }

    @Override
    public String leetCodeTitle() {
        return "Split a String in Balanced Strings";
    }

    @Override
    public Difficulty difficulty() {
        return Difficulty.EASY;
    }
}
