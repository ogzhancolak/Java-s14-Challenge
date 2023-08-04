package com.workintech.burgercompany;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.1, BreadRollType.DOUBLE_BURGER);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}
