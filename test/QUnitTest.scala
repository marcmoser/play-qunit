import play.api.test._

class QUnitTest extends PlaySpecification {
  include(new play.modules.qunit.QUnitRunner)
}

