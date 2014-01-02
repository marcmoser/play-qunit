package play.modules.qunit

import java.io.File
import org.apache.commons.io.FileUtils

import play.api.Play.current
import play.api.{Play, Application}
import play.api.mvc._
import play.api.templates.Html

object QUnitHelper {

  val TEST_FOLDER = "qunit/";

  def test(filename: String) = Play.isProd match {
    case true => Results.NotFound
    case _ => Results.Ok(html(filename))
  }

  def html(filename: String): Html = {
    val application = Play.application
    val js = application.getExistingFile(TEST_FOLDER + filename + ".js")
    val html = application.getExistingFile(TEST_FOLDER + filename + ".html")
    val htmlContent = html match { case Some(f) => FileUtils.readFileToString(f); case _ => ""; }
    val jsContent = js match { case Some(f) => FileUtils.readFileToString(f); case _ => ""; }
    views.html.qunit.qunit(filename, htmlContent, jsContent)
  }
}

