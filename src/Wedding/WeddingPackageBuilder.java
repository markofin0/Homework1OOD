package Wedding;

public interface WeddingPackageBuilder {

    // methods to build different parts of the wedding package
    void buildVenue(Venue venue);
    void buildPhotography(Photography photography);
    void buildDecorations(Decorations decorations);
    void buildCatering(Catering catering);
    WeddingPackage getWeddingPackage();

}
