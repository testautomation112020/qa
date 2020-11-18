package pl.jsystems.qa.qagui.cucmber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "classpath:pl.jsystems.qa.qagui.cucmber",
    plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
            "junit:target/cucumber.xml",
            "rerun:target/rerun.txt"
    },

    tags = {
//            "@userpanel",
            "@wordpress",
//            "@login",
//            "@BDD"
//            "@search"
//            "@website"
//            "@website_2"
//            "@website_3"
    }
)
public class RunTest {
}
