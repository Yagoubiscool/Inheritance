import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    void testCalculateWeeklyPay40Hours() {
        Worker worker = new Worker(
                "John",
                "Smith",
                "12345",
                "Mr.",
                1990,
                20.00
        );

        double pay = worker.calculateWeeklyPay(40);

        assertEquals(800.00, pay);
    }

    @Test
    void testCalculateWeeklyPay50Hours() {
        Worker worker = new Worker(
                "John",
                "Smith",
                "12345",
                "Mr.",
                1990,
                20.00
        );

        double pay = worker.calculateWeeklyPay(50);

        assertEquals(1100.00, pay);
    }

    @Test
    void testHourlyPayRate() {
        Worker worker = new Worker(
                "John",
                "Smith",
                "12345",
                "Mr.",
                1990,
                20.00
        );

        assertEquals(20.00, worker.getHourlyPayRate());

        worker.setHourlyPayRate(25.00);

        assertEquals(25.00, worker.getHourlyPayRate());
    }
}