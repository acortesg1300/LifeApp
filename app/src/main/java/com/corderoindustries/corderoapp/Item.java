package com.corderoindustries.corderoapp;
import java.time.LocalDate;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity


public class Item extends Cordero  { // Declaro la clase Item, que es tiene numero unico, nombre, costo prioridad e intervalo
    @PrimaryKey
    private String name;
    @ColumnInfo
    private float cost;
    @ColumnInfo
    private int priority;
    @ColumnInfo
    private int interval;
    @ColumnInfo
    private String lastRefilled;


    public Item(String name, float cost, int priority, int interval){ // declaro la funcion additem, que es una funcion de la clase (funcion) AppCordero, que es la principal.
        this.name=name;
        this.cost=cost;
        this.priority=priority;
        this.interval=interval;
        this.lastRefilled=String.valueOf(java.time.LocalDate.now());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
