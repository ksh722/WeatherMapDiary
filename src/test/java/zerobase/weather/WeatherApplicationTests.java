package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {
	@Test
	void equalTest() {
	    //given
		assertEquals(1,1);

	    //when
	    //then
	}

	@Test
	void nullTest() {
		assertNull(null);
	    //given
	    //when
	    //then
	}

	@Test
	void trueTest() {
		assertTrue(1==1);
	    //given
	    //when
	    //then
	}
}
