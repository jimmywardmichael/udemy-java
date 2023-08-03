public class Student {
    private String name;
    private int[] scores;

    // Constructor to initialize student name and scores
    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // Method to calculate the average score of the student
    public double calculateAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Method to display the student's information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage Score: " + calculateAverageScore());
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of students
        Student[] students = new Student[3];

        // Initialize students with their names and scores
        students[0] = new Student("Alice", new int[]{85, 90, 78, 95, 88});
        students[1] = new Student("Bob", new int[]{75, 82, 88, 79, 91});
        students[2] = new Student("Charlie", new int[]{92, 89, 78, 85, 96});

        // Display information for all students using a loop
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
