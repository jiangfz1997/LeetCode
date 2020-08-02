package Test;

public class 拼多多模拟_字典树 {
    static int n = 0;
    static boolean flag = false;
    static StringBuffer sb = new StringBuffer();
    static class Node{

        int aNum;
        int bNum;
        public String s;
        Node left;
        Node right;
        public Node(int aNum, int bNum, String s){
            this.aNum = aNum;
            this.bNum = bNum;
            this.s = s;

        }
        public void setLeft(Node left){
            this.left = left;
        }
        public void setRight(Node right){
            this.right = right;
        }

        @Override
        public String toString() {
           // String l = left.s == null ? "null" : left.s;
            //String r = right.s == null ? "null" : right.s;
            return "Node{" +
                    "aNum=" + aNum +
                    ", bNum=" + bNum +
                    ", s='" + s + '\'' +
                    //", left=" +l +
                    //", right=" + r +
                    '}';
        }
    }
    public static void create(Node root, int aNum, int bNum, int k){
        n++;
        System.out.println(root.toString());
        if(aNum != 0 && n != k){

            root.setLeft(new Node(aNum-1, bNum, "a"));
            create(root.left, aNum-1, bNum, k);
        }
        if(bNum != 0 && n != k){

            root.setRight(new Node(aNum, bNum-1, "b"));
            create(root.right, aNum, bNum-1, k);
        }
        if(n == k){
            flag = true;
            if(root.s != " ") sb.append(root.s);

        }

    }
    public static void dfs(Node node, int k){
        if(node == null) return;
        n--;
        if(n == k) {
            System.out.println("Find!!");
            sb.append(node.s);
            flag = true;
            return;
        }
        System.out.println(node.toString());
            if(!flag) dfs(node.left, k);
            if(!flag) dfs(node.right, k);
            if(flag && node.s != " ") sb.append(node.s);


    }
    public static void main(String[] args){
        int a = 2, b = 1;
        Node root = new Node(a, b," ");

        create(root, a,b, 5);
        System.out.println(n);
        //dfs(root, n - 4-1);
        System.out.println(sb.reverse());

    }
}
