package me.joseff.codeproblems.problems.onethreetwopattern;

import me.joseff.codeproblems.common.Difficulty;
import me.joseff.codeproblems.common.Problem;
import me.joseff.codeproblems.inputs.IntegerArrayInput;
import me.joseff.codeproblems.outputs.BooleanOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneThreeTwoPattern implements Problem<IntegerArrayInput, BooleanOutput> {
    @Override
    public BooleanOutput execute(IntegerArrayInput input) {

        List<Integer> numbers = input.getNums();

        for (int i = 0; i < numbers.size(); i++) {

            Integer firstNumber = numbers.get(i);

            for (int j = i + 1; j < numbers.size(); j++) {

                Integer secondNumber = numbers.get(j);

                for (int k = j + 1; k < numbers.size(); k++) {
                    Integer thirdNumber = numbers.get(k);

                    if (firstNumber < secondNumber && secondNumber > thirdNumber && firstNumber < thirdNumber) {
                        return new BooleanOutput(true);
                    }
                }
            }
        }

        return new BooleanOutput(false);
    }

    @Override
    public Map<IntegerArrayInput, BooleanOutput> inputsOutputsSet() {

        Map<IntegerArrayInput, BooleanOutput> set = new HashMap<>();

        set.put(new IntegerArrayInput(Arrays.asList(1, 2, 3, 4)), new BooleanOutput(false));
        set.put(new IntegerArrayInput(Arrays.asList(3, 1, 4, 2)), new BooleanOutput(true));
        set.put(new IntegerArrayInput(Arrays.asList(-1, 3, 2, 0)), new BooleanOutput(true));
        set.put(new IntegerArrayInput(Arrays.asList(-3, -2, 2, 4)), new BooleanOutput(false));

        return set;
    }

    @Override
    public String leetCodeId() {
        return "456";
    }

    @Override
    public String leetCodeTitle() {
        return "132 Pattern";
    }

    @Override
    public Difficulty difficulty() {
        return Difficulty.MEDIUM;
    }
}
