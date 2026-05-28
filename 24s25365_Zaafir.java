import java.util.Scanner;

/*
 * Student ID: 24s25365
 * Student Name: Zaafir Sajid
 * Module: COMP 30010.1 Software Quality Assurance
 */
class JobDemandClassifier {
    private static final int HIGH_DEMAND_THRESHOLD = 1000;
    private static final int MEDIUM_DEMAND_THRESHOLD = 500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sector;

        System.out.println("Job Market Trends Analysis System");
        System.out.println("This program classifies job demand by sector and number of job postings.");
        System.out.println("Choose one sector by entering only the number from 1 to 5.");
        System.out.println("1. IT");
        System.out.println("2. Healthcare");
        System.out.println("3. Engineering");
        System.out.println("4. Education");
        System.out.println("5. Tourism");
        System.out.println("6. Logistics");
        System.out.print("Enter sector number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a numeric sector value.");
            scanner.close();
            return;
        }

        int sectorChoice = scanner.nextInt();

        switch (sectorChoice) {
            case 1:
                sector = "IT";
                break;
            case 2:
                sector = "Healthcare";
                break;
            case 3:
                sector = "Engineering";
                break;
            case 4:
                sector = "Education";
                break;
            case 5:
                sector = "Tourism";
                break;
            case 6:
                sector = "Logistics";
                break;    
            default:
                System.out.println("Error: Invalid sector selected.");
                scanner.close();
                return;
        }

        System.out.print("Enter number of job postings: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a numeric job posting value.");
            scanner.close();
            return;
        }

        int jobPostings = scanner.nextInt();

        if (jobPostings < 0) {
            System.out.println("Error: Job postings cannot be negative.");
        } else if (jobPostings >= HIGH_DEMAND_THRESHOLD) {
            System.out.println(sector + " sector has High Demand.");
        } else if (jobPostings >= MEDIUM_DEMAND_THRESHOLD) {
            System.out.println(sector + " sector has Medium Demand.");
        } else {
            System.out.println(sector + " sector has Low Demand.");
        }

        scanner.close();
    }
}
