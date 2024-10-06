package Wedding;

public class DestinationWedding extends WeddingPackage implements WeddingPackageBuilder {

    // methods implemented from the abstract class
    @Override
    Venue getVenue() {
        Venue venue = new Venue();
        venue.setName("Hawaii Beach");
        venue.setLocation("Hawaii");
        return venue;
    }

    @Override
    Photography getPhotography() {
        Photography photography = new Photography();
        photography.setName("Hawaii Beach Photography");
        photography.setPrice(1000);
        return photography;
    }

    @Override
    Decorations getDecorations() {
        Decorations decorations = new Decorations();
        decorations.setName("Hawaii Beach Decorations");
        return decorations;
    }

    @Override
    Catering getCatering() {
        Catering catering = new Catering();
        catering.setName("Hawaii Beach Catering");
        catering.setFeeds(100);
        return catering;
    }

    // methods implemented from the interface
    @Override
    public void buildVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public void buildPhotography(Photography photography) {
        this.photography = photography;
    }

    @Override
    public void buildDecorations(Decorations decorations) {
        this.decorations = decorations;
    }

    @Override
    public void buildCatering(Catering catering) {
        this.catering = catering;
    }

    @Override
    public WeddingPackage getWeddingPackage() {
        return this;
    }

    @Override
    public String toString() {
        return "\nDestination Wedding! \nVenue: " + getVenue().getName() + " in " + getVenue().getLocation() + "\n" +
                "Photography: " + getPhotography().getName() + " for $" + getPhotography().getPrice() + "\n" +
                "Decorations: " + getDecorations().getName() + "\n" +
                "Catering: " + getCatering().getName() + " feeds " + getCatering().getFeeds();
    }

}
