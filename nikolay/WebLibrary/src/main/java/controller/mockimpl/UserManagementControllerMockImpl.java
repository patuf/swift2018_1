package controller.mockimpl;

import controller.interfaces.UserManagementController;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserManagementControllerMockImpl implements UserManagementController {
    private Map<String, User> myMockDB = new HashMap<>();

    public UserManagementControllerMockImpl() {
        myMockDB.put("pesho", new User("pesho", "Peter Parushev", 22, "pepi"));
        myMockDB.put("gosho", new User("gosho", "Georgi Dimitrov", 23, "CKnaBKP"));
        myMockDB.put("stamat", new User("stamat", "Stamat Praznikov", 35, "parse"));
    }

    @Override
    public User login(String userName, String password) {

        User usr = myMockDB.get(userName);
        if (usr != null && usr.getPassword().equals(password))
            return usr;
        else
            return null;
    }
}
