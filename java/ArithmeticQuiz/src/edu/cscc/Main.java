package edu.cscc;

/**
 * Main routine for quiz
 */
public class Main {

    /**
     * Quiz student on set of arithmetic problems
     * @param args ignored
     */
    public static void main(String[] args) {
        int numQuestions = 6;
        int correct = 0;
        int wrong = 0;
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);

        System.out.println("*** Arithmetic Quiz - Answer " + numQuestions + " Questions ***");
        for (int i = 0; i < numQuestions; i++) {
            if (quiz.doQuiz()) {
                correct++;
            } else {
                wrong++;
            }
        }

        System.out.println("Your score: " + correct + " Correct  " + wrong + " Wrong");
        if (wrong == 0) {
            System.out.println("Excellent!");
        }
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State websites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */