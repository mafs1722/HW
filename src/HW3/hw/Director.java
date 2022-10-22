package HW3.hw;

public class Director {
    int month;
    Counter counter;

    public void force(int monthCounter, Counter counter){
        counter.report(monthCounter);

    }


    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }


}

/**
    Создать класс директор у которого один метод force, который в качестве
    параметра принимает объект типа counter и переменную int,
    которая хранит число месяцев за которые нужно сделать отчет.
    В этом методе мы должны получить отчет у бухгалтера и вывести его на экран
    Т.е. директор требует отчет у бухгалетра - первый аргумент, за какое-то
    кол-во месяцев - второй аргумент, результатом выполнения метода
    будет строка на экране вида «Отчет за і месяцев»
 */