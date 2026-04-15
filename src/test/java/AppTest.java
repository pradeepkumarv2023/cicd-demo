import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testLowOrderAndPeak() {
        double fee = App.calculateDeliveryFee(10, 80, true);
        assertEquals(100, fee); 
        // 10*5 = 50 + 20 (low order) + 30 (peak) = 100
    }

    @Test
    void testNormalOrderNonPeak() {
        double fee = App.calculateDeliveryFee(10, 200, false);
        assertEquals(50, fee); 
        // 10*5 = 50 only
    }

    @Test
    void testLowOrderNonPeak() {
        double fee = App.calculateDeliveryFee(10, 80, false);
        assertEquals(70, fee); 
        // 50 + 20 = 70
    }
}