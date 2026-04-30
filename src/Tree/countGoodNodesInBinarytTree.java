package Tree;

public class countGoodNodesInBinarytTree {

    static class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);
    }

    private static int helper(TreeNode root,int currMax){
        if(root==null) return 0;

        int cnt=0;
        if(root.val >= currMax){
            cnt =1;
            currMax = root.val;
        }

        int left=helper(root.left  , currMax);
        int right=helper(root.right , currMax);
        return left + right + cnt;
    }

    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);

        root.left.left=new TreeNode(3);

        root.right.left=new TreeNode(1);
        root.right.right=new TreeNode(5);

        System.out.println("Nodes :" + goodNodes(root));


    }
}
