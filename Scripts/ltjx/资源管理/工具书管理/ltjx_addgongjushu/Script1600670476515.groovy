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

WebUI.callTestCase(findTestCase('ltjx/login'), [('Networkaddress') : 'http://ltpt.wkuai.cc/', ('username') : '管理员', ('password') : 'Ltjx2020'], 
    FailureHandling.STOP_ON_FAILURE)

int delaytime = 2

WebUI.click(findTestObject('ltjx/公共元素/菜单/ziyuanguanli'))

WebUI.click(findTestObject('ltjx/资源管理/工具书管理/gongjushuguanli'))

WebUI.click(findTestObject('ltjx/资源管理/工具书管理/addgongjushu'))

WebUI.setText(findTestObject('ltjx/资源管理/工具书管理/gongjushumingcheng'), gongjushumingcheng)

WebUI.delay(delaytime)

WebUI.uploadFile(findTestObject('ltjx/资源管理/工具书管理/uploadPDF'), uploadPDF)

WebUI.delay(delaytime)

WebUI.uploadFile(findTestObject('ltjx/资源管理/工具书管理/gongjushufengmian'), gongjushufengmian)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/资源管理/工具书管理/gongjushu-submit'))

WebUI.closeBrowser()

