//4. Inner Class Encapsulation: Secure Locker
//Encapsulate helper logic inside the class.
//•	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
//•	Use an inner private class SecurityManager to handle passcode verification logic.
//•	Only expose public methods: lock(), unlock(String code), isLocked().
//•	Password attempts should not leak verification logic externally—only success/failure.
//•	Ensure no direct access to passcode or the inner SecurityManager from outside.


package Day_5_Assignment;
class Locker {
   
    private String lockerId;
    private boolean isLocked;
    private String passcode;

  
    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true; 
    }

   
    public void lock() {
        isLocked = true;
        System.out.println("Locker is now locked.");
    }

   
    public boolean unlock(String code) {
        SecurityManager security = new SecurityManager();
        if (security.verify(code)) {
            isLocked = false;
            System.out.println("Locker unlocked successfully.");
            return true;
        } else {
            System.out.println("Unlock failed. Incorrect passcode.");
            return false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    private class SecurityManager {
        private boolean verify(String inputCode) {
            return passcode.equals(inputCode);
        }
    }
}
public class Encapsulation_4 {
	public static void main(String[] args) {
        Locker locker = new Locker("LKR001", "secure123");
        
        System.out.println("Is locker locked? " + locker.isLocked());

        locker.unlock("secure321");  // Should fail
        System.out.println("Is locker locked? " + locker.isLocked());

        locker.unlock("secure123");  // Should succeed
        System.out.println("Is locker locked? " + locker.isLocked());

        locker.lock();
        System.out.println("Is locker locked? " + locker.isLocked());
    }
}
