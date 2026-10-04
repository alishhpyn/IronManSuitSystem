public class CombatSuit extends IronManSuit{
    public CombatSuit(SuitSystem system){
        super(system);
    }

    public void attack(){
        system.executeCommand("Attack");
    }

    public void defence(){
        system.executeCommand("Defence");
    }
}
