package me.joseff.codeproblems.problems.balancedStrings;

import me.joseff.codeproblems.common.BaseOutput;

public class Output implements BaseOutput<Integer> {

    private final int result;

    public Output(int result) {
        this.result = result;
    }

    @Override
    public Integer output() {
        return result;
    }

    @Override
    public boolean compareTo(BaseOutput<Integer> baseOutput) {
        return result == baseOutput.output();
    }
}
