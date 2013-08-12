package models

import play.api.libs.json._

case class Widget(
  id:Long,
  name:String
)

object Widget extends ((Long,String) => Widget) {

  implicit val r = Json.reads[Widget]
  implicit val w = Json.writes[Widget]

  def listAll:List[Widget] = {
    List[Widget](
      Widget(1,"Molly"),
      Widget(2,"Andy"),
      Widget(3,"Sally"),
      Widget(4,"George")
    )
  }

}