package com.example.question;

public class Question {

	private String stem;
    private String operator;
    private String opa;
    private String opb;

    public Question(String stem, String operator, String opa, String opb) {
        this.stem = stem;
        this.operator = operator;
        this.opa = opa;
        this.opb= opb;
	}

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOpa() {
        return opa;
    }

    public void setOpa(String opa) {
        this.opa = opa;
    }

    public String getOpb() {
        return opb;
    }

    public void setOpb(String opb) {
        this.opb = opb;
    }

}
