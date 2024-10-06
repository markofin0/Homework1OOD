package Wedding;

public class WeddingPlanner {
    private static WeddingPlanner uniqueInstance;

    private WeddingPlanner(){

    }

    public static WeddingPlanner getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new WeddingPlanner();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {

        // creates wedding packages using the factory method
        WeddingFactory weddingFactory = new WeddingFactory();
        WeddingPackage destinationWedding = weddingFactory.createWeddingPackage("Destination");
        destinationWedding.getVenue();
        destinationWedding.getPhotography();
        destinationWedding.getDecorations();
        destinationWedding.getCatering();
        System.out.println(destinationWedding.toString());

        WeddingPackage traditionalWedding = weddingFactory.createWeddingPackage("Traditional");
        traditionalWedding.getVenue();
        traditionalWedding.getPhotography();
        traditionalWedding.getDecorations();
        traditionalWedding.getCatering();
        System.out.println(traditionalWedding.toString());

        WeddingPackage luxuryWedding = weddingFactory.createWeddingPackage("Luxury");
        luxuryWedding.getVenue();
        luxuryWedding.getPhotography();
        luxuryWedding.getDecorations();
        luxuryWedding.getCatering();
        System.out.println(luxuryWedding.toString());

        // creates wedding packages using the builder pattern
        WeddingPackageBuilder weddingPackageBuilder = new TraditionalWedding();
        weddingPackageBuilder.buildVenue(new Venue());
        weddingPackageBuilder.buildPhotography(new Photography());
        weddingPackageBuilder.buildDecorations(new Decorations());
        weddingPackageBuilder.buildCatering(new Catering());
        WeddingPackage traditionalWedding2 = weddingPackageBuilder.getWeddingPackage();
        System.out.println(traditionalWedding2.toString());

        WeddingPackageBuilder weddingPackageBuilder2 = new DestinationWedding();
        weddingPackageBuilder2.buildVenue(new Venue());
        weddingPackageBuilder2.buildPhotography(new Photography());
        weddingPackageBuilder2.buildDecorations(new Decorations());
        weddingPackageBuilder2.buildCatering(new Catering());
        WeddingPackage destinationWedding2 = weddingPackageBuilder2.getWeddingPackage();
        System.out.println(destinationWedding2.toString());

        WeddingPackageBuilder weddingPackageBuilder3 = new LuxuryWedding();
        weddingPackageBuilder3.buildVenue(new Venue());
        weddingPackageBuilder3.buildPhotography(new Photography());
        weddingPackageBuilder3.buildDecorations(new Decorations());
        weddingPackageBuilder3.buildCatering(new Catering());
        WeddingPackage luxuryWedding2 = weddingPackageBuilder3.getWeddingPackage();
        System.out.println(luxuryWedding2.toString());

    }

}
