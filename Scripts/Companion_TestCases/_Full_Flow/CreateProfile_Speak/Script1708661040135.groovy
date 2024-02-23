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

WebUI.callTestCase(findTestCase('Common_TestCases/Companion_SignUp'), [('username') : UserName, ('zipcode') : ZipCode, ('email') : Email
        , ('password') : Password], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Common_TestCases/Companion_SignUp'), [('username') : UserName, ('zipcode') : ZipCode, ('email') : Email
//	, ('password') : Password], FailureHandling.STOP_ON_FAILURE)
//Verify point-3 "Expectations from Companion"
//WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Expectations_From_Companion'),  10)
//Verify Text "Select the Button of your choice"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_Select the button of your choice to create your profile'), 
    10)

//Verify Text "We are exicted"
WebUI.verifyElementPresent(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/Text_We are excited'), 10)

//click on I want to speak
//WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_I_Want_To_Speak'),
//    67)
WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Click_Record'), 67)

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Click_Record'))

try {
    // Load the audio file
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File('Data Files/ProfileAudio.wav'))

    // Create a Clip and play the audio
    Clip clip = AudioSystem.getClip()

    clip.open(audioInputStream)

    clip.start()

    // Wait for the audio to finish playing
    while (clip.isRunning()) {
        Thread.sleep(1000 // Wait for 100 milliseconds)
            )
    }
    
    clip.stop()
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Stop'))

//scroll to next btn
WebUI.scrollToElement(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'), 0)

WebUI.waitForElementClickable(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'), 60)

//click on next btn
WebUI.click(findTestObject('Profile_Creation_Page/Profile_Creation_Page_Objects/btn_Next'))

//wait for category-view page to load
WebUI.delay(20)

WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/txt_1-2 minutes'), 180)

//Capture and print data of Education Category
String Education = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Educational_Info'), 
    'value')

//String EducationNew = 'I\'m Palak, a retired literature professor with a PhD from the University of Mumbai.'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('EDUCATION', Education, EducationNew)

//Capture and print data of Family and Community Category
String FamilyAndCommunity = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Family_And_Community_Involvement'), 
    'value')

//String FamilyAndCommunity = 'I have a joint family of 10 members'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('FAMILYANDCOMMUNITY', FamilyAndCommunity, FamilyAndCommunityNew)

//Capture and print data of Hobbies Category
String Hobbies = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Hobbies'), 
    'value')

//String HobbiesNew = 'I\'ve dedicated over 35 years to teaching and now spend my retirement immersed in classic novels and poetry. I have a passion for painting and photography.'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('HOBBIES', Hobbies, HobbiesNew)

//Capture and print data of Expectation Category
String Expectations = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_expectation'), 
    'value')

//String ExpectationsNew = 'I value companions who are creative, thoughtful. We could discuss a novel or paint together.'
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('EXPECTATIONS', Expectations, ExpectationsNew)

//Capture and print data of Other Category
String Others = WebUI.getAttribute(findTestObject('Category_View_Page/Category_View_Page_Objects/Input_Edit_Appropriate_Health'), 
    'value')

//String OtherNew = 'on a personal note, i manage hypertension with a balanced diet and regular yoga, but that doesn\'t stop me from embracing every moment of life!  '
CustomKeywords.'validateText.ValidateText.calculateAndPrintPercentageMatch'('OTHERS', Others, OtherNew)

WebUI.waitForElementClickable(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'), 65)

//click on save and continue btn
WebUI.click(findTestObject('Category_View_Page/Category_View_Page_Objects/button_Next'))

//calender page
WebUI.waitForElementNotPresent(findTestObject('WaitingPage/Waiting_Page/Clock_categoryToCalender'), 10)

//WebUI.waitForElementClickable(findTestObject('null'),
//    10)
WebUI.scrollToElement(findTestObject('Calendar_page/Input_Start_Date'), 0)

WebUI.click(findTestObject('Calendar_page/Input_Start_Date'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/startDate/JanuaryStartDates/div_20'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/Input_Busy_Days'))

WebUI.click(findTestObject('Calendar_page/busyDates/JanuaryBusyDate/div_23'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Calendar_page/busyDates/JanuaryBusyDate/div_24'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/div_day_Column'))

WebUI.selectOptionByLabel(findTestObject('Calendar_page/Select_Available_From'), '03:00 PM', false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Calendar_page/Select_Available_To'), '04:00 PM', false)

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Calendar_page/Button_Next (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Calendar_page/button_Ok'))

//verify thankyou page
//WebUI.verifyElementPresent(findTestObject('Object Repository/Thank_You_Page/Page_CaringConnections-v-1.18/txt_h1_Thank you'), 0)
WebUI.delay(2)

WebUI.callTestCase(findTestCase('Companion_TestCases/_Full_Flow/Companion_Demographic'), [('UserName') : UserName, ('ZipCode') : ZipCode
        , ('Email') : Email, ('Password') : Password, ('EducationNew') : EducationNew, ('FamilyAndCommunityNew') : FamilyAndCommunityNew
        , ('HobbiesNew') : HobbiesNew, ('ExpectationsNew') : ExpectationsNew, ('OtherNew') : OtherNew, ('mobile_no') : mobile_no
        , ('birth_year') : birth_year, ('input_address1') : input_address1, ('input_address2') : input_address2, ('zip_code') : zip_code
        , ('driving_licence_no') : driving_licence_no, ('licence_plate_no') : licence_plate_no, ('model_name') : model_name
        , ('emergency_name') : emergency_name, ('emergency_address') : emergency_address, ('address_line2') : address_line2
        , ('EC_zip_code') : EC_zip_code, ('EC_mobile_no') : EC_mobile_no, ('EC_other_mobile_no') : EC_other_mobile_no], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Other_Imp_TestCases/Thank_You_Page'), [:], FailureHandling.STOP_ON_FAILURE)

