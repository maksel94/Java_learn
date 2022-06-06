package decomposition;

public class Example {
    public static long createOrder(long userId, String[] products, int[] prices, int[] counts) {
        if (isShoppingCartValid(products, counts)) {
            if(isCreateOrderAllowed(userId)) {
                if(isTotalCostLessThanMax(prices, counts)) {
                    return createOrderAfterValidation(userId, products, prices, counts);
                } else {
                    // TODO throw exception
                    return -3;
                }
            } else {
                // TODO throw exception
                return -4;
            }
        } else {
            // TODO throw exception
            return -5;
        }
    }

    private static long createOrderAfterValidation(long userId, String[] products, int[] prices, int[] counts) {
        long orderId = saveOrderToDatabase(userId, products, counts);
        String email = findEmailForUser(userId);
        sendPrderCompletedEmail(email, orderId, products, prices, counts);
        return orderId;
    }

    private static boolean isShoppingCartValid(String[] products, int[] counts) {
        return false;
    }

    private static boolean isCreateOrderAllowed(long userId) {
        return false;
    }

    private static boolean isTotalCostLessThanMax(int[] prices, int[] counts) {
        return false;
    }

    private static long saveOrderToDatabase(long userId, String[] products, int[] counts) {
        return 0;
    }

    private static String findEmailForUser(long userId) {
        return null;
    }

    private static void sendPrderCompletedEmail(String email, long orderId, String[] products, int[] prices, int[] counts) {

    }
}
