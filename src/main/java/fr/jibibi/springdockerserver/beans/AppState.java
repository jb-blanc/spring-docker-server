package fr.jibibi.springdockerserver.beans;

import java.util.Date;

/**
 * AppState
 */
public class AppState {

    private String state;
    private Date startedAt;
    
    public AppState() {
        super();
        state = "ON";
        startedAt = new Date();
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * @return the startedAt
     */
    public Date getStartedAt() {
        return startedAt;
    }
    /**
     * @param startedAt the startedAt to set
     */
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }
}