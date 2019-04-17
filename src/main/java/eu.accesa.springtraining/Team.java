package eu.accesa.springtraining;

import org.hibernate.validator.constraints.Length;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix = "team")
public class Team {

    private static Logger log = LoggerFactory.getLogger(Team.class);

    @NotNull
     private String name;
    @Length(min = 2, max = 7)
     private String player;
     private Boolean winners;

     @PostConstruct
    public void cconstruct() {
         log.info("This is in congig {}",name+" "+player);
     }

    public String getName() {
        return name;
    }

    public String getPlayer() {
        return player;
    }

    public Boolean getWinners() {
        return winners;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setWinners(Boolean winners) {
        this.winners = winners;
    }
}
