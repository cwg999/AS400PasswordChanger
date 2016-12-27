// Requires openJDK, JTOpen
import java.io.IOException;
import com.ibm.as400.access.AS400; // JTOpen http://www-03.ibm.com/systems/power/software/i/toolbox/downloads.html
import com.ibm.as400.access.AS400SecurityException;
public class PasswordChanger {
	public static void main(String []args) {
		// CLI Args: SYSTEMNAME, USERNAME, OLDPASSWORD, NEWPASSWORD
		if(args.length == 4){
			AS400 system = new AS400(args[0],args[1]);
			try {
				system.changePassword(args[2], args[3]);
				System.out.println("Change Successful.");
			} catch (AS400SecurityException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
				// e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.toString());
			}	
		}else{
			System.out.println("Requires SYSTEMNAME (POWER7.DOMAIN.COM), USERNAME, OLDPASSWORD, NEWPASSWORD as inputs.");
		}
	}
}