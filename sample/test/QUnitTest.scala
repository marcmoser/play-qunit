import play.api.test._

class QUnitTest extends PlaySpecification {
  include(new modules.qunit.QUnitRunner)
}

