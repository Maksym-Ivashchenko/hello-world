package ua.goit.abstractFactory;

public abstract class Factory {
    private final static String OS = "WINDOWS";
    private static Factory factory;

    public static Factory of() {
        return factory;
    }

    protected Factory(){
        if (factory == null) factory = init(OS);
    }

    private Factory init(String os) {
        if ("WINDOWS".equalsIgnoreCase(os)) {
            return new MacFactory();
        } else if ("LINUX".equalsIgnoreCase(os)) {
            return new MacFactory();
        } else if ("MAC".equalsIgnoreCase(os)) {
            return new MacFactory();
        }
        throw new RuntimeException("Unsupported OS!");
    }

    public abstract Button createButton();
    public abstract Scroll createScroll();
    public abstract Panel createPanel();

}
