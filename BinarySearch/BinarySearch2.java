// // package BinarySearch;
// import java.util.*;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

// class BinaryTree {
//     static int idx = -1;

//     public Node builderTree(int nodes[]) {
//         idx++;
//         if (nodes[idx] == -1) {
//             return null;
//         }
//         Node newNode = new Node(nodes[idx]);
//         newNode.left = builderTree(nodes);
//         newNode.right = builderTree(nodes);
//         return newNode;
//     }

//     public void levelorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         while (!q.isEmpty()) {
//             Node currNode = q.remove();
//             if (currNode == null) {
//                 System.out.println();
//                 if (q.isEmpty()) {
//                     break;
//                 } else {
//                     q.add(null);
//                 }
//             } else {
//                 System.out.print(currNode.data + " ");
//                 if (currNode.left != null) {
//                     q.add(currNode.left);
//                 }
//                 if (currNode.right != null) {
//                     q.add(currNode.right);
//                 }
//             }
//         }
//     }
// }

// public class BinarySearch2 {
//     public static void main(String[] args) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.builderTree(nodes);
//         System.out.println("Root Node: " + root.data);
//         System.out.println();
//         tree.levelorder(root);
//     }
// }
