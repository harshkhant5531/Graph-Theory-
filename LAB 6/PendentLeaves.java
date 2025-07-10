import java.util.List;
import java.util.ArrayList;

public class PendentLeaves {

    public static void main(String[] args) {
        int[] arr = { 3, 9, 20, -1, -1, 15, 7 };

        TreeNode root = createTree(arr, 0);
        System.out.print("Preorder traversal\n");
        preOrder(root);
        List<Integer> list = new ArrayList<>();
        pendentLeaves(list, root);
        System.out.println("\nPendent Leaves:" + list);

    }

    public static TreeNode createTree(int[] arr, int i) {
        TreeNode root = new TreeNode(arr[i]);
        if (2 * i + 1 < arr.length && arr[2 * i + 1] != -1) {
            root.left = createTree(arr, 2 * i + 1);
        }
        if (2 * i + 2 < arr.length && arr[2 * i + 2] != -1) {
            root.right = createTree(arr, 2 * i + 2);
        }
        return root;

    }

    public static void preOrder(TreeNode root) {
        System.out.println(root.value + " ");
        if (root.left != null) {
            preOrder(root.left);
        }

        if (root.right != null) {
            preOrder(root.right);
        }
    }

    public static void pendentLeaves(List list, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.value);
            return;
        }
        pendentLeaves(list, root.left);
        pendentLeaves(list, root.right);
    }

}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }

}
