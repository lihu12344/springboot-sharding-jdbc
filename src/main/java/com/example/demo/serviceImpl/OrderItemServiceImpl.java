package com.example.demo.serviceImpl;

import com.example.demo.pojo.OrderItem;
import com.example.demo.dao.OrderItemMapper;
import com.example.demo.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihu
 * @since 2019-09-28
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
