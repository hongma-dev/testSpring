package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		TranspotationWalk transpotationWalk = new TranspotationWalk();
//		transpotationWalk.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");  // 컨테이너
	
		TranspotationWalk transpotaionWalk = ctx.getBean("tWalk", TranspotationWalk.class);  // 데이터 타입:TranspotationWalk.class
		transpotaionWalk.move();
		
		ctx.close(); // 반환
		
	}

}
