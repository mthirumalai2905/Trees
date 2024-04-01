import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        //Start with the first/root node
        treeNodeQueue.add(root);

        //Run a loop till this queue is not empty
        while(!treeNodeQueue.isEmpty()){
            TreeNode treeNode = treeNodeQueue.poll();

            //Print the value
            System.out.print(treeNode.val + "->");

            //Add left child to queue
            if(treeNode.left != null){
                treeNodeQueue.add(treeNode.left);
            }

            //Add right child to queue
            if(treeNode.right != null){
                treeNodeQueue.add(treeNode.right);
            }
        }
    }
    
}
