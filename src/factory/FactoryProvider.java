package factory;

public class FactoryProvider {
    private static final String MESSAGE = "Factory of this type can't be created";

    private static final FactoryType WHITE = FactoryType.WHITE;
    private static final FactoryType BLACK = FactoryType.BLACK;

    public static AbstractFactory getFactory(FactoryType factoryType){
        if(WHITE == factoryType)
            return new WhiteFactory();
        if(BLACK == factoryType)
            return new BlackFactory();
        throw new UnsupportedOperationException(MESSAGE);
    }
}
