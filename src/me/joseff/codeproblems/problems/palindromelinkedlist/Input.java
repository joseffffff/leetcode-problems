package me.joseff.codeproblems.problems.palindromelinkedlist;

import me.joseff.codeproblems.common.BaseInput;

import java.util.LinkedList;

public class Input implements BaseInput {

    private final LinkedList<Integer> linkedList;

    public Input(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}
