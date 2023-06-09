package springframework.beans.factory.config;

import springframework.beans.BeansException;
import springframework.beans.factory.BeanFactory;

/**
 * @author gusixue
 * @description 扩展了 BeanFactory，提供了自动装配、前、后处理器等接口，可以使用这个接口集成其它框架
 * @date 2023/4/1
 */
public interface AutowireCapableBeanFactory extends BeanFactory {


    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessAfterInitialization 方法
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;


}
