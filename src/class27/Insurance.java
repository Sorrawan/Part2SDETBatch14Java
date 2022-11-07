package class27;
//Related to Hw1Class26
//งง
public abstract class Insurance {
    //Create a class Insurance that will have an attribute as insuranceName
    String insuranceName;   //Instance field

    Insurance(String insuranceName){      //We have "Instance field" then we need to have "Constructor"
        this.insuranceName=insuranceName;
    }

    // unimplemented behaviour as getQuote and cancelInsurance.
    abstract void getQuote();
    abstract void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Car extends Insurance{

    String carModel;

    Car(String insuranceName,String carModel) {    //Calls the Parent class constructor and Add Instance field of Child class
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" 3% of the car value");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Pet extends Insurance{

    String petType;
    Pet(String insurance,String petType){
        super(insurance);
        this.petType=petType;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 15000USD for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled for "+petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ " cjarges 2000USD for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}