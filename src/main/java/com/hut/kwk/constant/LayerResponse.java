package com.hut.kwk.constant;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
@AllArgsConstructor
public class LayerResponse<T> implements Serializable {
    //"code":0,"msg":"","count":1000,"data"
    private Integer code;
    private String msg;
    private Long count;
    private T data;

}
