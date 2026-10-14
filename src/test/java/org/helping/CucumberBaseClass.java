package org.helping;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CucumberBaseClass {

	public static Actions a;
	public static Robot r;
	
private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>(); 	
	
public static WebDriver getDriver() {
	return tlDriver.get();
		}
public static void setDriver(WebDriver driver) {
	tlDriver.set(driver);
}

	// 1 browser
	public static void openChrome() {
		WebDriver chDriver = new ChromeDriver();
		setDriver(chDriver);
	}
	public static void openFirefox() {
		WebDriver fhDriver = new FirefoxDriver();
		setDriver(fhDriver);
		}
	public static void openEdge() {
		WebDriver edDriver = new EdgeDriver();
		setDriver(edDriver);
	}
	// 2browser
	public static void launchUrl(String url) {
      getDriver().get(url);
	}

	// 3 maximize
	public static void maximize() {
     getDriver().manage().window().maximize();
	}

	// 4 page title
	public static void pageTitle() {

		String title = getDriver().getTitle();
		System.out.println(title);
	}

	// 5 page url
	public static void pageurl() {
		String currentUrl = getDriver().getCurrentUrl();
		System.out.println(currentUrl);

	}

	// 6 pass values
	public static void passTheValues(WebElement ref, String value) {
		ref.clear();
		ref.sendKeys(value);
	}

	// 7 press button
	public static void pressTheButton(WebElement ref) {
		ref.click();
	}

	// 8 Right click
	public static void Rightclick(WebElement ref) {
		a.contextClick(ref).perform();
	}

	// 9 copy
	public static void copy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 10 paste
	public static void paste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// 11 refresh
	public static void refesh() {
		getDriver().navigate().refresh();
	}

	// 12 back
	public static void back() {
		getDriver().navigate().back();
	}

	// 13 forward
	public static void forward() {
		getDriver().navigate().forward();
	}

	// 14 doubleclick
	public static void doubleClick(WebElement ref) {
		a.contextClick(ref).perform();

	}

	// 15 mouse hover
	public static void mousehover(WebElement ref) {
		a.moveToElement(ref).perform();
	}
	public static void contextClick(WebElement element) {

	    Actions a = new Actions(getDriver());

	    a.contextClick(element).perform();
	}
	public static void keyDown(Keys key) {

	    Actions a = new Actions(getDriver());

	    a.keyDown(key).perform();
	}

	public static void keyUp(Keys key) {

	    Actions a = new Actions(getDriver());

	    a.keyUp(key).perform();
	}

		// 22 switch to frame

	public static void SwitchToFrame(WebElement ref) {
		getDriver().switchTo().frame(ref);
	}
	 public static String getWindowHandle() {
	    return getDriver().getWindowHandle();
	}

	public static Set<String> getWindowHandles() {
	    return getDriver().getWindowHandles();
	}
	public static void switchToParentFrame() {
		getDriver().switchTo().parentFrame();
	}
	public static void switchToFrameByName(String name) {
		getDriver().switchTo().frame(name);
	}
	
	
	// 23 Default Content

	public static void defaultContent() {
		getDriver().switchTo().defaultContent();
	}

	// 24 SwitchWindow

	public static void SwitchWindow(String id) {
		getDriver().switchTo().window(id);
	}
	
	public static void switchToChildWindow() {

	    String parent = getDriver().getWindowHandle();
	    Set<String> allWindows =
	    		getDriver().getWindowHandles();

	    for (String window : allWindows) {
	        if (!window.equals(parent)) {
	        	getDriver().switchTo().window(window);
	            break;
	        }
	    }
	}

	public static void staticWait(long milliseconds)throws InterruptedException {
	    Thread.sleep(milliseconds);
	}

	public static void implicitWait(int seconds) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static void waitForVisibility(WebElement element, int seconds) {

	    WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(seconds));

	    wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForClickable(WebElement element, int seconds) {

	    WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(seconds));

	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElement(WebElement element) {
	    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void navigateTo(String url) {
		getDriver().navigate().to(url);
	}

	public static void navigateBack() {
		getDriver().navigate().back();
	}

	public static void navigateForward() {
		getDriver().navigate().forward();
	}

	public static void refreshPage() {
		getDriver().navigate().refresh();
	}

	// 25 get text-retrun argument
	public static String getText(WebElement ref) {
		String text = ref.getText();
		return text;
	}
	public static String getAttribute(WebElement ref) {
		return ref.getAttribute("value");
	}
	
	
	
	// 26 dismiss alert
	public static void dismissAlert() {
		getDriver().switchTo().alert().dismiss();
	}
	public static String alertGetText() {

	    Alert alert = getDriver().switchTo().alert();

	    return alert.getText();
	}

	public static void alertSendKeys(String value) {

	    Alert alert = getDriver().switchTo().alert();

	    alert.sendKeys(value);
	}
	public static void selectByIndex(WebElement element, int index) {
	    Select select = new Select(element);
	    select.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
	    Select select = new Select(element);
	    select.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
	    select.selectByVisibleText(value);
	}
	
	

	public static List<WebElement> getOptions(WebElement element) {
	    Select select = new Select(element);
	    return select.getOptions();
	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
	    Select select = new Select(element);
	    return select.getAllSelectedOptions();
	}
	public static WebElement getFirstSelectedOption(
	        WebElement element) {
	    Select select = new Select(element);
	    return select.getFirstSelectedOption();
	}

	public static void deselectByIndex(WebElement element, int index) {
	    Select select = new Select(element);
	    select.deselectByIndex(index);
	}

	public static void deselectByValue(WebElement element, String value) {
	    Select select = new Select(element);
	    select.deselectByValue(value);
	}

	public static void deselectByVisibleText(WebElement element, String text) {
	    Select select = new Select(element);
	    select.deselectByVisibleText(text);
	}

	public static void deselectAll(WebElement element) {
	    Select select = new Select(element);
	    select.deselectAll();
	}

	public static boolean isDisplayed(WebElement element) {
	    return element.isDisplayed();
	}

	public static boolean isEnabled(WebElement element) {
	    return element.isEnabled();
	}

	public static boolean isSelected(WebElement element) {
	    return element.isSelected();
	}

		
	// 27 JavascriptExecutor- click
	public static void jsClick(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", ref);

	}
	// 28 JavascriptExecutor - sendkeys

	public static void jsSendKeys(WebElement ref, String value) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].value='" + "';", ref);
	}

	// 29 JavascriptExecutor-scroll
	public static void jsScroll(WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", ref);
	}

	// 30 ScreenShot
	public static void takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

	// 31 Alert
	public static void handleAlert() {
		Alert a = getDriver().switchTo().alert();
		a.accept();
	}

	// Close Browser
	public static void closeBrowser() {
		getDriver().quit();
	}
	public static String getDataFromExcel(String excelName, String sheetName,
	        int rowNo, int cellNo) throws IOException {

	    File f = new File("filepath");
	    FileInputStream fin = new FileInputStream(f);
	    Workbook book = new XSSFWorkbook(fin);
	    Sheet sheet = book.getSheet(sheetName);
	    Row r = sheet.getRow(rowNo);
	    Cell c = r.getCell(cellNo);
	    String s1 = c.getStringCellValue();

	    return s1;
	}
	public static void writeDataIntoExcel(String excelName, String sheetName, int rowIndex, int cellIndex, String cellValue) throws IOException {
	    File f = new File("FilePath");
	    Workbook book = new XSSFWorkbook();
	    Sheet sh = book.createSheet(sheetName);
	    Row r = sh.createRow(rowIndex);
	    Cell c = r.createCell(cellIndex);
	    c.setCellValue(cellValue);
	    FileOutputStream fo = new FileOutputStream(f);
	    book.write(fo);
	}
	public static String readExcelFile(String fileName , String sheetname,
	        int rownum, int cellnum) throws IOException {
		String filePath = System.getProperty("user.dir")
                + "/Swetha/" + fileName + ".xlsx";
	    File f = new File(filePath);
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);

	    Sheet sh = wb.getSheet(sheetname);
	    Row row = sh.getRow(rownum);
	    Cell cell = row.getCell(cellnum);

	    DataFormatter formatter = new DataFormatter();
	    String data = formatter.formatCellValue(cell);
	    fis.close();

	    return data;
	}

}
