package Wedding;

public class WeddingFactory {

    // Factory Method
    public WeddingPackage createWeddingPackage(String type){
        if(type.equals("Destination")){
            return new DestinationWedding();
        }
        else if(type.equals("Traditional")){
            return new TraditionalWedding();
        }
        else if(type.equals("Luxury")){
            return new LuxuryWedding();
        }
        else{
            return null;
        }
    }

}
