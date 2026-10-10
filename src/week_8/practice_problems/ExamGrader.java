package week_8.practice_problems;

abstract class Question {
    protected String text, correctAnswer, studentAnswer;
    protected double points;
    public Question(String text, String correctAnswer, String studentAnswer, double points) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }
    public abstract double calculateScore();
    public abstract String getType();
}

class MCQ extends Question {
    public MCQ(String text, String correctAnswer, String studentAnswer, double points) {
        super(text, correctAnswer, studentAnswer, points);
    }
    @Override
    public double calculateScore() {
        return studentAnswer.equalsIgnoreCase(correctAnswer) ? points : 0;
    }
    @Override
    public String getType() { return "MCQ"; }
}

class TF extends Question {
    public TF(String text, String correctAnswer, String studentAnswer, double points) {
        super(text, correctAnswer, studentAnswer, points);
    }
    @Override
    public double calculateScore() {
        return studentAnswer.equalsIgnoreCase(correctAnswer) ? points : 0;
    }
    @Override
    public String getType() { return "TF"; }
}

class Essay extends Question {
    public Essay(String text, String correctAnswer, String studentAnswer, double points) {
        super(text, correctAnswer, studentAnswer, points);
    }
    @Override
    public double calculateScore() {
        String[] keywords = correctAnswer.split(",");
        int matchCount = 0;
        String studentAnsLower = studentAnswer.toLowerCase();
        
        for (String keyword : keywords) {
            if (studentAnsLower.contains(keyword.trim().toLowerCase())) {
                matchCount++;
            }
        }
        
        if (matchCount >= 2) return points * 0.75;
        if (matchCount == 1) return points * 0.50;
        return 0;
    }
    @Override
    public String getType() { return "ESSAY"; }
}

public class ExamGrader {
    public static void main(String[] args) {
        Question[] questions = {
            new MCQ("What is the capital of France?", "Paris", "Paris", 10),
            new TF("The Earth is flat?", "False", "True", 5),
            new Essay("Name two primary OOP principles.", "Inheritance, Polymorphism, Encapsulation", "Polymorphism is one.", 20),
            new Essay("Describe abstraction and composition.", "Abstraction, Composition", "I talked about abstraction.", 15)
        };

        double totalScore = 0;
        for (Question q : questions) {
            double score = q.calculateScore();
            totalScore += score;
            System.out.printf("%s: %.2f\n", q.getType(), score);
        }
        System.out.printf("Total Score: %.2f\n", totalScore);
    }
}