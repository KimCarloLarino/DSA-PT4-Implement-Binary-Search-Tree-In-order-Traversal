public class BST {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
    }
    
    public Node root;
    
    public Node createNode(int value) {
        Node node = new Node();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }
    
    public Node insert(Node node, int value) {
        if (node == null) {
            return createNode(value);
        }
      
        if(value < node.value) {
            node.left = insert(node.left, value);
        } 
        else if(value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }
    
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
      
        inOrder(node.left);
        System.out.print(node.value + " , ");
        inOrder(node.right);
    }
    
}
