import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        // 3 hourly workers
        workers.add(new Worker(
                "John", "Smith", "W001",
                "Mr.", 1990, 20.00));

        workers.add(new Worker(
                "Mary", "Jones", "W002",
                "Ms.", 1988, 22.50));

        workers.add(new Worker(
                "David", "Brown", "W003",
                "Mr.", 1995, 18.75));

        // 3 salary workers
        workers.add(new SalaryWorker(
                "Sarah", "Wilson", "S001",
                "Ms.", 1985, 52000.00));

        workers.add(new SalaryWorker(
                "Michael", "Davis", "S002",
                "Mr.", 1980, 65000.00));

        workers.add(new SalaryWorker(
                "Emily", "Taylor", "S003",
                "Dr.", 1992, 78000.00));

        double[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {

            double hours = weeklyHours[week];

            System.out.println();
            System.out.println("==============================================");
            System.out.println("Week " + (week + 1) + " - " + hours + " Hours");
            System.out.println("==============================================");

            System.out.printf(
                    "%-20s %-15s %-15s%n",
                    "Worker",
                    "Hours",
                    "Weekly Pay"
            );

            System.out.println("----------------------------------------------");

            for (Worker worker : workers) {

                double pay = worker.calculateWeeklyPay(hours);

                System.out.printf(
                        "%-20s %-15.1f $%-15.2f%n",
                        worker.fullName(),
                        hours,
                        pay
                );
            }
        }
    }
}