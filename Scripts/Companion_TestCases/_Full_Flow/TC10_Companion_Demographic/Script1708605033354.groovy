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

WebUI.verifyElementPresent(findTestObject('Demographic Page/Text_Personal Information'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Demographic Page/My Information/Text_My Information'), 0, FailureHandling.STOP_ON_FAILURE)

String NAME = WebUI.getAttribute(findTestObject('Demographic Page/My Information/Input_Name'), 'value')

CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('Name', NAME, UserName)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__MobileNumber'), '9876543210')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__BirthYear'), '1956')

String EMAIL = WebUI.getAttribute(findTestObject('Demographic Page/My Information/Input_Email'), 'value')

CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('Email', EMAIL, Email)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Address1'), '8888 Pin Oak Drive NY')

WebUI.setText(findTestObject('Demographic Page/My Information/Input_Address2'), '8888 Pin Oak Drive NY')

WebUI.selectOptionByLabel(findTestObject('Demographic Page/My Information/Select_State'), 'Texas', false)

WebUI.selectOptionByLabel(findTestObject('Demographic Page/My Information/Select_City'), 'Houston', false)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Zipcode'), '414141')

//----------------------------------------------------------------------------------------------------------
//Driving information
WebUI.verifyElementPresent(findTestObject('Demographic Page/Driving inormation/Text_Driving_Information'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Demographic Page/Driving inormation/Input__DLNumber'), '190000001')

WebUI.setText(findTestObject('Demographic Page/Driving inormation/Input__DLExpireDate (1)'), '01/03/2024')

WebUI.setText(findTestObject('Object Repository/Demographic Page/Driving inormation/Other_Driving_Info/Page_CaringConnections-v-1.18/input_licensePlate'), 
    'ABC-123')

WebUI.setText(findTestObject('Object Repository/Demographic Page/Driving inormation/Other_Driving_Info/Page_CaringConnections-v-1.18/input_makeAndModel'), 
    'Maruti Suzuki')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Demographic Page/Driving inormation/Other_Driving_Info/Page_CaringConnections-v-1.18/select_Example TexasNew YorkCaliforniaIllin_2d8614'), 
    'Ohio', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Demographic Page/Driving inormation/Other_Driving_Info/Page_CaringConnections-v-1.18/select_Example TexasNew YorkCaliforniaIllin_2d8614'), 
    'Washington', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demographic Page/Driving inormation/Other_Driving_Info/Page_CaringConnections-v-1.18/label_How far are you willing to drive to m_4acf8a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Driving inormation/input__driveRange (1)'), 0)

WebUI.verifyElementPresent(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Text_Emergency_Contact'), 0)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyName'), 'Harsh Joshi')

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_Relation'), 'Spouse', false)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyAddress'), 'Ketting Road')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input_Address Line 2 (Optional)_emergencyAddress2'), 
    'Police Bazar')

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_State'), 'Florida', false)

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/select_Select a city in MichiganDetroitGran_ff8a02'), 
    'Tampa', false)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyZipcode'), '444444')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyMobileNumber'), '+1 (887) 788-9900')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input_Other No_emergencyOtherNumber'), '+1 (776) 677-8899')

WebUI.click(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/button_Next'))

