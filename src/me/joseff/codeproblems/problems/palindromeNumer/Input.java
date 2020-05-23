package me.joseff.codeproblems.problems.palindromeNumer;

import me.joseff.codeproblems.common.BaseInput;

public class Input implements BaseInput {

    private final int value;

    public Input(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
