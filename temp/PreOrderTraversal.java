package temp;
public class PreOrderTraversal {
    public static void preOrderTraversal(TreeNode root){
        //Terminating condition
        if(root == null){
            return;
        }
        //Print the  value of the root 
        System.out.println(root.val + "->");

        //Traversing the left node
        preOrderTraversal(root.left);

        //Traversing the right node
        preOrderTraversal(root.right);
    }
    
}
