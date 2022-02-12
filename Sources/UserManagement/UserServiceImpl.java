package UserManagement;

public interface UserServiceImpl {

	public void addUser(User aUser);

	public void disableUser(User aUser);

	public void changePassword(User aUser, String aPwd);

	public void updateUser(object[] aDetails);

	public void addCredential(Credential aCred);

	public void removeCredential(Credential aCred);

	public void checkUserDetails(User aUser);

	public void login(String aUsername, String aPwd);

	public void logout(String aSession);

	public void register(object[] aDetails);
}