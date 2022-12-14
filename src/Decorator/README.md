# Декоратор

### Описание
Код должен быть устойчив к изменениям. Это значит, что при добавлении нового функционала - старый код не должен ломаться.
Отсюда следует один из главных принципов - **Open Closed**. Класс должен быть закрыт для изменений, но открыт для расширения.
Зачем нам изменять текущий код, если он уже протестирован и прекрасно работает?

### Цель
При наследовании часто нарушается этот принцип, как и куча других.
Поэтому нам нужен другой способ добавить новый функционал в класс. В этом нам поможет паттерн *Декоратор*. 

### Реализация

Суть декоратора в том, что мы декорируем (оборачиваем) класс, который хотим расширить.

Рассмотрим реализацию на примере клавиатуры. Современную механическую клавиатуру можно улучшить: добавить шумку, поменять свитчи и т.д.

1. Нам понадобится интерфейс [Keyboard](Keyboard.java) для клавиатур, возможности которых хотим расширить.
2. Сами клавиатуры [Varmilo](Varmilo.java) и [Leopold](Leopold.java) реализуют этот интерфейс.
3. Нам нужен класс [Декоратор](ImprovementsDecorator.java), которым мы обернём наши клавиатуры. Этот класс так же наследует интерфейс для клавиатур [Keyboard](Keyboard.java).
4. Теперь наследуем класс [Декоратор](ImprovementsDecorator.java) нашими расширениями [горячей замены свитчей](HotSwap.java) и [Шумкой](Foam.java).


    Важное замечание. Здесь тоже используется наследование.
    Расширяющие классы наследуют класс Декоратор. Но есть большое отличие.
    Наследование тут необходимо, чтобы соблюдать типизацию, а не для расширения функционала.