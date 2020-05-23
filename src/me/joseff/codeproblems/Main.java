package me.joseff.codeproblems;

import me.joseff.codeproblems.common.Problem;
import me.joseff.codeproblems.problems.balancedStrings.BalancedStrings;
import me.joseff.codeproblems.problems.palindromeNumer.PalindromeNumber;
import me.joseff.codeproblems.problems.twoSum.TwoSum;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<Problem> problems;

    public static void main(String[] args) {
        addProblems();
        runProblems();
    }

    private static void addProblems() {
        problems = Arrays.asList(
                // List of problems here
                new TwoSum(),
                new PalindromeNumber(),
                new BalancedStrings()
        );
    }

    private static void runProblems() {

        problems.forEach((Problem problem) -> {
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
