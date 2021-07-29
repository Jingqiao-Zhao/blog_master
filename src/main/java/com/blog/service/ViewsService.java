package com.blog.service;

public interface ViewsService {
    //获取总访问量
    int getAllViewsForPeople();
    //获取昨日访问量
    int getYesterdayViewsForPeople();
    //获取一星期访问量
    int getAWeekViewsForPeople();
    //获取一个月访问量
    int getAMonthViewsForPeople();
    //获取指定时间访问量
    int getSpanViewsForPeople();
    //增加访问量
    void updateViewsForPeople();
}
