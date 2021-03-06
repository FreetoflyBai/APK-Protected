package com.library.dexknife.shell.apkparser.struct;


import java.util.Locale;

/**
 * one entity, may be one entry in resource table, or string value
 * one apk only has one resource table
 *
 * @author dongliu
 */
public class ResourceEntity {

    /**
     * the resource id
     */
    private long resourceId;

    /**
     * the resource's value
     */
    private String value;

    public ResourceEntity(int i) {
        this.value = String.valueOf(i);
    }

    public ResourceEntity(String s) {
        this.value = s;
    }

    public ResourceEntity(boolean b) {
        this.value = String.valueOf(b);
    }

    public ResourceEntity(long resourceId) {
        this.resourceId = resourceId;
    }

    public long getResourceId() {
        return resourceId;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get value as string
     */
    public String toStringValue(com.library.dexknife.shell.apkparser.struct.resource.ResourceTable resourceTable, Locale locale) {
        if (this.value != null) {
            return this.value;
        }
        String value = com.library.dexknife.shell.apkparser.utils.ParseUtils.getResourceById(this.resourceId, resourceTable, locale);
        this.value = value;
        return value;
    }

    @Override
    public String toString() {
        return "ResourceEntity{" +
                "resourceId=" + resourceId +
                ", value='" + value + '\'' +
                '}';
    }
}
