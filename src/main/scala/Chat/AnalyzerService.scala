package Chat
import Data.{AccountService, ProductService, Session}

class AnalyzerService(productSvc: ProductService,
                      accountSvc: AccountService):
  import ExprTree._

  /**
    * Return the output text of the current node, in order to write it in console.
    * @return the output text of the current node
    */
  def reply(session: Session)(t: ExprTree): String =
    // you can use this to avoid having to pass the session when doing recursion
    val inner: ExprTree => String = reply(session)
    t match
      // TODO - Part 2 Step 3
      // Example cases
      case Thirsty => 
        "Eh bien, la chance est de votre côté, car nous offrons les meilleures bières de la région !"
      case Hungry => 
        "Pas de soucis, nous pouvons notamment vous offrir des croissants faits maisons !"
end AnalyzerService
