package com.amr.common.communication;

import java.io.Serializable;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Response implements Serializable { //mozda treba poslati koji je exception

    private Object result;
    private ResponseType status;

    public Response() {
        status = ResponseType.SUCCESS;
    }

    public Response(Object result, ResponseType status) {
        this.result = result;
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ResponseType getStatus() {
        return status;
    }

    public void setStatus(ResponseType status) {
        this.status = status;
    }

}
