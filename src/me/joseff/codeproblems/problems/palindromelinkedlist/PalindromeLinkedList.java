package me.joseff.codeproblems.problems.palindromelinkedlist;

import me.joseff.codeproblems.common.Difficulty;
import me.joseff.codeproblems.common.Problem;
import me.joseff.codeproblems.outputs.BooleanOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class PalindromeLinkedList implements Problem<Input, BooleanOutput> {

    @Override
    public BooleanOutput execute(Input input) {

        LinkedList<Integer> numbers = input.getLinkedList();
        List<Integer> numbersStack = new ArrayList<>();

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            numbersStack.add(number);
        }

        while (numbersStack.size() > 0) {
            Integer first = numbersStack.get(0);
            numbersStack.remove(0);

            if (numbersStack.size() > 0) {
                Integer last = numbersStack.get(numbersStack.size() - 1);
                numbersStack.remove(numbersStack.size() - 1);

                if (!first.equals(last)) {
                    return new BooleanOutput(false);
                }
            }
        }

        return new BooleanOutput(true);
    }

    @Override
    public Map<Input, BooleanOutput> inputsOutputsSet() {

        Map<Input, BooleanOutput> set = new HashMap<>();

        set.put(new Input(new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1))), new BooleanOutput(true));
        set.put(new Input(new LinkedList<>(Arrays.asList(1, 2))), new BooleanOutput(false));
        set.put(new Input(new LinkedList<>(Arrays.asList(1, 2, 3))), new BooleanOutput(false));
        set.put(new Input(new LinkedList<>(Arrays.asList(1, 2, 3, 4))), new BooleanOutput(false));
        set.put(new Input(new LinkedList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1))), new BooleanOutput(true));

        return set;
    }

    @Override
    public String leetCodeId() {
        return "234";
    }

    @Override
    public String leetCodeTitle() {
        return "Palindrome Linked List";
    }

    @Override
    public Difficulty difficulty() {
        return Difficulty.EASY;
    }
}
