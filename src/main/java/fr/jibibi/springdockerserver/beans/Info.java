package fr.jibibi.springdockerserver.beans;
/** 
 * Info
 */

import java.util.Date;

public class Info {

    private Integer id;
    private String name;
    private Date publishDate;
    
    public Info() {
        super();
        this.id = -1;
        this.name = "";
        this.publishDate = new Date();
    }

    public Info(Integer id, String name, Date publishDate) {
        super();
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the publishDate
     */
    public Date getPublishDate() {
        return publishDate;
    }
    /**
     * @param publishDate the publishDate to set
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}