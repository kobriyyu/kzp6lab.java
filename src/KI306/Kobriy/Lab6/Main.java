package KI306.Kobriy.Lab6;

import java.io.PrintStream;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ShoppingMall<Store> mall = new ShoppingMall(9);
        mall.addStore(new ClothingStore("Zara", 50000.0, 1, "Мода"));
        mall.addStore(new ClothingStore("H&M", 45000.0, 2, "Повсякденний одяг"));
        mall.addStore(new ClothingStore("Nike", 75000.0, 1, "Спортивний одяг"));
        mall.addStore(new ClothingStore("Adidas", 70000.0, 2, "Спортивний одяг"));
        mall.addStore(new FoodCourtStore("McDonald's", 30000.0, 3, "Фаст-фуд"));
        mall.addStore(new FoodCourtStore("Суші Бар", 25000.0, 3, "Японська кухня"));
        mall.addStore(new FoodCourtStore("Pizza Hut", 35000.0, 3, "Італійська кухня"));
        mall.addStore(new FoodCourtStore("Starbucks", 40000.0, 1, "Кава"));
        mall.addStore(new FoodCourtStore("Subway", 28000.0, 3, "Сендвічі"));
        System.out.println("Всі магазини в торговому центрі:");
        List var10000 = mall.getAllStores();
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
        Store minRevenueStore = mall.findMinRevenueStore();
        System.out.println("\nМагазин з мінімальним доходом:");
        System.out.println(minRevenueStore);
        mall.removeStore(minRevenueStore);
        System.out.println("\nМагазини після видалення магазину з мінімальним доходом:");
        var10000 = mall.getAllStores();
        var10001 = System.out;
        var10000.forEach(var10001::println);
    }
}
