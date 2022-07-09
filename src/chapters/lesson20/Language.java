package chapters.lesson20;

public enum Language {
    HY("Armenia"),
    ENG("USA"),
    RU("Russia"),
    CH;

    private String country;

    Language(String country) {
        this.country = country;
    }

    Language() {

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void run() {

    }

}
