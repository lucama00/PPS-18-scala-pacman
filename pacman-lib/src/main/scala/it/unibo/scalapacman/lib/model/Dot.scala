package it.unibo.scalapacman.lib.model

object Dot extends Enumeration {

  case class Val(points: Int) extends super.Val with Eatable
  implicit def valueToDotVal(x: Value): Val = x.asInstanceOf[Val]

  // scalastyle:off magic.number
  val SMALL_DOT       : Val = Val(10)
  val ENERGIZER_DOT   : Val = Val(50)
  // scalastyle:on magic.number
}
