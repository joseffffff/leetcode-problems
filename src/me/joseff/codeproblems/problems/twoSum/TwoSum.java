package me.joseff.codeproblems.problems.twoSum;

import me.joseff.codeproblems.common.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.You may assume that
 * each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum implements Problem<Input, Output> {

    @Override
    public String leetCodeId() {
        return "1";
    }

    @Override
    public String leetCodeTitle() {
        return "Two Sum";
    }

    @Override
    public Map<Input, Output> inputsOutputsSet() {

        Map<Input, Output> inputOutputHashMap = new HashMap<>();

        inputOutputHashMap.put(new Input(new int[]{2, 7, 11, 15}, 9), new Output(new int[]{0, 1}));
        inputOutputHashMap.put(new Input(new int[]{2, 7, 11, 15}, 22), new Output(new int[]{1, 3}));
        inputOutputHashMap.put(new Input(new int[]{2, 7, 11, 15}, 13), new Output(new int[]{0, 2}));
        inputOutputHashMap.put(new Input(new int[]{2, 7, 11, 15}, 17), new Output(new int[]{0, 3}));

        return inputOutputHashMap;
    }

    @Override
    public Output execute(Input input) {

        int[] nums = input.getNums();
        int target = input.getTarget();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            for (int j = 1; j < nums.length; j++) {

                if (i != j) {

                    int secondNum = nums[j];

                    if ((num + secondNum) == target) {
                        return new Output(new int[]{i, j});
                    }
                }
            }
        }

        return new Output(new int[]{});
    }
}
