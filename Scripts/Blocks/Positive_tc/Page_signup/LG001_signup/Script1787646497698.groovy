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

WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.click(findTestObject('Page_signup/signupLogin_btn'))

WebUI.setText(findTestObject('Page_signup/input_newUsername_field'), 'Nina')

//WebUI.setText(findTestObject('Page_signup/input_newEmail_field'), 'liana06@gmail.com')
String email = ('nina' + System.currentTimeMillis()) + '@gmail.com'

WebUI.setText(findTestObject('Page_signup/input_newEmail_field'), email)

WebUI.click(findTestObject('Page_signup/Signup_btn'))

WebUI.click(findTestObject('Object Repository/Record/input_Mrs_id_gender2'))

WebUI.click(findTestObject('Page_signup/name_input'))

WebUI.setEncryptedText(findTestObject('Page_signup/password_input'), 'm06Lwe3xLKc=')

WebUI.selectOptionByValue(findTestObject('Page_signup/select_Day_dropdown'), '6', true)

WebUI.selectOptionByValue(findTestObject('Page_signup/select_Month_dropdown'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_signup/select_Year_dropdown'), '2002', true)

WebUI.setText(findTestObject('Page_signup/firstName_input'), 'Nina')

WebUI.setText(findTestObject('Page_signup/lastName_input'), 'Herliana')

WebUI.setText(findTestObject('Page_signup/address_input'), 'Mahatma Road')

WebUI.setText(findTestObject('Page_signup/state_input'), 'Maharashtra')

WebUI.setText(findTestObject('Page_signup/city_input'), 'Mumbai')

WebUI.setText(findTestObject('Page_signup/zipcode_input'), '400000')

WebUI.setText(findTestObject('Page_signup/mobileNumber_input'), '9123345678')

WebUI.click(findTestObject('Page_signup/createAccount_btn'))

WebUI.verifyElementVisible(findTestObject('Page_signup/accountCreated_label'))

WebUI.click(findTestObject('Page_signup/continue_btn'))

WebUI.verifyElementVisible(findTestObject('Page_signup/loggedinAs_label'))

