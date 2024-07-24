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



Mobile.tap(findTestObject('Object Repository/Visual_Test_AllItems/android.widget.ImageView'), 0)

Mobile.takeScreenshotAsCheckpoint('AllItems_one', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Electricity')

Mobile.takeScreenshotAsCheckpoint('AllItem_Two', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Prepaid load')

Mobile.takeScreenshotAsCheckpoint('AllItem_Three', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Mutual Fund')

Mobile.takeScreenshotAsCheckpoint('AllItem_Four', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('School')

Mobile.takeScreenshotAsCheckpoint('AllItem_five', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Daraz Wallet')

Mobile.takeScreenshotAsCheckpoint('AllItem_Six', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Online Vouchers')

Mobile.takeScreenshotAsCheckpoint('AllItem_Seven', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

