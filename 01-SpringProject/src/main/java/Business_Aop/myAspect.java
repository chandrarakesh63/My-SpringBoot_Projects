package Business_Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class myAspect {
	
	@Before("execution(* Business_Aop.BusinessAopProgram.LogicOne())")
	public void beforeLogicOne() {
		System.out.println("Before logicOne method");
	}
	@After("execution(* Business_Aop.BusinessAopProgram.LogicTwo())")
	public void beforeLogicTwo() {
		System.out.println("After logicTwo method");
	}
	@Before("execution(* Business_Aop.BusinessAopProgram.LogicThree())")
	public void beforeLogicThree() {
		System.out.println("Before logicThree method");
	}
	@Before("execution(* Business_Aop.BusinessAopProgram.LogicFive())")
	public void beforeLogicFour() {
		System.out.println("Before logicFour method");
	}
	@After("execution(* Business_Aop.BusinessAopProgram.LogicFour())")
	public void beforeLogicFive() {
		System.out.println("After logicFive method");
	}

}
