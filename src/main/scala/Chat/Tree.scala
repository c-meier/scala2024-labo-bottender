package Chat

/**
  * This sealed trait represents a node of the tree.
  */
sealed trait ExprTree

/**
  * Declarations of the nodes' types.
  */
object ExprTree:
  // Example cases
  case object Thirsty extends ExprTree
  case object Hungry extends ExprTree

