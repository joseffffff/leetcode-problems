package me.joseff.codeproblems.inputs;

import me.joseff.codeproblems.common.BaseInput;

import java.util.List;

public class IntegerArrayInput implements BaseInput {

    private final List<Integer> nums;

    public IntegerArrayInput(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
