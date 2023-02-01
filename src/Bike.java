abstract class Bike {
    Bike(){System.out.println("bike is crerated");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}

}
class Honda extends Bike {
 void run(){
     System.out.println("running safely");
 }
}
