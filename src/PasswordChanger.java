import java.io.IOException;
import com.ibm.as400.access.AS400; 
import com.ibm.as400.access.AS400SecurityException;
public class PasswordChanger {
	public static void main(String []args) {
		if(args.length == 4){
			AS400 system = new AS400(args[0],args[1]);
			try {
				system.changePassword(args[2], args[3]);
				System.out.println("Change Successful.");
				System.exit(0);
			} catch (AS400SecurityException e) {
				System.out.println(e.toString());
				System.exit(0);
			} catch (IOException e) {
				System.out.println(e.toString());
				System.exit(0);
			}	
		}else{
			System.out.println("Requires SYSTEMNAME (POWER7.HOSTNAME.DOMAIN.COM), USERNAME, OLDPASSWORD, NEWPASSWORD as inputs.");
		}
	}
}
