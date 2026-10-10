
public class BrowserHistory {
    static class Node {
        String page;
        Node next;

        Node(String page) {
            this.page = page;
        }
    }

    static Node top = null;

    static void visit(String page) {
        Node newNode = new Node(page);
        newNode.next = top;
        top = newNode;

        System.out.println("Visited: " + page);
    }

    static void goBack() {
        if (top == null) {
            System.out.println("No previous page");
        } else {
            System.out.println("Going back from: " + top.page);
            top = top.next;

            if (top != null) {
                System.out.println("Current page: " + top.page);
            } else {
                System.out.println("No page in history");
            }
        }
    }

    public static void main(String[] args) {
        visit("Google");
        visit("YouTube");
        visit("Wikipedia");

        goBack();
        goBack();
    }
}
