import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.pair_return as pair_return
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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

//呼叫登录测试用例
WebUI.callTestCase(findTestCase('ltjx/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ltjx/公共元素/菜单/ziyuanguanli'))

WebUI.click(findTestObject('ltjx/资源管理/课本管理/kebenguanli'))

WebUI.click(findTestObject('ltjx/资源管理/课本管理/Add keben'))

WebUI.setText(findTestObject('ltjx/资源管理/课本管理/kebenmingcheng'), kebenmingcheng)

WebUI.setText(findTestObject('ltjx/资源管理/课本管理/kebenzuozhe'), kebenzuozhe)

WebUI.setText(findTestObject('ltjx/资源管理/课本管理/kebenshuhao'), kebenshuhao)

WebUI.setText(findTestObject('ltjx/资源管理/课本管理/chubanshe'), chubanshe)

WebUI.click(findTestObject('ltjx/资源管理/课本管理/chubantime'))

WebUI.delay(1)

WebUI.click(findTestObject('ltjx/资源管理/课本管理/day'))

WebUI.setText(findTestObject('ltjx/资源管理/课本管理/kebenjianjie'), kebenjianjie)

WebUI.uploadFile(findTestObject('ltjx/资源管理/课本管理/fengmian'), fengmian)

WebUI.delay(1)

WebUI.click(findTestObject('ltjx/资源管理/课本管理/submit'))

//拍个照
WebUI.takeScreenshot('D:\\kebensubmit.png')

toString()

