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

WebUI.callTestCase(findTestCase('Senior_TestCases/TC09_Calender_Schedule_Date'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Demographic Page/Text_Personal Information'), 0, FailureHandling.STOP_ON_FAILURE)

//My Information Section
WebUI.verifyElementPresent(findTestObject('Demographic Page/My Information/Text_My Information'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Demographic Page/My Information/Input__MobileNumber'), 0)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__MobileNumber'), '2343556677')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__BirthYear'), '1987')

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Address1'), 'Eros Lane')

WebUI.setText(findTestObject('Demographic Page/My Information/Input_Address2'), 'Jungle Road')

WebUI.selectOptionByLabel(findTestObject('Demographic Page/My Information/Select_State'), 'Texas', false)

WebUI.selectOptionByLabel(findTestObject('Demographic Page/My Information/Select_City'), 'Houston', false)

WebUI.setText(findTestObject('Demographic Page/My Information/Input__Zipcode'), '123456')

//Emergency Contact section
//WebUI.verifyElementPresent(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Text_Emergency_Contact'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyName'), 'Shri')

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_Relation'), 'Family', false)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyAddress'), 'Angel Road')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input_Address Line 2 (Optional)_emergencyAddress2'), 
    'Police Road')

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/Select_EC_State'), 'California', 
    false)

WebUI.selectOptionByLabel(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/SelectEC_City'), 'Fresno', false)

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyZipcode'), '111111')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input__emergencyMobileNumber'), '2343454455')

WebUI.setText(findTestObject('ECemergencyNew/Page_CaringConnections-v-1.17/input_Other No_emergencyOtherNumber'), '2244335566')

