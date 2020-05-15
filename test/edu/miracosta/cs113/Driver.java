package edu.miracosta.cs113;
import java.util.*;
public class Driver {
    public static void main(String args[]){
        AVLTree<Integer> temp = new AVLTree<>();
        BinarySearchTree<Integer> temp2 = new BinarySearchTree<>();
        Random rand = new Random();
       /* temp.add(3);
        temp.add(2);
        temp.add(1);
        temp.add(7);
        temp.add(6);
        temp.add(4);
        temp.add(11);
        temp.add(10);
        temp.add(0);
        temp.add(9);
        temp.add(15);
        temp.add(16);
        temp.add(21);
        temp.add(32);
        temp.add(27);
        temp.add(22);
        temp.add(17);
        temp.add(26);
        temp.add(23);
        temp.add(41);
        temp.add(39);
        */
       for(int i = 0; i < 20; i++){
           int rand_int = rand.nextInt(100);
           System.out.println("adding" + rand_int);
           temp.add(rand_int);
           temp2.add(rand_int);
       }
        System.out.println(temp.toString2());
        /*temp2.add(3);
        temp2.add(2);
        temp2.add(1);
        temp2.add(7);
        temp2.add(6);
        temp2.add(4);
        temp2.add(11);
        temp2.add(10);
        temp2.add(0);
        temp2.add(9);
        temp2.add(15);
        temp2.add(16);
        temp2.add(21);
        temp2.add(32);
        temp2.add(27);
        temp2.add(22);
        temp2.add(17);
        temp2.add(26);
        temp2.add(23);
        temp2.add(41);
        temp2.add(39);
         */
        System.out.println("Printing in order traversal of AVL tree:");
        temp.printInOrder(temp.root);
        System.out.println();
        System.out.println("Printing in order traversal of Binary Search Tree:");
        temp2.printInOrder(temp2.root);
        System.out.println("\n" + "Height of AVL tree: " + temp.maxDepth(temp.root));
        System.out.println("Height of Binary Search Tree: " + temp2.maxDepth(temp2.root));
        System.out.println(temp2.toString2());
    }
}
