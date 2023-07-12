package com.example.homeworktraintickets413;

import java.io.Serializable;

public class Tickets implements Serializable {
    // поля сущности
    private int id; // поле  id пользователя
    private String mestoOtpravleniya; // поле  места отправления
    private String vremyaOtpravleniya; // поле  время отправления
    private String mestoPribitiya; // поле места прибытия
    private String vremyaPribitiya; // поле время прибытия
    private int stoimost; // поле стоимость

    // необходимый конструктор

    public Tickets(int id, String mestoOtpravleniya, String vremyaOtpravleniya, String mestoPribitiya, String vremyaPribitiya, int stoimost) {
        this.id = id;
        this.mestoOtpravleniya = mestoOtpravleniya;
        this.vremyaOtpravleniya = vremyaOtpravleniya;
        this.mestoPribitiya = mestoPribitiya;
        this.vremyaPribitiya = vremyaPribitiya;
        this.stoimost = stoimost;
    }

    // геттеры и сеттеры

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMestoOtpravleniya() {
        return mestoOtpravleniya;
    }

    public void setMestoOtpravleniya(String mestoOtpravleniya) {
        this.mestoOtpravleniya = mestoOtpravleniya;
    }

    public String getVremyaOtpravleniya() {
        return vremyaOtpravleniya;
    }

    public void setVremyaOtpravleniya(String vremyaOtpravleniya) {
        this.vremyaOtpravleniya = vremyaOtpravleniya;
    }

    public String getMestoPribitiya() {
        return mestoPribitiya;
    }

    public void setMestoPribitiya(String mestoPribitiya) {
        this.mestoPribitiya = mestoPribitiya;
    }

    public String getVremyaPribitiya() {
        return vremyaPribitiya;
    }

    public void setVremyaPribitiya(String vremyaPribitiya) {
        this.vremyaPribitiya = vremyaPribitiya;
    }

    public int getStoimost() {
        return stoimost;
    }

    public void setStoimost(int stoimost) {
        this.stoimost = stoimost;
    }

        // переопределение метода toString

    @Override
    public String toString() {
        return "Железнодорожный билет" + "\n" +
                "Пассажир " + id + "\n" +
                "Место отправления = " + mestoOtpravleniya + "\n" +
                "Время отправления = " + vremyaOtpravleniya + "\n" +
                "Место прибытия = " + mestoPribitiya + "\n" +
                "Время прибытия = " + vremyaPribitiya + "\n" +
                "Стоимость билета = " + stoimost +
                " рублей.";
    }
}
