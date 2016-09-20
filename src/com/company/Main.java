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

            int quanity1 = 0;

            Object quanBox = "[" + quanity1 + "]";

            //System.out.println("Your Inventory: " + (quanBox+items.quantity) + items.itemName);

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
                            System.out.println("How many do you want to add?");
                            int updateQuan = scanner.nextInt();
                            int itemQuantity = quanity1 + updateQuan;
                            //items.set(itemQuantity);
                        }
                        break;

                    case "4":
                        System.out.println(items);
                        break;

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