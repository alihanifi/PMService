package UserManagement;

public class User {
	public int _userID;
	private String _username;
	private String _password;
	private String _displayName;
	private UserRole _role;
	private Credential[] _credentials;
	private boolean _isDisabled;
	public UserRole _unnamed_UserRole_;
	public Credential _unnamed_Credential_;

	public User(int aId) {
		throw new UnsupportedOperationException();
	}

	public String getUsername() {
		return this._username;
	}

	public String getPassword() {
		return this._password;
	}

	public String getDisplayName() {
		return this._displayName;
	}

	public UserRole getRole() {
		return this._role;
	}

	public Credential[] getCredentials() {
		return this._credentials;
	}

	public boolean getIsDiabled() {
		throw new UnsupportedOperationException();
	}
}