package uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import ui.page_objects.MainPage;

import static ui.enums.Teams.*;

@Epic("UI тестирование")
public class FootballFNKTest extends BaseUiTest{

    @Feature("Проверка Чемпионата")
    @Test(description = "Проверка очков чемпионата")
    public void checkPoint(){
        openMainPage("https://football.kulichki.net/");
        new MainPage(LEIPZIQ)
                .champions()
                .checkPoints();
    }
}
