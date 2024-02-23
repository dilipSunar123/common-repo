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

WebUI.setText(findTestObject('Login_Pages/Sign_In_Page/input_Username'), 'jajaja@gmail.com')

WebUI.setEncryptedText(findTestObject('Login_Pages/Sign_In_Page/input_Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Login_Pages/Sign_In_Page/button_Sign In'))

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/button_Next'))

WebUI.click(findTestObject('Calendar_page/Button_Next (1)'))

WebUI.click(findTestObject('Calendar_page/button_Ok'))

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/h1_Personal Information'), 0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/h1_My Information'), 0)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__MobileNumber'), '+1 (111) 111-1')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__BirthYear'), 'jaja')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Zipcode'), 'hello')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Address1'), '')

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/h1_Emergency contact'), 0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/h1_Add more details about you'), 
    0)

WebUI.setText(findTestObject('Demographic Page/Emergency contact and footer/Input__ECName'), '111')

WebUI.setText(findTestObject('Demographic Page/Emergency contact and footer/Input__ECZipcode'), 'hello')

WebUI.setText(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/input_emergencyMobileNumber'), 
    '999999')

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/input_emergencyOtherNumber'), 
    0)

WebUI.setText(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/input_emergencyOtherNumber'), 
    '')

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/button_Next'), 
    0)

WebUI.click(findTestObject('Demographic Page/Emergency contact and footer/Button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/Error_Phone_Number_Is_Incomplete_Or_Invalid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/Error_Please_Enter_A_Valid_Numeric_Year'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/Error_It_Must_Consist_Only_Of_Numeric_Digits'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/Error_It_Must_Consist_Only_Of_Numeric_Digits'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/span_Phone number is incomplete or invalid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/button_Back'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/img_logo'), 0)

WebUI.click(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/img_logo'))

WebUI.closeBrowser()

