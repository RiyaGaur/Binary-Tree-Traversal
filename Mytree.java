public class Mytree {
    public  Node createnewnode(char value){
        Node newnode=new Node();
        newnode.data=value;
        return newnode;
    }
    public void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
    public static void main(String[] args) {
        Node root;
        Mytree obj=new Mytree();
        root=obj.createnewnode('A');
        root.left=obj.createnewnode('B');
        root.right=obj.createnewnode('C');
        root.left.left=obj.createnewnode('D');
        root.left.right=obj.createnewnode('E');
        root.left.left.left=obj.createnewnode('H');
        root.left.left.right=obj.createnewnode('I');
        root.left.right.left=obj.createnewnode('J');
        root.right.left=obj.createnewnode('F');
        root.right.right=obj.createnewnode('G');
        System.out.print("Preorder:");
        obj.preorder(root);
        System.out.println();
        System.out.print("Inorder:");
        obj.inorder(root);
        System.out.println();
        System.out.print("Postorder:");
        obj.postorder(root);

    }
}
