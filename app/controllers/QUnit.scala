package controllers

import play.api._
import play.api.mvc._

import play.modules.qunit._

object QUnit extends Controller {

  def test(fileName: String) = Action {
    QUnitHelper.test(fileName)
  }
}

