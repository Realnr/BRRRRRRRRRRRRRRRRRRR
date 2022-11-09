public class drill {
        private int watt;
        private String name;
        private int age;
        private double price;
        private boolean broken;

        public void DrillingMachine(){
                watt = (int)((Math.random()*1200)+800);
                age = (int)(Math.random()*10);
                price = (int)((Math.random()*450)+50);
        }
}
