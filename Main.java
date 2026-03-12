public class Main {

    // Array to store student names
    static String[] studentNames = new String[100];

    // Array to store student grades
    static int[] studentGrades = new int[100];

    // Variable to track the number of students added
    static int count = 0;

    // Method to add a new student and their grade
    public static void addStudent(String name, int grade) {

        // Check if the array still has space
        if (count < studentNames.length) {

            // Store the student name
            studentNames[count] = name;

            // Store the student's grade
            studentGrades[count] = grade;

            // Increase the number of stored students
            count++;

            // Confirmation message
            System.out.println("Student added successfully: " + name);

        } else {
            // Message if the array is full
            System.out.println("Cannot add more students. The list is full.");
        }
    }

    // Method to display all added students
    public static void displayStudents() {

        // Check if no students were added
        if (count == 0) {
            System.out.println("No students have been added yet.");
            return;
        }

        System.out.println("\nStudents and their grades:");

        // Loop through the arrays and print each student and grade
        for (int i = 0; i < count; i++) {
            System.out.println(
                "Student " + (i + 1) + ": " + studentNames[i] +
                " | Grade: " + studentGrades[i]
            );
        }
    }

    // Method to calculate the average grade
    public static void calculateAverage() {

        try {

            int sum = 0;

            // Loop through grades to calculate the total sum
            for (int i = 0; i < count; i++) {
                sum += studentGrades[i];
            }

            // Calculate the average
            double average = (double) sum / count;

            // Print the average grade
            System.out.println("\nAverage grade: " + average);

        } catch (ArithmeticException e) {

            // Handle division by zero if no students exist
            System.out.println("Error: Cannot calculate average because no students were added.");
        }
    }

    // Main method to test the system
    public static void main(String[] args) {

        // Add some sample students
        addStudent("Ahmed", 85);
        addStudent("Sara", 90);
        addStudent("Mona", 78);

        // Display the students
        displayStudents();

        // Calculate and display the average grade
        calculateAverage();
    }
}
