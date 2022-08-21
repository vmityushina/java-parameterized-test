import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, "red");
        Apple greenApples = new Apple(8, 60, "green");

        Food[] listOfProducts = {meat, redApples, greenApples};

        ShoppingCart basket = new ShoppingCart(listOfProducts);
        System.out.println("Сумма всех тваров, не учитывая скидку: " + basket.priceOfAllItems());
        System.out.println("Скидка для всей корзины: " + basket.calculateDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + basket.priceOfVegetarianItems());
    }
}