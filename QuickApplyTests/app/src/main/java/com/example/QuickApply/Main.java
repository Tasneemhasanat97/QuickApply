package com.example.QuickApply;
import java.util.Scanner;

public class Main {
    private static IQuickApply quickApply;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuickApplyFactory quickApplyFactory = new QuickApplyFactory();
        quickApply = quickApplyFactory.createQuickApply();
        System.out.println("Welcome to QuickApply!");

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1, 2, or 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 3) {
                break;
            }

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (choice == 1) {
                if (quickApply.authenticateUser(email, password)) {
                    System.out.println("Login successful!");
                    // Implement other user interactions here, e.g., view colleges, submit applications, etc.

                    // Create a student profile
                    createStudentProfile(scanner, email);

                    // View available colleges
                    viewColleges();

                    // Apply for Program 
                    applyForProgram(scanner, email);

                    // Send Application status email
                    sendApplicationStatusEmail(email);

                } else {
                    System.out.println("Login failed. Incorrect email or password.");
                }
            } else if (choice == 2) {
                quickApply.addUser(email, password);
                System.out.println("Sign up successful!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using QuickApply!");
        scanner.close();
    }


    private static void createStudentProfile(Scanner scanner, String email) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your SAT score: ");
        String satScore = scanner.nextLine();

        System.out.print("Enter your GPA: ");
        String gpa = scanner.nextLine();

        Student student = new Student(email, name, satScore, gpa);
        quickApply.addStudent(student);

        System.out.println("Profile created successfully!");
    }

    private static void viewColleges() {
        System.out.println("\nAvailable colleges:");
        for (College college : quickApply.getAllColleges()) {
            System.out.println("College: " + college.getName());
            System.out.println("Admissions Requirements:");
            System.out.println("  SAT Score: " + college.getAdmissions().getSatScoreRequirement());
            System.out.println("  GPA: " + college.getAdmissions().getGpaRequirement());
        }
    
    }

    private static void applyForProgram(Scanner scanner, String email) {
        System.out.println("\nApply for a Program:");
        System.out.print("Enter the college name: ");
        String collegeName = scanner.nextLine();
    
        System.out.print("Enter the program name: ");
        String programName = scanner.nextLine();
    
        Student student = quickApply.getStudent(email);
        Application application = new Application(student, collegeName, programName);
        quickApply.addApplication(application);
    
        System.out.println("Application submitted successfully!");
    }
    
    private static void sendApplicationStatusEmail(String email) {
        // In a real-world scenario, you would send an actual email using an email service.
        // For demonstration purposes, we will simulate sending an email by printing a message to the console.
        System.out.println("\nApplication status email has been sent to " + email + ".");
    }
    
    
}   