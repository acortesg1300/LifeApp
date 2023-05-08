package com.corderoindustries.corderoapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link PruebasFuncionales#newInstance} factory method to
// * create an instance of this fragment.
// */

    public class PruebasFuncionales extends Fragment{
    public PruebasFuncionales() {
        // Required empty public constructor
    }
        public static void main(String[] args) {
            class Item{
                private int masterCount;
                private String name = "defaultName";
                private int cost = 10;
                private int priority = 1;
                private int interval = 7;
                private String lastRefill = "defaultRefillDate";
                private String addedDate; // 2023-05-06 ; formato AAA-MM-DD

                public void newItem(String name, int cost, int priority, int interval, String lastRefill) {
                    if (this.lastRefill == "null"){
                        this.setLastRefill(String.valueOf(java.time.LocalDate.now()));
                    } else {this.lastRefill = lastRefill;
                    }
                    this.name = name;
                    this.cost = cost;
                    this.priority = priority;
                    this.interval = interval;
                    this.addedDate = String.valueOf(java.time.LocalDate.now());
                    masterCount++;
                }

                public void announceItem(){
                    System.out.println("Pagas " + this.cost + " de " + this.name + " cada " + this.interval + " días; Es tu prioridad número " + this.priority +" y la última vez que lo pagaste fue el " + this.lastRefill);
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

                public void setCost(int cost) {
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

                public String getLastRefill() {
                    return lastRefill;
                }
                public void setLastRefill(String lastRefill) {
                    this.lastRefill = lastRefill;
                }

            }
            Item renta = new Item();
            renta.newItem("Renta",6500,1,30,"04-30-2023");
            Item luz = new Item();
            luz.newItem("Electricidad",1000,1,30,null);
            renta.announceItem();
            luz.announceItem();
//            System.out.println("En este momento hay " + Item.masterCount + " artículos en la lista.");

        }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pruebas_funcionales, container, false);
    }
}
