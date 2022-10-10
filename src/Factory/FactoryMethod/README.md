# Фабричный метод

Рассмотрим пример [Простой фабрики](../SimpleFactory).
Мы можем расширить наш код, заменив простую фабрику [SimplePizzaFactory](../SimpleFactory/SimplePizzaFactory.java)
на несколько разных фабрик, которые отвечают за создание определённой группы объектов.

Например, в Русскую пиццу добавляют больше овощей, а в китайскую больше перца.
Теперь вместо [SimplePizzaFactory](../SimpleFactory/SimplePizzaFactory.java) у нас есть две фабрики
[ChinesePizzaFactory](WrongFactoryExample/ChinesePizzaFactory.java) и [RussianPizzaFactory](WrongFactoryExample/RussianPizzaFactory.java),
которые мы прокидываем в наш класс [PizzaStore](PizzaStore.java).

В чём минус данного подхода?

В таком случае многие процессы, помимо создания объектов, остаются в фабричном классе.
Но что делать, если клиент фабричного метода (pizza store) хочет управлять всеми процессами сам?

Другими словами, нам необходимо связать процессы [создания пиццы](WrongFactoryExample/RussianPizzaFactory.java)
с классами, использующими эти фабрики (разные магазины), но при этом сохранить гибкость.

Давайте перенесём код фабрик в классы, где эти фабрики используются.
При этом код выносим в отдельный метод, который определяется интерфейсом или абстрактным классом [PizzaStore](PizzaStore.java).
Теперь вместо фабричного класса [ChinesePepperoniPizza](WrongFactoryExample/ChinesePizzaFactory.java),
у нас появляются магазины типа [ChinesePizzaStore](ChinesePizzaStore.java), которые теперь сами управляют своими процессами.

Таким образом мы создали метод-фабрику, в честь чего этот паттерн и называется `фабричный метод`.
