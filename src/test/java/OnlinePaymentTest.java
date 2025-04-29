import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OnlinePaymentTest extends BaseDriverSetUp {
    @Test
    @DisplayName("Проверка надписей выпадающего меню")
    public void serviceDropdownCheck() {
        PrePayPage homePage = new PrePayPage();
        homePage.serviceDropdown();
    }

    @Test
    @DisplayName("Проверка элементов окна оплаты")
    public void payWindowInfoCheck() {
        String phone = "297777777";
        String sum = "10";
        PrePayPage homePage = new PrePayPage();
        homePage.inputData(phone, sum);
        PayWindowPage payWindowPage = new PayWindowPage();
        payWindowPage.payWindowInfo(phone, sum);
    }
}
