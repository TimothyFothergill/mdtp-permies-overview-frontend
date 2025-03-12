package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(
// age question
      age18to24       = 1,
      age25to34       = 3,
      age35to44       = 4,
      age45to54       = 2,
      age55plus       = 0,

// teams question
      buildanddeploy  = 1,
      ddcops          = 1,
      infrastructure  = 1,
      telemetry       = 1,
      platdocs        = 1,
      platops         = 1,
      platsec         = 1,
      platucd         = 1,
      platui          = 1
    ))
  }
}
