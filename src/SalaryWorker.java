public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID,
                        String title, int YOB, double annualSalary) {

        super(firstName, lastName, ID, title, YOB, 0);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52.0;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Weekly Pay: $" + calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toJSON() {
        return "{\"firstName\":\"" + getFirstName() +
                "\",\"lastName\":\"" + getLastName() +
                "\",\"ID\":\"" + getID() +
                "\",\"title\":\"" + getTitle() +
                "\",\"YOB\":" + getYOB() +
                ",\"annualSalary\":" + annualSalary + "}";
    }

    @Override
    public String toXML() {
        return "<SalaryWorker>" +
                "<firstName>" + getFirstName() + "</firstName>" +
                "<lastName>" + getLastName() + "</lastName>" +
                "<ID>" + getID() + "</ID>" +
                "<title>" + getTitle() + "</title>" +
                "<YOB>" + getYOB() + "</YOB>" +
                "<annualSalary>" + annualSalary + "</annualSalary>" +
                "</SalaryWorker>";
    }
}