package com.viviannecristina.santanderproject.domain;

public enum Risk {

    LOW (1),
    LOW_MEDIUM(2),
    MEDIUM (3),
    MEDIUM_HIGH(4),
    HIGH (5);

    private int risk;

    Risk(int i) {
        this.risk = i; {
        }

    }

    public int getRisk() {
        return risk;
    }
}
