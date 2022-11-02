package review5;
//Final Keyword
class Drink{

  void drink(){
      System.out.println("drinking method");
  }

  //Final method cannot be overriden
  final void enjoy(){
      System.out.println("We enjoy drinking water");
  }


}
public class FinalJuice extends Drink{

    //Then cannot overide the final method from Drink   " final void enjoy()"
   /* @Override
    public void enjoy(){
        System.out.println("We enjoy drinking juice");
    }
    */


}
