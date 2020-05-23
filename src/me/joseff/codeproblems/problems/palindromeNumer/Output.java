package me.joseff.codeproblems.problems.palindromeNumer;

import me.joseff.codeproblems.common.BaseOutput;

public class Output implements BaseOutput<Boolean> {

    private final boolean result;

    public Output(boolean result) {
        this.result = result;
    }

    @Override
    public Boolean output() {
        return result;
    }

    @Override
    public boolean compareTo(BaseOutput<Boolean> baseOutput) {
        return this.result == baseOutput.output();
    }

    @Override
    public String toString() {
        return this.result + "";
    }
}
