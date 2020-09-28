package me.joseff.codeproblems.problems.balancedstrings;

import me.joseff.codeproblems.common.BaseInput;

public class Input implements BaseInput {

    private final String letters;

    public Input(String letters) {
        this.letters = letters;
    }

    public String getLetters() {
        return letters;
    }
}
