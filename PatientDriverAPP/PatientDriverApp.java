/*
 * Class: CMSC203 
 * Instructor:
 * Description: The ap make sue of Class patient , class procedure and creat varoius object to display 
 * the information enter by a patient on the app
 * Due: 2/27/2025
 * Platform/compiler:javac/eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Armel Daryl Kelodjoue Nguetchouang
*/

import java.util.*;

public class PatientDriverApp {

    public static void main(String[] args) {
        
    	//variables
        String first_name, middle_name, last_name, street_address, city, zip, state,
                phone_number, emergency_name, emergency_contact,
                procedure, procedure_date, practitioner;
        double procedure_charges;

        Scanner input = new Scanner(System.in);
        //Patient information keyboard input
        System.out.println("Enter Patient information below:");
        System.out.print("First Name: ");
        first_name = input.nextLine();
        System.out.print("Middle Name: ");
        middle_name = input.nextLine();
        System.out.print("Last Name: ");
        last_name = input.nextLine();
        System.out.print("Street Address: ");
        street_address = input.nextLine();
        System.out.print("City: ");
        city = input.nextLine();
        System.out.print("State: ");
        state = input.nextLine();
        System.out.print("ZIP Code: ");
        zip = input.nextLine();
        while (!zip.matches("\\d{5}")) {
            System.out.println("Invalid ZIP Code. Please enter 5 digits.");
            System.out.print("ZIP Code: ");
            zip = input.nextLine();
        }

        System.out.print("Phone Number: ");
        phone_number = input.nextLine();
        while (!phone_number.matches("\\d{3}-\\d{3}-\\d{4}")) {
            System.out.println("Invalid phone number format. Please use the format 123-345-6789.");
            System.out.print("Phone Number: ");
            phone_number = input.nextLine();
        }
        System.out.print("Emergency Contact Name: ");
        emergency_name = input.nextLine();
        System.out.print("Emergency Contact Phone: ");
        emergency_contact = input.nextLine();
        System.out.println();
        Patient patient = new Patient(first_name, middle_name, last_name, street_address, city, state, zip,
                phone_number, emergency_name, emergency_contact);
        //Patient  procedure information keyboard input

        System.out.println("\nEnter patient's Procedure information :");
        System.out.print("Enter procedure name:");
        procedure = input.nextLine();
        System.out.print("Enter procedure date:");
        procedure_date = input.nextLine();
        while (!procedure_date.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            System.out.println("Invalid date format. Please use the format (e.g., 7/27/2023).");
            System.out.print("Enter procedure date : ");
            procedure_date = input.nextLine();
        }
        System.out.print("Enter practitioner's name:");
        practitioner = input.nextLine();
        System.out.print("Enter charges for the procedure:");
        procedure_charges = input.nextDouble();
        while (procedure_charges < 0) {
            System.out.println("Please enter a valid charge!!");
            procedure_charges = input.nextDouble();
        }
        input.nextLine(); 
        Procedure procedure1 = new Procedure(procedure, procedure_date, practitioner, procedure_charges);

        System.out.println("\nEnter details for Procedure :");
        System.out.print("Enter procedure name:");
        procedure = input.nextLine();
        System.out.print("Enter procedure date:");
        procedure_date = input.nextLine();
        while (!procedure_date.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            System.out.println("Invalid date format. Please use the format (e.g., 7/27/2023)");
            System.out.print("Enter procedure date (e.g., 7/27/2023): ");
            procedure_date = input.nextLine();
        }
        System.out.print("Enter practitioner's name:");
        practitioner = input.nextLine();
        System.out.print("Enter charges for the procedure:");
        procedure_charges = input.nextDouble();
        input.nextLine();
       
        while (procedure_charges < 0) {
            System.out.println("Please enter a valid charge!!");
            procedure_charges = input.nextDouble();
            input.nextLine();
        }
        
        Procedure procedure2 = new Procedure(procedure, procedure_date, practitioner, procedure_charges);

        System.out.println("\nEnter details for Procedure :");
        System.out.print("Enter procedure name:");
        procedure = input.nextLine();
        System.out.print("Enter procedure date (e.g., 7/27/2023):");
        procedure_date = input.nextLine();
        while (!procedure_date.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            System.out.println("Invalid date format. Please use the format (e.g., 7/27/2023)");
            System.out.print("Enter procedure date : ");
            procedure_date = input.nextLine();
        }
        System.out.print("Enter practitioner's name:");
        practitioner = input.nextLine();
        System.out.print("Enter charges for the procedure:");
        procedure_charges = input.nextDouble();
        input.nextLine(); 
        while (procedure_charges < 0) {
            System.out.println("Please enter a valid charge!!");
            procedure_charges = input.nextDouble();
        }
        Procedure procedure3 = new Procedure(procedure, procedure_date, practitioner, procedure_charges);
        System.out.println();
        //screen output
        displayPatient(patient);
        displayProcedure(procedure1, procedure2, procedure3);
        double total_charge = TotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%,.2f%n", total_charge);

        System.out.println("\nArmel Daryl Kelodjoue Nguetchouang");
        System.out.println("MC#:M21193269");
        System.out.println("Due Date: 2/27/2025");
        input.close();
    }
    /*
     * this method display patient information
     */
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }
    /*
     * this method display patient procedure information
     */
    public static void displayProcedure(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        System.out.println(procedure1.toString());
        System.out.println(procedure2.toString());
        System.out.println(procedure3.toString());
    }
    /*
     * this method compute total charge for 3 procedure
     */
    public static double TotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getprocedure_charges() + procedure2.getprocedure_charges() + procedure3.getprocedure_charges();
    }
}
