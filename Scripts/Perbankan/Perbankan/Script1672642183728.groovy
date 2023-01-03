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

WebUI.click(findTestObject('Object Repository/Perbankan/li_Perbankan'))

WebUI.click(findTestObject('Object Repository/Perbankan/span_Tambah Akun'))

WebUI.click(findTestObject('Object Repository/Perbankan/body_Tes FullCycle1PT. SKSBerandaPenjualanP_c58106'))

WebUI.click(findTestObject('Perbankan/div_'))

WebUI.click(findTestObject('Object Repository/Perbankan/li_Bank'))

WebUI.setText(findTestObject('Object Repository/Perbankan/input__name'), 'May Bank')

WebUI.click(findTestObject('Object Repository/Perbankan/span_Simpan'))

//WebUI.click(findTestObject('Object Repository/Perbankan/button_Transfer Saldo'))

//WebUI.click(findTestObject('Object Repository/Perbankan/svg__MuiSvgIcon-root'))
//
//WebUI.click(findTestObject('Object Repository/Perbankan/span_110201  Bank'))
//
//WebUI.click(findTestObject('Object Repository/Perbankan/path'))
//
//WebUI.click(findTestObject('Object Repository/Perbankan/span_110204  Bank Jago'))
//
//WebUI.setText(findTestObject('Object Repository/Perbankan/input__currency-total'), '20.000')
//
//WebUI.setText(findTestObject('Object Repository/Perbankan/textarea_Catatan_note'), 'Saldo1')
//
//WebUI.uploadFile(findTestObject('Perbankan/button_Unggah Berkas'), 'D:\\File Upload Testing\\Contoh Manual Jurnal PDF.pdf')
//
//WebUI.delay(10)
//
//WebUI.click(findTestObject('Object Repository/Perbankan/span_Simpan'))

//WebUI.click(findTestObject('Object Repository/Perbankan/span_Iya, Saya ingin transfer'))

