package com.corderoindustries.corderoapp;

public class Cordero extends MainActivity {
    boolean isActivity = false;

    public static void main(String[] args) {


        Item leche;
        leche = new Item("Leche", 6, 1, 14);

        String itemAdded = "Se ha agregado " + leche.getName() + "; Costo:" + leche.getCost() + " Prioridad:" + leche.getPriority();
        System.out.println("Se ha agregado " + leche.getName() + "; Costo:" + leche.getCost() + " Prioridad:" + leche.getPriority());

    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}