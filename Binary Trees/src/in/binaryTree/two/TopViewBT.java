package in.binaryTree.two;
import java.util.*;
public class TopViewBT {
        public static class Node{
                int data;
                Node left;
                Node right;
                public Node(int data){
                        this.data = data;
                }
        }
        public static class Info{
                Node node;
                int hd;
                public Info(int hd, Node node){
                        this.node = node;
                        this.hd = hd;
                }
        }

        public static void topView(Node root){
                Queue<Info> q = new LinkedList<>();
                HashMap<Integer, Node> hashMap = new HashMap<>();

                int min = 0, max = 0;
                q.add(new Info(0, root));
                q.add(null);
                while(!q.isEmpty()){
                        Info currInfo = q.remove();
                        if(currInfo == null){
                                if(q.isEmpty()){
                                        break;
                                } else{
                                        q.add(null);
                                }
                        } else{
                                if(!hashMap.containsKey(currInfo.hd)){
                                        hashMap.put(currInfo.hd, currInfo.node);
                                }
                                if(currInfo.node.left != null){
                                        q.add(new Info(currInfo.hd-1, currInfo.node.left));
                                        min = Math.min(min, currInfo.hd-1);
                                }
                                if(currInfo.node.right != null){
                                        q.add(new Info(currInfo.hd+1, currInfo.node.right));
                                        max = Math.max(max, currInfo.hd+1);
                                }
                        }
                }
                for (int i = min; i <= max; i++) {
                        System.out.print(hashMap.get(i).data+ "  ");
                }
        }

        public static void main(String[] args) {
                /*
                                   1
                               /       \
                             2         3
                         /     \       /     \
                       4       5   6        7
*/
//                Node root = new Node(1);
//                root.left = new Node(2);
//                root.right = new Node(3);
//                root.left.left = new Node(4);
//                root.left.right = new Node(5);
//                root.right.left = new Node(6);
//                root.right.right = new Node(7);


                /*
                                    1
                                  /   \
                                 2     3
                                  \
                                   4
                                    \
                                     5
                                      \
                                       6
*/

                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.right = new Node(4);
                root.left.right.right = new Node(5);
                root.left.right.right.right = new Node(6);

                topView(root);

        }
}
