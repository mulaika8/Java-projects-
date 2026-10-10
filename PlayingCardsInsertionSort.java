public class PlayingCardsInsertionSort {
    public static void main(String[] args) {
        int[] cards = {5, 3, 8, 4, 2};

        System.out.println("Original Cards:");

        for (int card : cards) {
            System.out.print(card + " ");
        }

        for (int i = 1; i < cards.length; i++) {
            int key = cards[i];
            int j = i - 1;

            while (j >= 0 && cards[j] > key) {
                cards[j + 1] = cards[j];
                j--;
            }

            cards[j + 1] = key;
        }

        System.out.println("\nSorted Cards:");

        for (int card : cards) {
            System.out.print(card + " ");
        }
    }
}
