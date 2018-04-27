package facade.pattern.demo;

import facade.pattern.robotfacade.RobotFacade;

public class FacadePatternExample {

        public static void main(String[] args)
        {
            System.out.println("***Facade Pattern Demo***");
            RobotFacade rf1 = new RobotFacade();
            rf1.ConstructRobot("Green", "Iron");
            RobotFacade rf2 = new RobotFacade();
            rf2.ConstructRobot("Blue", "Steel");

        }

}
