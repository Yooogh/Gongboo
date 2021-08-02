package x.y.p36;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringAppP36 {

	public static void main(String[] args) {
			Resource resource = new ClassPathResource("applicaionContext.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			Foo bean = (Foo)factory.getBean("foo");
			
//			Foo bean2 = (Foo)factory.getBean("foo");
	}
}
