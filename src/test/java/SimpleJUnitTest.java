import org.junit.jupiter.api.*;

public class SimpleJUnitTest {
    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("###    Before All\n");
    }

   @BeforeEach
   void BeforeEach() {
       System.out.println("###    Before Each");
        result = getResult();
   }

   @AfterEach
   void AfterEach() {
       System.out.println("###    After Each\n");
       result = 0;
   }

   @AfterAll
   static void afterAll() {
        System.out.println("###    After All\n");
   }

    @Test
    void firstTest() {
        System.out.println("###   firstTest()");
        Assertions.assertTrue(result > 2);
    }


    @Test
    void secondTest() {
        System.out.println("###   secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###   thirdTest()");
        Assertions.assertTrue(result > 2);
    }
    
    private int getResult() {
       return 3;
    }
}
