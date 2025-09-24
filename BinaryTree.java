import java.util.*;
class Tree{
    int data;
    Tree left,right;
    Tree(int data){
        this.data=data;
        left=right=null;
    }
}
class BTree{
    Tree root;
    Tree insert(Tree root,int val){
        if(root==null) return new Tree(val);
        else if(val<root.data) root.left=insert(root.left, val);
        else if(val>root.data) root.right=insert(root.right, val);
        return root;
    }
   

    Tree minval(Tree node){
        Tree curr=node;
        while(curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }

    Tree delete(Tree root,int val){
        if(root==null) return root;
        if(val<root.data) root.left=delete(root.left, val);
        else if(val>root.data) root.right=delete(root.right, val);
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            Tree temp=minval(root.right);
            root.data=temp.data;
            root.right=delete(root.right, temp.data);

        }
        return root;
    }

    void levelorder(Tree root){
        if(root==null) return;
        Queue<Tree> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Tree node=q.poll();
            System.out.print((node.data)+" ");
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
    }

    
}
public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BTree tree=new BTree();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            tree.root=tree.insert(tree.root, x);
        }
        tree.levelorder(tree.root);
        
    }
}
