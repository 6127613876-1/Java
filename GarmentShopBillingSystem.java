class Garment {
    private double basePrice;

    public Garment(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        return basePrice;
    }

    public void printBill() {
        System.out.println("Item: " + this.getClass().getSimpleName());
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Final Price: $" + calculatePrice());
    }
}

class Shirt extends Garment {
    private boolean isFormal;

    public Shirt(double basePrice, boolean isFormal) {
        super(basePrice);
        this.isFormal = isFormal;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.calculatePrice();
        if (isFormal) {
            finalPrice *= 1.2; // Apply a 20% markup for formal shirts
        }
        return finalPrice;
    }
}

class Pants extends Garment {
    private boolean isJeans;

    public Pants(double basePrice, boolean isJeans) {
        super(basePrice);
        this.isJeans = isJeans;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.calculatePrice();
        if (!isJeans) {
            finalPrice *= 0.9; // Apply a 10% discount for non-jeans pants
        }
        return finalPrice;
    }
}

public class GarmentShopBillingSystem {
    public static void main(String[] args) {
        Garment shirt = new Shirt(40.0, true);
        Garment pants = new Pants(30.0, false);

        System.out.println("Shirt Bill:");
        shirt.printBill();

        System.out.println("\nPants Bill:");
        pants.printBill();
    }
}