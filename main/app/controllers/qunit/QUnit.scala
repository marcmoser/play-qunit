package controllers.qunit

import play.api._
import play.api.mvc._

import modules.qunit._

object QUnit extends Controller {

  def test(fileName: String) = Action {
    QUnitHelper.test(fileName)
  }
}

