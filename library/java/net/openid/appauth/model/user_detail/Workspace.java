
package net.openid.appauth.model.user_detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Workspace {

    @SerializedName("gid")
    @Expose
    private String gid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("resource_type")
    @Expose
    private String resourceType;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
