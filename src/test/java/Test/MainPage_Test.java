package Test;
import Base.Base;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class MainPage_Test extends Base {
    @BeforeTest
    public void BeforeMethod() {
        super.beforemethod();
    }
    @Test
    public void Page_SF_SPC() throws InterruptedException {
        driver.get(SF_SPC_PAGE_URL);
        Response response = given().
                when()
                .get(SF_SPC_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("SPC is OK");
        } else {
            System.out.println("SPC is NOK");
            Assert.fail();
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_DashBoard() throws InterruptedException {
        driver.get(SF_DashBoard_PAGE_URL);
        Response response = given().
                when()
                .get(SF_DashBoard_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("SF DashBoard is OK");
        } else {
            Assert.fail();
            System.out.println("SF DashBoard is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_Platform() throws InterruptedException {
        driver.get(SF_Platform_PAGE_URL);
        Response response = given().
                when()
                .get(SF_Platform_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("SF Platform is OK");
        } else {
            Assert.fail();
            System.out.println("SF Platform is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_LIM() throws InterruptedException {
        driver.get(SF_LIM_PAGE_URL);
        Response response = given().
                when()
                .get(SF_LIM_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("LIM is OK");
        } else {
            Assert.fail();
            System.out.println("LIM is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_Reports() throws InterruptedException {
        driver.get(SF_Reports_PAGE_URL);
        Response response = given().
                when()
                .get(SF_Reports_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("SF Production Reports is OK");
        } else {
            Assert.fail();
            System.out.println("SF Production Reports is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_MLC() throws InterruptedException {
        driver.get(SF_MLC_PAGE_URL);
        Response response = given().
                when()
                .get(SF_MLC_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("MLC is OK");
        } else {
            Assert.fail();
            System.out.println("MLC is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_NDAPortal() throws InterruptedException {
        driver.get(SF_NDAPortal_PAGE_URL);
        Response response = given().
                when()
                .get(SF_NDAPortal_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("NDA Portal is OK");
        } else {
            Assert.fail();
            System.out.println("NDA Portal is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_SmartSensor() throws InterruptedException {
        driver.get(SF_SmartSensor_PAGE_URL);
        Response response = given().
                when()
                .get(SF_SmartSensor_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("SmartSensor is OK");
        } else {
            Assert.fail();
            System.out.println("SmartSensor is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_Tiber() throws InterruptedException {
        driver.get(SF_Tiber_PAGE_URL);
        Response response = given().
                when()
                .get(SF_Tiber_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("Tiber is OK");
        } else {
            Assert.fail();
            System.out.println("Tiber is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_Comessa() throws InterruptedException {
        driver.get(SF_Comessa_PAGE_URL);
        Response response = given().
                when()
                .get(SF_Comessa_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("Comessa is OK");
        } else {
            Assert.fail();
            System.out.println("Comessa is NOK");
        }
        Thread.sleep(1000);
    }
    @Test
    public void Page_SF_Assist() throws InterruptedException {
        driver.get(SF_Assist_PAGE_URL);
        Response response = given().
                when()
                .get(SF_Assist_PAGE_URL)
                .then()
                .extract().response();
        System.out.println("Apllication Status "  + response.getStatusCode());
        if (response.getStatusCode() == 200) {
            System.out.println("Smart Assist is OK");
        } else {
            Assert.fail();
            System.out.println("Smart Assist is NOK");
        }
        Thread.sleep(1000);
    }
    @AfterTest
    public void AfterMethod() {
        super.aftermethod();
    }
}