package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Add_test {
	
	private Add add;
	
	@Before
	public void setup() {
		add = new Add();
	}
	
	@Test
	public void test1() {
		assertEquals(3, add.solution(1, 2));
	}
	
	@Test
	public void test2() {
		assertEquals(3, add.solution(1, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(3, add.solution(1, 2));
	}

}
