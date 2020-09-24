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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

//	
WebUI.openBrowser('')

WebUI.navigateToUrl('http://120.24.73.48/')

WebUI.waitForPageLoad(3000)

WebUI.setText(findTestObject('xinli/public/username'), username)

WebUI.setText(findTestObject('xinli/public/password'), password)

WebUI.click(findTestObject('xinli/public/login'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('xinli/public/tianjiabaobei'))

WebUI.waitForPageLoad(1000)

WebUI.click(findTestObject('xinli/pinpai/HTSJ'))

WebUI.waitForPageLoad(1000)

WebUI.setText(findTestObject('xinli/baobei/gongsimingcheng'), gosimingcheng)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('xinli/baobei/shangchuangmingpian'), card)

WebUI.click(findTestObject('xinli/baobei/close'))

WebUI.click(findTestObject('xinli/baobei/zhucedizhishengshiqu'))

WebUI.waitForPageLoad(1000)

WebUI.click(findTestObject('xinli/baobei/sheng'))

WebUI.waitForPageLoad(1000)

WebUI.click(findTestObject('xinli/baobei/shi'))

WebUI.waitForPageLoad(1000)

WebUI.click(findTestObject('xinli/baobei/qu'))

WebUI.waitForPageLoad(1000)

WebUI.setText(findTestObject('xinli/baobei/zhucedizhi'), zhucedizhi)

WebUI.waitForPageLoad(1000)

WebUI.click(findTestObject('xinli/baobei/copy'))

WebUI.waitForPageLoad(1000)

WebUI.setText(findTestObject('xinli/baobei/bangongdianhua'), bangongdianhua)

WebUI.setText(findTestObject('xinli/baobei/chuanzhenhaoma'), chuangzhenhaoma)

WebUI.click(findTestObject('xinli/baobei/submit'))

WebUI.waitForPageLoad(1000)

WebUI.click(findTestObject('xinli/baobei/YES'))

WebUI.delay(2)