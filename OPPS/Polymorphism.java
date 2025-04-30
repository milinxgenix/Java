                                                // DYNAMIC MESSAGE DISPATCH
/*
    * CONSIDER A FOLLOWING INHERITANCE HEIRARRCHY
    * BASE HAVING METHOD1,METHOD2
    * DERIVED HAVING METHOD2(overridden),METHOD3
    * Scenario1 
    * base object=new derived();
    * object.method2();              //this will allowed
    * object.method3();             //this will not allowed
    * Scenario2
    * derived object=new base();    //NOT ALLOWED
*/



                                            //DYNAMIC METHOD DISPATCH
/*
class phone{
    public void greet(){
        System.out.println("gm");
    }
    public void on(){
        System.out.println("turning on phone");
    }
 }
 class smartphone extends phone{
    public void music(){
        System.out.println("play");
    }
    public void on(){
        System.out.println("turning on smartphone");
    }
 }
 public class Polymorphism{
    public static void main(String[] args){
        phone e=new smartphone();
        //jo object bna h wo smartphone ka bna h
        //phone to reference h
        //smartphone t=new phone(); not allowed
        e.on();
        //e.music();  not allowed
        e.greet();
 
    }
 }
*/




                                        //POLYMORPHISM USING INTERFACE
/*
    * CONSIDER A SCENARIO WHERE THERE ARE FOUR INTERFACE CELLPHONE,GPS,MEDIAPLAYER,CAMERA AND A CLASS SMARTPHONE THAT IMPLEMENTS ALL FOUR INTERFACE
    * GPS G = NEW SMARTPHONE();             - THIS CAN ONLY USE GPS METHODS
    * SMARTPHONE S = NEW SMARTPHONE();      - THIS CAN USE ALL METHODS
*/



                                            //polymorphism using interface
/*
interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("gm");
    }
    default void record4kvideo(){
        greet();
        System.out.println("recording...4k.");
    }
 }
 interface wifi{
    String[] getnetwork();
    void connecttonetwork(String network);
 }
 class mycellphone{
    void callnumber(int phone){
        System.out.println("calling");
    }
    void pickcall(int phone){
        System.out.println("connecting");
    }
 }
 class smartphone extends mycellphone implements wifi,camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
 //    public void record4kvideo(){
 //        System.out.println("4krecording");
 //    }
    public String[] getnetwork(){
        System.out.println("getting list of network");
        String[] networklist={"bsnl","jio","docomo"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connectiong to"+network);
    }
 }
 public class Polymorphism{
    public static void main(String[] args){
        camera cam=new smartphone();  //this is a smartphone use it is as a camera
        //cam.getnetwork();     not allowed
        cam.record4kvideo();
        smartphone m=new smartphone();
        m.recordvideo();
        m.takesnap();
        m.callnumber(9430649);
 
    }
 }
*/
