package Inheritance;

public class Staff extends Employee {
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

    private String educationLevel;
    private String job;

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
}
