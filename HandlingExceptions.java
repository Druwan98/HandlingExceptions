package Lessons.Exercise.HandlingExceptions;

public class HandlingExceptions {

    public static void checkScore(double score) {
        if (0 < score && score <= 50.00) {
            System.out.println("Avarage Score");
        } else if (50.00 < score && score <= 100) {
            System.out.println("Very Good Score!");
        } else {
            throw new ArithmeticException("Score is out of scale");
        }
    }

    public static void main(String[] args) {
        double[] allScores = {2.15, 50, 95.02, 100.01};
        for (double d : allScores) {
            try {
                double imputScore = d;
                checkScore(d);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Exception:" + arithmeticException.getMessage());
            }
        }
    }

}






