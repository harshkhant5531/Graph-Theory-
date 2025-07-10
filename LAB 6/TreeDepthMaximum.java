
public class TreeDepthMaximum {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 20, -1, -1, 15, 7 };

        TreeNode root = createTree(arr, 0);
        System.out.print("Preorder traversal\n");
        preOrder(root);
        int maximumDepth = maxDepth(root);
        System.out.println("\nMaximum depth:" + maximumDepth);

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

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
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