# Заместитель

### Цель
Предоставляет суррогатный `proxy` объект, управляющий доступом к другому объекту.

### Пример
Представим, что у на сайте есть тяжёлая картинка.
Она очень долго загружается, и пользователю кажется, что сайт завис.
В таком случае мы можем предоставить пользователю заглушку или прелоадер, который будет отображаться,
пока большая картинка загружается.

Приступим к реализации. Создадим единый [интерфейс](Icon.java) для объектов-изображений.

Объект [imageIcon](ImageIcon.java) это настоящий субъект (real subject), доступ к которому нам требуется.
Этот объект будет ходить в интернет для скачивания тяжёлой картинки.

А [прокси объект](ImageProxy.java) является суррогатным, и он блокирует доступ к настоящей картинке, пока она загружается и выводит прелоадер.


Как это использовать? В клиентском коде мы подменяем [настоящий объект](ImageIcon.java) на [proxy](ImageProxy.java).
Поскольку интерфейс у них одинаковый, то всё будет работать так же как и до подмены.

Рассмотрим [проксирующий класс](ImageProxy.java) подробней.
При вызове метода `paintIcon()` мы запускаем параллельно загрузку настоящей картинки.
Пока наша картинка загружается, мы выводим картинку заглушку. Как только картинка загрузилась, мы делегируем дальнейшее управление уже настоящему субъекту.

> Прокси класс содержит ссылку на реальный субъект и делегирует ему работу после выполнения соответствующих условий.
> Обратите внимание, что прокси может сам создавать объекты настоящего субъекта.

### Разные вариации паттерна
Proxy класс и есть паттерн `заместитель`. Его главная цель подменять другие объекты и управлять доступом к ним.
Реализаций и применений данного паттерна очень много. В текущем примере мы реализовали паттерн `виртуальный заместитель`.
Его цель - управление доступом к тяжёлому ресурсу.

Другие заместители:

`Удалённый заместитель` - управляет взаимодействие с удалённым клиентом. Когда клиент вызывает методы класса или процедуры, которые находятся на другой машине.
Примером такой технологии является `RPC`. На клиенте мы используем proxy класс, который называется заглушкой. На сервере используем класс с таким же интерфейсом, который уже называется скелетом.
На клиенте proxy класс можно сказать подменяет реальный класс, который находится удалённо, и управляет доступом к нему по сети.
Клиент же обращается к такому прокси как к реальному субъекту, а вся реализация передачи данных по сети скрыта от пользователя.

`Кеширующий заместитель` - обеспечивает временное хранение высокозатратных операций.

`Защитный заместитель` - управляет доступом в зависимости от привилегий пользователя.

И куча ещё других заместителей. Мы можем сами придумать применение этому паттерну.

### Сравнение с другими паттернами
`Заместитель` по диаграмме классов, и в целом очень похож на `Декоратор`.
Оба должны реализовывать общий интерфейс, используют композицию и т.д.
Но цели у паттернов абсолютно разные. Если декоратор расширяет функционал какого-то класса,
то прокси заменяет этот класс, управляя доступом к нему.

Так же заместительно может содержать и создавать объекты класса, который замещается.