package eu.accesa.springtraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@ConditionalOnProperty(name = "training.test.enabled", havingValue = "true", matchIfMissing = true)
public class TestPostConstructor {

    private static Logger log = LoggerFactory.getLogger(TestPostConstructor.class);

    @Value("${training.val}")
    private String val;

    @PostConstruct
    public void init() {
        log.info("A pornit acest bean{}!",val);
    }

    @PreDestroy
    public void destory() {
        log.info("Aceasta app se va opri!");
    }
}
