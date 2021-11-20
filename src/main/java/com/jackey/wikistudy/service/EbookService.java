package com.jackey.wikistudy.service;

import com.jackey.wikistudy.domain.Ebook;
import com.jackey.wikistudy.domain.EbookExample;
import com.jackey.wikistudy.mapper.EbookMapper;
import com.jackey.wikistudy.req.EbookReq;
import com.jackey.wikistudy.resp.EbookResp;
import com.jackey.wikistudy.utils.CopyUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper EbookMapper;

    public List<EbookResp> list(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!StringUtils.isNullOrEmpty(ebookReq.getName())) {
            criteria.andNameLike("%" + ebookReq.getName() + "%");
        }
        List<Ebook> ebooks = EbookMapper.selectByExample(ebookExample);
        List<EbookResp> ebookResps = CopyUtil.copyList(ebooks, EbookResp.class);
        return ebookResps;
    }

}
