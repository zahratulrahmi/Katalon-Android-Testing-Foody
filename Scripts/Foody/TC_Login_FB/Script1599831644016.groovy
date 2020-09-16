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

Mobile.tap(findTestObject('Foody/Tab_Profile'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Foody/Menu_Login'), 0)

Mobile.tap(findTestObject('Foody/Btn_Connect with Facebook'), 2)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Foody/Txt_EmailFB'), 'zahratulrahmi04@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Foody/Txt_PasswordFB'), 'TIpZDZ8cCY0=', 0)

Mobile.tapAndHold(findTestObject('Foody/Btn_Masuk'), 0, 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Foody/Btn_LanjutkanSebagaiBunga'), 0, FailureHandling.OPTIONAL) == true) {

	Mobile.tapAndHold(findTestObject('Foody/Btn_LanjutkanSebagaiBunga'), 2, 0)
	
} else {
	
	Mobile.tapAndHold(findTestObject('Foody/Btn_Lanjutkan'), 2, 0)
		
	}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Foody/Txt_Bunga'), 0)

