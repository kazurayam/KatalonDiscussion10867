import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://thetestingworld.com/login')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login/label_User Name'), 10)

String text = WebUI.getText(findTestObject('Object Repository/Page_Login/label_User Name'))

WebUI.comment("***${text}***")        // shows ***User Name***

WebUI.delay(3)

WebUI.closeBrowser()

