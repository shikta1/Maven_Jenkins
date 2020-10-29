import static org.junit.Assert.*;

import org.junit.Test;

import com.data.Demo;

public class TestDemo {

@Test
public void testAdd() {
Demo d = new Demo();
int ans = d.add(30, 20);
assertEquals(500, ans);
}

}

