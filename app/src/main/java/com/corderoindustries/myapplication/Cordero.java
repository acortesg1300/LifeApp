public class Cordero {
    protected static int masterCount;
    boolean isActivity = false;
    public static void main(String[] args){
        masterCount = 0;

      Item leche = new Item(001,"Leche", 6, 1, 14);
      System.out.println("Nombre:" + leche.getName() + " Costo:" +leche.getCost() + " Prioridad:" + leche.getPriority());
    }
}

