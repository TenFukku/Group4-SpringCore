package aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* aop.service.OrderService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("[@Before] Method: " + joinPoint.getSignature().getName() +
                ", Args: " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution(* aop.service.OrderService.*(..))", returning = "result")
    public void afterReturningAdvice(Object result) {
        System.out.println("[@AfterReturning] Method returned: " + result);
    }

    @AfterThrowing(pointcut = "execution(* aop.service.OrderService.*(..))", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("[@AfterThrowing] Exception: " + ex.getMessage());
    }

    @After("execution(* aop.service.OrderService.*(..))")
    public void afterAdvice() {
        System.out.println("[@After] Method execution completed.");
    }
}
