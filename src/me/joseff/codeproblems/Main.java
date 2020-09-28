package me.joseff.codeproblems;

import me.joseff.codeproblems.common.BaseInput;
import me.joseff.codeproblems.common.BaseOutput;
import me.joseff.codeproblems.common.Problem;
import me.joseff.codeproblems.problems.balancedstrings.BalancedStrings;
import me.joseff.codeproblems.problems.onethreetwopattern.OneThreeTwoPattern;
import me.joseff.codeproblems.problems.palindromelinkedlist.PalindromeLinkedList;
import me.joseff.codeproblems.problems.palindromenumber.PalindromeNumber;
import me.joseff.codeproblems.problems.twosum.TwoSum;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<Problem<? extends BaseInput, ? extends BaseOutput<?>>> problems;

    public static void main(String[] args) {
        addProblems();
        runProblems();
    }

    private static void addProblems() {
        problems = Arrays.asList(
                // List of problems here
                new TwoSum(),
                new PalindromeNumber(),
                new BalancedStrings(),
                new PalindromeLinkedList(),
                new OneThreeTwoPattern()
        );
    }

    private static void runProblems() {
        problems.forEach((Problem<? extends BaseInput, ? extends BaseOutput<?>> problem) -> {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Problem ID " + problem.leetCodeId() + ": " + problem.leetCodeTitle());

            boolean result = problem.check();

            if (result) {
                System.out.println("¡¡Problem match with ALL the expected outputs!!");
            } else {
                System.out.println("¡¡Problem does not match with the expected outputs!!");
            }

            System.out.println("--------------------------------------------------------------------------");
        });
    }
}
