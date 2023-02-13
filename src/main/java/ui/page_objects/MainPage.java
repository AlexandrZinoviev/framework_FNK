package ui.page_objects;


import asserts.CustomAssert;
import com.codeborne.selenide.SelenideElement;
import com.google.gson.JsonObject;
import io.qameta.allure.Step;
import ui.enums.Teams;

import static com.codeborne.selenide.Selenide.*;
import static utilities.JsonReader.getJsonObjectFromFile;

public class MainPage {
    Teams team;

    public MainPage (Teams team) {
        this.team = team;
    }

    @Step("Открываем чемпионат {name}")
    public MainPage champions(){
        $x("//a[@href= '/" + team.englishNameCountry() + "/' and text() = '"+team.nameCountry()+"']").click();
        SelenideElement text = $x("//center/font/b");

        String actual = text.getText();
        String expected = "ЧЕМПИОНАТ " + team.nameCountryI() + " 2022/2023.";

        CustomAssert.assertEquals(actual,expected,"Чемпионат " + team.nameCountryI() + " открыт");
        return this;
    }
    @Step("Проверка очков команды {name}")
    public MainPage checkPoints(){
        SelenideElement point = $x("//b//a[@href and text() = '" + team.getName() + "']/ancestor::td[@align]/following-sibling::td[6]");
        JsonObject body =
                getJsonObjectFromFile("src/test/resources/json_expected/param_FNK.json");

        String actual = point.getText();
        String expected = body.get(team.getName()).getAsString();
        CustomAssert.assertEquals(actual,expected,"У команды " + team.getName() + " количество очков совпадает");
        return this;
    }

}