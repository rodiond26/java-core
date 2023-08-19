### Многопоточность

---

#### Создание поток

- через наследование класса Thread

```java
// Создать поток через наследование класса Thread
class MyThread1 extends Thread {
    public void run() {
        /* код */
    }
}

// Запуск потока
MyThread1 myThread1 = new MyThread1();
myThread1.start();
```

- через имплементацию Runnable

```java
// Создать поток через имплементацию Runnable
class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

// Запуск потока
Thread myThread3 = new Thread(new MyThread3());
myThread3.start();
```

- с помощью анонимного класса

```java
// Создать поток с помощью анонимного класса и запустить его
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("hello 1");
    }
}).start();
```

- с помощью лямбда-выражения

```java
// Создать поток с помощью лямбда-выражения и запустить его
new Thread(() -> System.out.println("hello 2")).start();
```

---

#### Методы потока

- переименование потока и изменение его приоритета

```java
MyThread5 myThread7 = new MyThread5();
myThread7.setName("new name of myThread7");

myThread7.setPriority(9);
myThread7.setPriority(Thread.MIN_PRIORITY);
myThread7.setPriority(Thread.NORM_PRIORITY);
myThread7.setPriority(Thread.MAX_PRIORITY);
```

- получить name текущего потока
```java
Thread.currentThread().getName();
```

- Разница между методами start() и run():
    - метод start() создает новый поток и запускает в нем метод run();
    - метод run() не создает новый поток и запускается в текущем потоке.
