package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] basket;

    public ShoppingCart (Food[] basket) {
        this.basket = basket;
    }

    public double priceOfAllItems(){
        int sum = 0;
        for (int i = 0; i < basket.length; i ++) {
            sum += basket[i].getAmount() * basket[i].getPrice();
        }
        return sum;
    }

    public double calculateDiscount(){
        int sum = 0;
        double discount = 0;

        for (int i = 0; i < basket.length; i ++) {
            if (basket[i].getDiscount() != 0) {
                discount = basket[i].getAmount() * basket[i].getPrice() * basket[i].getDiscount() / 100;
                sum += discount;
            }
        }
        return sum;
    }

    public double priceOfVegetarianItems(){
        int sum = 0;

        for (int i = 0; i < basket.length; i ++) {
            if (basket[i].isVegetarian()) {
                sum += basket[i].getAmount() * basket[i].getPrice();
            }
        }
        return sum;
    }

    //not used in main
    public double priceOfAllItemsWithDiscount() {
        return this.priceOfAllItems() - this.calculateDiscount();
    }
}
