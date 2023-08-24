import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class CreateBT {
        static int indx = -1;

        public static Node buildBT(int nodes[]) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildBT(nodes);
            newNode.right = buildBT(nodes);

            return newNode;
        }

        public static Node preOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return null;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

            return root;
        }

        public static Node inOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return null;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
            return root;
        }

        public static Node postOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return null;
            }
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
            return root;
        }

        public static void levelOrder(Node root) {

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }

        public static int countOfNode(Node root) {

            if (root == null) {
                return 0;
            }

            int leftNode = countOfNode(root.left);
            int rightNode = countOfNode(root.right);

            return leftNode + rightNode + 1;

        }

        public static int sumOfNode(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumOfNode(root.left);
            int rightSum = sumOfNode(root.right);

            return leftSum + rightSum + root.data;
        }

        public static int heightofTree(Node root) {
            if (root == null) {
                return 0;
            }

            int left = heightofTree(root.left);
            int right = heightofTree(root.right);

            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.buildBT(nodes);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // tree.inOrder(root);
        // tree.postOrder(root);
        // tree.levelOrder(root);
        // System.out.println(tree.countOfNode(root));
        // System.out.println(tree.sumOfNode(root));
        System.out.println(tree.heightofTree(root));
    }
}
