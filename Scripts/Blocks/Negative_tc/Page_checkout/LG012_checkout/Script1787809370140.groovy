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

WebUI.callTestCase(findTestCase('Blocks/Positive_tc/Page_login/LG002_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Positive_tc/Page_viewProduct/LG003_viewProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Positive_tc/Page_addtoCart/LG004_addtoCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Positive_tc/Page_viewCart/LG005_viewCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Record/a_Proceed To Checkout'))

WebUI.click(findTestObject('Object Repository/Record/a_Place Order'))

WebUI.setText(findTestObject('Object Repository/Record/input_Name on Card_name_on_card'), 'Nina')

WebUI.setText(findTestObject('Object Repository/Record/input_Card Number_card_number'), '')

WebUI.setText(findTestObject('Object Repository/Record/input_CVC_cvc'), '567')

WebUI.setText(findTestObject('Object Repository/Record/input_Expiration_expiry_month'), '08')

WebUI.setText(findTestObject('Object Repository/Record/input_Expiration_expiry_year'), '2028')

WebUI.click(findTestObject('Object Repository/Record/button_Pay and Confirm Order'))

