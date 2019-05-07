package com.example.main.service.impl;

import com.example.main.repository.*;
import com.example.main.service.MovieTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 专门服务于购票/退改票 用例;
 * 包含了 选座;生成订单;购买
 * 退票;查看历史订单
 */
@Service
public class MovieTicketServiceImpl implements MovieTicketService {
    @Autowired
    private MovieInfoRepository movieInfoRepository;
    @Autowired
    private MovieTicketRepository movieTicketRepository;
    @Autowired
    private CouponRepository couponRepository;
    @Autowired
    private TimeSlotRepository timeSlotRepository;
}
