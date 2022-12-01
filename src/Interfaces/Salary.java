package Interfaces;

public interface Salary {
    int salaryToPay(int hoursWorked, int payRate);

    default int salaryForOvertime(int overtimeHours, int overtimePayRate){
        return overtimeHours * overtimePayRate;
    }

    static boolean EligibleForExtraSalary(int yearsOfExperience){
        return yearsOfExperience >= 10;
    }
}
