package com.excel.proj.log;

import com.excel.proj.utils.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.UUID;

@Aspect
@Component
public class LoggingAdvice {

    Logger log = LoggerFactory.getLogger(LoggingAdvice.class);

    /**
     * Pointcut that matches all repositories, services and Web REST endpoints.
     */
   /* @Pointcut("within(@org.springframework.stereotype.Repository *)" +
            " || within(@org.springframework.stereotype.Service *)" +
            " || within(@org.springframework.web.bind.annotation.RestController *)")
    public void springBeanPointcut() {
        // Method is empty as this is just a Pointcut, the implementations are in the advices.
    }*/

    @Pointcut(value="execution(* com.redis.redisproj..*(..))")//execution(* com.backboneproj.*.*.*(..) )")
    public void myPointcut() {

    }

    //@Around("myPointcut()")
    @Before("myPointcut()")
    public void applicationLogger(JoinPoint pjp) throws Throwable {
        if(MDC.get(Constants.TRACE_ID) == null){
            MDC.put(Constants.TRACE_ID, String.valueOf(UUID.randomUUID()));
        }
        ObjectMapper mapper = new ObjectMapper();
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Object[] array = pjp.getArgs();
        log.info("method invoked " + className + " : " + methodName + "()" + "arguments : "
                + mapper.writeValueAsString(array));
    }

    /*@Around("myPointcut()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();

        log.info("\"{}\" executed in {} ms", joinPoint.getSignature(), stopWatch.getTotalTimeMillis());

        return proceed;
    }*/
    /*
    //ProceedingJoinPoint SOLO CON @Around se no da errore
    @Around("myPointcut()")
    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
        MDC.put(Constants.LOG_ID, generateRandom(25));
        ObjectMapper mapper = new ObjectMapper();
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Object[] array = pjp.getArgs();
        log.info("method invoked " + className + " : " + methodName + "()" + "arguments : "
                + mapper.writeValueAsString(array));
        Object object = pjp.proceed();
        log.info(className + " : " + methodName + "()" + "Response : "
                + mapper.writeValueAsString(object));
        return object;
    }


    @Before("execution(* com.backboneproj..*(..))")
    public void before(JoinPoint joinPoint) throws Exception {
        MDC.put(Constants.LOG_ID, generateRandom(25));

        String className = getClassName(joinPoint);
        String methodName = getMethodName(joinPoint);
        log.debug("Start {} method {}", className, methodName);
    }*/

    private String getClassName(JoinPoint joinPoint) {
        return joinPoint.getTarget().getClass().toString();
    }

    private String getMethodName(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        return methodSignature.getMethod().getName();
    }

    //USO UUID
    public static String generateRandom(int len) {
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}