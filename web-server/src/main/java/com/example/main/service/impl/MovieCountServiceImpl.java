package com.example.main.service.impl;

import com.example.main.repository.MovieHallRepository;
import com.example.main.repository.MovieInfoRepository;
import com.example.main.repository.MovieTicketRepository;
import com.example.main.repository.TimeSlotRepository;
import com.example.main.service.MovieCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 专用于电影数据统计
 *
 * 可选的统计数据：
 * 近期最受欢迎电影（票房越高越受欢迎）,
 * 上座率（当日某影片上座率=当日该影片观影人数/∑【当日每场电影放映场次*每场所在影厅的座位数】），
 * 客单价（观众购票所花总金额/购票次数），
 * 票房（当日某影片票房=∑【当日该影片每场观影人数*当日该场票价】），
 * 排片率（当日某影片排片率=当日该影片放映场数/当日所有电影的总放映场数）
 */
@Service
public class MovieCountServiceImpl implements MovieCountService {
    @Autowired
    private MovieInfoRepository movieInfoRepository;
    @Autowired
    private TimeSlotRepository timeSlotRepository;
    @Autowired
    private MovieTicketRepository movieTicketRepository;
    @Autowired
    private MovieHallRepository movieHallRepository;
}
