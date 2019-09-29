package com.example.demo.serviceImpl;

import com.example.demo.pojo.Myorder;
import com.example.demo.dao.MyorderMapper;
import com.example.demo.service.MyorderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihu
 * @since 2019-09-29
 */
@Service
public class MyorderServiceImpl extends ServiceImpl<MyorderMapper, Myorder> implements MyorderService {

}
