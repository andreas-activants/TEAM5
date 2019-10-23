import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Model.Task;
import Model.ToDoList;

import static org.junit.Assert.*;

public class LoginTest {
	Login login1, login2;
	
	public LoginTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		login1 = new Login ("user1", "user1");
		login2 = new Login ("user2", "user2");
	}
	@After
	 public void tearDown() throws Exception{
		login1 = null;
		login2 = null;
	}

	@Test
	public void testValidateLogin() {
		assertTrue(login1.validateLogin());
		assertTrue(login2.validateLogin());
	}
}
