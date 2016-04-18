package com.vadym.starbuzz;

/**
 * Created by Vadym on 21.03.2016.
 */
public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
        new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
        new Drink("Cappuchino", "A couple of espresso shots with steamed milk", R.drawable.cappuccino),
        new Drink("Filter", "A couple of espresso shots with steamed milk", R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
