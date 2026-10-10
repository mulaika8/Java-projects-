
public class ProductPriceSelectionSort {
    public static void main(String[] args) {
        int[] prices = {500, 200, 800, 100, 400};

        System.out.println("Original Prices:");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        for (int i = 0; i < prices.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = prices[i];
            prices[i] = prices[minIndex];
            prices[minIndex] = temp;
        }

        System.out.println("\nSorted Prices:");

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
