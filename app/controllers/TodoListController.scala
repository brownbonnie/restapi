package controllers

import com.google.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

@Singleton
class TodoListController (val controllerComponents: ControllerComponents) extends BaseController {

  def getAll(): Action[AnyContent] = Action {
    NoContent
  }

}