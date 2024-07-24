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
import generalFunctions.InputOTP as InputOTP
//import generalFunctions.decryptMPIN
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.startApplication('D:\\Projects\\Consumer\\APK\\20 Mar 2024\\app (1).apk', true)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.Button - CLOSE'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 03XX-XXXXXXX'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 03XX-XXXXXXX'), GlobalVariable.MISDIN, 0)

Mobile.tap(findTestObject('Object Repository/LoginApp/android.widget.Button - Next'), 0)

Mobile.takeScreenshot()

Mobile.hideKeyboard()

//InputOTP inputObj = new InputOTP();
//inputObj.provideOTP(GlobalVariable.MPIN);
Mobile.tap(findTestObject('Object Repository/LoginConsumerApp/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/LoginConsumerApp/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/LoginConsumerApp/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/LoginConsumerApp/android.widget.TextView - 2'), 0)
