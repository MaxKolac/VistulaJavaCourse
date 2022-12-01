package Interfaces;

public class Staff extends Employee implements Salary{
    public String getEducationLevel() {
        return educationLevel;
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    private String educationLevel;
    private String job;
    private int yearsOfExperience;

    Staff() {

    }

    public void Initialize(String educationLevel, String job) {
        this.educationLevel = educationLevel;
        this.job = job;
        Initialize(this.getName(), this.getSecondName(), this.getStreetName(), this.getStreetNumber(),
        this.getPostalCode(), this.getCity());
    }

    public void PrintAll(){
        Print();
        System.out.print(", " + educationLevel + ", " + job);
        System.out.println();
    }

    public int salaryToPay(int hoursWorked, int payRate){
        int totalSalary = hoursWorked * payRate;
        if (Salary.EligibleForExtraSalary(getYearsOfExperience())){
            totalSalary += salaryForOvertime(2, 13);
        }
        return totalSalary;
    }
}
