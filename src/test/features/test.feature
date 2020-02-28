Feature: ToDo

@test
  Scenario: Archiving ToDos
    Given I go to my "ToDo" App
    When I archive all todos
    Then I should have no todos

    @wip
  Scenario: Archiving ToDos 1
    Given I go to my "ToDo" App
    When I archive all todos
    Then I should have no todos