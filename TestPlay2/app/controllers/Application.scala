package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.test("Ceci est un super message !", "Lol mess"))
  }
  
}