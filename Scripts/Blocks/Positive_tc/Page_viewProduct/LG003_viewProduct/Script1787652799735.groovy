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

WebUI.click(findTestObject('Page_viewProduct/products_btn'))

WebUI.waitForElementVisible(findTestObject('Page_viewProduct/allProducts_tittleText'), 20)

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/allProducts_tittleText'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/productList_label'))

WebUI.waitForElementClickable(findTestObject('Page_viewProduct/viewProduct_btn'), 20)

WebUI.click(findTestObject('Page_viewProduct/viewProduct_btn'))

WebUI.waitForElementClickable(findTestObject('Page_viewProduct/productName_label'), 20)

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/productName_label'))

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/category_label'))

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/price_label'))

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/availability_label'))

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/condition_label'))

WebUI.verifyElementVisible(findTestObject('Page_viewProduct/brand_label'))

