package com.tecsun.sisp.card.modules.card.entity.response;

public class TCardInfoServiceReplacement {
    private String id;

    private String identifition;

    private String three;

    private String normalStatus;

    private String one;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIdentifition() {
        return identifition;
    }

    public void setIdentifition(String identifition) {
        this.identifition = identifition == null ? null : identifition.trim();
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three == null ? null : three.trim();
    }

    public String getNormalStatus() {
        return normalStatus;
    }

    public void setNormalStatus(String normalStatus) {
        this.normalStatus = normalStatus == null ? null : normalStatus.trim();
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one == null ? null : one.trim();
    }
}