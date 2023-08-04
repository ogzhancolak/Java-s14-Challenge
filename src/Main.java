import com.workintech.burgercompany.BreadRollType;
import com.workintech.burgercompany.DeluxeBurger;
import com.workintech.burgercompany.Hamburger;
import com.workintech.burgercompany.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);
        hamburger.addAddition("Tomato", 0.27);
        hamburger.addAddition("Lettuce", 0.75);
        hamburger.addAddition("Cheese", 1.13);
        hamburger.itemizeHamburger();

        System.out.println("---------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);
        healthyBurger.addAddition("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();

        System.out.println("---------------------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addAddition("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}