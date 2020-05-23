package me.joseff.codeproblems.problems.twoSum;

import me.joseff.codeproblems.common.BaseOutput;

public class Output implements BaseOutput<int[]> {

    private final int[] result;

    public Output(int[] result) {
        this.result = result;
    }

    @Override
    public int[] output() {
        return result;
    }

    @Override
    public boolean compareTo(BaseOutput<int[]> baseOutput) {

        if (baseOutput.output().length != this.result.length) {
            return false;
        }

        for (int i = 0; i < result.length; i++) {

            int[] otherOutputResults = baseOutput.output();

            if (this.result[i] != otherOutputResults[i]) {
                return false;
            }
        }

        return true;
    }
}
