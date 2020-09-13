package com.miaoqi.springcloudsell.order.service;

import com.miaoqi.springcloudsell.order.dto.OrderDTO;

/**
 * Created by 廖师兄
 * 2017-12-10 16:39
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 完结订单(只能卖家操作)
     *
     * @author miaoqi
     * @date 2019-06-13
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);
}
