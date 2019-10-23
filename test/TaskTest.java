import Model.Task;
import Model.User;
import org.junit.*;

import java.util.Date;

import static org.junit.Assert.*;

public class TaskTest {

    private Task task1;
    private Task task2;
    private Task task3;
    private Task task4;
    private Task task5;
    private User user1;
    private User user2;
    private Date currentDate;

    public TaskTest() {
        super();
    }

    @Before
    public void setUp() throws Exception{
        currentDate = new Date();
        user1 = new User("User1", "qwer1234", "user1@email.com", null);
        user2 = new User("User2", "qwert12345", "user2@email.com", null);
        task1 = new Task ("desc 1", currentDate, currentDate, "desc 1", user1);
        task2 = new Task ("desc 1", currentDate, currentDate, "desc 1", user1);
        task3 = new Task ("desc 1", currentDate, currentDate, "desc 1", user2);
        task4 = new Task ("desc 4", currentDate, currentDate, "desc 1", user1);
        task5 = new Task ("desc 1", new Date(), currentDate, "desc 2", user2);
    }
    @After
    public void tearDown() throws Exception{
        task1 = null;
        task2 = null;
        task3 = null;
    }

    @Test
    public void testEdit() {
        assertFalse(task1.equals(task4));
        task4.edit("desc 1", currentDate, currentDate, "desc 1");
        assertTrue(task1.equals(task4));

        assertFalse(task1.equals(task5));
        task5.edit("desc 1", currentDate, currentDate, "desc 1");
        assertTrue(task1.equals(task5));
    }

    @Test
    public void testDelete() {
        assertFalse(task1.isDelete());
        task1.delete();
        assertTrue(task1.isDelete());
    }

    @Test
    public void testEquals() {
    }
}