public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Cars Audi = new Cars("Audi V5", 1999, 180);
        Cars Tgr = new Cars("TGR V9", 2027, 780);
        Truck Mgk = new Truck("MGK P9", 2008, 120, 600);
        Buss L1 = new Buss("L1 social Bus", 1970, 90, 98);
        shop.add(Audi);
        shop.add(Tgr);
        shop.add(Mgk);
        shop.add(L1);
        System.out.println("Shop: ");
        shop.print_cars();

        System.out.println("\n\n\nShorted:");
        shop.ShortByYear();
        shop.print_cars();

    }
}
