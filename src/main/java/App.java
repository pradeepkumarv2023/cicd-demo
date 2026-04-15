public class App {

    public static double calculateDeliveryFee(double distance, double orderValue, boolean isPeakTime) {

        double fee = distance * 5; // ₹5 per km

        if (orderValue < 100) {
            fee += 20; // low order charge
        }

        if (isPeakTime) {
            fee += 30; // peak charge
        }

        return fee;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Food Delivery Pricing System Started...");
        
        while (true) {
            Thread.sleep(5000);
            double fee = calculateDeliveryFee(10, 80, true);
            System.out.println("Delivery Fee: " + fee);
        }
    }
}