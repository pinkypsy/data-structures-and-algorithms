package ua.alvin.binarysearchtree;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        }else {
            root.insert(value);
        }
    }

    public TreeNode get(int value){

        if (root != null){
            return root.get(value);
        }

        return null;
    }

    public int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        } else{
            return root.min();
        }
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }
    public void traversePreOrder(){
        if (root != null){
            root.traversePreOrder();
        }
    }
    public void traversePostOrder(){
        if (root != null){
            root.traversePostOrder();
        }
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            //case 1 & 2: node has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();//if 1 child returns it, if 0 child return 0 as supposed
            } else if (subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();//if 1 child returns it, if 0 child return 0 as supposed
            } else { //case 3: node has 2 children (if left route then replace deleted node with biggest OR if right route - replace with smallest)

                subtreeRoot.setData(subtreeRoot.getRightChild().min());//choose right and replace with smallest value
                //delete the node that has the smallest value in the right subtree
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
            }
        }
        return subtreeRoot;
    }

}
