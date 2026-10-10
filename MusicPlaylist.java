
public class MusicPlaylist {
    static class Node {
        String song;
        Node next;

        Node(String song) {
            this.song = song;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node("Song A");
        Node second = new Node("Song B");
        Node third = new Node("Song C");

        head.next = second;
        second.next = third;

        Node current = head;

        System.out.println("Music Playlist:");

        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }
    }
}
