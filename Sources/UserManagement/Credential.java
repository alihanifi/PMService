package UserManagement;

import java.util.Vector;
import UserManagement.User;

public class Credential {
	public int _iD;
	public String _name;
	public String _description;
	public Vector<User> _unnamed_User_ = new Vector<User>();

	public Credential() {
		throw new UnsupportedOperationException();
	}
}