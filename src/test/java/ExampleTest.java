import org.junit.Test;

//import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class ExampleTest extends BaseSteps {



    @Test
    @Title("Заявка на страхование")
            public void testInsurance(){

        MainSteps mainSteps = new MainSteps();
        InsuranceSteps insuranceSteps = new InsuranceSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();
        SendApp2Steps sendApp2Steps = new SendApp2Steps();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия на англ", "Ivanov");
        testData.put("Имя на англ", "Ivan");
        testData.put("Дата рождения1", "05.06.1990");
        testData.put("Фамилия", "Иванов");
        testData.put("Имя", "Иван");
        testData.put("Отчество", "Иванович");
        testData.put("Дата рождения", "05.06.1990");
        testData.put("Серия паспорта", "4215");
        testData.put("Номер паспорта", "569865");
        testData.put("Дата выдачи", "20.06.2013");
        testData.put("Место выдачи", "уфмс рф города Казани");

        /*mainSteps.stepSelectMainMenu("Страхование");
        mainSteps.stepSelectSubMenu("Путешествия и покупки");*/

        insuranceSteps.stepTitle("Страхование путешественников");
        insuranceSteps.stepSendAppBtn();
        insuranceSteps.switchWindow();


        sendAppSteps.stepMinSumma();
        sendAppSteps.stepOformitButton();

        sendApp2Steps.stepFillFields(testData);
        sendApp2Steps.stepCheckFillFields(testData);
        sendApp2Steps.stepProdolzhitButton();
        sendApp2Steps.stepPhone("Номер телефона вводится в 10-ти значном формате");


    }
}