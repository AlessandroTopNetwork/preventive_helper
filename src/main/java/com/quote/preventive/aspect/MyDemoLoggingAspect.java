//package com.quote.preventive.aspect;
//
//import java.util.logging.Logger;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class MyDemoLoggingAspect {
//	
//    // setup logger
//    private Logger log = Logger.getLogger(getClass().getName());
//
//    // setup pointcut declarations
//    @Pointcut("execution( *  com.quote.preventive.controller.*.*(..))") // any class into path any method and any argusments
//    private void forContorllerPackage() {}
//    
//    // do smae for service and dao
//    @Pointcut("execution( *  com.quote.preventive.service.*.*(..))") // any class into path any method and any argusments
//    private void forServicePackage() {}
//    
//    @Pointcut("execution( *  com.quote.preventive.jpa.*.*(..))") // any class into path any method and any argusments
//    private void forJpaPackage() {}
//    
//    @Pointcut("forContorllerPackage() || forServicePackage() || forJpaPackage()")
//    private void forAppFlow() {}
//    
//    @Before("forAppFlow()")
//    public void before(JoinPoint joinPoint) {
//    	
//    	// display method we are calling
//    	
//    	String nameMethod = joinPoint.getSignature().toShortString();
//    
//    	log.info("method called is : " + nameMethod);
//    	
//    	// display the arguments
//    	
//    	Object[] args = joinPoint.getArgs();
//    	
//    	if(null != args && 0 != args.length) {
//	    	
//	    	log.info("arguments : ");
//	    	
//	    	for(Object a : args) {
//	    		log.info("	0 : " + a);
//	    	}
//    	} else {
//    		log.info("method not have arguments");
//    	}
//    	
//    	
//    }
//    
//    @AfterReturning(
//    		pointcut = "forAppFlow()", // call pointcut
//    		returning = "result") // name of returning obj method , uou can call it whatever you want
//    public void afterReturning(JoinPoint joinPoint, Object result) {
//    	
//    	// display method we are calling
//    	
//    	String nameMethod = joinPoint.getSignature().toShortString();
//    
//    	log.info("we are into after returning method called is : " + nameMethod);
//    	
//    	// display data returning
//    	log.info("result : " + result);
//    	
//    }
//    
//    @Around("execution(* com.quote.preventive.service.implemetation.*.*(..))")
//    public Object aroundTest(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
//    	// print out method we are advising on
//        String method = theProceedingJoinPoint.getSignature().toShortString();
//        System.out.println("\n=====>>> Executing @Around on method: " + method);
//
//        // get begin timestamp
//        long begin = System.currentTimeMillis();
//        
//        // code above is the code before the method target
//        
//        Object result = null;
//        
//        try {
//
//	        // now, let's execute the method
//	        result = theProceedingJoinPoint.proceed(); // luanch method target
//        } catch (Exception e) {
//        	System.err.println("the execution of method " + method + "has throw exception :" + e );
//        	
//        	throw e;
//        }
//
//        // code after execution target method
//        
//        // get end timestamp
//        long end = System.currentTimeMillis();
//
//        // compute duration and display it
//        long duration = end - begin;
//        System.out.println("\n=====> Duration: " + duration / 1000.0 + " seconds"); // didere per 1000.0 ritona direttamente un decimale 10.2 secondi per esempio
//
//        return result;
//    }
//    
//}
//
//
//
//
//
//
//
//
//
//
//
