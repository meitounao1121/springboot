package com.zlt.pojo;

import java.io.Serializable;

public class Boot implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 4113345577907997313L;

    private  int  id;

    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boot(){}
    public Boot(int id, String message) {
        super();
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Boot [id=" + id + ", message=" + message + "]";
    }




}
