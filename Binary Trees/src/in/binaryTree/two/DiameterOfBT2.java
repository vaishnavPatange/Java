package in.binaryTree.two;

public class DiameterOfBT2 {
        public static class Node{
                int data;
                Node left;
                Node right;
                public Node(int data){
                        this.data = data;
                }
        }

        public static class NodeInfo{
                int dm;
                int ht;
                public NodeInfo(int dm, int ht){
                        this.dm = dm;
                        this.ht = ht;
                }
        }

        public static NodeInfo diameter(Node root){
                if(root == null){
                        return new NodeInfo(0, 0);
                }
                NodeInfo left = diameter(root.left);
                NodeInfo right = diameter(root.right);

                int currDm = Math.max(Math.max(left.dm, right.dm) , left.ht + right.ht + 1);
                int currHt = Math.max(left.ht, right.ht) + 1;
                return new NodeInfo(currDm, currHt);
        }

        public static void main(String[] args){
                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);
                root.left.right = new Node(5);
                root.right.left = new Node(6);
                root.right.right = new Node(7);
                System.out.println(diameter(root).dm);
                System.out.println(diameter(root).ht);
        }
}
