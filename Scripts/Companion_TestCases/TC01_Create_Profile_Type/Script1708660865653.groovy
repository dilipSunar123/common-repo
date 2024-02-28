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
options.setExperimentalOption('prefs', new Script90787180850200$1())

// Set preferences to allow microphone access
DesiredCapabilities capabilities = DesiredCapabilities.chrome()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(capabilities)

// Assuming you are using the Katalon Framework for the following lines
DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign Up'))

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_First_Last_Name'), 'ronald')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_ZIP_code'), '888888')

WebUI.setText(findTestObject('Login_Pages/Sign_Up_Page/Input_Username'), 'ba@gmail.com')

WebUI.setEncryptedText(findTestObject('Login_Pages/Sign_Up_Page/Input_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_role_Companion'))

WebUI.click(findTestObject('Login_Pages/Sign_Up_Page/button_Sign Up_1'))

//Verify point-3 "Expectations from Companion"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Expectations_From_Senior'), 
    0)

//Verify Text "Select the Button of your choice"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Select the button of your choice to create your profile'), 
    0)

//Verify Text "We are exicted"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_We are excited'), 0)

//Click on I want to type button
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'), 
    65)

//click on I wnt to type button
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//enter you profie info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Hello, I\'m Ethan, a passionate technology enthusiast, celebrating my 32 years of existence. Equipped with a Ph.D. in computer science, I\'ve spent the past two decades exploring the ever-evolving world of artificial intelligence and machine learning. Beyond the technical domain, I find great satisfaction in channeling my creativity into writing, crafting compelling stories that transport readers to different realms. I have a joint family of 30 members. In my quest for professional growth, I\'m in search of a senior who can offer valuable insights as I navigate the dynamic field of AI research. On a personal note, I prioritize a balanced lifestyle despite managing allergies, with regular yoga and meditation sessions ensuring both my physical and mental well-being.')

//scroll to next btn
WebUI.scrollToElement(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'), 
    0)

//click on next btn
WebUI.click(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

//wait for category-view page to load
//WebUI.waitForPageLoad(180)
WebUI.delay(45)

WebUI.waitForElementClickable(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'), 65)

