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
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.buildBT(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
    }
}
