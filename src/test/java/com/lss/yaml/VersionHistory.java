package com.lss.yaml;

import java.util.List;

/**
 * Created by Sean.liu on 2017/3/15.
 */
public class VersionHistory {
    private String lastPublishTime;
    private List<Verson> versions;

    public String getLastPublishTime() {
        return lastPublishTime;
    }

    public void setLastPublishTime(String lastPublishTime) {
        this.lastPublishTime = lastPublishTime;
    }

    public List<Verson> getVersions() {
        return versions;
    }

    public void setVersions(List<Verson> versions) {
        this.versions = versions;
    }
}
