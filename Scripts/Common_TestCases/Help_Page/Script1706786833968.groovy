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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/input_username'), 'raju23@gmail.com')

WebUI.setEncryptedText(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/input_password'), 'QmrIyMB454Sq0s0w1zzgnQ==')

WebUI.click(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/button_Sign In'))

WebUI.scrollToElement(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'), 0)

WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'))

WebUI.scrollToElement(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/button_Help'), 0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/button_Help'), 0)

WebUI.click(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/button_Help'))

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/h3_Need Help in calendar Weve got your back (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/p_You can find the answer in our collections'), 
    0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/img_help-image'), 0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/span_How do I show my availability to provi_971f37'), 
    0)

WebUI.click(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/svg_buttonFeature'))

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/span_How do I show my availability to provi_971f37'), 
    0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/img_step-image'), 0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/p_A pop-up window will appear for you to en_799693'), 
    0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/img_step-image_1'), 0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/p_Repeat Step 2 to set remaining availabili_73c99c'), 
    0)

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/svg_concat(Need Help in calendar We, , ve got your back)_buttonFeature'), 
    0)

WebUI.click(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/svg_concat(Need Help in calendar We, , ve got your back)_buttonFeature'))

WebUI.click(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/button_Help'))

WebUI.verifyElementPresent(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/img'), 0)

WebUI.click(findTestObject('next_calender_view_test/Calender_Help_Page_Companion/img'))

WebUI.closeBrowser()

