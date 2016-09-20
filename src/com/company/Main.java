package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        HashMap<String, ArrayList<Items>> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Username: ");
            String userName = scanner.nextLine();

            ArrayList<Items> items = users.get(userName);
            if (items == null) {
                items = new ArrayList<>();
                users.put(userName, items);
            }

            boolean isLoggedIn = true;
            while (isLoggedIn) {
                System.out.println("Press 1 to add an item.");
                System.out.println("Press 2 to remove an item.");
                System.out.println("Press 3 to update quantity.");
                System.out.println("Press 4 to list your inventory.");
                System.out.println("Press 5 to log out.");

                String userInp = scanner.nextLine();

                switch (userInp) {

                    case "1":
                        System.out.println("Enter the item name: ");
                        String itemName = scanner.nextLine();
                        Items items1 = new Items(itemName, 1);
                        items.add(items1);
                        break;

                    case "2":
                        System.out.println("Which item do you want to remove?");
                        String itemRem = scanner.nextLine();
                        if (items.contains(itemRem)) {
                            items.remove(itemRem);
                        }
                        break;

                    case "3":
                        System.out.println("Which item do you want to update?");
                        String itemQuan = scanner.nextLine();
                        if (items.contains(itemQuan)) {

                        }
                        break;

                    case "4":
                        System.out.println(ArrayList(userName));

                    case "5":
                        isLoggedIn = false;
                        break;

                    default:
                        System.out.println("Invalid option.");
                }
            }

        }
    }
}



//        Create a variable to store the inventory items.
//        Print out the inventory items and then list the options.
//        If the user enters 1, let them create a new item by entering its name.
//        If the user enters 2, let them remove an item by its number.
//        If the user enters 3, let them update the quantity of that item.
//        Create a login system to allow for multiple users.