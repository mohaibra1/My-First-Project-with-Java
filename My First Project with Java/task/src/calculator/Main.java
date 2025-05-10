package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bubblegum bubblegum = new Bubblegum("Bubblegum", 202);
        Toffee toffee= new Toffee("Toffee", 118);
        Icecream icecream = new Icecream("Ice cream", 2250);
        MilkChocolate milkChocolate = new MilkChocolate("Milk chocolate", 1680);
        Doughnut doughnut = new Doughnut("Doughnut", 1075);
        Pancake pancake = new Pancake("Pancake", 80);

        menu(bubblegum.getPrice(), toffee.getPrice(), icecream.getPrice(), milkChocolate.getPrice(), doughnut.getPrice(), pancake.getPrice());
        int income = bubblegum.getPrice() + toffee.getPrice() + icecream.getPrice() + milkChocolate.getPrice() + doughnut.getPrice() + pancake.getPrice();

        System.out.println();
        System.out.println("Income: " + income);

        //staff expenses
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Staff expenses: ");
            int staffExpenses = sc.nextInt();
            System.out.println("Other expenses: ");
            int otherExpenses = sc.nextInt();

            System.out.println("Net income: " + (income - staffExpenses - otherExpenses));
        }catch (Exception ex){
            System.out.println("Please insert numeric!");
        }

    }

    public static void menu(int bubblegumPrice, int toffeePrice, int iceCreamPrice, int milkChocolatePrice, int doughnutPrice, int pancakePrice){
        System.out.printf("Earned amount: \nBubblegum: $%d\nToffee: $%d\nIce cream: $%d\nMilk chocolate: $%d\nDoughnut: $%d\nPancake: $%d\n",
                bubblegumPrice,toffeePrice,iceCreamPrice,milkChocolatePrice,doughnutPrice,pancakePrice);
    }
}