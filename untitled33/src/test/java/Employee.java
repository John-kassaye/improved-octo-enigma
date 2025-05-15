package HotelOperations;

import java.time.LocalDateTime;

public class Employee {
   private String employeeId;
   private String name;
   private String department;
   private double payRate;
   private double hoursWorked;
   private double startTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double totalPay(){
        return regularHours() * getPayRate() + overTimeHours() * getPayRate() * 1.5;
    }

    public double regularHours(){
        return hoursWorked >= 40 ? 40 : hoursWorked;
    }

    public double overTimeHours(){
        return hoursWorked > 40 ? hoursWorked - 40 : 0;
    }

    public void punchIn(double startTime){
        this.startTime = startTime;
    }

    public void punchOut(double time){
        hoursWorked+= time - startTime;
    }

    public void punchIn() {
        int hours = LocalDateTime.now().getHour();
        int minutes = LocalDateTime.now().getMinute() * 1/60;
        startTime = hours + minutes;
    }

    public void punchOut() {
        int hours = LocalDateTime.now().getHour();
        double minutes = LocalDateTime.now().getMinute()/60.0;
        double endTime = hours + minutes;
        hoursWorked += endTime - startTime;
    }
}
