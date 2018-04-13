package com.example.demo.scope;

import com.example.demo.conf.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
        AppConfig.class
})
public class ScopeTest {

    @Autowired
    private SingletonBean singletonBean;
    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void shouldPresentHowSingletonWorks() {
        assertThat(singletonBean.incerase()).isEqualTo(0);
        assertThat(singletonBean.incerase()).isEqualTo(1);
    }

    @Test
    public void shouldPresentHowPrototypeWorks() {
        assertThat(prototypeBean.incerase()).isEqualTo(0);
        assertThat(prototypeBean.increaseBy2()).isEqualTo(3);

        assertThat(beanFactory.getBean(PrototypeBean.class).incerase()).isEqualTo(0);
    }


    public class DecaratedPrototypeBean extends PrototypeBean {

        public DecaratedPrototypeBean(BeanFactory beanFactory) {
            this.beanFactory = beanFactory;
        }

        private BeanFactory beanFactory;

        @Override
        public int incerase() {
            return beanFactory.getBean(PrototypeBean.class).incerase();
        }
    }

}