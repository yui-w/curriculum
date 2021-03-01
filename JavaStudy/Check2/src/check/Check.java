package check;

import constants.Constants;

public class Check {

    private String firstName = "和賀";
    private String lastName = "結";

private void printName( ) {
    System.out.println( "printNameメソッド → "+ firstName + lastName);
}

public static void main(String[] args) {
    
    
    Check ck = new Check();
    ck.printName( );


        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        pet.introduce();

        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
    }
}
