package controller.interfaces;

import model.User;

public interface UserManagementController {

    User login(String userName, String password);
}
