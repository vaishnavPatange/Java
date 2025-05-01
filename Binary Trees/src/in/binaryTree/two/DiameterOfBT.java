package in.binaryTree.two;


public class DiameterOfBT {
        public static class Node{
                int data;
                Node left;
                Node right;
                public Node(int data) {
                        this.data = data;
                }
        }
        public static int heightOfBT(Node root){
                if(root == null) return 0;
                return Math.max(heightOfBT(root.left), heightOfBT(root.right)) + 1;
        }

        public static int diameterOfBT(Node root){
                if(root == null) return 0;
                int leftD = diameterOfBT(root.left);
                int leftH = heightOfBT(root.left);
                int rightD = diameterOfBT(root.right);
                int rightH = heightOfBT(root.right);

                int selfD = leftH + rightH + 1;
                return Math.max(selfD, Math.max(leftD, rightD));
        }

        public static void main(String[] args) {
                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);
                root.left.right = new Node(5);
                root.right.left = new Node(6);
                root.right.right = new Node(7);
                System.out.println(diameterOfBT(root));

        }
}
