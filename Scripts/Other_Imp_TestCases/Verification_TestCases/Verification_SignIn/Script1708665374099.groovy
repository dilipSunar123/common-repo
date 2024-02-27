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

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/p_Guidance for starting'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/img'), 0)

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/button_Read Now'), 
    0)

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/button_Read Now'))

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/button_btn text-primary button-position-modal'), 
    0)

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/button_btn text-primary button-position-modal'))

WebUI.delay(2)

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/span_'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/span_'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/a_Terms of use'))

WebUI.switchToWindowTitle('CaringConnections-v-1.18')

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/a_Privacy Policy'))

WebUI.switchToWindowTitle('CaringConnections-v-1.18')

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/div_Shared Purpose'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/p_Fostering meaningful connections through _be736b'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/div_Impact'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/p_We focus on activities that research show_6d5755'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/div_Aligned Values'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/p_Embracing a mission that resonates, invit_9878c4'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/div_Inclusive'))

WebUI.click(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/p_Welcoming diverse individuals to join our_80a27e'))

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/div_Dont you have an account Sign Up'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/button_Sign In'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_Guidence_And_Popup/Page_CaringConnections-v-1.18/button_Sign Up'), 
    0)

WebUI.closeBrowser()

