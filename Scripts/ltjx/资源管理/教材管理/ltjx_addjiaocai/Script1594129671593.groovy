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
//呼叫登录用例
WebUI.callTestCase(findTestCase('ltjx/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ltjx/公共元素/菜单/ziyuanguanli'))

WebUI.click(findTestObject('ltjx/资源管理/教材管理/jiaocaiguanli'))

WebUI.click(findTestObject('ltjx/资源管理/教材管理/fujiaxuanxiang_1'))

WebUI.click(findTestObject('ltjx/资源管理/教材管理/addzimulu'))

WebUI.setText(findTestObject('ltjx/资源管理/教材管理/zimulubiaoti'), '第一节')

WebUI.click(findTestObject('ltjx/资源管理/教材管理/xuanzeleixing'))

WebUI.click(findTestObject('ltjx/资源管理/教材管理/jie'))

WebUI.setText(findTestObject('ltjx/资源管理/教材管理/paixun'), '1')

WebUI.click(findTestObject('ltjx/资源管理/教材管理/tijiao'))

WebUI.delay(1)

WebUI.closeBrowser()

