class Node {
    Node left, right;
    int val;

    Node(int val) {
        this.val = val;
    }
}

public class Symmetric_mirror {

    public static boolean isMirror(Node a, Node b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        if (a.val != b.val)
            return false;

        return isMirror(a.left, b.right) && isMirror(a.right, b.left);

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);

        Node b = new Node(1);
        b.left = new Node(3);
        b.right = new Node(2);

        System.out.println(isMirror(a, b));
    }

}
