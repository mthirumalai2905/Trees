public class PostOrderTraversal {
    public static void postOrderTraversal(TreeNode root){
        //Terminating condition
        if(root == null){
            return;
        }

        //Traversing the left node
        postOrderTraversal(root.left);
        //Traversing the right node
        postOrderTraversal(root.right);
        //printing the value
        System.out.println(root.val + "->");
        
    }
    
}
