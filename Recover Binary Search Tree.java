class Solution {
  
      
    TreeNode firstpoint, lastpoint;
    TreeNode prevnode;
    
    public void find(TreeNode root){
        if(root == null)return;
        find(root.left);
        if(prevnode != null){
            if(prevnode.val > root.val){
                if(firstpoint == null){
                    firstpoint = prevnode;
                }
                lastpoint = root;
            }
        }
        prevnode = root;
        find(root.right);
    }
   public void recoverTree(TreeNode root) {
        
        find(root);
        int temp = firstpoint.val;
        firstpoint.val = lastpoint.val;
        lastpoint.val = temp;
        
    }
}
