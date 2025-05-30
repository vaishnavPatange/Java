package in.binaryTree.one;

public class HeightBT {
        static class Node{
                int data;
                Node left;
                Node right;
                public Node(int data){
                        this.data = data;
                }
        }

        public static int heightOfBT(Node root){
                if(root == null){
                        return 0;
                }
                return Math.max(heightOfBT(root.left), heightOfBT(root.right)) + 1;
        }

        public static void main(String[] args) {
                /*
                                  1
                               /      \
                             2         3
                          /    \      /    \
                        4      5   6      7
                 */

                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);
                root.left.right = new Node(5);
                root.right.left = new Node(6);
                root.right.right = new Node(7);
                root.right.right.right = new Node(8);
                root.right.right.right.right = new Node(9);

                System.out.println(heightOfBT(root));

        }
}
