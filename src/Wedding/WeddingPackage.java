package Wedding;

public abstract class WeddingPackage implements WeddingPackageBuilder {

    Venue venue;
    Photography photography;
    Decorations decorations;
    Catering catering;

    // methods to be implemented by subclasses
    abstract Venue getVenue();
    abstract Photography getPhotography();
    abstract Decorations getDecorations();
    abstract Catering getCatering();

}
