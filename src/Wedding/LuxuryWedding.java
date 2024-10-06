package Wedding;

public class LuxuryWedding extends WeddingPackage {

    // methods implemented from the abstract class
    @Override
    Venue getVenue() {
        Venue venue = new Venue();
        venue.setName("The Plaza Hotel");
        venue.setLocation("New York");
        return venue;
    }

    @Override
    Decorations getDecorations() {
        Decorations decorations = new Decorations();
        decorations.setName("The Plaza Hotel Decorations");
        return decorations;
    }

    @Override
    Photography getPhotography() {
        Photography photography = new Photography();
        photography.setName("The Plaza Hotel Photography");
        photography.setPrice(10000);
        return photography;
    }

    @Override
    Catering getCatering() {
        Catering catering = new Catering();
        catering.setName("The Plaza Hotel Catering");
        catering.setFeeds(200);
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
        return "\nLuxury Wedding! \nVenue: " + getVenue().getName() + " in " + getVenue().getLocation() + "\n" +
                "Photography: " + getPhotography().getName() + " for $" + getPhotography().getPrice() + "\n" +
                "Decorations: " + getDecorations().getName() + "\n" +
                "Catering: " + getCatering().getName() + " feeds " + getCatering().getFeeds();
    }

}
