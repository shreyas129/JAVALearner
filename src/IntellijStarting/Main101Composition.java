package IntellijStarting;

public class Main101Composition {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "hp", "560");
        Monitor theMonitor = new Monitor("28inch ultra Beast", "Apple", 28, "2570 x 1460");
        MotherBoard theMotherBoard = new MotherBoard("Z790", "Best Intel", 6, 8, "v8.68");
        PersonalComputer thePC = new PersonalComputer("2208", "hp", theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(10, 10, "Navy Blue");
//        thePC.getMotherBoard().loadProgram("MSI Afterburner");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
