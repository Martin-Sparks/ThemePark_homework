package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {
    private double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }



    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 1.45;
    }

    @Override
    public Double defaultPrice() {
        return this.price;
    }



    @Override
    public Double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            price = price *2;
        }
        else price = price;
        return price;
    }



    public Double getPrice(){
        return this.price;
    }



    public Double setPrice(Visitor visitor){
        if (visitor.getHeight() > 2.00) {
            return this.getPrice() * 2;
        }
        else return this.getPrice();
    }


}
