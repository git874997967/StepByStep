package easy;


import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
   public static  class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x){
           this.val=x;
       }
   }
///  get the max depth of the tree
    public static int maxDepth(TreeNode head){
        int result=(head==null)?0:1+Math.max(maxDepth(head.left),maxDepth(head.right));
      //  System.out.println(result);
        return result;
    }
    // get the min depth of the tree
    // define is amubius
    public  static int minDepth(TreeNode head){
            return (head==null)?0:
                    (head.left==null&&head.right==null)?1:
                            (head.left!=null&&head.right!=null)?
                                    1+Math.min(minDepth(head.left),minDepth(head.right)):
                                    (head.right!=null)?1+minDepth(head.right):1+minDepth(head.left);

    }
    public static  boolean isBalanced(TreeNode head){
        return  height(head)!=-1;
    }
    public static int height ( TreeNode head){
       if(head==null) return 0;
        int left=height(head.left);
        int right=height(head.right);

        if(left==-1|| right==-1 ||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }

    public static boolean symetricTree(TreeNode head){
       if(head==null) return  true;


        return helper(head.left,head.right);

       // swap the tree with left and root  get tree`  then compare with tree with tree` is equal or not;


    }
    public static boolean helper(TreeNode head1,TreeNode head2){
            // space =O(n)  if the tree is balanced the space =height =lgn


            if(head1==null&&head2==null) return true;
            if(head1==null||head2==null) return false;
            if(head1.val==head2.val) return  true; //  check the value in this level


          return helper(head1.left,head2.right)&&helper(head1.right,head2.right);
    }

    public static boolean symetricTree_BFS(TreeNode head){
       if(head==null) return true;
       Queue<TreeNode> q=new LinkedList<>();

       q.add(head);
       q.add(head);
       while(!q.isEmpty()){
            TreeNode t1=q.poll();
            TreeNode t2=q.poll();
            if(t1==null&&t2==null){
               continue;
            }
            if(t1==null||t2==null){
                return false;
            }
            if(t1.val!=t2.val) return  false;

            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);

       }
       return true;
    }

    public static boolean isBST(TreeNode  head){
        if(head==null) return true;
        return valid(head,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean valid(TreeNode head,long lower,long upper){
        if(head==null) return  true;
        if(head.val>=upper||head.val<=lower) return  false;
        return valid(head.left,lower,head.val)&&valid(head.right,head.val,upper);
    }





    public static void main(String[] args) {
        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);
        root1.left.left=new TreeNode(4);
        root1.left.left.left=new TreeNode(5);
        TreeNode root2=new TreeNode(3);
        root2.left=new TreeNode(3);
        root2.left.left=new TreeNode(5);
        root2.left.left.left=new TreeNode(65);


        // 1  max depth
        maxDepth(root1);
        maxDepth(root2);
        System.out.println(minDepth(root1));

        System.out.println(minDepth(root2));
        System.out.println(isBalanced(root1));

    }


}
