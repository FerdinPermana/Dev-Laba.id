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

WebUI.click(findTestObject('Object Repository/Kontak/li_Kontak'))

WebUI.click(findTestObject('Object Repository/Kontak/span_Tambah Kontak'))

WebUI.click(findTestObject('Object Repository/Kontak/input__jss51'))

WebUI.click(findTestObject('Object Repository/Kontak/input__jss51'))

WebUI.setText(findTestObject('Object Repository/Kontak/input__name'), 'Sambo')

WebUI.setText(findTestObject('Object Repository/Kontak/input__email'), 'sambo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Kontak/input__currency-phone'), '08989898989898')

WebUI.setText(findTestObject('Object Repository/Kontak/input__companyName'), 'PT. Ano')

WebUI.setText(findTestObject('Object Repository/Kontak/input__currency-companyPhone'), '0897654321876')

WebUI.click(findTestObject('Object Repository/Kontak/div_'))

WebUI.setText(findTestObject('Object Repository/Kontak/textarea__address'), 'Wakanda')

WebUI.click(findTestObject('Object Repository/Kontak/input__jss51'))

WebUI.setText(findTestObject('Object Repository/Kontak/input_Kecamatan_districts'), 'Wakanda')

WebUI.setText(findTestObject('Object Repository/Kontak/input_Kota_city'), 'Wakanda')

WebUI.setText(findTestObject('Object Repository/Kontak/input_Provinsi_province'), 'Wakanda')

WebUI.setText(findTestObject('Object Repository/Kontak/input_Kode Pos_postalCode'), '113245')

WebUI.setText(findTestObject('Object Repository/Kontak/textarea_Catatan_note'), 'Kontak1')

WebUI.uploadFile(findTestObject('Kontak/button_Pilih Foto'), 'D:\\File Upload Testing\\Bunga.jpg')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Kontak/span_Simpan'))

