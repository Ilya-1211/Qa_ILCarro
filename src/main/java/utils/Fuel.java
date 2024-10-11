package utils;

public enum Fuel {
    DISEL("//option[@value='Diesel']"),
    PETROL("//option[@value='Petrol']"),
    HGYBRID("//option[@value='Hybrid']"),
    GAS("//option[@value='Gas']"),
    ELECTRIC("//option[@value='Electric']");
    private String locator;

    Fuel(String locator) {
        this.locator = locator;
    }
    public String getLocator(){
        return locator;
    }
}
