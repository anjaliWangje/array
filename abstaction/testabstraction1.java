package abstaction;

abstract class shape{

  abstract  void draw();
  void display(){
      System.out.println(" this is dispalying shape");

    }

}

class rectangle extends shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}

class circle extends shape{
    void draw(){
        System.out.println(" drawing circle");
    }

}

public class testabstraction1 {
    public static void main(String[]arge){
       shape circle = new circle();
       circle.draw();
       circle.display();

           }
       }



