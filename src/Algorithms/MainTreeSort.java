package Algorithms;

class Node {
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    Node leftNode, rightNode;

}
public class MainTreeSort {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 3, 6, 7, 10, 8, 1, 4, 2, 5};
        boolean justStarted = true;
        Node rootNode = new Node();
        rootNode.setValue(arr[0]);
        for (int numberToInsert : arr) {
            insert(rootNode, numberToInsert);
        }
        print (rootNode);

    }

    private static void print(Node node) {
        if (node.getLeftNode()!=null){
            print(node.getLeftNode());
        }
        System.out.println(node.value);
        if (node.getRightNode()!=null){
            print(node.getRightNode());
        }
    }

    private static void insert(Node parentNode, int numberToInsert) {
        if (parentNode.getValue()>numberToInsert){
            if (parentNode.getLeftNode()==null) {
                Node node = new Node();
                node.setValue(numberToInsert);
                parentNode.setLeftNode(node);
            } else  {
                insert(parentNode.getLeftNode(), numberToInsert);
            }
        } else if (parentNode.getValue()<numberToInsert) {
            if(parentNode.getRightNode()==null){
                Node node = new Node();
                node.setValue(numberToInsert);
                parentNode.setRightNode(node);
            } else {
                insert(parentNode.getRightNode(), numberToInsert);
            }
        }
    }
}
