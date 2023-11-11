package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解中常用的元数据:
 * @Target:用于指定当前注解可以被应用的位置
 *         ElementType指定了相应的位置,常见的有:
 *         ElementType.TYPE:类上
 *         ElementType.FIELD:属性上
 *         ElementType.METHOD:方法上
 *         ElementType.CONSTRUCTOR:构造器上
 *         ...
 *         例如:
 *         @Target(ElementType.TYPE):当前注解仅能在类上使用
 *
 *         @Target({ElementType.TYPE,ElementType.CONSTRUCTOR}):当前注解可以在类上或构造器上使用
 *
 * @Retention:注解的保留级别
 *            有三个可选项:
 *            RetentionPolicy:SOURCE  注解仅保留在源码中
 *            RetentionPolicy:CLASS   注解保留在字节码文件中,但不可被反射机制访问(默认保留级别)
 *            RetentionPolicy:RUNTIME 注解保留在字节码文件中,[可被反射机制访问]
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunClass {
}
