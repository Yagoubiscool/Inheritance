import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    void testCalculateWeeklyPay() {

        SalaryWorker worker = new SalaryWorker(
                "Jane",
                "Smith",
                "54321",
                "Ms.",
                1995,
                52000.00
        );

        double pay = worker.calculateWeeklyPay(40);

        assertEquals(1000.00, pay);
    }

    @Test
    void testPayDoesNotChangeWithHours() {

        SalaryWorker worker = new SalaryWorker(
                "Jane",
                "Smith",
                "54321",
                "Ms.",
                1995,
                52000.00
        );

        double pay40 = worker.calculateWeeklyPay(40);
        double pay50 = worker.calculateWeeklyPay(50);

        assertEquals(pay40, pay50);
    }

    @Test
    void testAnnualSalary() {

        SalaryWorker worker = new SalaryWorker(
                "Jane",
                "Smith",
                "54321",
                "Ms.",
                1995,
                52000.00
        );

        assertEquals(52000.00, worker.getAnnualSalary());

        worker.setAnnualSalary(62400.00);

        assertEquals(62400.00, worker.getAnnualSalary());
    }
}