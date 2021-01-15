package com.jk.service.impl;

import com.jk.mapper.MediaMapper;
import com.jk.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaMapper mediaMapper;
}
