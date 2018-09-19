package org.andestech.learning.rfb18;


/**
 * TODO:
 *
 * Java07-Course-materials
 * Итоговое задание. Срок выполнения - к 17.09.18.
 *
 * Вашему подразделению поручено разработать программный стек для обработки заявок по кредитам и
 * сопровождению выданных кредитов. Архитектор проекта предложил следующий шаблон для выполнения задачи:
 *
 * Заявители должы описываться классом Customer, в котором должны быть следующие поля (как минимум):
 * id, name, sname, salary, age, creditRating.
 *
 * Заявки на кредит должны сопровождаться и обрабатываться классом CreditInquiry.
 *
 * На основе данных клиента - salary, age, creditRating, а также суммы запрашиваемого кредита и срока погашения,
 * принимается решение.
 * При отклонении заявки на кредит должно генерироваться исключение CreditInquiryException.
 *
 * Для получивших кредит заявителей должен создаваться экземпляр класса CreditAccount,
 * который должен описывать все данные кредита и операции по нему.
 * Если Вы не знаете, как написать реализацию какого-либо метода, сделайте класс абстрактным.
 *
 * Добавьте стек исключений, обслуживающий операции по кредитам.
 * Например, при превышении лимита по кредиту, должно генерироваться исключение CreditOverdraftException.
 *
 * Вся история операций по выданным кредитам и заявкам на кредит должна
 * обслуживаться в типе CreditHistory. Этот класс должен уметь сохранять историю во внутренней коллекции,
 * выгружать историю на диск или БД, загружать историю с диска или БД обратно в коллекцию.
 * При необходимости, генерировать исключения.
 *
 * Установите проект в локальный репозиторий maven.
 * Протестируйте проект на основе отдельного приложения (нового проекта maven).
 *
 *
 *
 */

public class App 
{
    public static void main( String[] args )
    {

    }
}
