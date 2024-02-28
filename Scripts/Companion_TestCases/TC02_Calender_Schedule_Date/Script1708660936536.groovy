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

WebUI.callTestCase(findTestCase('Companion_TestCases/TC01_Create_Profile_Type'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('New Folder/Page_CaringConnections-v-1.17/Button_Next_Category_View_Page'), 0)

WebUI.click(findTestObject('New Folder/Page_CaringConnections-v-1.17/Button_Next_Category_View_Page'))

//verify thankyou page
//WebUI.verifyElementPresent(findTestObject('Object Repository/Thank_You_Page/Page_CaringConnections-v-1.18/txt_h1_Thank you'), 0)
//
//WebUI.delay(2)
//
//WebUI.closeBrowser()
//calender page
WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/Clock_categoryToCalender'), 10)

//WebUI.waitForElementClickable(findTestObject('null'),
//    10)
WebUI.scrollToElement(findTestObject('Calendar_page/Input_Start_Date'), 0)

WebUI.click(findTestObject('Calendar_page/Input_Start_Date'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/busyDates/JanuaryBusyDate/div_25'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/Input_Busy_Days'))

not_run: WebUI.click(findTestObject('Calendar_page/busyDates/JanuaryBusyDate/div_23'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/div_day_Column'))

WebUI.selectOptionByLabel(findTestObject('Calendar_page/Select_Available_From'), '01:30 PM', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Calendar_page/Select_Available_To'), '04:30 PM', false)

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/Button_Next (1)'))

WebUI.delay(3)

