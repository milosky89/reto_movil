#author Camilo Garcia

  @userRegister
  Feature: as Dafiti user
    I want to register in the app
    to buy products

    @userRegisterSuccessful
  Scenario Outline: User register successful
    Given tha camilo enters the Dafiti app
    When enter your data correctly
      |email|key|key2|documentType|number|name|lastName|birthDate|gender|
      |<email>|<key>|<key2>|<documentType>|<number>|<name>|<lastName>|<birthDate>|<gender>|
    Then must see profile <email>

    Examples:
      |email|key|key2|documentType|number|name|lastName|birthDate|gender|
      |andrea59@gmail.com|123456|123456|CC|2030405012|Andrea|Soto|05021989|Femenino|