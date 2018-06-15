package steps;

import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SendAppSteps extends BaseSteps{


    @Step("выполнен выбор минимальной суммы")
    public void stepMinSumma(){
        new SendAppPage(driver).minSumma.click();
    }

    @Step("выполнено нажатие на кнопку - Оформить")
    public void stepOformitButton(){
        new SendAppPage(driver).oformitButton.click();
    }


}
