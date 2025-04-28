package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrePayPage extends WebPage {
    private WebDriver driver;

    @FindBy(xpath = "//button[@class='select__header']")//селектор выбора услуги
    private WebElement buttonHolder;

    @FindBy(xpath = "//button[@class='button button__default']")// кнопка Продолжить
    private WebElement buttonCont;

    @FindBy(xpath = "//iframe[@class='bepaid-iframe']")//блок оплаты
    private WebElement payPage;

    @FindBy(xpath = "//section[@class='pay']")//блок услуг
    private WebElement list;

    //блок услуги связи
    @FindBy(xpath = "ul[@class='select__list']/li[1]/p")//ссылка услуги
    private WebElement serviceField;

    @FindBy(id = "connection-phone")//ссылка номера
    private WebElement mobilePhone;

    @FindBy(id = "connection-sum")//строка сумма
    private WebElement serviceSum;

    @FindBy(id = "connection-email")//строка почта
    private WebElement connectionMail;

    //блок домашний интернет
    @FindBy(xpath = "ul[@class='select__list']/li[2]/p")//ссылка на услугу
    private WebElement homeInternet;

    @FindBy(id = "internet-phone")//ссылка на номер абонента
    private WebElement numberAbonent;

    @FindBy(id = "internet-sum")//строка сумма
    private WebElement internetSum;

    @FindBy(id = "internet-email")//строка почта
    private WebElement internetMail;

    //блок рассрочка
    @FindBy(xpath = "ul[@class='select__list']/li[3]/p")//ссылка на услугу
    private WebElement servisePayToPart;

    @FindBy(id = "score-instalment")//ссылка на номер абонента
    private WebElement numberScore;

    @FindBy(id = "instalment-sum")//строка сумма
    private WebElement payToPartSum;

    @FindBy(id = "instalment-email")//строка почта
    private WebElement payToPartMail;

    //блок задолженость
    @FindBy(xpath = "ul[@class='select__list']/li[4]/p")//ссылка на услугу
    private WebElement arrears;

    @FindBy(id = "score-arrears")//ссылка на номер абонента
    private WebElement arrearsNumber;

    @FindBy(id = "arrears-sum")//строка сумма
    private WebElement arrearsSum;

    @FindBy(id = "arrears-email")//строка почта
    private WebElement arrearsMail;

    public PrePayPage() {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void booleanString() {

        buttonHolder.click();
        serviceField.click();
        Assertions.assertEquals("Услуги связи", serviceField.getText(), "Строка (Услуга связи назв.) не совпадает");
        Assertions.assertEquals("Номер телефона", mobilePhone.getText(), "Строка (номер телефона) не совпадает");
        Assertions.assertEquals("Сумма", serviceSum.getText(), "Строка (Сумма. усл связи) не совпадает");
        Assertions.assertEquals("E-mail для отправки чека", connectionMail.getText(), "Строка (почта усл. св.) не совпадает");
        buttonHolder.click();
        homeInternet.click();
        Assertions.assertEquals("Домашний интернет", homeInternet.getText(), "Строка (Домашний интернет назв.) не совпадает");
        Assertions.assertEquals("Номер абонента", numberAbonent.getText(), "Строка (номер абонента) не совпадает");
        Assertions.assertEquals("Сумма", internetSum.getText(), "Строка (Сумма дом. инт.) не совпадает");
        Assertions.assertEquals("E-mail для отправки чека", internetMail.getText(), "Строка (почта дом. инт.) не совпадает");
        buttonHolder.click();
        servisePayToPart.click();
        Assertions.assertEquals("Рассрочка", servisePayToPart.getText(), "Строка (Рассрочка назв.) не совпадает");
        Assertions.assertEquals("Номер счета на 44", numberScore.getText(), "Строка (Номер счета на 44) не совпадает");
        Assertions.assertEquals("Сумма", payToPartSum.getText(), "Строка (сумма расср.) не совпадает");
        Assertions.assertEquals("E-mail для отправки чека", payToPartMail, "Строка (почта расср.) не совпадает");
        buttonHolder.click();
        arrears.click();
        Assertions.assertEquals("Задолженность", arrears.getText(), "Строка (Задолженость назв.) не совпадает");
        Assertions.assertEquals("Номер счета на 2073", arrearsNumber.getText(), "Строка (Номер счета на 2073) не совпадает");
        Assertions.assertEquals("Сумма", arrearsSum.getText(), "Строка (Сумма зад.) не совпадает");
        Assertions.assertEquals("E-mail для отправки чека", arrearsMail.getText(), "Строка (почта зад.) не совпадает");
    }

    public void inputDataUser(String phone, String sum) {

        buttonHolder.click();
        serviceField.click();
        mobilePhone.click();
        mobilePhone.sendKeys(phone);
        serviceSum.click();
        serviceSum.sendKeys(sum);
        buttonCont.click();
        driver.switchTo().frame(payPage);
    }
}
