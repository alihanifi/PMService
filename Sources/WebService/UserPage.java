package WebService;

import UserManagement.User;

public class UserPage extends Webpage {
	private User _user;
	private ContextMenu _menus;

	public void RegisterPage() {
		throw new UnsupportedOperationException();
	}

	public ContextMenu getMenus() {
		return this._menus;
	}
}