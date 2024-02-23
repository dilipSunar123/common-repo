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

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Sign Up'), 
    0)

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/span_'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/p_Guidance for starting'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Read Now'), 
    0)

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Read Now'))

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_btn text-primary button-position-modal'), 
    0)

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_btn text-primary button-position-modal'))

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/div_Shared Purpose'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/p_Fostering meaningful connections through _be736b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/div_Impact'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/p_We focus on activities that research show_6d5755'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/div_Aligned Values'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/p_Embracing a mission that resonates, invit_9878c4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/div_Inclusive'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/p_Welcoming diverse individuals to join our_80a27e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/a_Terms of use'), 
    0)

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/a_Terms of use'))

WebUI.switchToWindowTitle('CaringConnections-v-1.18')

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/a_Privacy Policy'), 
    0)

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/a_Privacy Policy'))

WebUI.switchToWindowTitle('CaringConnections-v-1.18')

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/div_Already have an account Sign In'), 
    0)

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Sign In'), 
    0)

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Sign Up_1'))

WebUI.setText(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/input_name'), 'radha kapoor')

WebUI.setText(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/input_name'), '111111')

WebUI.setText(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/input_zipcode'), '123456')

WebUI.setText(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/input_username'), 'honeyy@gmail.com')

WebUI.setEncryptedText(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/input_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/input_role'))

WebUI.verifyElementPresent(findTestObject('Verification_guidence_and_popup/Verification_Guidance_Img_Popup_SignUp/button_Sign Up_1'), 
    0)

WebUI.closeBrowser()

