import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class UserTest {
    User user;
    @Before
    public void beforeTests()
    {
        user = new User(15L,"test@mail.com");
    }

    @Test
    public void testEqualsIdIsNull()
    {
        //Given
        user = new User();
        //When
        boolean result = user.equals(user);
        //Then
        assertTrue(result);
    }
    @Test
    public void testEqualsIdNotNull()
    {
        //Given
        //User object is created before
        //When
        boolean result = user.equals(user);
        //Then
        assertTrue(result);
    }
    @Test
    public void testEqualsObject()
    {
        //Given
        //User object is created before
        //When
        boolean result = user.equals(new Object());
        //Then
        assertFalse(result);
    }
    @Test
    public void testHashCodeIdIsNull()
    {
        //Given
        user = new User();
        //When
        int result =  user.hashCode();
        //Then
        assertEquals(0,result);
    }
    @Test
    public void testHashCodeIdNotNull()
    {
        //Given
        //User object is created before
        //When
        int hashCodeId = user.hashCode();
        boolean result = user.getId().equals(hashCodeId);
       //Then
       assertFalse(result);
    }
    @Test
    public void setEmailTest()
    {
        //Given
        //User object is created before
        //When
        user.setEmail("test2@mail.com");
        //Then
        assertEquals(user.getEmail(),"test2@mail.com");

    }
    @Test
    public void setIdTest()
    {
        //Given
        //User object is created before
        //When
        user.setId(14L);
        boolean result = user.getId().equals(14L);
        //Then
        assertTrue(result);
    }
    @Test
    public void getIdTest()
    {
        //Given
        //User object is created before
        //When
        boolean result = user.getId().equals(15L);
        //Then
        assertTrue(result);
    }
    @Test
    public void getEmailTest()
    {
        //Given
        //User object is created before
        //When
        boolean result = user.getEmail().equals("test@mail.com");
        //Then
        assertTrue(result);
    }


}






