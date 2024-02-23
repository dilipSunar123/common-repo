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

//Open Browser
WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

//enter emailID
WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Username'), 'sam23@gmail.com')

//enter password
WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Password'), 'Harsh@123')

//click on signup button
WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign_In'))

WebUI.delay(5)

//scroll to re-record button
WebUI.scrollToElement(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Re-record'), 0)

//click on Re-record
WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Re-record'))

//click on proceed
WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Proceed'))

//Click on I want to type button
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'), 
    65)

//click on I wnt to type button
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Type'))

//enter you profie info
WebUI.setText(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Input_I_Want_To_Type'), 'Greetings, I\'m Naveen , a seasoned explorer in the journey of life, joyfully celebrating my 58 years of existence. With a background in literature, I dedicated decades to exploring the rich world of words and stories. Beyond academic pursuits, I find solace in the world of painting, crafting vibrant canvases that express the beauty of the written word. I have a joint family of 32 members. In a companion, I hope to find someone who shares my love for literature and the appreciation for the creative blend of art and storytelling. Health-wise, I\'ve faced challenges with allergies, but with careful management and a balanced lifestyle, I continue to pursue my passions with vigor. Life has been a captivating adventure through the pages of books and art, and I look forward to painting new chapters with a like-minded soul who values the beauty of storytelling and the creativity of artistic expression.')

//scroll to next btn
WebUI.scrollToElement(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'), 
    0)

//click on next btn
WebUI.click(findTestObject('Object Repository/Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

//wait for category-view page to load
WebUI.delay(20)

WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/txt_1-2 minutes'), 180)

WebUI.waitForElementClickable(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Next'), 
    65)

