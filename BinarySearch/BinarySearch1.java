package BinarySearch;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    static int idx = -1;

    public Node builderTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = builderTree(nodes);
        newNode.right = builderTree(nodes);
        return newNode;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

   public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
       
        inorder(root.right);
    }


   public void postorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");
    }
}

public class BinarySearch1 {
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.builderTree(nodes);
        System.out.println("Root Node: " +  root.data);

        tree.preorder(root);
        System.out.println();
         tree.inorder(root);
         System.out.println();
         tree.postorder(root);
    }
}
