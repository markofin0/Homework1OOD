package Wedding;

public class TraditionalWedding extends WeddingPackage {

    // methods implemented from the abstract class
    @Override
    Venue getVenue() {
        Venue venue = new Venue();
        venue.setName("Saint Mary's Church");
        venue.setLocation("New Jersey");
        return venue;
    }

    @Override
    Photography getPhotography() {
        Photography photography = new Photography();
        photography.setName("Saint Mary's Church Photography");
        photography.setPrice(100);
        return photography;
    }

    @Override
    Decorations getDecorations() {
        Decorations decorations = new Decorations();
        decorations.setName("Church Decorations");
        return decorations;
    }

    @Override
    Catering getCatering() {
        Catering catering = new Catering();
        catering.setName("Church Catering");
        catering.setFeeds(35);
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
        return "\nTraditional Wedding!\n Venue: " + getVenue().getName() + " in " + getVenue().getLocation() + "\n" +
                "Photography: " + getPhotography().getName() + " for $" + getPhotography().getPrice() + "\n" +
                "Decorations: " + getDecorations().getName() + "\n" +
                "Catering: " + getCatering().getName() + " feeds " + getCatering().getFeeds();
    }

}