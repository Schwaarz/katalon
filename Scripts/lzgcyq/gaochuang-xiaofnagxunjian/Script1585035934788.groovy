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
import com.kms.katalon.core.testdata.InternalData as InternalData

/*InternalData data = findTestData('null')

for (def index : (0..data.getRowNumbers() - 1)) {*/
//打开浏览器
WebUI.openBrowser('')

//打开网站
WebUI.navigateToUrl('http://configgc.wkuai.cc/')

//账号
WebUI.setText(findTestObject('lzgc/public/username'), username1)

//密码
WebUI.setText(findTestObject('lzgc/public/password'), password1)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//消防巡检
WebUI.click(findTestObject('lzgc/lzgc-lc/xiaofangxunjian'))


WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/xunjianryaun'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/xunjianryuan-4'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/xunjianriqi'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/xunjianriqi_24'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/yaunqu'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/yuanqu_3'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/banci'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/banci_1'))

WebUI.setText(findTestObject('lzgc/xiaofangzhiban-yuansu/guzhangbaojing'), '没有问题')

WebUI.setText(findTestObject('lzgc/xiaofangzhiban-yuansu/beizhu'), '1')

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/zhenggaiqingkuang_YES'))

WebUI.click(findTestObject('lzgc/public/submit'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/xiaofangxunjian_liuchengliuxiang'))

//点击头像
WebUI.click(findTestObject('lzgc/public/toxiang'))

//点击退出
WebUI.click(findTestObject('lzgc/public/quit2'))

//点击退出确认
WebUI.click(findTestObject('lzgc/public/YES'))

WebUI.delay(3)

//账号
WebUI.setText(findTestObject('lzgc/public/username'), username1)

//密码
WebUI.setText(findTestObject('lzgc/public/password'), password1)

WebUI.click(findTestObject('lzgc/public/denglu'))

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/renwudaiban_xunjian'))

WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

WebUI.setText(findTestObject('lzgc/xiaofangzhiban-yuansu/chuliqingkuang'), '可以')

WebUI.click(findTestObject('lzgc/xiaofangzhiban-yuansu/xiaofangxunjian_tijiao'))

//关掉任务待办
WebUI.click(findTestObject('lzgc/public/renwudaiban_quit'))

//点击头像
WebUI.click(findTestObject('lzgc/public/toxiang'))

//点击退出
WebUI.click(findTestObject('lzgc/public/quit2'))

//点击退出确认
WebUI.click(findTestObject('lzgc/public/YES'))

