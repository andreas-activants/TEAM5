import Model.User;
import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {

    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private User user5;

    @Before
    public void setUp() throws Exception{
        user1 = new User("User1", "qwer1234", "user1@email.com", null);
        user2 = new User("User2", "qwert12345", "user2@email.com", null);
        user3 = new User("User3", "qwerty123456", "user3@email.com", user1);
        user4 = new User("User3", "Qwerty123456", "user3@email.com", user1);
        user5 = new User("user3", "qwerty123456", "user3@email.com", user1);
    }
    @After
    public void tearDown() throws Exception{
        user1 = null;
        user2 = null;
        user3 = null;
    }

    @Test
    public void isValidUser() {
        assertTrue(user1.isValidUser(user1.getUsername(), user1.getPassword()));
        assertFalse(user2.isValidUser(user1.getUsername(), user2.getPassword()));
        assertFalse(user2.isValidUser(user2.getUsername(), user1.getPassword()));
        assertFalse(user3.isValidUser(user1.getUsername(), user1.getPassword()));
        assertFalse(user3.isValidUser(user4.getUsername(), user4.getPassword()));
        assertTrue(user3.isValidUser(user5.getUsername(), user5.getPassword()));
    }
}