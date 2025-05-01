package in.binaryTree.one;

public class PreorderTraversal {
        static class Node{
                int data;
                Node left;
                Node right;
                public Node(int data){
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
                        newNode.right  = buildTree(nodes);
                        return newNode;
                }

                public void preorder(Node root){
                        if(root == null){
                                return;
                        }
                        System.out.print(root.data + " ");
                        preorder(root.left);
                        preorder(root.right);
                }

        }

        public static void main(String[] args){
                int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
                BinaryTree binaryTree = new BinaryTree();
               Node root =  binaryTree.buildTree(nodes);
               binaryTree.preorder(root);
        }

}
