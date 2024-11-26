import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class SearchTests1 {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[name=q]").setValue("selenide").pressEnter();
       // $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}