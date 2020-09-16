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

Mobile.tap(findTestObject('Foody/Menu_Review'), 2)

not_run: Mobile.tap(findTestObject('Foody/Txt_Title2'), 0)

Mobile.clearText(findTestObject('Foody/Txt_Title2'), 0)

Mobile.setText(findTestObject('Foody/Txt_Title2'), GlobalVariable.title, 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Foody/Txt_Review'), GlobalVariable.explanation, 0)

Mobile.tap(findTestObject('Foody/Btn_Post'), 0)

Mobile.tap(findTestObject('Foody/Btn_Rate'), 0)

Mobile.setSliderValue(findTestObject('Foody/Sld_Location'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Sld_Price'), 80, 0)

Mobile.setSliderValue(findTestObject('Foody/Sld_Quality'), 70, 0)

Mobile.setSliderValue(findTestObject('Foody/Sld_Service'), 80, 0)

Mobile.setSliderValue(findTestObject('Foody/Sld_Decoration'), 70, 0)

Mobile.tapAndHold(findTestObject('Foody/Btn_NoPerson2'), 0, 0)

Mobile.selectListItemByLabel(findTestObject('Foody/View_List_NoPerson'), '2+', 0)

Mobile.tapAndHold(findTestObject('Foody/Btn_Expense'), 0, 0)

Mobile.selectListItemByLabel(findTestObject('Foody/View_Expense'), '150,000đ +', 0)

Mobile.tapAndHold(findTestObject('Foody/Btn_Comeback'), 0, 0)

Mobile.selectListItemByLabel(findTestObject('Foody/View_Comeback'), 'Sure', 0)

Mobile.tap(findTestObject('Foody/Btn_Done'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Foody/Btn_Post'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Foody/Img_Foody'), 0, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('Foody/Icn_Close_FB'), 0)
} else {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Foody/Btn_Close'), 0)

Mobile.verifyMatch(Mobile.getText(findTestObject('Foody/Ttl_Taste'), 0), GlobalVariable.title, false)

Mobile.verifyMatch(Mobile.getText(findTestObject('Foody/Ttl_Good'), 0), GlobalVariable.explanation, false)

Mobile.tap(findTestObject('Foody/Btn_Like'), 0)

Mobile.tap(findTestObject('Foody/Menu_Review (1)'), 0)

Mobile.tap(findTestObject('Foody/Menu_Delete'), 0)

Mobile.tap(findTestObject('Foody/Btn_YesDelete'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

not_run: Mobile.pressBack()

