package io.javabrains.springbootstarter.topic;
public class Topic {
    private String id;
    private String name;
    private String discription;
    public Topic(  ) {
    }

    public Topic(String id,String name,String discription) {
        this.id = id;
        this.name=name;
        this.discription=discription;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
