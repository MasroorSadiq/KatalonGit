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



Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.LinearLayout'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.TextView - Got it'), 0)

Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.TextView - Got it'), 0)

Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.TextView - Account Limits'), 0)

Mobile.scrollToText('Yearly Limits')

Mobile.pressBack()

//Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.TextView - Transaction History'), 0)
//Thread.wait(2000)
//Mobile.pressBack()

Mobile.scrollToText('Logout')

Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.TextView - Logout'), 0)

Mobile.tap(findTestObject('Object Repository/LogoutLocators/android.widget.TextView - Yes, Im sure'), 0)

Mobile.closeApplication()

