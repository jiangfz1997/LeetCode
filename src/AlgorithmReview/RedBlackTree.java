package AlgorithmReview;

import java.util.HashMap;

public class RedBlackTree {

    private final int Red = 0;
    private final int Black = 0;
    private Node root = null;
    class Node{
        Node leftNode;
        Node rightNode;
        Node parent;
        int data;    //保存的值
        int color;

        public Node(int data){
            this.data = data;
        }
    }
    /*
    * 插入部分的代码
    * */
    public void insert(Node root, int data){    //root节点不为空
        if(root.data < data) {
            if(root.rightNode == null) root.rightNode = new Node(data);
            else insert(root.rightNode, data);
        }else{
            if(root.leftNode == null) root.leftNode = new Node(data);
            else insert(root.leftNode, data);
        }
        }

        public void leftRotate(Node node){
            if(node.parent == null){    //根节点左旋
                Node E = root;
                Node S = E.rightNode;    //右子树
                E.rightNode = S.leftNode;    //移动S左子树
                S.leftNode.parent = E;
                S.parent = null;    //修改S的父节点
                S.leftNode = E;    //修改S的左节点

            }
        }
    }


