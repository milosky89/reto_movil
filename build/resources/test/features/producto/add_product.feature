#author Camilo Garcia

@addProduct
Feature: as Dafiti user
  I want to products to the cart
  to buy products

  @addProductSuccesful
  Scenario Outline: user add Product Successful
    Given tha camilo enters the Dafiti app
    When select product
      |nameProduct|size|
      |<nameProduct>|<size>|
    Then you should see the <nameProduct> in the cart

    Examples:
      |nameProduct|size|
      |Hoodie Amarillo Kuva|M|