package ua.goit.abstractFactory;

public abstract class Factory {
    private final static String OS = "MAC";
    private static Factory factory;

    //ленивая инициализация синглтон
    public static Factory of() {
        if (factory == null) factory = init(OS);
        return factory;
    }

    //
    private static Factory init(String os) {
        switch (os) {
            case "WINDOWS":
                return new WindowsFactory();
            case "LINUX":
                return new LinuxFactory();
            case "MAC":
                return new MacFactory();
            default:
                throw new RuntimeException("Unsupported OS!");
        }
    }

    protected Factory() {
    }

    public abstract Button createButton();
    public abstract Scroll createScroll();
    public abstract Panel createPanel();

}
