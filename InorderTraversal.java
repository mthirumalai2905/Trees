public class InorderTraversal {
    //Inorder traversal
    public static void inOrderTraversal(TreeNode root){
        //Terminating condition
        if(root == null){
            return;
        }

        //Traverse the left node
        inOrderTraversal(root.left);
        //Print the root node
        System.out.println(root.val + " -> ");
        //Go to the right node
        inOrderTraversal(root.right);
    }
    
}
