package com.rest;

public class Lesson_54_JSON {
    // Мы уяснили, что REST, это некая парадигма позволяющая передавать данные через транспортные
    // протоколы, в основном через HTTP. Теперь поговорим о формате представления этих данных.
    // Существует несколько основных типов представления данных: обычный текст, XML, JSON, Binary.
    // Мы работаем с Java, как мы можем помнить, это объектно-ориентированный язык и в нем
    // абсолютно все является объектами. Какой формат позволяет нам передавать объекты? JSON.
    // А значит именно в этом формате нам удобнее всего передавать сообщения. Правда причина не
    // сколько в этом, а в том, что json является форматом по умолчанию в rest запросах(возможен и XML,
    // но чаще всего используют именно json).

    // JSON(JavaScript Object Notation) - это текстовый формат обмена данными, основанный на java-script.
    // При этом, этот формат не зависит от JS и де-факто является стандартом передачи информации на
    // любом языке программирования. Мы уже знакомы с этим форматом, но нелишне будет
    // освежить память.
    // Формат записи json: { "query" : "Answer", "value" : 7}, это простейший пример. JSON сообщение
    // является коллекцией пар ключ-значение, разделенных запятыми. Сам json объект заключается
    // в фигурные скобки. Ключ всегда является строкой и заключается в кавычки, в значении в кавычки
    // заключается только строка, число можно передавать без них, как и другие объекты.
    // Да, основное преимущество json в том, что мы можем передавать не только примитивные
    // типы данных и их производные, но и объекты целиком. Например, класс Employee имеет поля
    // name, age, передавать сам объект будем такой записью { "name" : "Anton", "age" : 33}.
    // Такая передача называется JSON Mapping, этот процесс привязывает json сообщение к объекту,
    // а принимающая сторона на его основе воссоздает объект и его состояние.
    // Внутри json так же могут передаваться массивы, причем они могут содержать произвольные
    // типы данных, даже другие объекты.


    // В контексте REST json нас интересует, как стандарт передачи информации. Клиент формирует
    // запрос, сервер возвращает ответ с данными в формате json.

    // Итак, мы хотим передать объект. Представим ситуацию: у нас есть класс Car, в нем поля
    // model, color. Есть класс House, в нем одно поле intRooms(количество комнат) и есть класс
    // Employee, у которого есть такие поля:
//    private String name;
//    private String surName;
//    private int salary;
//    private String[] languages;
//    private Car car;
//    private House house;
    // Как мы видим, часть полей не примитивные типы данных, есть массив строк, есть поля-классы.
    // Как будет выглядеть json передающий экземпляр Employee?
//    {
//        "name" : "Art",
//        "surname" : "Shib",
//        "salary" : 500,
//        "languages" : ["English", "Russian"],
//        "car" : {
//            "model": "BMW",
//            "color": "Black"
//        },
//        "house" : null
//    }
    // Далее особенности по списку. Первым идет salary, int значения в кавычки не заключаются,
    // вторым мы видим как передается массив, тоже без кавычек, причем массив может содержать
    // разные типы данных, третьим мы видим такой же json с другим объектом, последнему полю
    // мы не присвоили значение, там прописано null, причем это поле может быть действительно
    // пустым, но указать его мы обязаны, чтобы не нарушать сигнатуру класса, либо мы пропустили
    // это поле при сериализации(как мы помним сериализация, это процесс преобразования объекта
    // в json формат, поля объекта можно сериализовать, а можно пропустить, но не проигнорировать
    // иначе объект не соберется на принимающей стороне, либо соберется некорректно).


}
