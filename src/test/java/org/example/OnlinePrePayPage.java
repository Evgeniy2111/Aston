package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinePrePayPage {
    private WebDriver driver;

    //блок услуги связи
    @FindBy(xpath = "//p[@class='select__option']")//ссылка услуги
    private WebElement serviceField;

    @FindBy(id = "connection-phone")//ссылка номера
    private WebElement mobilePhone;

    @FindBy(id = "connection-sum")//строка сумма
    private WebElement serviceSum;

    @FindBy(id = "connection-email")//строка почта
    private WebElement connectionMail;

    //блок домашний интернет
    @FindBy(xpath = "//button[@class='select__header']")//ссылка на услугу
    private WebElement homeInternet;

    @FindBy(id = "internet-phone")//ссылка на номер абонента
    private WebElement numberAbonent;

    @FindBy(id = "internet-sum")//строка сумма
    private WebElement internetSum;

    @FindBy(id = "internet-email")//строка почта
    private WebElement internetMail;

    //блок рассрочка
    @FindBy(xpath = "//span[@class='select__now']")//ссылка на услугу
    private WebElement servisePayToPart;

    @FindBy(id = "score-instalment")//ссылка на номер абонента
    private WebElement numberScore;

    @FindBy(id = "instalment-sum")//строка сумма
    private WebElement payToPartSum;

    @FindBy(id = "instalment-email")//строка почта
    private WebElement payToPartMail;

    //блок задолженость
    @FindBy(xpath = "//span[@class='select__now']")//ссылка на услугу
    private WebElement arrears;

    @FindBy(id = "score-arrears")//ссылка на номер абонента
    private WebElement arrearsNumber;

    @FindBy(id = "arrears-sum")//строка сумма
    private WebElement arrearsSum;

    @FindBy(id = "arrears-email")//строка почта
    private WebElement arrearsMail;

    public OnlinePrePayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void start() {
        driver.get("https://www.mts.by/");
    }

    public String getServiceField() {
        return serviceField.getAttribute("placeholder");
    }

    public String getMobilePhone() {
        return mobilePhone.getAttribute("placeholder");
    }

    public String getServiceSum() {
        return serviceSum.getAttribute("placeholder");
    }

    public String getConnectionMail() {
        return connectionMail.getAttribute("placeholder");
    }

    public String getHomeInternet() {
        return homeInternet.getAttribute("placeholder");
    }

    public String getNumberAbonent() {
        return numberAbonent.getAttribute("placeholder");
    }

    public String getInternetSum() {
        return internetSum.getAttribute("placeholder");
    }

    public String getInternetMail() {
        return internetMail.getAttribute("placeholder");
    }

    public String getServisePayToPart() {
        return servisePayToPart.getAttribute("placeholder");
    }

    public String getNumberScore() {
        return numberScore.getAttribute("placeholder");
    }

    public String getPayToPartSum() {
        return payToPartSum.getAttribute("placeholder");
    }

    public String getPayToPartMail() {
        return payToPartMail.getAttribute("placeholder");
    }

    public String getArrears() {
        return arrears.getAttribute("placeholder");
    }

    public String getArrearsNumber() {
        return arrearsNumber.getAttribute("placeholder");
    }

    public String getArrearsSum() {
        return arrearsSum.getAttribute("placeholder");
    }

    public String getArrearsMail() {
        return arrearsMail.getAttribute("placeholder");
    }
}



