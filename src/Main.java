//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        getMaxLength();
    }

    public static void getMaxLength(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int depth = maxDepth(root);
        System.out.println("\nMaximum depth of the binary tree is: " + depth);
    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        System.out.print(root.val + " ");
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return 1+Math.max(left_depth, right_depth);
    }

}