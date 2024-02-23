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

WebUI.callTestCase(findTestCase('Senior_TestCases/TC10_Demographic_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Demographic Page/Demographic_Validation/Senior_Demographic_Validation/Page_CaringConnections-v-1.18/button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Thank_You_Page/Page_CaringConnections-v-1.18/h1_Thank you'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Thank_You_Page/Page_CaringConnections-v-1.18/p_badge(role)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Thank_You_Page/Page_CaringConnections-v-1.18/img'), 0)

WebUI.click(findTestObject('Object Repository/Thank_You_Page/Page_CaringConnections-v-1.18/img'))

WebUI.closeBrowser()

