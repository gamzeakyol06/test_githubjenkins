package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    protected static WebDriver driver;

    public final static String SF_SPC_PAGE_URL = "https://sf.eldor.com.tr/SPC/Account/Login";
    public final static String SF_DashBoard_PAGE_URL = "https://sf.eldor.com.tr/Dashboard/";
    public final static String SF_Platform_PAGE_URL = "https://sf.eldor.com.tr/Platform/#/login";
    public final static String SF_LIM_PAGE_URL = "https://sf.eldor.com.tr/LIM";
    public final static String SF_Reports_PAGE_URL = "https://sf.eldor.com.tr/Reports";
    public final static String SF_MLC_PAGE_URL = "https://sf.eldor.com.tr/MLC/#/materialLoadControl";
    public final static String SF_NDAPortal_PAGE_URL = "https://sf.eldor.com.tr/NDAPortal/Account/Login";
    public final static String SF_SmartSensor_PAGE_URL = "https://sf.eldor.com.tr/SmartSensor/login";
    public final static String SF_Tiber_PAGE_URL = "http://sf.eldor.com.tr/Tiber";
    public final static String SF_Comessa_PAGE_URL = "https://sf.eldor.com.tr/Commessa/Account/Login";
    public final static String SF_Assist_PAGE_URL = "https://sf.eldor.com.tr/SmartAssist/Account/Login";

    public void beforemethod(){
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

 /*       chromeOptions.addArguments("--whitelist-ip *");
        chromeOptions.addArguments("--proxy-server='direct://'");
        chromeOptions.addArguments("--proxy-bypass-list=*");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-web-security");
        chromeOptions.addArguments("--allow-running-insecure-content");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.setHeadless(true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //test.eldorturkey.com.tr
        // test.eldorturkey.com.tr*/

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void aftermethod(){
        driver.quit();
    }
}
