package Spring_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainAppClass {
	
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("Spring_1/Bean-Conf.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		factory.getBean("Credit",CreditCardPayment.class);
		factory.getBean("Debit",DebitCardPayment.class);
		
		PaymentProcessor processor=factory.getBean("PaymentProcessor",PaymentProcessor.class);
			processor.doPayment(1500.00);	
	}

}
