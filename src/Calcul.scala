

abstract class Calcul {
  case class Sum(l: Calcul, r: Calcul) extends Calcul
  case class Var(n: String) extends Calcul
  case class Const(v: Int) extends Calcul
}