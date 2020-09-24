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

//打开浏览器
WebUI.openBrowser('')

//进入系统
WebUI.navigateToUrl('http://configgc.wkuai.cc/')

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '物业项目部员工')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//点击公文处理
WebUI.click(findTestObject('lzgc/lzgc-lc/gongwenchuli'))

//输入项目标题
WebUI.setText(findTestObject('lzgc/gongwenchuli-yuansu/xiangmubiaoti'), '自动测试')

//输入项目摘要
WebUI.setText(findTestObject('lzgc/gongwenchuli-yuansu/xiangmuzhaiyao'), '自动测试111')

//上传报价单
WebUI.uploadFile(findTestObject('lzgc/gongwenchuli-yuansu/baojiadan'), 'C://Users//yinguohao//Pictures//Saved Pictures//81856.jpg')

//上传单位资质证明
WebUI.uploadFile(findTestObject('lzgc/gongwenchuli-yuansu/danweizizhizhnegming'), 'C://Users//yinguohao//Pictures//Saved Pictures//428892.jpg')

//上传施工图纸
WebUI.uploadFile(findTestObject('lzgc/gongwenchuli-yuansu/shigongtuzhi'), 'C://Users//yinguohao//Pictures//Saved Pictures//642257.jpg')

//点击提交
WebUI.click(findTestObject('lzgc/public/submit'))

WebUI.click(findTestObject('lzgc/public/liuchengliuxiang_YES'))

//点击头像
WebUI.click(findTestObject('lzgc/public/toxiang'))

//点击退出
WebUI.click(findTestObject('lzgc/public/quit2'))

//点击退出确认
WebUI.click(findTestObject('lzgc/public/YES'))

//等待时间设置为3秒
WebUI.delay(3)

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '物业项目部经理')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办经费报销
WebUI.click(findTestObject('lzgc/gongwenchuli-yuansu/gzt_gongwenchuli'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//选择通过
WebUI.click(findTestObject('lzgc/public/toguo'))

//提交
WebUI.click(findTestObject('lzgc/public/renwudaiban_tijiao1'))

//确定
WebUI.click(findTestObject('lzgc/public/renwudaiban_3'))

//等待时间
WebUI.delay(3)

//关掉任务待办
WebUI.click(findTestObject('lzgc/public/renwudaiban_quit'))

//点击头像
WebUI.click(findTestObject('lzgc/public/toxiang'))

//点击退出
WebUI.click(findTestObject('lzgc/public/quit2'))

//点击退出确认
WebUI.click(findTestObject('lzgc/public/YES'))

//等待时间设置为3秒
WebUI.delay(3)

