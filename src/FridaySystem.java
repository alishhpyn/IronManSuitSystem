public class FridaySystem implements SuitSystem{
    @Override
    public void initialize() {
        System.out.println("FRIDAY: Suit system initialized.");
    }

    @Override
    public void executeCommand(String command) {
        System.out.println("FRIDAY executes:"+command);
    }
}
