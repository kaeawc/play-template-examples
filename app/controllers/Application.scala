package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def loopOnWidgets = Action {
    Ok(views.html.widgetloop(models.Widget.listAll))
  }

}