package me.joseff.codeproblems.problems.palindromenumber;

import me.joseff.codeproblems.common.Difficulty;
import me.joseff.codeproblems.common.Problem;

import java.util.HashMap;
import java.util.Map;

public class PalindromeNumber implements Problem<Input, Output> {
    @Override
    public Output execute(Input input) {

        String stringifiedValue = input.getValue() + "";
        int halfLength = stringifiedValue.length() / 2;

        for (int i = 0; i < halfLength; i++) {

            char currentChar = stringifiedValue.charAt(i);
            char backChar = stringifiedValue.charAt(stringifiedValue.length() - (i + 1));

            if (currentChar != backChar) {
                return new Output(false);
            }
        }

        return new Output(true);
    }

    @Override
    public Map<Input, Output> inputsOutputsSet() {
        Map<Input, Output> inputOutputHashMap = new HashMap<>();

        inputOutputHashMap.put(new Input(543), new Output(false));
        inputOutputHashMap.put(new Input(5765), new Output(false));
        inputOutputHashMap.put(new Input(119911), new Output(true));
        inputOutputHashMap.put(new Input(-1234321), new Output(false));
        inputOutputHashMap.put(new Input(-1234), new Output(false));
        inputOutputHashMap.put(new Input(912353219), new Output(true));

        return inputOutputHashMap;
    }

    @Override
    public String leetCodeId() {
        return "9";
    }

    @Override
    public String leetCodeTitle() {
        return "Palindrome Number";
    }

    @Override
    public Difficulty difficulty() {
        return Difficulty.EASY;
    }
}
