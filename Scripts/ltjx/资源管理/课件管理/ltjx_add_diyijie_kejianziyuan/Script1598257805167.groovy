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
//导入支持键
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('ltjx/login'), [:], FailureHandling.STOP_ON_FAILURE)

int delaytime = 1

//选择菜单
WebUI.click(findTestObject('ltjx/公共元素/菜单/ziyuanguanli'))

WebUI.click(findTestObject('ltjx/资源管理/课件管理/kejianguanli'))

WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu'))

WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_diyijie'))

WebUI.delay(delaytime)

//选择菜单-END

//循环加区块
for (def index : (1..7)) {
    WebUI.click(findTestObject('ltjx/资源管理/课件管理/kejian-addqukuai'))
}
//循环结束

//富文本
WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第一区块/qukuaimingchengdelaytime'), qukuaimingchengdelaytime)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第一区块/xuanzequkuaidelaytime'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第一区块/富文本/fuwenben'))

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第一区块/富文本/text'), text)

//富文本-END

//视频
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第二区块/qukuaimingcheng2'), qukuaimingcheng2)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第二区块/xuanzequkuai2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第二区块/视频/MP4'))

WebUI.delay(delaytime)

WebUI.uploadFile(findTestObject('ltjx/公共元素/区块元素/第二区块/视频/upload-MP4'), MP4)

WebUI.delay(delaytime)

//视频-END

//图片
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第三区块/qukuaimingcheng3'), qukuaimingcheng3)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第三区块/xuanzequkuai3'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第三区块/图片/Pic'))

WebUI.delay(delaytime)

WebUI.uploadFile(findTestObject('ltjx/公共元素/区块元素/第三区块/图片/upload-Pic'), Pic)

WebUI.delay(delaytime)

//图片-END

//PPT
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第四区块/qukuaimingcheng4'), qukuaimingcheng4)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第四区块/xuanzequkuai4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第四区块/幻灯片/PPT'))

WebUI.delay(delaytime)

WebUI.uploadFile(findTestObject('ltjx/公共元素/区块元素/第四区块/幻灯片/upload-PPT'), PPT)

WebUI.delay(delaytime)

//PPT-END

//填空
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第五区块/qukuaimingcheng5'), qukuaimingcheng5)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第五区块/xuanzequkuai5'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第五区块/填空/tiankong'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第五区块/填空/timu'), tiankongtimu)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第五区块/填空/daan-shuliang'), tiankongdaanshuliang)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第五区块/填空/daan-jiexi'), tiankongdaanjiexi)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第五区块/填空/daan-delaytime'), tiankongdaandelaytime)

WebUI.delay(delaytime)

WebUI.uploadFile(findTestObject('ltjx/公共元素/区块元素/第五区块/填空/upload-Pic'), tiankongPic)

WebUI.delay(delaytime)

//填空-END

//判断
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第六区块/qukuaimingcheng6'), qukuaimingcheng6)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第六区块/xuanzequkuai6'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第六区块/判断/panduan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第六区块/判断/timu'), panduantimu)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第六区块/判断/daan-jiexi'), panduandaanjiexi)

WebUI.delay(delaytime)

//判断-END

//简述
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第七区块/qukuaimingcheng7'), qukuaimingcheng7)

WebUI.delay(delaytime)

WebUI.sendKeys(findTestObject('ltjx/公共元素/区块元素/第七区块/xuanzequkuai7'), Keys.chord(Keys.ENTER))

WebUI.delay(delaytime)

WebUI.sendKeys(findTestObject('ltjx/公共元素/区块元素/第七区块/xuanzequkuai7'), Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, 
        Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN))

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第七区块/简述/jianshu'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第七区块/简述/timu'), jianshutimu)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第七区块/简述/daan'), jianshudaan)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第七区块/简述/daan-jiexi'), jianshudaanjiexi)

WebUI.delay(delaytime)

//简述-END

//选择
WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/qukuaimingcheng8'), qukuaimingcheng8)

WebUI.delay(delaytime)

WebUI.click(findTestObject('ltjx/公共元素/区块元素/第八区块/xuanzequkuai8'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ltjx/公共元素/区块元素/第八区块/xuanzequkuai8'), Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, 
        Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER))

WebUI.delay(delaytime)

WebUI.waitForElementClickable(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/xuanze'), 3)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/timu'), xuanzetimu)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/daan-shuliang'), xuanzedaanshuliang)

WebUI.delay(delaytime)

WebUI.sendKeys(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/daan-shuliang'), Keys.chord(Keys.ENTER))

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/daan-jiexi'), xuanzedaanjiexi)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/daan-A'), xuanzedaanA)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/daan-B'), xuanzedaanB)

WebUI.delay(delaytime)

WebUI.setText(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/daan-C'), xuanzedaanC)

WebUI.delay(delaytime)

WebUI.click(findTestObject("ltjx/公共元素/区块元素/第八区块/选择/daanxuanxiang"))

WebUI.delay(delaytime)

WebUI.click(findTestObject("ltjx/公共元素/区块元素/第八区块/选择/xuanxiang-A"))

WebUI.uploadFile(findTestObject('ltjx/公共元素/区块元素/第八区块/选择/upload-Pic'), xuanzePic)

WebUI.delay(delaytime)

//选择-END

//保存课件

WebUI.click(findTestObject('ltjx/资源管理/课件管理/kejian-baocun'))

WebUI.delay(delaytime)

WebUI.closeBrowser()

