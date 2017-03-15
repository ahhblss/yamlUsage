package com.lss.yaml;

import java.util.List;

/**
 * Created by Sean.liu on 2017/3/15.
 */
public class Verson {
    private String version;
    private Boolean update;
    private Boolean force;
    private List<String> content;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }
}
