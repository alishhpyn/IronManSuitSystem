public class RescueSuit extends IronManSuit{
    public RescueSuit(SuitSystem system){
        super(system);
    }

    public void scanArea(){
        system.executeCommand("Scan area");
    }

    public void rescue(){
        system.executeCommand("Rescue");
    }
}
