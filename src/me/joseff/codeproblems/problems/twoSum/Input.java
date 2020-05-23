package me.joseff.codeproblems.problems.twoSum;

import me.joseff.codeproblems.common.BaseInput;

public class Input implements BaseInput {

    private final int[] nums;
    private final int target;

    public Input(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int[] getNums() {
        return nums;
    }

    public int getTarget() {
        return target;
    }
}
