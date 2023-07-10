class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        int size = 0;
        TreeNode removed;
        while (!queue.isEmpty()){
            size = queue.size();
            for(int i = 0;i<size;i++){
                removed = queue.remove();
                if(removed==null)continue;
                if(removed.left==null && removed.right==null) return depth;
                queue.add(removed.left);
                queue.add(removed.right);
            }
            depth++;
        }
        return 0;
    }
}