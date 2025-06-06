package in.binaryTree.one;

public class BTImplementation {

        static class Node{
                int data;
                Node left;
                Node right;

                public Node(int data) {
                        this.data = data;
                }
        }

        static class BinaryTree{
                static int idx = -1;
                public Node buildTree(int[] nodes){
                        idx++;
                        if(nodes[idx] == -1){
                                return null;
                        }
                        Node newNode = new Node(nodes[idx]);
                        newNode.left = buildTree(nodes);
                        newNode.right = buildTree(nodes);
                        return newNode;
                }
        }

        public static void main(String[] args) {
                int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
                BinaryTree tree = new BinaryTree();
                Node root = tree.buildTree(nodes);
                System.out.println(root.data);
        }
}
