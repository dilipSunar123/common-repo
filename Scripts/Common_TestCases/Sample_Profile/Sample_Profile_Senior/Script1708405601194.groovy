import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.sound.sampled.AudioInputStream as AudioInputStream
import javax.sound.sampled.AudioSystem as AudioSystem
import javax.sound.sampled.Clip as Clip
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

System.setProperty('webdriver.chrome.driver', 'Data Files/chromedriver-win64/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addArguments('start-maximized')

options.addArguments('force-device-scale-factor=1.2')

//Set preferences to allow microphone access
options.setExperimentalOption("prefs",
	new HashMap<String, Object>() {{
		put("profile.default_content_setting_values.media_stream_mic", 1);
	}}
);

// Set preferences to allow microphone access
DesiredCapabilities capabilities = DesiredCapabilities.chrome()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(capabilities)

// Assuming you are using the Katalon Framework for the following lines
DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign Up'))

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_First_Last_Name'), 'lucky')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '123456')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'hi@gmail.com')

WebUI.setEncryptedText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_role_Senior'))

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign Up_1'))

WebUI.delay(60)

WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_View_Sample_Profile'), 
    0)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_View_Sample_Profile'))

WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/p_Greetings, Im Amy Michael, senior profile view text'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/close_view_profile_button_2'), 
    0)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/close_view_profile_button_2'))

WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/img'), 0)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/img'))

WebUI.closeBrowser()

