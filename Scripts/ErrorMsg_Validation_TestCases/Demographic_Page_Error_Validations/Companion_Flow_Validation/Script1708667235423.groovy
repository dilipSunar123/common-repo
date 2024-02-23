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

WebUI.setText(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/input_username'), 
    'raju23@gmail.com')

WebUI.setText(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/input_password'), 
    'Harsh@123')

WebUI.click(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/button_Sign In'))

WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'))

WebUI.click(findTestObject('Calendar_page/Button_Next (1)'))

WebUI.click(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/button_Ok'))

WebUI.click(findTestObject('Demographic Page/Emergency contact and footer/Button_Back'))

WebUI.click(findTestObject('Calendar_page/Button_Next (1)'))

WebUI.click(findTestObject('Calendar_page/button_Ok'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Driving license number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Driving license expiration date'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_License plate number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Make and Model'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Issuing driving license state'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Relation'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Address Line 1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Address Line 2 (Optional)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_State'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_City'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Zipcode'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Mobile No'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Page_CaringConnections-v-1.18/label_Other No'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/Page_CaringConnections-v-1.18/h1_Personal Information'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/Page_CaringConnections-v-1.18/h1_My Information'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/Page_CaringConnections-v-1.18/h1_Driving Information'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/Page_CaringConnections-v-1.18/h1_Emergency contact'), 
    0)

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_Relation'), 'Partner', 
    false)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Emergency contact and footer/Button_Back'), 0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Emergency contact and footer/Button_Next'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/Page_CaringConnections-v-1.18/img'), 
    0)

WebUI.click(findTestObject('Demographic Page/Demographic_Validation/Companion_Demographic_Validation/Validation/Page_CaringConnections-v-1.18/img'))

WebUI.closeBrowser()

