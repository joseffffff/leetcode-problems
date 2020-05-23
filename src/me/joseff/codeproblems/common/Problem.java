package me.joseff.codeproblems.common;

import java.util.Map;

public interface Problem<Input extends BaseInput, Output extends BaseOutput> {

    public Output execute(Input input);

    public Map<Input, Output> inputsOutputsSet();

    public String leetCodeId();

    public String leetCodeTitle();

    default boolean check() {

        Map<Input, Output> set = this.inputsOutputsSet();

        for (Input input : set.keySet()) {
            BaseOutput inputsOutputsSetOutput = set.get(input);

            BaseOutput output = this.execute(input);

            boolean resultProblem = output.compareTo(inputsOutputsSetOutput);

            if (!resultProblem) {
                return false;
            }
        }

        return true;
    }

}
