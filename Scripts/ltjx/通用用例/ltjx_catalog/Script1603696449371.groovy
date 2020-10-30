import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.*

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return
import org.junit.Test
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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


// 定义开关变量
int a = 0
// 定义一个空列表
def str=[]
// 定义变量str1
String str1 = mulumingcheng
// 循环遍历目录列表
	for(int i=1; i<99;i++){
		// 定义目录列表元素路径
		String sanjiaoXpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div["+i+"]/div[1]/div[1]/div[1]/div[1]"
		// 创建实例
		TestObject to = new TestObject("objectName") 
		// 添加属性给测试对象
		to.addProperty("xpath",ConditionType.EQUALS,sanjiaoXpath)
		// 获取目录元素文本
		re = WebUI.getText(to) 
		// 添加文本到空列表
		str.add(re)
		//判断是否有文本匹配，如匹配则中断循环
		if(str1==re){
			break;
		}
}	
// 循环判断文本是否一致
	for(int i=0;i<str.size();i++){
		if(str1==str.get(i)){
			a = i+1 //开关变量
		}
	}
	
switch (a) {
	case 1:
		WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu_1'))//展开排第一的章节目录
		WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_1'))//点击第一章节
	break;
	case 2:
		WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu_2'))//展开排第二的章节目录
		WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_2'))//点击第二章节
	break;
	case 3:
		WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu_3'))//展开排第三的章节目录
		WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_3'))//点击第三章节
	break;
	case 4:
		WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu_4'))//展开排第四的章节目录
		WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_4'))//点击第四章节
	break;
	case 5:
		WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu_5'))//展开排第五的章节目录
		WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_5'))//点击第五章节
	break;
	case 6:
		WebUI.click(findTestObject('ltjx/公共元素/目录/zhankaimulu_6'))//展开排第六的章节目录
		WebUI.click(findTestObject('ltjx/公共元素/目录/mulu_6'))//点击第六章节
	break;
	default:
		break;
}