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

//打开浏览器
WebUI.openBrowser('')

//进入系统
WebUI.navigateToUrl('http://configgc.wkuai.cc/')

//账号
WebUI.setText(findTestObject('lzgc/public/username'), a)

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//点击经费报销
WebUI.click(findTestObject('lzgc/lzgc-lc/jingfeibaoxiao'))

//选择项目
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/xiangmu'))

//选择第一个
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/xiangmu1'))

//选择预算分类
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/yusuanfenlei'))

//选择第一个
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/yusuanfenlei1'))

//输入经费金额
WebUI.setText(findTestObject('lzgc/jingfeibaoxiao-yuansu/jingfeijine'), '20000')

//输入经费用途
WebUI.setText(findTestObject('lzgc/jingfeibaoxiao-yuansu/jingfeiyongtu'), '高创测试金额大写')

//上传报销单据
WebUI.uploadFile(findTestObject('lzgc/jingfeibaoxiao-yuansu/baoxiaodanju'), 'C://Users//yinguohao//Pictures//gcwy//unnamed.jpg')

//选择物业财务部会计
WebUI.click(findTestObject('lzgc/lzgc-juese/wuyecaiwubukauiji'))

//点击提交
WebUI.click(findTestObject('lzgc/public/submit'))

//点击头像
WebUI.click(findTestObject('lzgc/public/toxiang'))

//点击退出
WebUI.click(findTestObject('lzgc/public/quit2'))

//点击退出确认
WebUI.click(findTestObject('lzgc/public/YES'))

//等待时间设置为3秒
WebUI.delay(3)

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '物业财务部会计')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办经费报销
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/renwudaiban-jingfeibaoxiao'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//选择通过
WebUI.click(findTestObject('lzgc/public/toguo'))

//提交
WebUI.click(findTestObject('lzgc/public/renwudaiban_tijiao1'))

//确定
WebUI.click(findTestObject('lzgc/public/renwudaiban_YES'))

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

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '物业项目部经理')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办经费报销
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/renwudaiban-jingfeibaoxiao'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

WebUI.click(findTestObject('lzgc/renwudaiban_juese/fuzojingli'))

//提交
WebUI.click(findTestObject('lzgc/public/toguo2'))

WebUI.click(findTestObject('lzgc/public/renwudaiban_tijiao1'))

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

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '副总经理')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办经费报销
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/renwudaiban-jingfeibaoxiao'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

WebUI.click(findTestObject('lzgc/renwudaiban_juese/fuzojingli'))

//提交
WebUI.click(findTestObject('lzgc/public/toguo2'))

WebUI.click(findTestObject('lzgc/public/renwudaiban_tijiao1'))

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

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '总经理')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办经费报销
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/renwudaiban-jingfeibaoxiao'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

WebUI.click(findTestObject('lzgc/renwudaiban_juese/wuyecaiwubuchuna_4'))

//提交
WebUI.click(findTestObject('lzgc/public/toguo2'))

WebUI.click(findTestObject('lzgc/public/renwudaiban_tijiao1'))

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

//账号
WebUI.setText(findTestObject('lzgc/public/username'), '物业财务部出纳')

//密码
WebUI.setEncryptedText(findTestObject('lzgc/public/password'), 'aeHFOx8jV/A=')

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办经费报销
WebUI.click(findTestObject('lzgc/jingfeibaoxiao-yuansu/renwudaiban-jingfeibaoxiao'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//提交
WebUI.click(findTestObject('lzgc/public/renwudaiban_jieshuliucheng'))

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

//退出浏览器
WebUI.closeBrowser()

