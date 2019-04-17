package eu.accesa.springtraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    private static Logger log = LoggerFactory.getLogger(TestScheduler.class);

    @Value("${training.test.enabled}")
    private boolean isEnabled;


    @Scheduled(initialDelay = 5000, fixedDelay = 10000)
    public void orice(){

        if(isEnabled){
            log.info("LOG PT SECUNDE TRUE");
        } else {
            log.info("Log pentru secunde.");
        }

    }

}
