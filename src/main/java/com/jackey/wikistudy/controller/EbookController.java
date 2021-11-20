package com.jackey.wikistudy.controller;

import com.jackey.wikistudy.domain.Ebook;
import com.jackey.wikistudy.req.EbookReq;
import com.jackey.wikistudy.resp.CommonResp;
import com.jackey.wikistudy.resp.EbookResp;
import com.jackey.wikistudy.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq ebookReq) {
        CommonResp<List<EbookResp>> commonResp = new CommonResp<>();
        commonResp.setContent(ebookService.list(ebookReq));
        return commonResp;
    }

}
