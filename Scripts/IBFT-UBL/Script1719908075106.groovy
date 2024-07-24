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



Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - More'), 0)

Mobile.scrollToText('M-Tag')

Mobile.scrollToText('Bank Transfer')

Mobile.waitForElementPresent(findTestObject('Object Repository/BankTransfer/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Bank Transfer'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/BankTransfer/android.widget.EditText - Search bank'), 'United Bank Limited', 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/BankTransfer/android.widget.TextView - United Bank Limited'), 
    0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - United Bank Limited'), 0)

Mobile.setText(findTestObject('Object Repository/BankTransfer/android.widget.EditText - XXXXXXXXXX'),GlobalVariable.IBFT_UBL_ACCOUNT , 
    0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Add Bank Account Number'), 0)

Mobile.setText(findTestObject('Object Repository/BankTransfer/android.widget.EditText - 0'), '1', 0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Send Rs'), 0)

Mobile.scrollToText('Others')

Mobile.hideKeyboard()

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Others'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Others'), 0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/BankTransfer/android.widget.TextView - Yes, cancel Transfer'), 0)



