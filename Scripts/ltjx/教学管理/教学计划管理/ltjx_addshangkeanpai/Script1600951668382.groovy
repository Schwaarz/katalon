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

WebUI.callTestCase(findTestCase('ltjx/login'), [('Networkaddress') : 'http://proltpt.wkuai.cc/', ('username') : '管理员', ('password') : 'Ltjx2020'], 
    FailureHandling.STOP_ON_FAILURE)

int delaytime = 1

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/菜单/jiaoxueguanli'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/jiaoxuejihuaguanli'))

WebUI.delay(delaytime)

WebUI.mouseOver(findTestObject('ltjx/教学管理/教学计划管理/xiala'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkeanpai'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/add_shangkeanpai'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/suoshuxueqi'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/suoshuxueqi-1'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkeshijian'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkeshijian-24'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shichang'), shichang)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/jiaoshixuanze'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/jiaoshixuanze-1'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkebanji'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkebanji-1'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkebanji-2'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/上课安排/shangkeanpai-submit'))

WebUI.delay(delaytime)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

