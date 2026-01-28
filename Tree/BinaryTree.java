package Tree;

import java.util.*;

public class BinaryTree {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }

    }

    static void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    static void printPreOrder(Node root) {  //TC:0(N) if level is given TC:2^l
        if (root == null) {                 // SC: 0(logn) -for balanced BT : worst-0(n)- for skewed
            return;
        }
        System.out.print(root.val + " -> ");

        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    static List<Integer> list = new LinkedList<>();

    static void printInorder(Node root) {

        if (root == null) {
            return;
        }

        printInorder(root.left);
        list.add(root.val);
        // System.out.print(root.val + " -> ");
        printInorder(root.right);

    }

    static void printList(List<Integer> list) {
        for (int no : list) {
            System.out.print(no + " ");
        }
    }

    static void printPostOrder(Node root) { //also called and DFS
        if (root == null) {
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.val + " -> ");
    }

    static void printNth(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.val + " ");
            return;// agar hum yahan return na lagye to ye last 
            // level tak traverse karega TC badh jaayega
            //without return TC:0(nlogn)
            //with return TC:0(n)
        }
        printNth(root.left, n - 1);
        printNth(root.right, n - 1);
    }

    static int findSize(Node root) {
        if (root == null) {
            return 0;
        }

        int l = findSize(root.left);
        int r = findSize(root.right);
        return l + r + 1;

    }
    //      2    1st level        
    //    /  \
    //   14    10   2nd level
    //  / \     \
    // 6   5     11   3rd level

    static int sumOfTree(Node root) { //TC:0(n)
        if (root == null) {
            return 0;
        }
        int l = sumOfTree(root.left);
        int r = sumOfTree(root.right);
        //pehle ye dono ke wajah se leaf tak jaayega
        //l=6, r=5 first sum=11
        //then root=4  now at 4 total=15 and at 10 total=21
        //now root is 2 l=15 r=21 total=36 ans;
        System.out.println(root.val + l + r);
        return root.val + l + r;

    }

    static int maxValOfNode(Node root) {
        if (root == null) {
            // return 0;//agar hum yahan pe 0 rtn karenge to
            // to -ve no me 0 hamesha max hoga jisse tree ki value nhi milegi
            // agr tree ki saari val +ve hai to propr kaam karega

            return Integer.MIN_VALUE;// isliye min val rtn kiya hai
        }

        // since return type is int so these will return val of node
        int l = maxValOfNode(root.left);
        int r = maxValOfNode(root.right);

        return Math.max(root.val, Math.max(l, r));
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0; // this is leaf node

        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lh = height(root.left); // it will not count 
        if (root.left != null) {
            lh++;
        }
        int rh = height(root.right);
        if (root.right != null) {
            rh++;
        }
        int d = lh - rh;
        if (d < 0) {
            d = -d;
        }
        if (d > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }
    //      2    1st level        
    //    /  \
    //   14    10   2nd level
    //  / \     \
    // 6   5     11   3rd level
    // at leaf node height fn returning zero so the height of node 14 will be 1
    //  but its not true
    //bcz its height is 2 therefore we use  // if (root.left != null) lh++;

    static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 0;
        }
        if (root.right == null) {
            return 0;
        }
        int leftAns = diameterOfTree(root.left);
        int rightAns = diameterOfTree(root.right);

        int mid = height(root.right) + height(root.left);
        if (root.left != null) {
            mid++;
        }
        if (root.right != null) {
            mid++;
        }
        int max = Math.max(leftAns, Math.max(rightAns, mid));
        return max;

    }

    static boolean contains(Node root, Node node) {
        if (root == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        return contains(root.left, node) || contains(root.right, node);
    }

    static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == p || q == root) {
            return root;
        }
        if (p == q) {
            return p;
        }
        boolean left = contains(root.left, p);
        boolean right = contains(root.right, q);
        if (left && right || !left && !right) {
            return root;
        }
        if (left && !right) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (!left && right) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);

        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = b;
        root.right = a;
        a.left = c;
        a.right = d;
        b.left = e;

        // System.out.println(diameterOfTree(root));
//hum level order traversal(breadth first search) ko aise bhi kar sakte hai
//  but iski TC bahut worst hai
        // int levels = BinaryTree.height(root)+1; 
        // for (int i = 1; i <= levels; i++) {
        //     BinaryTree.printNth(root, i);
        //     System.out.println();
        // }
        // printPostOrder(root);
        System.out.println(lowestCommonAncestor(root, c, e).val);
    }
}
