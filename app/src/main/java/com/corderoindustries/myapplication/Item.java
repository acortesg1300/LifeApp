public class Item extends Cordero  { // Declaro la clase Item, que es tiene numero unico, nombre, costo prioridad e intervalo
        private int masterKey;
        private String name;
        private float cost;
        private int priority;
        private int interval;



        public Item(int masterKey, String name, float cost, int priority, int interval){ // declaro la funcion additem, que es una funcion de la clase (funcion) AppCordero, que es la principal.
            this.masterKey=Cordero.masterCount++;
            this.name=name;
            this.cost=cost;
            this.priority=priority;
            this.interval=interval;
        }

    public int getMasterKey() {
        return masterKey;
    }

    public void setMasterKey(int masterKey) {
        this.masterKey = masterKey;
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
