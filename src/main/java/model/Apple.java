package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple (int amount, double price, String color){
        this.amount = amount;
        this.price = price;
        this.colour = color;
        isVegetarian = true;
    }

    @Override
    public int getDiscount() {
        if (colour.equals(Colour.RED))
            return Discount.RED_APPLES_DISCOUNT;
        else
            return 0;
    }
}
