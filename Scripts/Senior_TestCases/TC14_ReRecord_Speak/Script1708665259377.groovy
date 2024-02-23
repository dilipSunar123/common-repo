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

//Re-Record the Profile
WebUI.scrollToElement(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Re-record'), 0)

WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Re-record'))

WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Proceed_ReRecord'))

WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Click_Record'), 67)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Click_Record'))

try {
    // Load the audio file
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File('Data Files/ProfileAudio.wav'))

    // Create a Clip and play the audio
    Clip clip = AudioSystem.getClip()

    clip.open(audioInputStream)

    clip.start()

    // Wait for the audio to finish playing
    while (clip.isRunning()) {
        Thread.sleep(1000 // Wait for 100 milliseconds)
            )
    }
    
    clip.stop()
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Stop'))

WebUI.delay(20)

//click on next btn
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'))

WebUI.delay(20)

WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/txt_1-2 minutes'), 180)

WebUI.waitForElementClickable(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'), 65)

