package play.modules.qunit

import org.specs2.runner._
import org.openqa.selenium.phantomjs._

import play.api.test._
import play.api.test.Helpers._

import java.io.File
import java.util.Collection
import org.apache.commons.io.FileUtils
import scala.collection.JavaConversions._

import org.fluentlenium.core.domain.FluentList
import org.fluentlenium.core.domain.FluentWebElement

class QUnitRunner extends PlaySpecification {

  def log(err: Object) = println("[Qunit test] " + err)

  "Application" should {
    val application = FakeApplication()
    val folder = application.getFile("/qunit")
    val jsFiles = FileUtils.listFiles(folder, Array("js"), true)
    examplesBlock {
      jsFiles.toList.foreach(f => {
        val testname = f.getName().replace(".js", "")
        "Pass QUnit Tests " + testname in new WithBrowser(webDriver = classOf[PhantomJSDriver]) {
          browser.goTo("/qunit/" + testname)
          try {
            Thread.sleep(500L)
          } catch {
            case _: Throwable => {}
          }
  
          val fls = browser.$("#qunit-tests > li > strong")
          fls.zipWithIndex.foreach{case (item, index) => log("   " + index + ". " + item.getText())}
          // log(browser.$("#qunit-testresult").getTexts())
  
          val nbErrors = browser.$("span.failed").getTexts().get(0).toString().trim().toInt
          nbErrors must beEqualTo(0)
        }
      })
    }
  }
}

