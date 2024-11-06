package com.ernesto.springboot.goldenkey.springboot_web.Model;

import java.util.List;

public class CustomResponse {
    private boolean isError;
    private String message;
    private List<Object> Data;

    public CustomResponse() {
    }

    // Getters y Setters
    public boolean isError() {
        return isError;
    }

    public void setError(boolean isError) {
        this.isError = isError;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Object> getData(){
        return Data;
    }
    public void setData(List<Object> categorias){
        this.Data = categorias;
    }
}
