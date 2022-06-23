package pages.myStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ScreenShotPage {
    private  WebDriver driver;

    public ScreenShotPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void main() throws IOException {


        Screenshot Screenshot_webele = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
        ImageIO.write(Screenshot_webele.getImage(), "png", new File("src/main/ScreenShot\\element.png"));

    }
}
