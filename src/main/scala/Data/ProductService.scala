package Data
import ProductService.*

object ProductService:
  type BrandName = String
  type ProductName = String

trait ProductService:
  def getPrice(product: ProductName, brand: BrandName): Double
  def getDefaultBrand(product: ProductName): BrandName
  def products: Map[ProductName, Iterable[BrandName]]

class ProductImpl extends ProductService:
  import ProductService.*

  def getPrice(product: ProductName, brand: String): Double = 
    ???

  def getDefaultBrand(product: ProductName): BrandName = 
    ???

  def products: Map[ProductName, Iterable[BrandName]] = 
    ???
end ProductImpl
