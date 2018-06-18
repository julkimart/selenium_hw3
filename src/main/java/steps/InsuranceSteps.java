package steps;

import pages.InsurancePage;
import pages.SendAppPage2;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class InsuranceSteps extends BaseSteps{

    @Step("выполнено нажатие на кнопку - Оформить онлайн")
    public void stepSendAppBtn(){
        new InsurancePage(driver).sendAppBtn.click();
    }


    @Step("заголовок страницы - {0}")
    public void stepTitle(String expectedTitle){
        String actualTitle = new InsurancePage(driver).title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("переход на другое окно")
    public void stepSwitchWindow () {
        new InsurancePage(driver).stepSwitchWindow();
    }

}
