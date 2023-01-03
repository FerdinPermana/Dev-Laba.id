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

WebUI.navigateToUrl('http://dev.laba.id/')

WebUI.setText(findTestObject('Object Repository/Terima Kas Bank/input_Email_email'), 'tesfull1@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Terima Kas Bank/input_Kata Sandi_password'), '+cXSoFe0BuixPq5RXeQsKw==')

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/li_Terima KasBank'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/li_Pendapatan Lain-lain'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/button_Buat Baru'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/i_Jumlah Dibayar_kakutor-date-picker'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/button_5'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/svg_Jumlah Dibayar_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/span_Pendapatan Lainnya'))

WebUI.setText(findTestObject('Object Repository/Terima Kas Bank/input_Jumlah Dibayar_items0.note'), 'Pendapatan1')

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/svg_Jumlah Dibayar_MuiSvgIcon-root'))

WebUI.setText(findTestObject('Object Repository/Terima Kas Bank/input_Jumlah Dibayar_items0.note'), 'Pendapatan1')

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/span_110201  Bank'))

WebUI.setText(findTestObject('Object Repository/Terima Kas Bank/input_Jumlah Dibayar_currency-items0.total'), 'Rp.20.000')

WebUI.click(findTestObject('Object Repository/Terima Kas Bank/button_Submit'))

