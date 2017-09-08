package cn.imory.zb.test.service;

import cn.imory.zb.test.bean.CrmDemo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/8
 */
@Service
public class CrmDemoService {

    @Resource
    private CrudRepository crudRepository;

    @Transactional
    public void save(CrmDemo crmDemo)
    {
        crudRepository.save(crmDemo);
    }
}
