package ui.enums;

public enum Championships {

    ENGLAND ("Италия", "Италия", "italy"),
    GERMANY ("Германия", "ГЕРМАНИИ", "germany"),
    SPAIN ("Италия", "Италия", "italy"),
    ITALY ("Италия", "ИТАЛИИ", "italy"),
    FRANCE ("Италия", "Италия",  "italy"),
    NETHERLANDS ("Италия", "Италия", "italy"),
    PORTUGAL ("Италия", "Италия", "italy"),
    TURKEY ("Италия", "Италия", "italy"),
    BELARUS ("Италия", "Италия", "italy"),
    KAZAKHSTAN ("Италия", "Италия", "italy");

    String name;
    String nameI;
    String englishName;



    Championships(String name, String nameI, String englishName) {this.name = name; this.nameI = nameI; this.englishName = englishName;}
    public String getName() {return name;}
    public String getNameI() {return nameI;}
    public String englishName() {return englishName;}

}
