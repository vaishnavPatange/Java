public class InorderTraversal {
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
                        newNode.right = buildTree(nodes);
                        return newNode;
                }

                public void inorder(Node root){
                        if(root == null){
                                return;
                        }
                        inorder(root.left);
                        System.out.print(root.data + " ");
                        inorder(root.right);
                }

        }

        public static void main(String[] args){
                int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
                BinaryTree bt = new BinaryTree();
                Node root = bt.buildTree(nodes);
                bt.inorder(root);
        }

}
