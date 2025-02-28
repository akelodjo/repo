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
public class Procedure {
	private String procedure_name,procedure_date,practitioner_name;
	private double procedure_charges;
	
//  contructor for each attributes
    public Procedure() {
    }

    
    public Procedure(String procedure_name, String procedure_date) {
        this.procedure_name = procedure_name;
        this.procedure_date = procedure_date;
    }

    
    public Procedure(String procedure_name,String practitioner_name ,String procedure_date, double procedure_charges) {
        this.procedure_name = procedure_name;
        this.procedure_date = procedure_date;
        this.practitioner_name = practitioner_name;
        this.procedure_charges = procedure_charges;
    }

    // accessor for each attributes
    public String getprocedure_name() {
        return procedure_name;
    }

    public String getprocedure_date() {
        return procedure_date;
    }

   
    public String getpractitioner_name() {
        return practitioner_name;
    }


    public double getprocedure_charges() {
        return procedure_charges;
    }

    // mutator for each attributes
    public void setProcedure_name(String procedure_name) {
        this.procedure_name = procedure_name;
    }

    public void setprocedure_date(String procedure_date) {
        this.procedure_date = procedure_date;
    }

   
    public void setpractitioner_name(String practitioner_name) {
        this.practitioner_name= practitioner_name;
    }

    public void setprocedure_charges(double procedure_charges) {
        this.procedure_charges = procedure_charges;
    }
    /*
     * this method display return a string which is the procedure output
     */
    public  String toString () {
		return "\tProcedure: "+getprocedure_name()+"\n"+"\tProcedureDate: "+getprocedure_date()+"\n"+"\tPractitioner: "+ getpractitioner_name()
		+"\n"+"\tCharge="+getprocedure_charges()+"\n";
		}
   
}
