Feature: Ordenes de la tienda PetStore

  Background:
    Given la url del servicio "https://petstore.swagger.io/v2/store"

  Scenario Outline: Creación de Order
    When creo la order con id "<id>", petId "<petId>", quantity "<quantity>", shipDate "<shipDate>", status "<status>" y complete "<complete>"
    Then el código de respuesta es 200
    And obtengo un order con el formato especificado

    Examples:
      | id  | petId | quantity | shipDate                 | status | complete |
      | 1   | 1     | 1        | 2024-06-10T14:00:00.000Z | placed | true     |
      | 2   | 2     | 2        | 2024-06-11T14:00:00.000Z | placed | false    |
      | 3   | 3     | 3        | 2024-06-12T14:00:00.000Z | placed | true     |

  Scenario Outline: Consulta de Order
    When consulto la order con id "<id>"
    Then el código de respuesta es 200
    And obtengo un order con el formato especificado

    Examples:
      | id |
      | 1  |
      | 2  |
      | 3  |

