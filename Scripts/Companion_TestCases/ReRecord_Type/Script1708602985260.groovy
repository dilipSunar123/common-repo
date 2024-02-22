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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Username'), 'sachin@gmail.com')

WebUI.setEncryptedText(findTestObject('Login_Pages/Sign_In_Page/input_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign In'))

//scroll to re-record button
WebUI.scrollToElement(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Re-record'), 
    0)

//click on Re-record
WebUI.click(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Re-record'))

//click on proceed
WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/btn_Proceed_ReRecord'))

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

WebUI.waitForElementClickable(findTestObject('Object Repository/Category_View_Page/Category_View_Page_Objects/button_Next'), 
    65)

