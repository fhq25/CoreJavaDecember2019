package enums;

public enum Country {

    USA("United States of America", "Washington", "English-US", 330000000),
    INDIA("India", "New Delhi", "Hindi", 1400000000),
    BANGLADESH("Bangladesh", "Dhaka", "Bangla", 170000000);

    Country(String name, String capital, String language, long population) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.population = population;
    }

    private String name;
    private String capital;
    private String language;
    private long population;

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getLanguage() {
        return language;
    }

    public long getPopulation() {
        return population;
    }
}
