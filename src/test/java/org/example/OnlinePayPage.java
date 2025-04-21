package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinePayPage {

    private WebDriver driver;

    //блок оплаты
    @FindBy(xpath = "//div[@class='pay-description__cost']/span")//строка суммы
    private WebElement payCount;

    @FindBy(xpath = "//div[@class='pay-description__text']/span")//дублирование номера телефона
    private WebElement numberPhoneCopy;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-1']/label")//номер карты
    private WebElement numberCart;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-4']/input")//срок действия
    private WebElement dateCart;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-5']/input")//cvc
    private WebElement cvc;

    @FindBy(xpath = "//div[@class='ng-tns-c2312288139-3 ng-pristine ng-invalid ng-touched']/input")//владелец карты
    private WebElement nameOwner;

    @FindBy(xpath = "//button[@class='colored disabled']/text()")//дублирование суммы на кнопке "Продолжить"
    private WebElement payCountCopy;

    //конструктор
    public OnlinePayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //геттеры, которые возвращают переменные
    public String getPayCount() {
        return payCount.getAttribute("span");
    }

    public String getNumberPhoneCopy() {
        return numberPhoneCopy.getAttribute("span");
    }

    public String getNumberCart() {
        return numberCart.getAttribute("label");
    }

    public String getDateCart() {
        return dateCart.getAttribute("label");
    }

    public String getCvc() {
        return cvc.getAttribute("label");
    }

    public String getNameOwner() {
        return nameOwner.getAttribute("label");
    }

    public String getPayCountCopy() {
        return payCountCopy.getAttribute("label");
    }
}
