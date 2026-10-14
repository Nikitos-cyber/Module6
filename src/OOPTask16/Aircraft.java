package OOPTask16;

public class Aircraft {
        private int number;
        private int speed;
        public Aircraft(int number, int speed){
            this.number = number;
            this.speed = speed;
        }

        public double flight(int n){
            return (double) n / speed;
        }

}
