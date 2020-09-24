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

//打开网站
WebUI.navigateToUrl('http://configgc.wkuai.cc/')

//账号
WebUI.setText(findTestObject('lzgc/public/username'), wuyexiangmubu_username)

//密码
WebUI.setText(findTestObject('lzgc/public/password'), wuyexiangmubu_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//点击企业入驻
WebUI.click(findTestObject('lzgc/lzgc-lc/qiyeruzhu'))

//输入企业名称
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/qiyemingcheng'), '广西光速发展公司')

//输入联系人
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/lianxiren'), '易先生')

//输入手机号
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/iPhone'), '15360059852')

//输入地址
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/add'), '广州天河区银锭塘')

//输入注册资金
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/zhucezijin'), '1')

//点击提交
WebUI.click(findTestObject('lzgc/public/submit'))

WebUI.click(findTestObject('lzgc/public/liuchengliuxiang_YES'))

//点击头像
WebUI.click(findTestObject('lzgc/public/toxiang'))

//点击退出
WebUI.click(findTestObject('lzgc/public/quit2'))

//点击退出确认
WebUI.click(findTestObject('lzgc/public/YES'))

WebUI.delay(3)

//输入第二个账号
WebUI.setText(findTestObject('lzgc/public/username'), qiyefuwubu_username)

//输入第二个密码
WebUI.setText(findTestObject('lzgc/public/password'), qiyefuwubu_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办企业入驻
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/renwudaiban_qiyeruzhu'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//选择创业中心领导
WebUI.click(findTestObject('lzgc/renwudaiban_juese/chuangyezhoxinlingdao_1'))

//选择通过
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/qiyeruzhu_toguo'))

//提交
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

//输入第三个账号
WebUI.setText(findTestObject('lzgc/public/username'), zhoxinlingdao_username)

//输入第三个密码
WebUI.setText(findTestObject('lzgc/public/password'), zhoxinlingdao_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办企业入驻
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/renwudaiban_qiyeruzhu'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//选择物业综合部领导，元素第一位
WebUI.click(findTestObject('lzgc/renwudaiban_juese/wuyezohebulingdao_1'))

//选择通过
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/qiyeruzhu_toguo'))

//提交
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

//输入第四个账号
WebUI.setText(findTestObject('lzgc/public/username'), wuyezohebu_username)

//输入第四个密码
WebUI.setText(findTestObject('lzgc/public/password'), wuyezohebu_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办企业入驻
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/renwudaiban_qiyeruzhu'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//输入合同编号
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/hetobianhao'), 'CK00442228')

//输入租赁期
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/zulinqi'), '6')

//输入租赁开始日期
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/zulinkaishiriqi'))

//点击17日
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/zulinkaishiriqi_ri'))

//输入租金缴费周期
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/zujinjiaofeizhouqi'), '1')

//输入每月租金
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/meiyuezujin'), '1600')

//输入每月综合服务费
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/meiyuezohefuwufei'), '15')

//输入水电保证金
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/shuidianbaozhengjin'), '1500')

//输入履约保证金
WebUI.setText(findTestObject('lzgc/qiyeruzhu-yuansu/lvyuebaozhengjin'), '2000')

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/add_fangjian'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/yuanqu'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/yuanqu_3'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/jianzhu'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/jianzhu_1'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/louceng'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/louceng_3'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/fanghao'))

WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/fanghao_1'))

//选择创业中心财务，元素第一位
WebUI.click(findTestObject('lzgc/renwudaiban_juese/chuangyezhoxincaiwubu_1'))

//完成签订合同
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/wanchengqianding'))

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

//输入第四个账号
WebUI.setText(findTestObject('lzgc/public/username'), zhoxincaiwu_username)

//输入第四个密码
WebUI.setText(findTestObject('lzgc/public/password'), zhoxincaiwu_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办企业入驻
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/renwudaiban_qiyeruzhu'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//选择物业财务部会计
WebUI.click(findTestObject('lzgc/renwudaiban_juese/wuyecaiwubukuaiji_2'))

//完成核对租金
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/wanchengzujinhedui'))

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

//输入第四个账号
WebUI.setText(findTestObject('lzgc/public/username'), wuyecaiwu_username)

//输入第四个密码
WebUI.setText(findTestObject('lzgc/public/password'), wuyecaiwu_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办企业入驻
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/renwudaiban_qiyeruzhu'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//选择物业财务部会计，元素第一位
WebUI.click(findTestObject('lzgc/renwudaiban_juese/wuyexiangmubuyuangong_4'))

//完成核对租金
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/wanchengheduiwuyefei'))

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

//输入第四个账号
WebUI.setText(findTestObject('lzgc/public/username'), wuyexiangmubu_username)

//输入第四个密码
WebUI.setText(findTestObject('lzgc/public/password'), wuyexiangmubu_password)

//登录
WebUI.click(findTestObject('lzgc/public/denglu'))

//选择任务待办企业入驻
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/renwudaiban_qiyeruzhu'))

//选择消息中心第一条
WebUI.click(findTestObject('lzgc/public/renwudaiban_1'))

//完成核对租金
WebUI.click(findTestObject('lzgc/qiyeruzhu-yuansu/wanchengruzhu'))

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

