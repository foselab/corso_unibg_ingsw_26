package se.unibg.it.calculator;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * Hello world!
 */
public class App {
	
	static final Logger logger = LogManager.getLogger(App.class);
	
	
    public static void main(String[] args) {
    	logger.error("sto entrando nel main");
    	logger.error("La somma di 3 + 5 è");
    	logger.error("calcolo la somma");
    	logger.error(Calculator.sum(3, 5, 0));
    }
}
