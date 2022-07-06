package com.hut.kwk.controller;

import com.hut.kwk.constant.ServerResponse;
import com.hut.kwk.service.IArrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/process/")
public class ArrController {

    @Autowired
    private IArrService iArrService;
    @RequestMapping("arr")
    public ServerResponse<String> arr() {
        return iArrService.arr(20);
    }
}
