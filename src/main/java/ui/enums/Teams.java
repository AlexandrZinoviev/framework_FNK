package ui.enums;
import static ui.enums.Championships.*;

public enum Teams {
    // Комады Германии
    BAVARIA (GERMANY,"Бавария", 36),
    UNION_BERLIN (GERMANY,"Унион Берлин", 33),
    LEIPZIQ (GERMANY,"Лейпциг", 35),
    EINTRACHT_F (GERMANY,"Айнтрахт Ф", 31),
    BORUSSIA_D (GERMANY,"Боруссия Д", 31),
    FREIBURG (GERMANY,"Фрайбург", 31),
    WOLFSBURG (GERMANY,"Вольфсбург", 29),
    BAYER (GERMANY,"Байер", 24),
    BORUSSIA_M (GERMANY,"Боруссия М", 22),
    COLOGNE (GERMANY,"Кельн", 21),
    WERDER (GERMANY,"Вердер", 21),
    MAINZ (GERMANY,"Майнц", 20),
    HOFFENHEIM (GERMANY,"Хоффенхайм", 19),
    AUGSBURG (GERMANY,"Аугсбург", 18),
    STUTTGART (GERMANY,"Штутгарт", 16),
    BOCHUM (GERMANY,"Бохум", 16),
    HERTHA (GERMANY,"Герта", 14),
    SCHALKE (GERMANY,"Шальке", 9),

    // Комады Италии
    NAPOLI (ITALY,"Наполи", 47),
    MILAN (ITALY, "Милан", 38),
    JUVENTUS (ITALY,"Ювентус", 37),
    INTER (ITALY,"Интер", 37),
    LAZIO (ITALY,"Лацио", 34),
    ATALANTA (ITALY,"Аталанта", 31),
    ROMA (ITALY,"Рома", 31),
    UDINESE (ITALY,"Удинезе", 25),
    FIORENTINA (ITALY,"Фиорентина", 23),
    TORINO (ITALY,"Торино", 23),
    MONZA (ITALY,"Монца", 21),
    LECCE (ITALY,"Лечче", 20),
    EMPOLI (ITALY,"Эмполи", 19),
    BOLOGNA (ITALY,"Болонья", 19),
    SALERNITANA (ITALY,"Салернитана", 18),
    SASSUOLO (ITALY,"Сассуоло", 16),
    SPICE (ITALY,"Специя", 15),
    VERONA (ITALY,"Верона", 9),
    SAMPDORIA (ITALY,"Сампдория", 9),
    CREMONESE (ITALY,"Кремонезе", 7);



    Championships country;
    String name;
    int point;


    Teams(Championships country, String name, int point) {this.country = country; this.name = name; this.point = point;}
    public String getName() {return name;}
    public int getPoint() {return point;}
    public String nameCountry() {return country.getName();}
    public String nameCountryI() {return country.getNameI();}
    public String englishNameCountry() {return country.englishName();}
}
