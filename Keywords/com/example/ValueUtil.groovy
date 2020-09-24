package com.example

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ValueUtil {
	@Keyword
	def propertiesRead(caseName,key){
		String usrDir = System.getProperty("user.dir");
		println (usrDir);
		File f =new File(usrDir+File.separator+"keyconfig"+File.separator+caseName+".properties");
		println f.getAbsolutePath();
		println this.getClass().getSimpleName();
		if(!f.exists()){
			f.getParentFile().mkdirs();
			f.createNewFile();
		}
		Properties p =new Properties();
		FileInputStream fis =new FileInputStream(f);
		p.load(fis)
		fis.close();
		Object value = p.get(key);
		return value;
	}
	/*存储值*/
	@Keyword
	def propertiesWrite(caseName,key,value){
		String usrDir = System.getProperty("user.dir");
		println (usrDir);
		File f =new File(usrDir+File.separator+"keyconfig"+File.separator+caseName+".properties");
		println f.getAbsolutePath();
		println this.getClass().getSimpleName();
		if(!f.exists()){
			f.getParentFile().mkdirs();
			f.createNewFile();
		}
		Properties p =new Properties();
		FileInputStream fis =new FileInputStream(f);
		p.load(fis)
		fis.close();
		p.put(key, value);
		FileOutputStream fos= new FileOutputStream(f);
		p.store(fos, "");
		fos.close();
	}
}
