package Data

trait ProductService:
  type BrandName = String
  type ProductName = String

  def getPrice(product: ProductName, brand: BrandName): Double
  def getDefaultBrand(product: ProductName): BrandName
  def products: Map[ProductName, Iterable[BrandName]]

class ProductImpl extends ProductService:
  // TODO - Part 2 Step 2

  def getPrice(product: ProductName, brand: String): Double = 
    ???

  def getDefaultBrand(product: ProductName): BrandName = 
    ???

  def products: Map[ProductName, Iterable[BrandName]] = 
    ???
end ProductImpl
