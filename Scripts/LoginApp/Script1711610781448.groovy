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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Projects\\Consumer\\APK\\20 Mar 2024\\app (1).apk', true)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.Button - CLOSE'), 0)

Mobile.tap(findTestObject('Object Repository/Smang-Login_Object/android.widget.TextView - 03XX-XXXXXXX'), 0)

Mobile.sendKeys(findTestObject('Object Repository/LoginApp/android.widget.EditText - 03XX-XXXXXXX'), '03054317178')

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.Button - Next'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.TextView - 6'), 0)

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.TextView - 9'), 0)

Mobile.hideKeyboard()

