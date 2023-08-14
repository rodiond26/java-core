### Stream API

---

#### Создать stream

```java
Stream<String> stream=list.stream();
```

#### Создать list из stream

```java
List<String> newStrinList=stream.collect(Collectors.toList());
```

#### map - преобразовать из одного типа данных в другой (String -> Integer)

```java
List<Integer> newIntegerList=list.stream()
        .map(element->element.length())
        .collect(Collectors.toList());
```

#### Лямбда-выражение внутри map

```java
        int[] array = {5, 9, 3, 8, 1, 17, 23, 33, 2};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
```

#### filter - отфильтровать объекты по условию

```java
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 22 && student.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
```

#### forEach - вызывает метод для каждого элемента, возвращает void 

```java
        int[] array = {5, 9, 3, 8, 1, 17, 23, 33, 2};
        Arrays.stream(array).
                forEach(element -> {
                    element *= 2;
                    System.out.println(element);
                });
```

#### reduce - преобразвание нескольких значений в одно

```java
        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get();

        int result = list.stream()
                .reduce(1, (accumulator, element) -> accumulator * element);
```

#### sorted - сортировка значений (использует интерфейс Comparator)

```java
        List<Student> students = makeStudents();
        students = students.stream()
        .sorted((student1, student2) -> student1.getName().compareToIgnoreCase(student2.getName()))
        .collect(Collectors.toList());
```

#### chaining - последоватульный вызов методов API Stream

> source -> intermediate methods (lazy) -> terminal method (eager) 
Без терминального метода типа eager не будут вызываться промежуточные методы типа lazy. 

#### concat - соединение нескольких потоков в один

```java
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream4 = Stream.concat(stream3, stream2);
```

#### distinct - возвращает уникальные элементы с помощью метода equals

```java
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.distinct().forEach(System.out::println); // 1, 2, 3, 4, 5
```

#### Стримы нельзя переиспользовать после обработки!

#### count - возвращает количестов элементов в стриме

```java
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.count());
        System.out.println(stream2.distinct().count());
```

#### peek - intermediate метод позволяет посмотреть, что происходит с элементом стрима во время выполнения (аналог foreach)

```java
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.count());
        System.out.println(stream2.distinct().count());
```

#### flatMap (intermediate метод) - создает стрим из нескольких стримов

```java
   faculties.stream()
        .flatMap(faculty -> faculty.getStudents().stream())
        .forEach(student -> System.out.println(student.getName()));
```

#### groupingBy - группировка элементов по какому-то полю

```java
    Map<Integer, List<Student>> map = students.stream()
        .map(student -> {
        student.setName(student.getName().toUpperCase());
        return student;
        })
        .collect(Collectors.groupingBy(student -> student.getCourse()));
```

#### partitionBy - резделение элементов по какому-то условию

```java
    Map<Integer, List<Student>> map = students.stream()
        .map(student -> {
        student.setName(student.getName().toUpperCase());
        return student;
        })
        .collect(Collectors.groupingBy(student -> student.getCourse()));
```

#### findFirst - возвращает первый элемент в результате работы стрима

```java
        Student firstStudent = students.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .filter(student -> student.getSex() == 'f')
                .sorted(Comparator.comparingInt(Student::getAge))
                .findFirst().get();
```

#### min/max - возвращает объект с минимальным/максимальный значением признака

```java
    Student minStudent = students.stream()
        .min(Comparator.comparingInt(Student::getAge))
        .get();

    Student maxStudent = students.stream()
        .max(Comparator.comparingInt(Student::getAge))
        .get();
```

#### limit - ограничивает количество элементов в результате работы стрима, выводит элементы с начала стрима 

```java
    students.stream()
        .filter(student -> student.getAge() > 20)
        .limit(2)
        .forEach(System.out::println);
```

#### skip - ограничивает количество элементов в результате работы стрима, пропускает заданное количество элементов стримаы с начала стрима 

```java
    students.stream()
        .filter(student -> student.getAge() > 20)
        .limit(2)
        .forEach(System.out::println);
```

#### mapToInt - возвращает стрим из полей объектов типа int + методы sum, average, min, max

```java
    List<Integer> courses = students.stream()
        .mapToInt(student -> student.getCourse())
        .boxed()
        .collect(Collectors.toList());
```

#### По умолчанию используется sequential stream 

#### parallel stream - возможность использования несколько потоков в стримах

```java
    double sum1 = list.stream()
        .reduce((accumulator, value) -> accumulator + value)
        .get();

    double sum2 = list.parallelStream()
        .reduce((accumulator, value) -> accumulator + value)
        .get();
```

---

Intermediate метод - это метод, который возвращает другой stream после действий над ним. 

Terminal метод - это метод, который возвращает результат работы над элементами из stream.
