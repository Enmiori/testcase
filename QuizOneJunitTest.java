

import static org.junit.Assert.*;
import org.junit.Test;

public class QuizOneJunitTest {

    QuizOneJunit quizOneJunit = new QuizOneJunit();

    @Test
    public void testSquare() {
        assertEquals(25, quizOneJunit.square(5));
    }

    @Test
    public void testCountLetterA() {
        assertEquals(2, quizOneJunit.countLetterA("Apple"));
    }

    @Test 
    public void testCheckTwoLetter() { 
        assertTrue(quizOneJunit.checkTwoLetter("apple")); 
        assertFalse(quizOneJunit.checkTwoLetter("a")); 
   } 

   @Test 
   public void testCheckTwoLetter_EmptyString() { 
       assertFalse(quizOneJunit.checkTwoLetter("")); 												   }   }