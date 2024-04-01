class TreeNode {
    //Assigning the property
    public int val;
    public TreeNode left;
    public TreeNode right;

    //Creating the node using constructor class
    public TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }

   //main class
    public static void main(String[] args) {
        //creating the root node
        TreeNode root = new TreeNode(4);
     
        root.left = new TreeNode(8);   //left root
        root.right = new TreeNode(15); //right root

        TreeNode leftNode = root.left; //new leftnode
        TreeNode rightNode = root.right; //new rightnode

        leftNode.left = new TreeNode(16);

        rightNode.left = new TreeNode(23);
        rightNode.right = new TreeNode(42);

        System.out.println(root.val);//root value
        System.out.println(root.right.left.val);//leaf value
    }
}
