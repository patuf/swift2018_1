package controller.mockimpl;

import controller.interfaces.UserManagementController;
import model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserManagementControllerMockImplTest {

    @Test
    public void testLogin() {

        UserManagementController umc = new UserManagementControllerMockImpl();
        Assert.assertNull(umc.login("pesho", "sadasd"));
        User user = umc.login("pesho", "pepi");
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getUserName(), "pesho");
    }
}
