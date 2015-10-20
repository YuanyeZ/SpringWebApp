package ted.test.controller;

import org.slf4j.LoggerFactory;

@Runwith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
public abstract class AbstractTest {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
}
