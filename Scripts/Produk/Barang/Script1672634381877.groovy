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

WebUI.click(findTestObject('Object Repository/Produk/Barang/li_Produk'))

WebUI.click(findTestObject('Object Repository/Produk/Barang/li_Barang'))

WebUI.click(findTestObject('Object Repository/Produk/Barang/span_Tambah Barang'))

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input__name'), 'Laptop')

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input__code'), '10')

WebUI.click(findTestObject('Object Repository/Produk/Barang/svg__MuiSvgIcon-root'))

WebUI.selectAllOption(findTestObject('Produk/Barang/div_Gadget'))

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input__unit'), 'Unit')

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input__currency-purchasePrice'), 'Rp.10.000.000')

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input__currency-sellingPrice'), 'Rp.10.200.000')

WebUI.setText(findTestObject('Object Repository/Produk/Barang/textarea_Catatan(Optional)_note'), 'Barang1')

WebUI.click(findTestObject('Object Repository/Produk/Barang/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Produk/Barang/i_Unit_kakutor-dotcircle'))

WebUI.click(findTestObject('Object Repository/Produk/Barang/p_Stok Barang'))

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input_Gudang Pusat_currency-items0.stock'), '1.000')

WebUI.setText(findTestObject('Object Repository/Produk/Barang/input_Gudang Pusat_currency-items0.stockMin'), '10')

WebUI.click(findTestObject('Object Repository/Produk/Barang/span_Simpan'))

