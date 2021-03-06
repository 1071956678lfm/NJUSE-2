package com.example.main.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.main.core.enums.ResponseType;
import com.example.main.core.response.Response;
import com.example.main.model.FavorList;
import com.example.main.model.MovieInfo;
import com.example.main.repository.*;
import com.example.main.service.MovieCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 专用于电影数据统计
 * <p>
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
    @Autowired
    private FavorListRepository favorListRepository;

    @Override
    public JSON getTopMovieFavor(int top) {
        try {
            //得到所有的电影id,按照喜爱人数降序排列
            List<String> ids = favorListRepository.findMovieIdsMostFavorSorted();
            List<MovieInfo> movies = movieInfoRepository.findAllById(ids);
            JSONObject ans = new JSONObject();
            int max = Math.max(movies.size(), top);
            JSONArray array = new JSONArray();
            for (int i = 0; i < max; ++i) {
                JSONObject object = new JSONObject();
                object.put("movieName", movies.get(i).getName());
                object.put("favorNum", favorListRepository.findFavorListsByMovieId(
                        movies.get(i).getMovieId()));
                array.add(object);
            }
            ans.put("rankList", array);
            return Response.success(ans);
        } catch (NullPointerException e) { //发生了资源找寻不到的异常
            return Response.fail(ResponseType.RESOURCE_NOT_EXIST);
        } catch (Exception e) {
            return Response.fail(ResponseType.UNKNOWN_ERROR);
        }

    }
}
