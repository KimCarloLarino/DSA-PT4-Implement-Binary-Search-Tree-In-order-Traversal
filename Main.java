import java.util.Scanner;

// Hey there, implement the function inOrder() in the BST Class...

public class Main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BST bst = new BST();

        int operation;
        System.out.println();
        System.out.print("Enter operation: ");
        operation = Integer.parseInt(scanner.nextLine());

         switch (operation) {
                case 1:
                    bst.root = bst.insert(bst.root, 4);
                    bst.root = bst.insert(bst.root, 2);
                    bst.root = bst.insert(bst.root, 7);
                    bst.root = bst.insert(bst.root, 1);
                    bst.root = bst.insert(bst.root, 3);
                    bst.root = bst.insert(bst.root, 6);
                    bst.root = bst.insert(bst.root, 8);
                    bst.root = bst.insert(bst.root, 5);
                    bst.root = bst.insert(bst.root, 11);
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
                case 2:
                    bst.root = bst.insert(bst.root, 15);
                    bst.root = bst.insert(bst.root, 12);
                    bst.root = bst.insert(bst.root, 17);
                    bst.root = bst.insert(bst.root, 10);
                    bst.root = bst.insert(bst.root, 13);
                    bst.root = bst.insert(bst.root, 16);
                    bst.root = bst.insert(bst.root, 18);
                    bst.root = bst.insert(bst.root, 8);
                    bst.root = bst.insert(bst.root, 11);
                    bst.root = bst.insert(bst.root, 14);
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
                case 3:
                    bst.root = bst.insert(bst.root, 18);
                    bst.root = bst.insert(bst.root, 14);
                    bst.root = bst.insert(bst.root, 8);
                    bst.root = bst.insert(bst.root, 17);
                    bst.root = bst.insert(bst.root, 15);
                    bst.root = bst.insert(bst.root, 16);
                    bst.root = bst.insert(bst.root, 13);
                    bst.root = bst.insert(bst.root, 10);
                    bst.root = bst.insert(bst.root, 11);
                    bst.root = bst.insert(bst.root, 12);
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
                case 4:
                    bst.root = bst.insert(bst.root, 7);
                    bst.root = bst.insert(bst.root, 1);
                    bst.root = bst.insert(bst.root, 4);
                    bst.root = bst.insert(bst.root, 2);
                    bst.root = bst.insert(bst.root, 11);
                    bst.root = bst.insert(bst.root, 16);
                    bst.root = bst.insert(bst.root, 6);
                    bst.root = bst.insert(bst.root, 8);
                    bst.root = bst.insert(bst.root, 3);
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
                case 5:
                    bst.root = bst.insert(bst.root, 17);
                    bst.root = bst.insert(bst.root, 21);
                    bst.root = bst.insert(bst.root, 6);
                    bst.root = bst.insert(bst.root, 8);
                    bst.root = bst.insert(bst.root, 26);
                    bst.root = bst.insert(bst.root, 2);
                    bst.root = bst.insert(bst.root, 31);
                    bst.root = bst.insert(bst.root, 5);
                    bst.root = bst.insert(bst.root, 12);
                    bst.root = bst.insert(bst.root, 10);
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
                case 6:
                    bst.root = bst.insert(bst.root, 20);
                    bst.root = bst.insert(bst.root, 25);
                    bst.root = bst.insert(bst.root, 21);
                    bst.root = bst.insert(bst.root, 16);
                    bst.root = bst.insert(bst.root, 15);
                    bst.root = bst.insert(bst.root, 4);
                    bst.root = bst.insert(bst.root, 10);
                    bst.root = bst.insert(bst.root, 26);
                    bst.root = bst.insert(bst.root, 12);
                    bst.root = bst.insert(bst.root, 9);
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
             default:
                 break;
        }
    }
}