package module13.interfaces;

public interface Storable {
    void storeData();
    void retrieveData();
    default void sillyMethod(){
        System.out.println("I have done the silly thing.");
    };
}
