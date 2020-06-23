package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {
    private double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public double getPirce(){
        return this.price;
    }

    @Override
    public Double defaultPrice() {
        return null;
    }

    @Override
    public Double priceFor(Visitor visitor) {

        if (visitor.getAge() < 12) {
            price = price / 2;
        }
        else price = price;
        return price;
    }
}
