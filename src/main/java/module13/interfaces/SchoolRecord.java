package module13.interfaces;

public class SchoolRecord implements Auditable, Storable{


    @Override
    public void runAudit() {
        System.out.println("Auditing...");
    }

    @Override
    public void sendAuditToState() {
        System.out.println("Audit sent to state.");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void retrieveData() {

    }
}
