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

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/jiaoxuejihuaguanli'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/add_zhuanyefenlei'))

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/教学管理/教学计划管理/教学计划/kechengfenlei'), kechengfeilei)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/zhuanyefenlei_submit'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/clickkechengfenlei'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/add_jiaoxuejihua'))

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/教学管理/教学计划管理/教学计划/kechengmingcheng'), kechengmingcheng)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/kechengkeben'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/kechengkeben-6'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/renkelaoshi'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/renkelaoshi-1'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/jiaoxuejihua_submit'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/clickkechengmingcheng'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/add_jiaoxuehuanjie'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/zhangjiemulu'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/zhangjiemulu_1'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/zhangjiemulu_1_1'))

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/教学管理/教学计划管理/教学计划/keshi'), keshi)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/jiaoxuehuanjie_submit'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/edit-kejian'))

WebUI.delay(delaytime)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/daoru'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/daoru-Yes'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/baocunkejian'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/jiaoxuejihuaguanli'))

WebUI.delay(delaytime)

WebUI.mouseOver(findTestObject('ltjx/教学管理/教学计划管理/xiala'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/gongdanguanli'))

WebUI.switchToWindowIndex(2)

WebUI.waitForPageLoad(10)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/daoru'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/daoru-Yes'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/baocungongdan'))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/教学管理/教学计划管理/教学计划/jiaoxuejihuaguanli'))

WebUI.delay(delaytime)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

