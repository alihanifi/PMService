package WebService;

import UserManagement.User;

public class LoginPage extends Webpage {
	private User _user;
	private ContextMenu _menus;

	public LoginPage() {
		throw new UnsupportedOperationException();
	}

	public ContextMenu getMenus() {
		return this._menus;
	}

	public void requestLogin() {
		throw new UnsupportedOperationException();
	}

	public void requestForgetPassword() {
		throw new UnsupportedOperationException();
	}
}