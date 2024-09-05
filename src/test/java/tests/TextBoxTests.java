package tests;
import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000

    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Veronika");
        $("#userEmail").setValue("genkel1707@gmail.com");
        $("#currentAddress").setValue("Igalo");
        $("#permanentAddress").setValue("Novo Mesto");
        $("#submit").click();

        $("#output #name").shouldHave(text("Veronika"));
        $("#output #email").shouldHave(text("genkel1707@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Igalo"));
        $("#output #permanentAddress").shouldHave(text("Novo Mesto"));

    }

}
