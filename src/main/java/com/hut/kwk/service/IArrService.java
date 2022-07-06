package com.hut.kwk.service;

import com.hut.kwk.constant.ServerResponse;


public interface IArrService {
    ServerResponse<String> arr(int weeks);
}
