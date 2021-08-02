package x.y.use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.consolution.test.anno.Bar72;

public class P77AnnoMain {

	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("annoTestContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annoTestContext.xml");
		
		Bar72 bar72 = (Bar72)context.getBean("bar72");
		System.out.println("beans 생성");
		bar72.doBar72();
	}

}
