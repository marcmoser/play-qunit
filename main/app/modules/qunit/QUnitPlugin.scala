package modules.qunit

import play.api.{Play, Application, Logger, Plugin}
import play.api.Play.current

class QUnitPlugin(val app: Application) extends Plugin {

  var isEnabled = false;

  override def onStart() {
    super.onStart();
    if (Play.isDev || Play.isTest) {
      isEnabled = true;
      Logger.debug("QUnit is enabled");
    } else {
      isEnabled = false;
      Logger.debug("QUnit is disabled");
    }
  }

  override def enabled = isEnabled
}

