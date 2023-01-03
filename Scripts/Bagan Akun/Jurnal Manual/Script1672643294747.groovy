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

WebUI.setText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Email_email'), 'tesfull1@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Kata Sandi_password'), '+cXSoFe0BuixPq5RXeQsKw==')

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/li_Bagan Akun'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/span_Tindakan'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/p_Jurnal Manual'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/button_Buat Jurnal Manual Baru'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/button__MuiButtonBase-root MuiIconButton-root'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/button_3'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/svg_Kredit_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/span_110201  Bank'))

WebUI.setText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Kredit_items0.description'), '1')

WebUI.setText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Kredit_items0.debit'), 'Rp100.000')

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/span_Tambah Baris'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/svg_Kredit_MuiSvgIcon-root_1'))

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/span_210202  PPh 23'))

WebUI.setText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Kredit_items1.description'), '2')

WebUI.setText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Kredit_items1.credit'), 'Rp100.000')

WebUI.setText(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/input_Tambah Baris_note'), 'MJ1')

WebUI.uploadFile(findTestObject('Bagan Akun/Jurnal Manual/button_Unggah Berkas'), 'D:\\File Upload Testing\\Bunga.jpg')

WebUI.click(findTestObject('Object Repository/Bagan Akun/Jurnal Manual/button_Simpan'))

