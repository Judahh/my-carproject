package test;

import static org.junit.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCadastroCarro {
	
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testE() throws Exception {
    driver.get(baseUrl + "/CarProject/cadastroCarroNew.jsf");
    driver.findElement(By.id("codCarro")).clear();
    driver.findElement(By.id("codCarro")).sendKeys("3232");
    driver.findElement(By.id("marca")).clear();
    driver.findElement(By.id("marca")).sendKeys("asdsa");
    driver.findElement(By.cssSelector("span.ui-icon.ui-icon-triangle-1-w")).click();
    driver.findElement(By.xpath("//div[@id='j_idt34']/div/a/span")).click();
    driver.findElement(By.id("modelo")).clear();
    driver.findElement(By.id("modelo")).sendKeys("sada");
    driver.findElement(By.id("precoTabelado")).clear();
    driver.findElement(By.id("precoTabelado")).sendKeys("1231");
    driver.findElement(By.xpath("//div[@id='tipo']/div[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='tipo_panel']/div/ul/li[2]")).click();
    driver.findElement(By.id("potencia")).clear();
    driver.findElement(By.id("potencia")).sendKeys("12312");
    driver.findElement(By.xpath("//div[@id='capacidadeLitros']/div[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='capacidadeLitros_panel']/div/ul/li[2]")).click();
    driver.findElement(By.id("posicaoMotor")).clear();
    driver.findElement(By.id("posicaoMotor")).sendKeys("asds");
    driver.findElement(By.xpath("//div[@id='combustivel']/div[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='combustivel_panel']/div/ul/li[2]")).click();
    driver.findElement(By.id("autonomiaKM")).clear();
    driver.findElement(By.id("autonomiaKM")).sendKeys("1231");
    driver.findElement(By.id("kmCidade")).clear();
    driver.findElement(By.id("kmCidade")).sendKeys("12321");
    driver.findElement(By.id("kmEstrada")).clear();
    driver.findElement(By.id("kmEstrada")).sendKeys("1232");
    driver.findElement(By.id("volumeTanque")).clear();
    driver.findElement(By.id("volumeTanque")).sendKeys("12321");
    driver.findElement(By.id("volumeBagageiro")).clear();
    driver.findElement(By.id("volumeBagageiro")).sendKeys("1231");
    driver.findElement(By.id("numAssentos")).clear();
    driver.findElement(By.id("numAssentos")).sendKeys("12321");
    driver.findElement(By.id("qntPortas")).clear();
    driver.findElement(By.id("qntPortas")).sendKeys("1231");
    driver.findElement(By.id("aceleracao")).clear();
    driver.findElement(By.id("aceleracao")).sendKeys("1231");
    driver.findElement(By.id("velocidadeMax")).clear();
    driver.findElement(By.id("velocidadeMax")).sendKeys("1231");
    driver.findElement(By.id("areaCega")).clear();
    driver.findElement(By.id("areaCega")).sendKeys("1231");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
